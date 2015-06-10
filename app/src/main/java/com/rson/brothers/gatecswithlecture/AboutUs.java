package com.rson.brothers.gatecswithlecture;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Brother's on 5/19/2016.
 */
public class AboutUs extends AppCompatActivity implements Comm {

    //InterstitialAd mInterstitialAd;

    //private StartAppAd startAppAd = new StartAppAd(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.information_activity);
        //StartAppSDK.init(this, "104130031", "204644773", true);

        Helper helper=new Helper();
        helper.setAboutUsIntro(true);



    }



    @Override
    public void onResume() {
        super.onResume();

    }

    @Override
    public void respond(int data) {
        FragmentManager fragmentManager = this.getSupportFragmentManager();
        DescriptionFrag descriptionFrag= (DescriptionFrag) fragmentManager.findFragmentById(R.id.fragment2);
        descriptionFrag.changeData(data);

    }
}
