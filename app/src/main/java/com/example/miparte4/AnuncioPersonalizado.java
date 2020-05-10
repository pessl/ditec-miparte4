package com.example.miparte4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;

public class AnuncioPersonalizado extends AppCompatActivity {

    private final VibrateReceiver receiver = new VibrateReceiver();
    private IntentFilter intentFilter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anuncio_personalizado);
        intentFilter = new IntentFilter("RESPONSE");
        intentFilter.addCategory(Intent.CATEGORY_DEFAULT);
        registerReceiver(receiver, intentFilter);
    }

    @Override
    protected void onDestroy() {
        unregisterReceiver(receiver);
        super.onDestroy();
    }

    public void vibrar(View view) {
        sendBroadcast(new Intent("RESPONSE"));
    }
}
