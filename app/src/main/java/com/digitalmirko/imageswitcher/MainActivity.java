package com.digitalmirko.imageswitcher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageSwitcher;

public class MainActivity extends AppCompatActivity {

    Button btnPrev, btnNext;

    ImageSwitcher imageSwitcher;

    Integer[] images = {R.drawable.zoo01, R.drawable.zoo02, R.drawable.zoo03, R.drawable.zoo04,
                        R.drawable.zoo05, R.drawable.zoo06, R.drawable.zoo07, R.drawable.zoo08,
                        R.drawable.zoo09, R.drawable.zoo10, R.drawable.zoo11, R.drawable.zoo12};

    int i = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
