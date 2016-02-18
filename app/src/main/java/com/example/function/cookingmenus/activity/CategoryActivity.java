package com.example.function.cookingmenus.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.example.function.cookingmenus.Constants;
import com.example.function.cookingmenus.R;
import com.example.function.cookingmenus.adapter.item.CategoryItem;
import com.example.function.cookingmenus.service.BaseService;
import com.example.function.cookingmenus.service.model.CategoryResp;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CategoryActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        setToolbarName("Category");

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String parentId = bundle.getString("parentId");
        Log.e("what", parentId);

        Call<CategoryResp> respCall = BaseService.getMenuNamesService().getCategory(Integer.valueOf(parentId), Constants.APP_KEY);
        respCall.enqueue(new Callback<CategoryResp>() {
            @Override
            public void onResponse(Response<CategoryResp> response) {
                List<com.example.function.cookingmenus.service.model.List> lists = response.body().getResult().get(0).getList();
                String name = lists.get(1).getName();
                Log.e("name", name);
            }

            @Override
            public void onFailure(Throwable t) {

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_category, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
