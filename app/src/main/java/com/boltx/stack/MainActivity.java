package com.boltx.stack;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //setViewPagerFragment();
        //animateOnStart();
    }

    void addButtonOnClick (){

    }

    void setViewPagerFragment(){
        ViewPager viewPager = findViewById(R.id.viewpager_main);
        PagerAdapter pagerAdapter = new MainPageAdaptor(getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapter);

    }
    /*
    void animateOnStart(){
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
    }*/
}
