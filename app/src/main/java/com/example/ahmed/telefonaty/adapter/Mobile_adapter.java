package com.example.ahmed.telefonaty.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.ahmed.telefonaty.util.constant;
import com.example.ahmed.telefonaty.Model.Mobile;
import com.example.ahmed.telefonaty.R;
import com.example.ahmed.telefonaty.activity.Details_Activity;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by ahmed on 31/3/2018.
 */

public class Mobile_adapter extends RecyclerView.Adapter<Mobile_adapter.Mobaile_Holder> {

    private Context context_m;
    private List<Mobile> mobileList;


    public Mobile_adapter(Context context_m, List<Mobile> mobileList) {
        this.context_m = context_m;
        this.mobileList = mobileList;
    }


    @Override
    public Mobaile_Holder onCreateViewHolder(ViewGroup parent, int viewType) {

        View row = LayoutInflater.from(context_m).inflate(R.layout.row, parent, false);
        Mobaile_Holder holder = new Mobaile_Holder(row);
        return holder;
    }


    @Override
    public void onBindViewHolder(Mobaile_Holder holder, int position) {
        final Mobile mobile = mobileList.get(position);

        holder.deviceName.setText("deviceName = " + mobile.getDeviceName());
        holder.deviceBrand.setText("deviceBrand = " + mobile.getBrand());
        holder.technology.setText("technology = " + mobile.getTechnology());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(context_m , Details_Activity.class);

                intent.putExtra(constant.EXTRA.MOVIE , mobile );


                context_m.startActivity(intent);

//_____________________________________________________________________________________

//                intent.putExtra(constant.EXTRA.RESOLUTION , mobile.getResolution());
//
//                intent.putExtra(constant.EXTRA.FEATURES , mobile.getFeatures());
//
//                intent.putExtra(constant.EXTRA.BATTERY , mobile.getBattery_c());
//
//                intent.putExtra(constant.EXTRA.SPEED , mobile.getSpeed());
//
//                intent.putExtra(constant.EXTRA.STATUS , mobile.getStatus());
//
//                intent.putExtra(constant.EXTRA.COLOR , mobile.getColors());
//
//                intent.putExtra(constant.EXTRA.SIZE , mobile.getSize());
//
//                intent.putExtra(constant.EXTRA.SENSORE , mobile.getSensors());
//
//                intent.putExtra(constant.EXTRA.BLUETOOTH , mobile.getBluetooth());
//
//                intent.putExtra(constant.EXTRA.PRICE , mobile.getPrice());

               // context_m.startActivity(intent);
            }
        });

    }


    @Override
    public int getItemCount() {
        return mobileList.size();
    }


    public class Mobaile_Holder extends RecyclerView.ViewHolder {

        @BindView(R.id.device_name)
        TextView deviceName;

        @BindView(R.id.device_brand)
        TextView deviceBrand;

        @BindView(R.id.technology)
        TextView technology;

        @BindView(R.id.root) // click on root-->(Linearlayout)----> open new activity --> Details By ( intent )
        LinearLayout root;

        public Mobaile_Holder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

}
