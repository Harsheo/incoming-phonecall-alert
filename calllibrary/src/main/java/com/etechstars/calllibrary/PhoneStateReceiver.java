package com.etechstars.calllibrary;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class PhoneStateReceiver {
    public void onReceive(Context context, Intent intent) {
        try {
            System.out.println(" Getting an incoming phone call ");
            Toast.makeText(context," Getting an incoming phone call ",Toast.LENGTH_SHORT).show();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
