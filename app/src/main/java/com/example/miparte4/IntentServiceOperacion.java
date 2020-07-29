package com.example.miparte4;

import android.annotation.SuppressLint;
import android.app.IntentService;
import android.content.Intent;
import android.os.SystemClock;
import android.view.View;

public class IntentServiceOperacion extends IntentService {

    public IntentServiceOperacion() {
        super("IntentServiceOperacion");
    }

    @SuppressLint("WrongThread")
    @Override
    protected void onHandleIntent(Intent intent) {
        double n = intent.getExtras().getDouble("numero");
        SystemClock.sleep(25000);
        /*MiIntentService.salida.append(n*n + "\n");

        MiIntentService.miprogress.setVisibility(View.GONE);*/

        Intent i = new Intent();
        i.setAction(MiIntentService.ReceptorOperacion.ACTION_RESP);
        i.addCategory(Intent.CATEGORY_DEFAULT);
        i.putExtra("resultado", n*n);
        sendBroadcast(i);
    }
}