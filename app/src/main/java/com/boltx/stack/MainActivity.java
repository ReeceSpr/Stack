package com.boltx.stack;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.animation.PathInterpolatorCompat;

import android.os.Bundle;
import android.transition.Fade;
import android.transition.Scene;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        animate();
    }

    void animate(){
        ImageView logo = findViewById(R.id.imageView);
        Fade mFade;
        ViewGroup rootView;

        // Get the root view and create a transition
        rootView = (ViewGroup) findViewById(R.id.main_layout);
        mFade = new Fade(Fade.OUT);

        //Add easing
        Interpolator customInterpolator = PathInterpolatorCompat.create((float) 0.420, (float) 0.000, (float) 0.580, (float) 1.000);
        mFade.setInterpolator(customInterpolator);

        TransitionManager.beginDelayedTransition(rootView, mFade);

        logo.animate().translationY(2000).setDuration(1000);
    }
}
