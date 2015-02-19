package com.swpbiz.myinstagram;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends Activity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void handleFacebook(View view) {
        Toast.makeText(this, "On no.. times up facebook!", Toast.LENGTH_SHORT).show();
    }

    public void handleEmail(View view) {
        Toast.makeText(this, "On no.. times up email!", Toast.LENGTH_SHORT).show();
    }

    public void handleAccount(View view) {
        Toast.makeText(this, "On no.. times up account!", Toast.LENGTH_SHORT).show();
    }

}
