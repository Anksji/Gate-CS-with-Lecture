package com.rson.brothers.gatecswithlecture;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.AudioFormat;
import android.media.AudioRecord;
import android.media.MediaRecorder;
import android.os.Bundle;
import android.os.Environment;
import android.os.SystemClock;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import static android.Manifest.permission.RECORD_AUDIO;
import static android.Manifest.permission.WRITE_EXTERNAL_STORAGE;

//import com.startapp.android.publish.StartAppSDK;

/**
 * Created by Brother's on 5/15/2016.
 */
public class AudioRecording extends Activity {
    private static final int RECORDER_BPP = 16;
    private static final String AUDIO_RECORDER_FILE_EXT_WAV = ".wav";
    private static final String AUDIO_RECORDER_FOLDER = "AudioRecorder";
    private static final String AUDIO_RECORDER_TEMP_FILE = "record_temp.raw";
    private static final int RECORDER_SAMPLERATE = 11025;
    private static final int RECORDER_CHANNELS = AudioFormat.CHANNEL_IN_STEREO;
    private static final int RECORDER_AUDIO_ENCODING = AudioFormat.ENCODING_PCM_16BIT;

    private AudioRecord recorder = null;
    private int bufferSize = 0;
    private Thread recordingThread = null;
    private boolean isRecording = false;
    ImageButton Startbutton;
    TextView stopwatch;
    boolean startRecording=true,pauseRecording=false,Recording=false;
    private  static int startrecordingImage,stopRecording;
    Button play,pause;
    long timeWhenStopped = 0;
    Chronometer StopWatch;

    InterstitialAd mInterstitialAd;

    //private StartAppAd startAppAd = new StartAppAd(this);

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.audio_recording);
        //StartAppSDK.init(this, "104130031", "204644773", true);

        setButtonHandlers();


        // startAppAd.onBackPressed();


