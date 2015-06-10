package com.rson.brothers.gatecswithlecture;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.gms.ads.AdRequest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    Button btn,Topic,Info,AudioPlay,VideoLecture,About,OurADS,Forum,Bookstore,Blog,Officialbtn;
    //private AdView mAdView;
    //InterstitialAd mInterstitialAd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //StartAppSDK.init(this, "104130031", "204644773", true);

        btn = (Button) findViewById(R.id.button);
        Topic= (Button) findViewById(R.id.button1);
        Info= (Button) findViewById(R.id.info);
        AudioPlay= (Button) findViewById(R.id.audioRecorder);
        VideoLecture= (Button) findViewById(R.id.video_lecture);
        About= (Button) findViewById(R.id.about_us);

        Officialbtn=(Button) findViewById(R.id.official);
        OurADS= (Button) findViewById(R.id.myappads);

        Forum=(Button) findViewById(R.id.forum);
        Bookstore= (Button) findViewById(R.id.bookstore);
        Blog= (Button) findViewById(R.id.web_blog);
        // mAdView= (AdView) findViewById(R.id.adView);

        AdRequest adRequest = new AdRequest.Builder().build();

        try {
            if(CheckDate()){
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        showAddPopup();
                    }
                }, 2000);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }




        OurADS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=com.developers.rsons.gatecswithlecturespro")));
                }
                catch (Exception e){
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.developers.rsons.gatecswithlecturespro")));
                }

            }
        });


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, TopicScreen.class);
                startActivity(in);
            }
        });

        Topic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, TopicWise.class);
                startActivity(in);
            }
        });
        Info.setOnClickListener(new View.OnClickListener() {
           @Override
          public void onClick(View v) {
                Intent in= new Intent(MainActivity.this,InforMation.class);
               startActivity(in);
    }
});
        AudioPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in= new Intent(MainActivity.this,AudioRecording.class);
                startActivity(in);
            }
        });
        VideoLecture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in= new Intent(MainActivity.this,SelectTeacher.class);
                startActivity(in);
            }
        });
        About.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in= new Intent(MainActivity.this,AboutUs.class);
                startActivity(in);
            }
        });

        Forum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in= new Intent(MainActivity.this, com.rson.brothers.gatecswithlecture.Forum.class);
                startActivity(in);
            }
        });
        Bookstore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in= new Intent(MainActivity.this,BookCollection.class);
                startActivity(in);
            }
        });

        Blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in= new Intent(MainActivity.this, com.rson.brothers.gatecswithlecture.Blog.class);
                startActivity(in);
            }
        });

        Officialbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in= new Intent(MainActivity.this,Official.class);
                startActivity(in);
            }
        });


    }

    public boolean CheckDate() throws ParseException {

        boolean dateCheck=false;

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat mdformat = new SimpleDateFormat("dd/MM/yyyy");
        String strDate =  mdformat.format(calendar.getTime());

        String[] Currentdate=strDate.split("/");
        String cur_day=Currentdate[0];
        String cur_month=Currentdate[1];
        String cur_year=Currentdate[2];
        if(Integer.parseInt(cur_year)==2017&&Integer.parseInt(cur_month)<5){
            dateCheck=true;
        }
        else if(Integer.parseInt(cur_year)==2017&&Integer.parseInt(cur_month)==5){
              if(Integer.parseInt(cur_day)<=31){
                    dateCheck=true;
          }
    }
        //Toast.makeText(MainActivity.this,"This is todays date "+cur_day +" "+cur_month,Toast.LENGTH_LONG).show();
        //Log.e("Myteem","This is current time "+strDate);
        return dateCheck;
    }


    public void showAddPopup(){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        View mView = getLayoutInflater().inflate(R.layout.add_popup, null);

        ImageView Close = (ImageView) mView.findViewById(R.id.close_add);
        ImageView Addclick = (ImageView) mView.findViewById(R.id.add_click);
        builder.setView(mView);
        final AlertDialog dialog = builder.create();

        Close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });

        Addclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
                goToUrl("https://launchpad.kahaniya.com");

                //Toast.makeText(MainActivity.this,"You have clicked on image",Toast.LENGTH_SHORT).show();
            }
        });

        dialog.show();
    }

    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

    @Override
    public void onDetachedFromWindow() {

        super.onDetachedFromWindow();
    }

    @Override
    public void onPause() {

        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();

    }


    public void BackPopUp(){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        View mView = getLayoutInflater().inflate(R.layout.rate_us_popup, null);

        Button Cancel = (Button) mView.findViewById(R.id.cancel);
        Button Ok= (Button) mView.findViewById(R.id.ok);

        builder.setView(mView);
        final AlertDialog dialog = builder.create();
        Ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
                final String appPackageName = getPackageName();
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + appPackageName)));
                } catch (android.content.ActivityNotFoundException anfe) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=" + appPackageName)));
                }
            }
        });
        Cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
                finish();
            }
        });

        dialog.show();
    }

    @Override
    public void onBackPressed() {
        BackPopUp();
    }

    @Override
    public void onDestroy() {

        super.onDestroy();

    }

    @Override
    protected void onStop() {

        super.onStop();
    }

}
