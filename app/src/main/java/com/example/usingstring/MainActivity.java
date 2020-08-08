package com.example.usingstring;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtview2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        txtview2 = findViewById(R.id.tvMsg2);
        txtview2.setText(R.string.Msg2);

        Log.i("LifeCycle", " !!! OnCreate method called !!! ");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i("LifeCycle", " !!! OnStarts method called !!! ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.i("LifeCycle", " !!! OnRestart method called !!! ");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i("LifeCycle", " !!! OnResume method called !!! ");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i("LifeCycle", " !!! OnPause method called !!! ");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i("LifeCycle", " !!! OnStop method called !!! ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i("LifeCycle", " !!! OnDestroy method called !!! ");
    }
}