//        enableButtons(false);


        mInterstitialAd = new InterstitialAd(this);
        //set the ad unit ID
        mInterstitialAd.setAdUnitId(getString(R.string.interstitial_ad_unit_id));

        AdRequest adRequest = new AdRequest.Builder().build();

        // Load ads into Interstitial Ads
        mInterstitialAd.loadAd(adRequest);

        mInterstitialAd.setAdListener(new AdListener() {
            public void onAdLoaded() {
                showInterstitial();
            }
        });



        startrecordingImage= R.drawable.recording;
        stopRecording= R.drawable.startrecording;

        play= (Button) findViewById(R.id.playaudio);
        stopwatch= (TextView) findViewById(R.id.stopwatch);
        StopWatch=(Chronometer)findViewById(R.id.stopwatch);


        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkPermission()){
                    Intent in =new Intent(AudioRecording.this,PlayAudio.class);
                    startActivity(in);
                }else {
                    requestPermission();
                }

            }
        });

        bufferSize = AudioRecord.getMinBufferSize(11025,
                AudioFormat.CHANNEL_IN_MONO,
                AudioFormat.ENCODING_PCM_16BIT);

        String filepath = Environment.getExternalStorageDirectory().getPath();
        File file = new File(filepath,AUDIO_RECORDER_FOLDER);
       /* File file = new File(Environment.getExternalStorageDirectory() +
                File.separator + "TollCulator/");*/

        if(!file.exists()){
            file.mkdirs();
        }
    }

    private void showInterstitial() {

        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        }

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        showInterstitial();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //showInterstitial();
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        //showInterstitial();
    }



    private void setButtonHandlers() {
        Startbutton=((ImageButton)findViewById(R.id.btnStart));
        Startbutton.setOnClickListener(btnClick);
        pause= (Button) findViewById(R.id.pauserecording);
        pause.setOnClickListener(btnClick);
        //((Button)findViewById(R.id.btnStop)).setOnClickListener(btnClick);
    }

    private void enableButton(int id,boolean isEnable){
        ((ImageButton)findViewById(id)).setEnabled(isEnable);
    }

    private void enableButtons(boolean isRecording) {
        //enableButton(R.id.btnStart,!isRecording);
        //
        // enableButton(R.id.btnStop,isRecording);
    }

    private String getFilename(){
        String filepath = Environment.getExternalStorageDirectory().getPath();
        File file = new File(filepath,AUDIO_RECORDER_FOLDER);
       /* File file = new File(Environment.getExternalStorageDirectory() +
                File.separator + "TollCulator/");*/

        if(!file.exists()){
            file.mkdirs();
        }

        return (file.getAbsolutePath() + "/" + System.currentTimeMillis() + AUDIO_RECORDER_FILE_EXT_WAV);
    }

    private String getTempFilename(){
        String filepath = Environment.getExternalStorageDirectory().getPath();
        File file = new File(filepath,AUDIO_RECORDER_FOLDER);
        /*File file = new File(Environment.getExternalStorageDirectory() +
                File.separator + "TollCulator/");*/

        if(!file.exists()){
            file.mkdirs();
        }

        File tempFile = new File(filepath,AUDIO_RECORDER_TEMP_FILE);
       /* File tempFile = new File(Environment.getExternalStorageDirectory() +
                File.separator + "TollCulator/");*/
        if(tempFile.exists())
            tempFile.delete();

        return (file.getAbsolutePath() + "/" + AUDIO_RECORDER_TEMP_FILE);
    }

    private void startRecording(){

       /* ActivityCompat.requestPermissions(AudioRecording.this,
                new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},2);
        ActivityCompat.requestPermissions(AudioRecording.this,
                new String[]{Manifest.permission.RECORD_AUDIO},1);*/

        if(checkPermission()) {

            //Unfotunatly stops at this time

            recorder = new AudioRecord(MediaRecorder.AudioSource.MIC,
                    RECORDER_SAMPLERATE, RECORDER_CHANNELS,RECORDER_AUDIO_ENCODING, bufferSize);

            int i = recorder.getState();
            if(i==1)
                recorder.startRecording();

            isRecording = true;

            recordingThread = new Thread(new Runnable() {

                @Override
                public void run() {
                    writeAudioDataToFile();
                }
            },"AudioRecorder Thread");


            StopWatch.setBase(SystemClock.elapsedRealtime());
            StopWatch.start();

            recordingThread.start();

        }
        else {
            requestPermission();
        }


    }


    public static final int RequestPermissionCode = 1;

    private void requestPermission() {
        ActivityCompat.requestPermissions(AudioRecording.this, new
                String[]{WRITE_EXTERNAL_STORAGE, RECORD_AUDIO}, RequestPermissionCode);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode,
                                           String permissions[], int[] grantResults) {
        switch (requestCode) {
            case RequestPermissionCode:
                if (grantResults.length> 0) {
                    boolean StoragePermission = grantResults[0] ==
                            PackageManager.PERMISSION_GRANTED;
                    boolean RecordPermission = grantResults[1] ==
                            PackageManager.PERMISSION_GRANTED;

                    if (StoragePermission && RecordPermission) {
                        Toast.makeText(AudioRecording.this, "Permission Granted",
                                Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(AudioRecording.this,"Permission Denied",Toast.LENGTH_LONG).show();
                    }
                }
                break;
        }
    }

    public boolean checkPermission() {
        int result = ContextCompat.checkSelfPermission(getApplicationContext(),
                WRITE_EXTERNAL_STORAGE);
        int result1 = ContextCompat.checkSelfPermission(getApplicationContext(),
                RECORD_AUDIO);
        return result == PackageManager.PERMISSION_GRANTED &&
                result1 == PackageManager.PERMISSION_GRANTED;
    }




    private void writeAudioDataToFile(){
        byte data[] = new byte[bufferSize];
        String filename = getTempFilename();
        FileOutputStream os = null;

        try {
            os = new FileOutputStream(filename);
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }

        int read = 0;

        if(null != os){
            while(isRecording){
                read = recorder.read(data, 0, bufferSize);

                if(AudioRecord.ERROR_INVALID_OPERATION != read){
                    try {
                        os.write(data);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void stopRecording(){
        if(null != recorder){
            isRecording = false;

            int i = recorder.getState();
            if(i==1)
                recorder.stop();
            recorder.release();

            recorder = null;
            recordingThread = null;
        }

        Startbutton.setImageResource(stopRecording);
        StopWatch.setBase(SystemClock.elapsedRealtime());
        timeWhenStopped = 0;
        StopWatch.stop();


        copyWaveFile(getTempFilename(),getFilename());
        deleteTempFile();
    }

    private void deleteTempFile() {
        File file = new File(getTempFilename());

        file.delete();
    }

    private void copyWaveFile(String inFilename,String outFilename){
        FileInputStream in = null;
        FileOutputStream out = null;
        long totalAudioLen = 0;
        long totalDataLen = totalAudioLen + 36;
        long longSampleRate = RECORDER_SAMPLERATE;
        int channels = 2;
        long byteRate = RECORDER_BPP * RECORDER_SAMPLERATE * channels/8;

        byte[] data = new byte[bufferSize];

        try {
            in = new FileInputStream(inFilename);
            out = new FileOutputStream(outFilename);
            totalAudioLen = in.getChannel().size();
            totalDataLen = totalAudioLen + 36;

            //AppLog.logString("File size: " + totalDataLen);

            WriteWaveFileHeader(out, totalAudioLen, totalDataLen,
                    longSampleRate, channels, byteRate);

            while(in.read(data) != -1){
                out.write(data);
            }

            in.close();
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void WriteWaveFileHeader(
            FileOutputStream out, long totalAudioLen,
            long totalDataLen, long longSampleRate, int channels,
            long byteRate) throws IOException {

        byte[] header = new byte[44];

        header[0] = 'R'; // RIFF/WAVE header
        header[1] = 'I';
        header[2] = 'F';
        header[3] = 'F';
        header[4] = (byte) (totalDataLen & 0xff);
        header[5] = (byte) ((totalDataLen >> 8) & 0xff);
        header[6] = (byte) ((totalDataLen >> 16) & 0xff);
        header[7] = (byte) ((totalDataLen >> 24) & 0xff);
        header[8] = 'W';
        header[9] = 'A';
        header[10] = 'V';
        header[11] = 'E';
        header[12] = 'f'; // 'fmt ' chunk
        header[13] = 'm';
        header[14] = 't';
        header[15] = ' ';
        header[16] = 16; // 4 bytes: size of 'fmt ' chunk
        header[17] = 0;
        header[18] = 0;
        header[19] = 0;
        header[20] = 1; // format = 1
        header[21] = 0;
        header[22] = (byte) channels;
        header[23] = 0;
        header[24] = (byte) (longSampleRate & 0xff);
        header[25] = (byte) ((longSampleRate >> 8) & 0xff);
        header[26] = (byte) ((longSampleRate >> 16) & 0xff);
        header[27] = (byte) ((longSampleRate >> 24) & 0xff);
        header[28] = (byte) (byteRate & 0xff);
        header[29] = (byte) ((byteRate >> 8) & 0xff);
        header[30] = (byte) ((byteRate >> 16) & 0xff);
        header[31] = (byte) ((byteRate >> 24) & 0xff);
        header[32] = (byte) (2 * 16 / 8); // block align
        header[33] = 0;
        header[34] = RECORDER_BPP; // bits per sample
        header[35] = 0;
        header[36] = 'd';
        header[37] = 'a';
        header[38] = 't';
        header[39] = 'a';
        header[40] = (byte) (totalAudioLen & 0xff);
        header[41] = (byte) ((totalAudioLen >> 8) & 0xff);
        header[42] = (byte) ((totalAudioLen >> 16) & 0xff);
        header[43] = (byte) ((totalAudioLen >> 24) & 0xff);

        out.write(header, 0, 44);
    }

    private View.OnClickListener btnClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch(v.getId()){
                case R.id.btnStart:{
                    //AppLog.logString("Start Recording");

                    if (startRecording){
                        Recording=true;
                        startRecording=false;
                        Startbutton.setImageResource(startrecordingImage);
                        pause.setBackgroundResource(R.drawable.pauserecord);
                        startRecording();
                    }else{
                        startRecording=true;
                        Recording=false;
                        stopRecording();
                        pause.setBackgroundResource(R.drawable.playrecord);


                    }
                    // enableButtons(true);
                    break;
                }
                case R.id.pauserecording:{

                    //AppLog.logString(" Recording pause");
                    if(Recording){
                        pause.setBackgroundResource(R.drawable.pauserecord);
                        if (pauseRecording){
                            pauseRecording=false;
                            recorder.startRecording();
                            StopWatch.setBase(SystemClock.elapsedRealtime() + timeWhenStopped);
                            StopWatch.start();

                        }else {
                            pause.setBackgroundResource(R.drawable.playrecord);
                            pauseRecording = true;
                            recorder.stop();
                            timeWhenStopped = StopWatch.getBase() - SystemClock.elapsedRealtime();
                            StopWatch.stop();

                        }
                    }

                    // enableButtons(false);
                    // stopRecording();

                    break;
                }
            }
        }
    };
}