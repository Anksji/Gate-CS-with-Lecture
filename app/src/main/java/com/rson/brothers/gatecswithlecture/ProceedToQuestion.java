package com.rson.brothers.gatecswithlecture;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Path;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Brother's on 3/30/2016.
 */

public class ProceedToQuestion extends AppCompatActivity implements Communicator{
    ViewPager viewPager = null;
    int Item;
    public static int counter,k,j,l;
    public static Path path=null;
    Question_Tab q1 = new Question_Tab();
    public static int select = 0;
        boolean Qcheck=false;
    public static boolean firstTime=true,RoughAdd=false;
    public static boolean HardwareBack=false,Farward=true,backward=false,PalletJump=false,fill=false,sleep=false;
    FragmentManager manager;
    PalletColour Pcolour=new PalletColour();

    public static List<Path> list = new ArrayList<Path>();





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.proceed_to_question);

        //StartAppSDK.init(this, "104130031", "204644773", true);

        manager=getSupportFragmentManager();


        Pcolour.setDefaultResponse();

            Item = getIntent().getExtras().getInt("position", 0);
            boolean  Selecttopic = getIntent().getExtras().getBoolean("TopicWise",false);
            int Topic_Position = getIntent().getExtras().getInt("Subject", 0);



        Toolbar toolbar= (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        FragmentManager fragmentManager = this.getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.relativlaout, q1, "Question");
         fragmentTransaction.addToBackStack("Question");
        fragmentTransaction.commit();
        q1.setItem(Item);
        q1.setSelecttopic(Selecttopic);
        q1.setTopic_Position(Topic_Position);


        j=0;l=0;k=0;counter=0;HardwareBack=false;RoughAdd=false;PalletJump=false;fill=false;sleep=false;



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    protected void onResume() {
        super.onResume();
        Helper helper=new Helper();
        Log.d("Onreview", "Proceed to question onResume is  called");

        if(helper.getOnReview()){


            FragmentManager fragmentManager = this.getSupportFragmentManager();
             //fragmentManager.popBackStack();
                setContentView(R.layout.test);
            try {
                    Question_Tab q2=new Question_Tab();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.add(R.id.relativlaout, q2, "Question");
                fragmentTransaction.addToBackStack("Question");
                fragmentTransaction.commit();

                q1.setItem(Item);
                j=0;l=0;k=0;counter=0;HardwareBack=false;RoughAdd=false;PalletJump=false;fill=false;sleep=false;
            }catch (Exception e){
                e.printStackTrace();
            }



              //  helper.setOnReview(false);
        }

        if(helper.getfinish()){

            helper.isSetFinish(false);
            helper.setOnReview(false);
            finish();
        }
        for(int i=0; i<90; i++){

            Pcolour.setArray(i);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();


        if (id == R.id.pallet) {

            Intent i = new Intent(this, Pallet.class);
            startActivityForResult(i, 1);
            if (Qcheck) {
                FragmentManager fragmentManager = this.getSupportFragmentManager();
                fragmentManager.popBackStack("Question", 0);
                if (Farward && counter < j) {
                    counter = j;
                } else if (backward && counter <= k) {
                    counter = k + 1;
                }

                RoughAdd = false;
                PalletJump = true;
                sleep=false;
            } else {
               // Toast.makeText(this, "No Question open yet", Toast.LENGTH_SHORT).show();
            }

            Log.d("Pallet", "after setQuestion");

        }
        if(id == R.id.calculator){
            Intent in= new  Intent(ProceedToQuestion.this,Calculate.class);
            startActivity(in);

        }
        if (id == R.id.backbutton) {
            if(Farward||backward){
            Log.e("Back", "we are going back");
            if (counter > 0) {

            } else {
                counter = k + 1;
            }

            //k=k-2;

            if (k > 0) {

                    Rough s1 = new Rough();
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentManager.popBackStack("Question", 0);
                    fragmentTransaction.add(R.id.relativlaout, s1, "Rough");
                    fragmentTransaction.addToBackStack("Rough");
                    fragmentTransaction.commit();
                    Log.d("Raugh", "we are in if part of addRough ");

                Qcheck = true;
                sleep = false;

            } else {

                k=0;
                if(RoughAdd){
                    Toast.makeText( this, "You are in first page", Toast.LENGTH_SHORT ).show();
                }

            }
                    /*if(k==0)
                        Toast.makeText(this, "You are in first page", Toast.LENGTH_SHORT).show();*/
            if ( j > counter ) {
                counter = j;
            }

            j = k;


            HardwareBack = true;
            PalletJump = false;RoughAdd = true;
            Farward = false;backward=true;
            if(k>=9) {
                fill = true;
            }else {
                fill=false;
            }
        }
            else {
                Toast.makeText(this, "You does't open any Raugh Page", Toast.LENGTH_SHORT).show();
                backward=false;Farward=false;
            }
    }
        if(id== R.id.next) {
            if (k >= 9) {
                fill = true;
            }else {
                fill=false;
            }
            if (!fill) {
                if (j < 10) {
                    Log.e("Back", "we are going farward");

                    if (RoughAdd) {
                        Rough s1 = new Rough();
                        FragmentManager fragmentManager = getSupportFragmentManager();
                        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                        fragmentManager.popBackStack("Question", 0);
                        fragmentTransaction.add(R.id.relativlaout, s1, "Rough");
                        fragmentTransaction.addToBackStack("Rough");
                        fragmentTransaction.commit();
                        Log.d("Raugh", "we are in if part of addRough ");

                    } else {
                        // if(!PalletJump){
                        setAll();
                        Log.e("Pallet", "pallet jump is false false  false  false  false");
                        // }else{
                        // j=k;
                        // }
                        Log.e("Pallet", "pallet jump is true true true");
                        Log.d("Raugh", "we are in else part of addRough");
                        Rough s1 = new Rough();
                        FragmentManager fragmentManager = getSupportFragmentManager();
                        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                        fragmentTransaction.add(R.id.relativlaout, s1, "Rough");
                        fragmentTransaction.addToBackStack("Rough");
                        fragmentTransaction.commit();
                    }
                    fill = false;
                    // Qcheck = true;RoughAdd=true;
                    j++;

                } else {
                    Toast.makeText(this, "You have Enough Pages Go Back & Reuse it again", Toast.LENGTH_SHORT).show();
                    j = 10;

                }
                HardwareBack = true;
                PalletJump = false;
                backward = false;
                Qcheck = true;
                RoughAdd = true;
                Farward = true;
                sleep=false;
            }else{
                Toast.makeText(this, "You have Enough Pages Go Back & Reuse it again", Toast.LENGTH_SHORT).show();
            }
        }
        if(id== R.id.quest){
            if(Qcheck) {
                HardwareBack=true;
                FragmentManager fragmentManager = this.getSupportFragmentManager();
                fragmentManager.popBackStack("Question", 0);
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                fragmentTransaction.commit();
                PalletJump=true;
                if(Farward && counter<j){
                    counter=j;
                }else if(backward && counter<=k) {
                    counter = k+1;
                }
                RoughAdd=false;
                sleep=false;

            }
            else {
                Toast.makeText(this, "No Question open yet", Toast.LENGTH_LONG).show();
            }
        }

        return super.onOptionsItemSelected(item);
    }
public void setAll(){
    j=0;k=0;l=0;
}
    @Override
    public void set(int data) {
        FragmentManager manager = getSupportFragmentManager();
        Question_Tab q1= (Question_Tab) manager.findFragmentByTag("Question");
        q1.setQid(data);

    }
    public static void setPath(Path p){
       // path=p;
        Log.d("Rough", "setPath is called value of k=" +k);


                try {
                    list.add(k, p);
                    Log.d("Rough", "Path is set value of  add into list at=" + k);
                    if (RoughAdd && HardwareBack) {
                        if (backward && k >0) {
                            if (k == 0) {
                                k = 0;
                            } else {
                                k--;
                            }

                        } else {
                            if (Farward) {
                                k++;
                            } else {
                                k--;
                                backward = true;
                            }
                        }
                    }
                }catch (Exception e){

                    Log.e("Rough","Bhai yha list add me exception hua hai");
                }
        Log.d("Rough", "Path is set value after a lot of conditions k=" + k);




    }
    public static void clear(){
        list.clear();
        k=0;j=0;counter=0;
    }
    public  static void getPath() {
        Log.d("Rough", "Path is get value of k=" + k + "and counter values is " + counter);
        if (k <counter) {
            try{
                path = list.get(k);
            }catch (Exception e){
                //path=list.get(k-1);
            }

            Remove();
           // k++;
            Log.d("Rough", "Path is get Valid value of get from list at="+k);

        }
        else{
            path=null;
            Log.d("Rough", "Path is get InValid or null value of k="+k);
        }

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Rough","onDestroy view of ProceedToQuestion is called");
       // path=null;
       //list.clear();
    }

    public static void Remove(){
        if (k <counter) {
            try{
                list.remove(k);
            }catch (Exception e){
               // list.remove(k-1);
            }

            Log.d("Rough", "Remove is called value of k=" + k);

        }
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == 1) {
            Log.d("Pallet", "we are in onActivityResult method 1 if");
            if(resultCode == Activity.RESULT_OK){
               int  result=data.getIntExtra("Idset",0);
                Log.d("Pallet", "we are in onActivityResult method 2 if");
                set(result);
                Log.d("Pallet", "we are in onActivityResult method set method is called");
            }

        }

    }




}


