package com.rson.brothers.gatecswithlecture;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Brother's on 5/15/2016.
 */
public class PlayAudio extends Activity implements View.OnClickListener{


    public static ArrayList songList;
    final ArrayList songListData=new ArrayList<>();
    public static List<String> myList = new ArrayList<String>();
    Button stop,delete,resume;
    private MediaPlayer mp =null;
    ArrayAdapter<String> adapter;
    Boolean itemSelected=false,longClicked=false,deleteSelect=false;
    private static String[] files = null;
    private static ListView listView;
    private static View deleteView;
    private static int Position=-1;
    private static long i=-1;
    boolean songCompleted=false;

    private static int pause,play;

    SeekBar seek_bar;
    private  static boolean playOn=true;
    Button  pause_button,backward,farward;
    private int forwardTime = 5000;
    private int backwardTime = 5000;
    // MediaPlayer player=null;
    ImageButton play_button;
    private static TextView text_shown,tx1,tx2;
    Handler seekHandler = new Handler();
    private static String mediaPath,path;
    private static long finalTime,presentTime;
    private static boolean playing=false;
    float seekPosition=0,fileLength,result;
    // DecimalFormat f = new DecimalFormat("##.00");
    //private StartAppAd startAppAd = new StartAppAd(this);



    public static final String MEDIA_PATH = new String(Environment.getExternalStorageDirectory().getAbsolutePath() +"/AudioRecorder/");
    // public static final String MEDIA_PATH = new String( Environment.getExternalStorageDirectory() + File.separator + "/TollCulator/");

