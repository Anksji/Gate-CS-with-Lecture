package com.rson.brothers.gatecswithlecture;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

/**
 * Created by Brother's on 3/30/2016.
 */
public class ScoreWindow extends Activity {

    TextView rank,text2,text3,Time,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15;
    int S=20;
    Button Finish,Review;
    ResultStatus resultStatus=new ResultStatus();
    static boolean ScoreWindowOpensReview=false;
    double ScorePercentage;
    Typeface fontstyle;

    //private StartAppAd startAppAd = new StartAppAd(this);

    private AdView mAdView;

    InterstitialAd mInterstitialAd;

   /* @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d("score", "your score in score window in on createView " + S);


                View rootView = inflater.inflate(R.layout.score,container,false);

                 return rootView;

    }*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // Chartboost.startWithAppId(this, "576cca22f6cd455584144959", "896a49557cf4ef953a1b24a4c9960e045e1977c0");
       // Chartboost.onCreate(this);
        setContentView(R.layout.score);
       // StartAppSDK.init(this, "104130031", "204644773", true);
      //  Intent in=getIntent();
        //int S=in.getIntExtra("key",0);
        fontstyle= Typeface.createFromAsset(this.getAssets(), "Regular.ttf");


        mInterstitialAd = new InterstitialAd(this);
        //set the ad unit ID
        mInterstitialAd.setAdUnitId(getString(R.string.test_result));

        AdRequest Request = new AdRequest.Builder().build();

        // Load ads into Interstitial Ads
        mInterstitialAd.loadAd(Request);

        mInterstitialAd.setAdListener(new AdListener() {
            public void onAdLoaded() {
                showInterstitial();
            }
        });


        text2= (TextView) findViewById(R.id.marks);
        text3=(TextView) findViewById(R.id.score);
        Time = (TextView) findViewById(R.id.time);
        rank= (TextView) findViewById(R.id.rank);

        t1= (TextView) findViewById(R.id.textView4);
        t2= (TextView) findViewById(R.id.textView5);
        t3= (TextView) findViewById(R.id.textView3);
        t4= (TextView) findViewById(R.id.textView2);

        t5= (TextView) findViewById(R.id.textView20);
        t6= (TextView) findViewById(R.id.textView21);
        t7= (TextView) findViewById(R.id.textView22);
        t8= (TextView) findViewById(R.id.textView23);
        t9= (TextView) findViewById(R.id.textView24);
        t10= (TextView) findViewById(R.id.textView25);
        t11= (TextView) findViewById(R.id.textView26);
        t12= (TextView) findViewById(R.id.textView27);
        t13= (TextView) findViewById(R.id.textView28);
        t14= (TextView) findViewById(R.id.textView29);
        t15= (TextView) findViewById(R.id.textView30);

        t1.setTypeface(fontstyle);
        t2.setTypeface(fontstyle);
        t3.setTypeface(fontstyle);
        t4.setTypeface(fontstyle);
        t5.setTypeface(fontstyle);
        t6.setTypeface(fontstyle);
        t7.setTypeface(fontstyle);
        t8.setTypeface(fontstyle);
        t9.setTypeface(fontstyle);
        t10.setTypeface(fontstyle);
        t11.setTypeface(fontstyle);
        t12.setTypeface(fontstyle);
        t13.setTypeface(fontstyle);
        t14.setTypeface(fontstyle);
        t15.setTypeface(fontstyle);

        text3.setTypeface(fontstyle);
        text2.setTypeface(fontstyle);
        Time.setTypeface(fontstyle);
        rank.setTypeface(fontstyle);
        Log.d("score", "your score in score window is " + S);
        PalletColour palletColour=new PalletColour();
        //text1.setText(""+palletColour.getFinalScore());



        mAdView= (AdView) findViewById(R.id.adView);

        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


       // String MyValue=""+palletColour.getFinalScore();
        String formattedValue=""+doubleToScale(palletColour.getFinalScore(),2);

        //String formattedValue = decimalFormat.format(MyValue);
        //text3.setText(formattedValue);
        ScoreWindowOpensReview=true;
        int k=resultStatus.getTopic();

        Time.setText(String.format(" " + "%d : %d ",

                TimeUnit.MILLISECONDS.toMinutes(resultStatus.getTotalTimeTaken()),
                TimeUnit.MILLISECONDS.toSeconds(resultStatus.getTotalTimeTaken()) -
                        TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.
                                toMinutes(resultStatus.getTotalTimeTaken()))));

        int TotalMarks=0;

        for(int i=0;i<palletColour.getNo_of_Question();i++){

           TotalMarks += palletColour.getMarks(i);

        }


        double du=Double.parseDouble(formattedValue);
        if(resultStatus.getSubjective()){
            ScorePercentage=((du/TotalMarks)*100);
        }else {
            ScorePercentage=((du/TotalMarks)*100);
        }

        if (ScorePercentage <= 0) {

                ScorePercentage=0;
        }
        text3.setText(""+doubleToScale(ScorePercentage,2)+"%");
        text2.setText(formattedValue);
        if(ScorePercentage<35){
            rank.setText("Fail");
        }else if(ScorePercentage>35 && ScorePercentage<50){
            rank.setText("D");
        }
        else if(ScorePercentage>50 && ScorePercentage<60){
            rank.setText("C");
        }
        else if(ScorePercentage>60 && ScorePercentage<75){
            rank.setText("B");
        }
        else if(ScorePercentage>75  && ScorePercentage<90){
            rank.setText("A");
        }
        else{
            rank.setText("A");
        }
        wb= (WebView)findViewById(R.id.webViewResult);
        Finish= (Button) findViewById(R.id.finish);
        Review= (Button) findViewById(R.id.review);


        Finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //ScoreWindowOpensReview=true;
                showInterstitial();
                Helper helper=new Helper();
                helper.isSetFinish(true);
                finish();
            }
        });
        Review.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ScoreWindowOpensReview=false;

                Helper helper=new Helper();
                helper.setOnReview(true);
               // Chartboost.showInterstitial(CBLocation.LOCATION_DEFAULT);
                //showInterstitial();

                //startAppAd.onBackPressed();
                Log.d("ReviewQuestion", "On Reviewing before finish ");
                finish();

               // Intent intent=new Intent(ScoreWindow.this,ProceedToQuestion.class);
                //intent.putExtra("position",11);
                //startActivity(intent);
            }
        });


        resultStatus=resultStatus.getContext();

        WebSettings webSettings = wb.getSettings();
        Log.d("Check", "after web setting ");
        webSettings.setJavaScriptEnabled(true);


        String path="file:///android_asset/result_page/";


        int totalNo_ofQuestion=0,TotalMarked=0,ToatalUnmarked=0,TotalCorrect=0,TotalWrong=0;

        for(int j=0;j<12;j++){

            totalNo_ofQuestion=totalNo_ofQuestion+resultStatus.getNoOfQuestion(j);
            TotalMarked=TotalMarked+resultStatus.getMarked(j);
            ToatalUnmarked=ToatalUnmarked+resultStatus.getUnmarked(j);
            TotalWrong=TotalWrong+resultStatus.getWrong(j);
            TotalCorrect=TotalCorrect+resultStatus.getCorrect(j);
        }


if(resultStatus.getSubjective()){

    s=getTable( MyTable(3, 6,getTextForDoubleHeading(6,"Topic", "<img src='" + path + "question.png'/>", "<img src='" + path + "marked2.png'/>", "<img src='" + path + "unmarked.png'/>", "<img src='" + path + "correct.png'/>", "<img src='" + path + "wrong.png'/>",
            resultStatus.getTopicName(k), ""+resultStatus.getNoOfQuestion(k), ""+resultStatus.getMarked(k), ""+resultStatus.getUnmarked(k), ""+resultStatus.getCorrect(k), ""+resultStatus.getWrong(k),
            "Total",                        ""+totalNo_ofQuestion,                   ""+TotalMarked,           ""+ToatalUnmarked                ,""+TotalCorrect,               ""+TotalWrong),true,false));


}else{
    s=getTable( MyTable(14, 6,getTextForDoubleHeading(6,"Topic", "<img src='" + path + "question.png'/>", "<img src='" + path + "marked2.png'/>", "<img src='" + path + "unmarked.png'/>", "<img src='" + path + "correct.png'/>", "<img src='" + path + "wrong.png'/>",
            resultStatus.getTopicName(0), ""+resultStatus.getNoOfQuestion(0), ""+resultStatus.getMarked(0), ""+resultStatus.getUnmarked(0), ""+resultStatus.getCorrect(0), ""+resultStatus.getWrong(0),
            resultStatus.getTopicName(1), ""+resultStatus.getNoOfQuestion(1), ""+resultStatus.getMarked(1), ""+resultStatus.getUnmarked(1), ""+resultStatus.getCorrect(1), ""+resultStatus.getWrong(1),
            resultStatus.getTopicName(2), ""+resultStatus.getNoOfQuestion(2), ""+resultStatus.getMarked(2), ""+resultStatus.getUnmarked(2), ""+resultStatus.getCorrect(2), ""+resultStatus.getWrong(2),
            resultStatus.getTopicName(3), ""+resultStatus.getNoOfQuestion(3), ""+resultStatus.getMarked(3), ""+resultStatus.getUnmarked(3), ""+resultStatus.getCorrect(3), ""+resultStatus.getWrong(3),
            resultStatus.getTopicName(4), ""+resultStatus.getNoOfQuestion(4), ""+resultStatus.getMarked(4), ""+resultStatus.getUnmarked(4), ""+resultStatus.getCorrect(4), ""+resultStatus.getWrong(4),
            resultStatus.getTopicName(5), ""+resultStatus.getNoOfQuestion(5), ""+resultStatus.getMarked(5), ""+resultStatus.getUnmarked(5), ""+resultStatus.getCorrect(5), ""+resultStatus.getWrong(5),
            resultStatus.getTopicName(6), ""+resultStatus.getNoOfQuestion(6), ""+resultStatus.getMarked(6), ""+resultStatus.getUnmarked(6), ""+resultStatus.getCorrect(6), ""+resultStatus.getWrong(6),
            resultStatus.getTopicName(7), ""+resultStatus.getNoOfQuestion(7), ""+resultStatus.getMarked(7), ""+resultStatus.getUnmarked(7), ""+resultStatus.getCorrect(7), ""+resultStatus.getWrong(7),
            resultStatus.getTopicName(8), ""+resultStatus.getNoOfQuestion(8), ""+resultStatus.getMarked(8), ""+resultStatus.getUnmarked(8), ""+resultStatus.getCorrect(8), ""+resultStatus.getWrong(8),
            resultStatus.getTopicName(9), ""+resultStatus.getNoOfQuestion(9), ""+resultStatus.getMarked(9), ""+resultStatus.getUnmarked(9), ""+resultStatus.getCorrect(9), ""+resultStatus.getWrong(9),
            resultStatus.getTopicName(10), ""+resultStatus.getNoOfQuestion(10), ""+resultStatus.getMarked(10), ""+resultStatus.getUnmarked(10), ""+resultStatus.getCorrect(10), ""+resultStatus.getWrong(10),
            resultStatus.getTopicName(11), ""+resultStatus.getNoOfQuestion(11), ""+resultStatus.getMarked(11), ""+resultStatus.getUnmarked(11), ""+resultStatus.getCorrect(11), ""+resultStatus.getWrong(11),
            "Total",                        ""+totalNo_ofQuestion,                   ""+TotalMarked,           ""+ToatalUnmarked                ,""+TotalCorrect,               ""+TotalWrong),true,false));

}

        wb.loadDataWithBaseURL("file:///android_assets/mathscribe/", s, "text/html", "UTF-8", null);



    }

    @Override
    public void onStart() {
        super.onStart();
       // Chartboost.onStart(this);
    }


    @Override
    public void onPause() {
        super.onPause();
       // Chartboost.onPause(this);
    }



    @Override
    public void onBackPressed() {
        // If an interstitial is on screen, close it.
       // Chartboost.showInterstitial(CBLocation.LOCATION_DEFAULT);
        //startAppAd.onBackPressed();
        showInterstitial();
        super.onBackPressed();
    }


    private void showInterstitial() {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        }
    }

    public static BigDecimal doubleToScale(double d, int scale){
        return new BigDecimal(d).setScale(scale, BigDecimal.ROUND_HALF_UP);
    }

    public static void setScoreWindowOpensReview(boolean scoreWindowOpensReview) {
        ScoreWindowOpensReview = scoreWindowOpensReview;
    }
    public boolean getScoreWindowOpensReview(){
        return ScoreWindowOpensReview;
    }

    String s;
    WebView wb;




    @Override
    protected void onResume() {
        super.onResume();
        PalletColour palletColour=new PalletColour();
        palletColour.setQid(0);
        //Chartboost.onResume(this);
        //finish();
        Log.e("ScoreWindow", "On Resume view is called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
      //  Chartboost.onDestroy(this);
        Log.e("ScoreWindow","On Destroy view is called");

    }

    @Override
    protected void onStop() {
        Log.e("ScoreWindow", "On Stop view is called");
        super.onStop();
      //  Chartboost.onStop(this);
       /* PalletColour palletColour=new PalletColour();
        palletColour.setQid(1);
        finish();*/
    }

    public String[][] getTextForDoubleHeading(int column_no,String s1,String s2,String s3,String s4,String s5,String s6,String s7,
                                              String s8,String s9,String s10,String s11,String s12,String s13,
                                              String s14,String s15,String s16,String s17,String s18,String s19,String s20,String s21,
                                              String s22,String s23,String s24,String s25,String s26,String s27,String s28,String s29,String s30,
                                              String s31,String s32,String s33,String s34,String s35,String s36,
                                              String s37,String s38,String s39,String s40,String s41,String s42,String s43,String s44,String s45,
                                              String s46,String s47,
                                              String s48,String s49,String s50,String s51,String s52,String s53,String s54,String s55,String s56,
                                              String s57,String s58,String s59,String s60,String s61,String s62,String s63,String s64,String s65,
                                              String s66,String s67,String s68,String s69,String s70,String s71,String s72,String s73,String s74,
                                              String s75,String s76,String s77,String s78,String s79,String s80,String s81,String s82,String s83,String s84){
        if(column_no==6){
            String[][] a = {{s1, s2, s3, s4, s5, s6},{s7,s8, s9, s10, s11, s12},{s13, s14,s15, s16, s17, s18},{s19, s20, s21,s22, s23, s24},{s25, s26, s27, s28,s29, s30},{s31, s32, s33, s34, s35,s36},{s37, s38, s39, s40, s41, s42},
                    {s43, s44, s45, s46, s47, s48},{s49,s50, s51, s52, s53, s54},{s55, s56,s57, s58, s59, s60},{s61, s62,s63, s64, s65, s66},{s67, s68,s69, s70, s71, s72},{s73, s74,s75, s76, s77, s78},{s79, s80,s81, s82, s83, s84}};

            return a;
        }

        return null;
    }

    public String[][] getTextForDoubleHeading(int column_no,String s1,String s2,String s3,String s4,String s5,String s6,String s7,
                                              String s8,String s9,String s10,String s11,String s12,String s13,
                                              String s14,String s15,String s16,String s17,String s18){
        if(column_no==6){
            String[][] a = {{s1, s2, s3, s4, s5, s6},{s7,s8, s9, s10, s11, s12},{s13, s14,s15, s16, s17, s18}};

            return a;
        }

        return null;
    }



    public String MyTable(int row_no, int column_no,String[][] a, boolean heading_top,boolean heading_left){
        Log.d("test", "we are start of inside my table");
        String x;
        int i=0,j=0;

        x="<table border=1 cellpadding=\"2\">";

        if(heading_top) {
            j=1;
            x=x+"<tr>" ;
            for (i = 0; i < column_no; i++) {
                x = x + "<th bgcolor=\"#5C97BF\">" + a[0][i] + "</th>";

            }

            x = x + "</tr>";
        }
        for(i=j;i<row_no-1;i++){
            j=0;
            x=x+"<tr>";
            if(heading_left){
                x = x + "<td bgcolor=\"#5C97BF\">" + a[i][j] + "</td>";
                j++;
            }
            for(j=j;j<column_no;j++){

                x=x+"<td>"+a[i][j]+"</td>";
            }



        }
        x=x+"<tr>";
        for(j=0;j<column_no;j++){

            x=x+"<th  bgcolor=\"#badaf5\">"+a[i][j]+"</th>";
        }
        x=x+"</tr>";
        x=x+"</table>";
        Log.d("test", "we are end of inside my table");
        return x;
    }
    public  String getTable(String s1){
        String path = "file:///android_asset/mathscribe/";
        String js = "<!DOCTYPE html><head>" +
                "<style type=\"text/css\">\n" +
                "                    @font-face {\n" +
                "                       font-family: MyFont;\n" +
                "                       src: url(\'file:///android_asset/fonts/Regular.ttf')\n" +
                "                    }\n" +
                "                    body {\n" +
                "                        font-family: MyFont;\n" +
                "                        font-size: medium;\n" +
                "                    }\n" +
                "                 </style>\n"

                + "</head><body>";
        js = js + s1;
        js = js + "</script></body></html>";

        return js;

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id=item.getItemId();


        if(id==android.R.id.home){
            NavUtils.navigateUpFromSameTask(this);
        }

        return super.onOptionsItemSelected(item);

    }
}
