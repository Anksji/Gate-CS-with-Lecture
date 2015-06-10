package com.rson.brothers.gatecswithlecture;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.startapp.android.publish.StartAppAd;

public class Instruction extends AppCompatActivity {
    Button button;
    int position;
    boolean Selecttopic;
    int i;
    private AdView mAdView;

    InterstitialAd mInterstitialAd;

    private StartAppAd startAppAd = new StartAppAd(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instruction);

       // StartAppSDK.init(this, "104130031", "204644773", true);

        button = (Button) findViewById(R.id.bigen);

        Selecttopic = getIntent().getExtras().getBoolean("TopicWise", false);
        i = getIntent().getExtras().getInt("Subject", 0);
        position = getIntent().getExtras().getInt("position", 0);


        //startAppAd.onBackPressed();

        mAdView = (AdView) findViewById(R.id.adView);

        AdRequest adRequest = new AdRequest.Builder().build();

        mAdView.loadAd(adRequest);


        mInterstitialAd = new InterstitialAd(this);
        //set the ad unit ID
        mInterstitialAd.setAdUnitId(getString(R.string.start_test));

        AdRequest Request = new AdRequest.Builder().build();

        // Load ads into Interstitial Ads
        mInterstitialAd.loadAd(Request);


        mInterstitialAd.setAdListener(new AdListener() {
            public void onAdLoaded() {
                showInterstitial();
            }
        });


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Selecttopic) {
                    // Toast.makeText(Instruction.this, Topic[i]+" is selected", Toast.LENGTH_SHORT).show();
                    Intent in = new Intent(Instruction.this, ProceedToQuestion.class);
                    in.putExtra("position", position);
                    in.putExtra("TopicWise", true);
                    in.putExtra("Subject", i);
                    startActivity(in);
                } else {
                    Intent in = new Intent(Instruction.this, ProceedToQuestion.class);
                    in.putExtra("position", position);
                    in.putExtra("TopicWise", false);
                    in.putExtra("Subject", 0);
                    startActivity(in);
                }

                //showInterstitial();

            }
        });


    }

    private void showInterstitial() {
        if (mInterstitialAd.isLoaded()) {
            startAppAd.onBackPressed();
            //mInterstitialAd.show();
        }
    }
}
