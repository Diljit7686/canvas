package com.example.canvas;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //1. setup the canvas

        // make a variable for drawing
        ImageView imageview = findViewById(R.id.imageView);
        Bitmap b = Bitmap.createBitmap(300,500, Bitmap.Config.ARGB_8888);

        // set canvas
        Canvas canvas = new Canvas(b);

        // setup paintbrush

        Paint paintbrush = new Paint();


        //draw some stuff on canvas







        // put the canvas into frame
        imageview.setImageBitmap(b);
    }
}
