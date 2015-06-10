package com.rson.brothers.gatecswithlecture;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.chartboost.sdk.CBLocation;
import com.chartboost.sdk.Chartboost;

/**
 * Created by Brother's on 5/15/2016.
 */
public class VideoLec extends Activity {
        TextView txt;

    //InterstitialAd mInterstitialAd;

   // private StartAppAd startAppAd = new StartAppAd(this);

    ListView l;

    String[] Topic = {"Theory of Computation", "Compiler Design", "Computer Network","Computer Network problems", "Algorithms and Data Structure",
            "Operating System", "Database", "Computer Organization", "Digital logic","Pemutation and combination", "Calculus","Linear Algebra"};

    String[] Topic2 = {"Theory of Computation", "Compiler Design", "Computer Network", "Data Structure and Algorithms",
            "Operating System", "Database", "Computer Organization", "Digital Circuits and Systems","Discrete Mathematical Structures"};

    String[] Topic3={"Build up Yourself","Happy Life","Tips By Ravindra Sir","By Sandeep Maheshwari","By Shiv Khera","Vasant Chauhan"};

    String[] Topic4={"Maths Paper Solutions"};

    Typeface fontstyle;

  //  InterstitialAd mInterstitialAd;
   // private StartAppAd startAppAd = new StartAppAd(this);

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Chartboost.startWithAppId(this, "579f9bad04b01656a4b2eb5e", "9faab1710cfb763e82f82ef2ba1a435c7178ff60");
         Chartboost.onCreate(this);
        setContentView(R.layout.video_lec);


        //Chartboost.showInterstitial(CBLocation.LOCATION_DEFAULT);

        l = (ListView) findViewById(R.id.listView2);
        //ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.Topic, android.R.layout.simple_list_item_1);
        // l.setAdapter(adapter);
        //l.setOnItemClickListener(this);
        Config conobj=new Config();
        if(conobj.getLectureTeacher()==1){
            l.setAdapter(new CustomAdapter(VideoLec.this,Topic));
        }else if((conobj.getLectureTeacher()==2)){
            l.setAdapter(new CustomAdapter(VideoLec.this,Topic2));
        }else if((conobj.getLectureTeacher()==3)){
            l.setAdapter(new CustomAdapter(VideoLec.this,Topic3));
        }
        else if((conobj.getLectureTeacher()==4)){
            l.setAdapter(new CustomAdapter(VideoLec.this,Topic4));
        }

        fontstyle= Typeface.createFromAsset(this.getAssets(), "Regular.ttf");


       // StartAppSDK.init(this, "104130031", "204644773", true);
        //startAppAd.onBackPressed();

       /* mInterstitialAd = new InterstitialAd(this);
        //set the ad unit ID
        mInterstitialAd.setAdUnitId(getString(R.string.video_main_Menu));

        AdRequest Request = new AdRequest.Builder().build();

        // Load ads into Interstitial Ads
        mInterstitialAd.loadAd(Request);

      /*  mInterstitialAd.setAdListener(new AdListener() {
            public void onAdLoaded() {
                showInterstitial();
            }
        });*/

    }

    /*private void showInterstitial() {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        }
    }*/


    @Override
    public void onStart() {
        super.onStart();
         Chartboost.onStart(this);
    }


    @Override
    public void onPause() {
        super.onPause();
         Chartboost.onPause(this);
    }



    @Override
    public void onBackPressed() {

        Chartboost.showInterstitial(CBLocation.LOCATION_DEFAULT);
        super.onBackPressed();
    }


    @Override
    protected void onResume() {
        super.onResume();

        Chartboost.onResume(this);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
          Chartboost.onDestroy(this);

    }

    @Override
    protected void onStop() {

        super.onStop();
          Chartboost.onStop(this);

    }



    public class CustomAdapter extends BaseAdapter {
        String [] result;
        Context context;

        private LayoutInflater inflater=null;

        public CustomAdapter(Context mainActivity, String[] YearList) {
            // TODO Auto-generated constructor stub
            result=YearList;
            context=mainActivity;

            inflater = ( LayoutInflater )context.
                    getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        @Override
        public int getCount() {
            // TODO Auto-generated method stub
            return result.length;
        }

        @Override
        public Object getItem(int position) {
            // TODO Auto-generated method stub
            return position;
        }

        @Override
        public long getItemId(int position) {
            // TODO Auto-generated method stub
            return position;
        }

        public class Holder
        {
            TextView tv,No_of_vid;

        }
        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {

            // TODO Auto-generated method stub

            Holder holder=new Holder();
            View rowView;
            rowView = inflater.inflate(R.layout.videomenurow, null);
            holder.tv=(TextView) rowView.findViewById(R.id.listItems);
            holder.No_of_vid=(TextView) rowView.findViewById(R.id.vid_number);
            holder.tv.setTypeface(fontstyle);
            VideoMenu No_of_Video=new VideoMenu();
            Config config=new Config();
            int i=config.getLectureTeacher();
            holder.No_of_vid.setText(""+No_of_Video.ReturnVideoNumber(position,i));
            holder.tv.setText(result[position]);

            rowView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    if(position>=0){

                        Config contxt=new Config();
                        contxt.setSubject(position);

                        Intent in =new Intent(VideoLec.this,VideoMenu.class);
                        startActivity(in);

                        // Toast.makeText(this, "This is list clicked at ", Toast.LENGTH_SHORT).show();
                    }

                }
            });
            return rowView;
        }

    }
}
