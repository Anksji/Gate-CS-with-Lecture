package com.rson.brothers.gatecswithlecture;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

/**
 * Created by Brother's on 6/21/2016.
 */
public class SelectTeacher extends Activity {

    Button ravindra,nptel,motivation,moreVideos;
    Config config=new Config();
    private AdView mAdView;
    //InterstitialAd mInterstitialAd;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_teacher);

        ravindra = (Button) findViewById(R.id.ravindra);
        nptel= (Button) findViewById(R.id.nptel);
        motivation= (Button) findViewById(R.id.motivation);
        moreVideos= (Button) findViewById(R.id.morevideo);

        mAdView= (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


       // mInterstitialAd = new InterstitialAd(this);
        //set the ad unit ID
       // mInterstitialAd.setAdUnitId(getString(R.string.select_teacher));

        AdRequest Request = new AdRequest.Builder()
                .build();

        // Load ads into Interstitial Ads
      /*  mInterstitialAd.loadAd(Request);

        mInterstitialAd.setAdListener(new AdListener() {
            public void onAdLoaded() {
                showInterstitial();
            }
        });*/




        ravindra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                config.setLectureTeacher(1);
                Intent intent =new Intent(SelectTeacher.this,VideoLec.class);
                startActivity(intent);
            }
        });

        nptel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                config.setLectureTeacher(2);
                Intent intent =new Intent(SelectTeacher.this,VideoLec.class);
                startActivity(intent);
            }
        });

        motivation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                config.setLectureTeacher(3);
                Intent intent =new Intent(SelectTeacher.this,VideoLec.class);
                startActivity(intent);
            }
        });

        moreVideos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                config.setLectureTeacher(4);
                Intent intent =new Intent(SelectTeacher.this,VideoLec.class);
                startActivity(intent);
            }
        });
    }

   /* private void showInterstitial() {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        }
    }*/
}
