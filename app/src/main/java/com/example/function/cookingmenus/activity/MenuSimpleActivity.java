package com.example.function.cookingmenus.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.example.function.cookingmenus.Constants;
import com.example.function.cookingmenus.R;
import com.example.function.cookingmenus.adapter.MenuSimpleAdapter;
import com.example.function.cookingmenus.adapter.item.MenuSimpleItem;
import com.example.function.cookingmenus.service.BaseService;
import com.example.function.cookingmenus.service.model.categorydetail.CateDetailResp;
import com.example.function.cookingmenus.service.model.categorydetail.Datum;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MenuSimpleActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<MenuSimpleItem> simpleItems = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        int cid = getIntent().getExtras().getInt("cid");
        recyclerView = (RecyclerView) findViewById(R.id.category_detail);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        final MenuSimpleAdapter simpleAdapter = new MenuSimpleAdapter(getApplicationContext(), simpleItems);
        recyclerView.setAdapter(simpleAdapter);
        Call<CateDetailResp> detailRespCallCall = BaseService.getMenuNamesService().getDatas(cid, "1", Constants.APP_KEY);
        detailRespCallCall.enqueue(new Callback<CateDetailResp>() {
            @Override
            public void onResponse(Response<CateDetailResp> response) {
                List<Datum> datums = response.body().getResult().getData();
                for (Datum datum : datums) {
                    String title = datum.getTitle();
                    String album = datum.getAlbums().get(0);
                    String imtro = datum.getImtro();
                    simpleItems.add(new MenuSimpleItem(title, imtro, album));
                }
                simpleAdapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Throwable t) {
                Log.e("fail", "fail");
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menu_simple, menu);
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
