package com.example.mmm.Service.neverEndingService;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.example.mmm.mainActivity;

/**
 * Created by Soapn on 24/01/2016.
 */
public class SensorRestarterBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i(mainActivity.class.getSimpleName() + "Check", SensorRestarterBroadcastReceiver.class.getSimpleName() + " : Service Stops! Oooooooooooooppppssssss!!!!");
        context.startService(new Intent(context, SensorService.class));;
    }

}