        private AdView mAdView;
    InterstitialAd mInterstitialAd;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.plalist);

       // StartAppSDK.init(this, "104130031", "204644773", true);

        // pause = (Button) findViewById(R.id.pause);
        // pause.setOnClickListener(this);
        farward = (Button) findViewById(R.id.farward);
        farward.setOnClickListener(this);
        backward = (Button) findViewById(R.id.backward);
        backward.setOnClickListener(this);
        delete = (Button) findViewById(R.id.delete);
        delete.setOnClickListener(this);

        seek_bar = (SeekBar) findViewById(R.id.seek_bar);
        play_button = (ImageButton) findViewById(R.id.play);
        text_shown = (TextView) findViewById(R.id.text_shown);
        tx1= (TextView) findViewById(R.id.textView);
        tx2= (TextView) findViewById(R.id.textView2);
        play_button.setOnClickListener(this);

        tx1.setText("00 : 00");
        tx2.setText("00 : 00");
        play= R.drawable.play;
        pause= R.drawable.pause;
        //seek_bar.setMax(mp.getDuration());
        // resume = (Button) findViewById(R.id.play);
        // resume.setOnClickListener(this);

        //l=getListView();

        //SongsManager song=new SongsManager();
        //songList=song.getPlayList();




        listView = (ListView) findViewById(R.id.list);
        path=Environment.getExternalStorageDirectory() + "/AudioRecorder/";
        //path= Environment.getExternalStorageDirectory() + File.separator + "/TollCulator/";
        files = new File(Environment.getExternalStorageDirectory() + "/AudioRecorder/").list();
        //files = new File(Environment.getExternalStorageDirectory() + File.separator + "/TollCulator/").list();
        sortAscending();

        adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, files);
        listView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        //listView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE_MODAL);

        //getInit();
        // if(!deleteSelect)
        // seekUpdation();




        mAdView= (AdView)findViewById(R.id.adView);

        AdRequest equest = new AdRequest.Builder().build();
        mAdView.loadAd(equest);




        mp=new MediaPlayer();


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
               /* view.setBackgroundColor(getResources().getColor(
                        R.color.pressed_color));*/
                // view.setBackgroundColor(getResources().getColor(R.drawable.bg_key));
                if (deleteSelect) {
                    deleteView.setBackgroundColor(getResources().getColor(R.color.default_color));
                }
                if (!longClicked) {
                    if (itemSelected) {
                        view.setSelected(false);
                    }
                    itemSelected = true;
                    view.setSelected(true);

                    if (mp != null) {
                        mp.release();
                        mp = null;
                    }
                    mp = new MediaPlayer();
                    //checking the position of item in list
                    Object listItem = listView.getItemAtPosition(position);
                    setPositionView(position, view);
                    playSong(MEDIA_PATH + listItem);


                    mediaPath = MEDIA_PATH + listItem;

                    Toast.makeText(PlayAudio.this, "" + listItem, Toast.LENGTH_SHORT).show();
                }

                longClicked = false;
                deleteSelect = false;
                //play_button.setImageResource(R.drawable.play);

            }

        });


        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {

            @Override
            public boolean onItemLongClick(AdapterView<?> arg0, View view,
                                           final int position, long arg3) {
                //view.setSelected(false);
                // TODO Auto-generated method stub
                longClicked = true;

                if (mp != null) {
                    seekHandler.removeCallbacks(run);
                    mp.release();
                    mp = null;
                }


                AlertDialog.Builder alert = new AlertDialog.Builder(PlayAudio.this);
                alert.setTitle("Rename");

                final EditText input = new EditText(PlayAudio.this);
                alert.setView(input);
                alert.setCancelable(false);

                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {

                        //update your listview here
                        // final String ext =   listView.substring(listView.indexOf(".") + 1);
                        Object listItem = listView.getItemAtPosition(position);

                        File from = new File(path + listItem);

                        String srt1 = input.getEditableText().toString();


                        File to = new File(path + srt1 + "." + "wav");


                        boolean success = from.renameTo(to);
                        if (success) {
                            Toast.makeText(PlayAudio.this, "File is Renamed", Toast.LENGTH_SHORT).show();
                            adapter.notifyDataSetChanged();
                            sortAscending();
                            playing = false;
                            itemSelected = false;
                            Intent intent = getIntent();
                            finish();
                            startActivity(intent);
                        }


                    }


                });

                alert.setNegativeButton("CANCEL",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int whichButton) {
                                dialog.cancel();

                                playing = false;
                                itemSelected = false;
                                Intent intent = getIntent();
                                finish();
                                startActivity(intent);
                            }

                        });
                AlertDialog alertDialog = alert.create();
                alertDialog.show();


                return false;
            }
        });



        mInterstitialAd = new InterstitialAd(this);
        //set the ad unit ID
        mInterstitialAd.setAdUnitId(getString(R.string.audio_play_interestrial));

        AdRequest adRequest = new AdRequest.Builder().build();

        // Load ads into Interstitial Ads
        mInterstitialAd.loadAd(adRequest);

        mInterstitialAd.setAdListener(new AdListener() {
            public void onAdLoaded() {
                showInterstitial();
            }
        });

    }

    private void showInterstitial() {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        }
    }

    @Override    public void onBackPressed() {
        //startAppAd.onBackPressed();
        //showInterstitial();
        super.onBackPressed();
    }

    @Override
    protected void onDestroy() {
        if(deleteSelect){

        }else {
            seekHandler.removeCallbacks(run);
            if(mp!=null){
                mp.release();
            }

            mp = null;
        }
        super.onDestroy();
    }



    Runnable run = new Runnable() {

        @Override
        public void run() {
            if(longClicked  ||deleteSelect){

            }
            else {
                seekUpdation();
            }
        }
    };

    public void seekUpdation() {
        presentTime = mp.getCurrentPosition();

        if(playing) {

            tx1.setText(String.format("%d : %d ",

                    TimeUnit.MILLISECONDS.toMinutes((long) presentTime),
                    TimeUnit.MILLISECONDS.toSeconds((long) presentTime) -
                            TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.
                                    toMinutes((long) presentTime))));
        }


        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

            public void onCompletion(MediaPlayer mp) {
                play_button.setImageResource(play);
                songCompleted = true;
                Log.i("Completion Listener", "Song Complete");
                Toast.makeText(PlayAudio.this, "Media Completed", Toast.LENGTH_SHORT).show();
            }
        });
        if(songCompleted){

        }else{
            seek_bar.setProgress((int) presentTime);
            seekHandler.postDelayed(run, 100);

        }
        Log.i("time", "revolveing loop");




    }
    private void setPositionView(int pos, View v){
        Position=pos;
        deleteView=v;
    }

    private void sortAscending () {
        List<String> sortedList = Arrays.asList(files);
        Collections.sort(sortedList);

        files = (String[]) sortedList.toArray();
    }



    private void playSong(String songPath) {
        playing=true;
        songCompleted=false;
        // play_button.setImageResource(R.drawable.pause);
        //Log.d("button","button colour changed");
        try {

            mp.reset();
            mp.setDataSource(songPath);
            mp.prepare();
            playOn=true;
            if (playOn){
                playOn=false;
                play_button.setImageResource(pause);

                mp.start();
                Log.d("button", "button colour changed");
            }


            seek_bar.setMax(mp.getDuration());
            finalTime=mp.getDuration();
            presentTime=mp.getCurrentPosition();
            setTime();

            seek_bar.setProgress((int) presentTime);
            seekHandler.postDelayed(run, 100);


        } catch (IOException e) {
            Log.v(getString(R.string.app_name), e.getMessage());
        }
    }
    public static void setTime(){
        tx2.setText(String.format("%d : %d ",
                TimeUnit.MILLISECONDS.toMinutes((long) finalTime),
                TimeUnit.MILLISECONDS.toSeconds((long) finalTime) -
                        TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) finalTime))));

        tx1.setText(String.format("%d : %d ",
                TimeUnit.MILLISECONDS.toMinutes((long) presentTime),
                TimeUnit.MILLISECONDS.toSeconds((long) presentTime) -
                        TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long) presentTime))));

        Object listItem = listView.getItemAtPosition(Position);
        String s,s2;
        s=""+listItem;
        s2=s.replace(".wav","");
        text_shown.setText(s2);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){

            case R.id.farward:

                if(itemSelected && mp!=null){
                    int temp = (int)presentTime;

                    if((temp+forwardTime)<=finalTime){
                        presentTime = presentTime + forwardTime;
                        mp.seekTo((int) presentTime);
                    }
                }
                else{
                    Toast.makeText(this,"This time Not playing any file",Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.play:

                if(itemSelected){
                    if(deleteSelect || songCompleted){
                        mp=new MediaPlayer();
                        Object ob=listView.getItemAtPosition(Position);
                        playSong(MEDIA_PATH + ob);
                        deleteSelect=false;
                        deleteView.setBackgroundColor(getResources().getColor(R.color.default_color));
                    }
                    if (playOn){

                        playOn=false;
                        play_button.setImageResource(pause);

                        mp.start();
                    }else{

                        playOn=true;
                        play_button.setImageResource(play);

                        mp.pause();
                    }

                }
                else{
                    Toast.makeText(this,"This time Not playing any file",Toast.LENGTH_LONG).show();
                }

                break;
            case R.id.backward:
                if(itemSelected&& mp!=null) {
                    int temp = (int) presentTime;

                    if ((temp - backwardTime) > 0) {
                        presentTime = presentTime - backwardTime;
                        mp.seekTo((int) presentTime);
                    }
                }
                else{
                    Toast.makeText(this,"This time Not playing any file",Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.delete:
                if(deleteSelect){
                    Object listItem = listView.getItemAtPosition(Position);
                    playing=false;
                    File from = new File(path + listItem);

                    from.delete();
                    adapter.notifyDataSetChanged();
                    deleteSelect=false;
                    Toast.makeText(this,"File successufully deleted",Toast.LENGTH_LONG).show();
                    Intent intent = getIntent();
                    finish();
                    startActivity(intent);
                }
                else{


                    if(itemSelected){
                        deleteSelect=true;
                        mp.release();
                        mp=null;
                        seekHandler.removeCallbacks(run);
                        deleteView.setBackgroundColor(getResources().getColor(R.color.pressed_color));
                        Toast.makeText(this,"File is Selected Now Press again to delete File",Toast.LENGTH_LONG).show();
                    }
                    else{
                        Toast.makeText(this,"You have not selected any file to delete",Toast.LENGTH_LONG).show();
                    }




                }
                break;
            case DEFAULT_KEYS_DIALER:
                Toast.makeText(this,"This is Inactive button",Toast.LENGTH_LONG).show();
                break;

        }
    }


}
