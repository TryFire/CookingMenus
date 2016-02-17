package com.example.function.cookingmenus.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.example.function.cookingmenus.Constants;
import com.example.function.cookingmenus.R;
import com.example.function.cookingmenus.adapter.RecommendMenusAdapter;
import com.example.function.cookingmenus.service.BaseService;
import com.example.function.cookingmenus.service.model.CategoryResp;
import com.example.function.cookingmenus.service.model.Result;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.GsonConverterFactory;
import retrofit2.Response;
import retrofit2.Retrofit;


public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    List<String> names = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycle_view);
        final RecommendMenusAdapter adapter = new RecommendMenusAdapter(getApplicationContext(), names);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        Call<CategoryResp> categoryRespCall = BaseService.getMenuNamesService().getCategorys(Constants.APP_KEY);
        categoryRespCall.enqueue(new Callback<CategoryResp>() {
            @Override
            public void onResponse(Response<CategoryResp> response) {
                List<Result> results = response.body().getResult();

                for (Result result : results) {
                    String name = result.getName();
                    names.add(name);
                }
                adapter.notifyDataSetChanged();

            }

            @Override
            public void onFailure(Throwable t) {

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
