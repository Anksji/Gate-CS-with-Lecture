package com.rson.brothers.gatecswithlecture;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Brother's on 5/15/2016.
 */

public class InforMation extends AppCompatActivity implements Comm {

   // InterstitialAd mInterstitialAd;

    //private StartAppAd startAppAd = new StartAppAd(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.information_activity);

        //StartAppSDK.init(this, "104130031", "204413821", true);

        //startAppAd.onBackPressed();

     /*   mInterstitialAd = new InterstitialAd(this);
        //set the ad unit ID
        mInterstitialAd.setAdUnitId(getString(R.string.info));

        AdRequest Request = new AdRequest.Builder()
                .build();

        // Load ads into Interstitial Ads
        mInterstitialAd.loadAd(Request);

        mInterstitialAd.setAdListener(new AdListener() {
            public void onAdLoaded() {
                showInterstitial();
            }
        });
*/

        Helper helper=new Helper();
        helper.setAboutUsIntro(false);
    }

   /* private void showInterstitial() {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        }
    }
*/
    @Override
    public void respond(int data) {
        FragmentManager fragmentManager = this.getSupportFragmentManager();
        DescriptionFrag descriptionFrag= (DescriptionFrag) fragmentManager.findFragmentById(R.id.fragment2);
        descriptionFrag.changeData(data);

    }
}
