package com.example.slideview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private  ImageSlider imageSlider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageSlider=findViewById(R.id.imageslider);

        //Create List
        ArrayList<SlideModel>slideModels=new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.cat1,ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.cat2,ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.cat3,ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.cat4,ScaleTypes.FIT));

        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

    }
}