package com.gestioneapi.app;

import java.util.List;
import java.util.Random;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

public class MainActivity extends ListActivity {



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main );

    }

    // Will be called via the onClick attribute
    // of the buttons in main.xml
    public void onClick(View view) {

    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

}