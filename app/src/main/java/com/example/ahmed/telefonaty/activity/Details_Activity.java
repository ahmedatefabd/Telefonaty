package com.example.ahmed.telefonaty.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.ahmed.telefonaty.Model.Mobile;
import com.example.ahmed.telefonaty.R;
import com.example.ahmed.telefonaty.util.constant;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Details_Activity extends AppCompatActivity {

    @BindView(R.id.resolution)
    TextView resolution;

    @BindView(R.id.features)
    TextView features;

    @BindView(R.id.battery)
    TextView battery;

    @BindView(R.id.speed)
    TextView speed;

    @BindView(R.id.status)
    TextView status;

    @BindView(R.id.colors)
    TextView colors;

    @BindView(R.id.size)
    TextView size;

    @BindView(R.id.sensors)
    TextView sensors;

    @BindView(R.id.bluetooth)
    TextView bluetooth;

    @BindView(R.id.price)
    TextView price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_);
        ButterKnife.bind(Details_Activity.this);

        Bundle intent = getIntent().getExtras();

        Mobile mobile = intent.getParcelable(constant.EXTRA.MOVIE);

        resolution.setText("resolution = " + mobile.getResolution());

        features.setText("features = " + mobile.getFeatures());

        battery.setText("battery = " + mobile.getBattery_c());

        speed.setText("speed = " + mobile.getSpeed());

        status.setText("status = " + mobile.getStatus());

        colors.setText("colors = " + mobile.getColors());

        size.setText("size = " + mobile.getSize());

        sensors.setText("sensors = " + mobile.getSensors());

        bluetooth.setText("bluetooth = " + mobile.getBluetooth());

        price.setText("price = " + mobile.getPrice());


//        Bundle intent = getIntent().getExtras();
//        resolution.setText("resolution = " + intent.getString(constant.EXTRA.RESOLUTION));
//
//        features.setText("features = " + intent.getString(constant.EXTRA.FEATURES));
//
//        battery.setText("battery = " + intent.getString(constant.EXTRA.BATTERY));
//
//        speed.setText("speed = " + intent.getString(constant.EXTRA.SPEED));
//
//        status.setText("status = " + intent.getString(constant.EXTRA.STATUS));
//
//        colors.setText("colors = " + intent.getString(constant.EXTRA.COLOR));
//
//        size.setText("size = " + intent.getString(constant.EXTRA.SIZE));
//
//        sensors.setText("sensors = " + intent.getString(constant.EXTRA.SENSORE));
//
//        bluetooth.setText("bluetooth = " + intent.getString(constant.EXTRA.BLUETOOTH));
//
//        price.setText("price = " + intent.getString(constant.EXTRA.PRICE));
    }
}
