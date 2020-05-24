package com.example.miparte4;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.SystemClock;

public class ServicioOperacion extends Service {

    @Override
    public int onStartCommand(Intent i, int flags, int idArranque){
        double n = i.getExtras().getDouble("numero");
        SystemClock.sleep(25000);
        MiIntentService.salida.append(n*n + "\n");
        return START_NOT_STICKY;
    }
    @Override
    public IBinder onBind(Intent arg0) {
        return null;
    }
}