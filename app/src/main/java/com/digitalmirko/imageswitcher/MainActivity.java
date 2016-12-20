package com.digitalmirko.imageswitcher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

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

        imageSwitcher = (ImageSwitcher) findViewById(R.id.imageSwitcher);

        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory(){
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(getApplicationContext());
                imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                imageView.setLayoutParams(
                        new ImageSwitcher.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                                ViewGroup.LayoutParams.MATCH_PARENT));

                return  imageView;
            }
        });

        Animation in = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.in);
        Animation out = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.out);

        imageSwitcher.setInAnimation(in);
        imageSwitcher.setOutAnimation(out);

        btnPrev = (Button) findViewById(R.id.btnPrev);
        btnNext = (Button) findViewById(R.id.btnNext);

        btnPrev.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(i > 0) {
                    i--;
                    imageSwitcher.setImageResource(images[i]);
                }
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(i < images.length - 1) {
                    i++;
                    imageSwitcher.setImageResource(images[i]);
                }
            }
        });
    }
}