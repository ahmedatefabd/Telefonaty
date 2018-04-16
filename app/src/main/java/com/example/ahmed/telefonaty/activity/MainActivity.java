package com.example.ahmed.telefonaty.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.example.ahmed.telefonaty.util.constant;
import com.androidnetworking.AndroidNetworking;
import com.example.ahmed.telefonaty.Model.Mobile;
import com.example.ahmed.telefonaty.R;
import com.example.ahmed.telefonaty.adapter.Mobile_adapter;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.mobile_recyclerView)
    RecyclerView mobileRecyclerView;

    @BindView(R.id.progress_bar)
    ProgressBar progressBar;

    private Mobile_adapter adapter; // referance --> class_Adapter

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(MainActivity.this);

//        recyclerView(response);// Method RecyclerVtew & Adapter

//        mobileRecyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

        downloadMobiles("" , "");// Method download Mobiles by Library-->Fastnetwark

    }


    // Method download Mobiles by Library-->Fastnetwark
    private void downloadMobiles(String typeMobile_key, String typeMobile_value) {

        progressBar.setVisibility(View.VISIBLE);

        AndroidNetworking.get(constant.Api.BASE_URL)
                .addQueryParameter(constant.Api.TOKEN_NAME , constant.Api.TOKEN_VALUE)
                .addQueryParameter( typeMobile_key , typeMobile_value )
                .build()
                .getAsObjectList(Mobile.class, new ParsedRequestListener<List<Mobile>>() {
                    @Override
                    // List<Mobile> --> list b3add el mobailes el hatt3rd
                    public void onResponse(List<Mobile> response) {
                        progressBar.setVisibility(View.INVISIBLE);

                        recyclerView(response);

//                        adapter = new Mobile_adapter(MainActivity.this, response);
//                        mobileRecyclerView.setAdapter(adapter);
                    }

                    @Override
                    public void onError(ANError anError) {
                        progressBar.setVisibility(View.INVISIBLE);

                        Toast.makeText(MainActivity.this, anError.getErrorDetail(), Toast.LENGTH_SHORT).show();

                    }
                });

    }


    // Method RecyclerVtew & Adapter
    public void recyclerView(List<Mobile> response) {

//        adapter = new Mobile_adapter(MainActivity.this, new ArrayList<Mobile>());

        adapter = new Mobile_adapter(MainActivity.this, response);
        mobileRecyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        mobileRecyclerView.setAdapter(adapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main_activity, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id){

            case R.id.all_mobiles:
                downloadMobiles("" , "");// Method download Mobiles by Library-->Fastnetwark

            case R.id.nokia:
                downloadMobiles(constant.Api.BRAND_KEY_NOKIA , constant.Api.BRAND_VALUE_NOKIA);// Method download Mobiles by Library-->Fastnetwark


            case R.id.sony:
                downloadMobiles(constant.Api.BRAND_KEY_SONY , constant.Api.BRAND_VALUE_SONY);// Method download Mobiles by Library-->Fastnetwark

        }
        return super.onOptionsItemSelected(item);
    }
}
