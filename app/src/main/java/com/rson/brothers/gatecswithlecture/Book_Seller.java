package com.rson.brothers.gatecswithlecture;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

/**
 * Created by Brother's on 7/23/2016.
 */

public class Book_Seller extends AppCompatActivity {

    int position;
    TextView BooKName;
    ImageButton Next,prev;
    private AdView mAdView;
    boolean isLoaded=false;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.book_seller);
        position = getIntent().getExtras().getInt("position", 0);
        BooKName= (TextView) findViewById(R.id.book_name);

        Next= (ImageButton) findViewById(R.id.button_next);
        prev= (ImageButton) findViewById(R.id.button_prev);


        mAdView= (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        LoadBook(position);


        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(position>0){
                    --position;
                    LoadBook(position);
                }

            }
        });
        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(position<13){
                    ++position;
                    LoadBook(position);
                }

            }
        });

    }

    public void LoadBook(int position) {
        if(isLoaded) {
            FragmentManager fragmentManager = this.getSupportFragmentManager();
            fragmentManager.popBackStack();
        }
        BooKName.setText(GetBookName(position));

        if (position == 0) {
            Book_motivation frag = new Book_motivation();

            FragmentManager fragmentManager = this.getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.relativlaout, frag, "Question");
            fragmentTransaction.addToBackStack("Question");
            fragmentTransaction.commit();

        } else if (position == 1) {

            Book_Motivational2 frag2 = new Book_Motivational2();

            FragmentManager fragmentManager = this.getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.relativlaout, frag2, "Question");
            fragmentTransaction.addToBackStack("Question");
            fragmentTransaction.commit();
        } else if (position == 2) {

            BookAlgorithm frag3 = new BookAlgorithm();

            FragmentManager fragmentManager = this.getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.relativlaout, frag3, "Question");
            fragmentTransaction.addToBackStack("Question");
            fragmentTransaction.commit();

        } else if (position == 3) {

            BookCN frag = new BookCN();

            FragmentManager fragmentManager = this.getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.relativlaout, frag, "Question");
            fragmentTransaction.addToBackStack("Question");
            fragmentTransaction.commit();

        } else if (position == 4) {

            BookTOC frag = new BookTOC();

            FragmentManager fragmentManager = this.getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.relativlaout, frag, "Question");
            fragmentTransaction.addToBackStack("Question");
            fragmentTransaction.commit();

        } else if (position == 5) {

            BookOperatingSystem frag = new BookOperatingSystem();

            FragmentManager fragmentManager = this.getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.relativlaout, frag, "Question");
            fragmentTransaction.addToBackStack("Question");
            fragmentTransaction.commit();

        } else if (position == 6) {

            BookDataStructure frag = new BookDataStructure();
            FragmentManager fragmentManager = this.getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.relativlaout, frag, "Question");
            fragmentTransaction.addToBackStack("Question");
            fragmentTransaction.commit();
        } else if (position == 7) {

            BookDatabase frag = new BookDatabase();
            FragmentManager fragmentManager = this.getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.relativlaout, frag, "Question");
            fragmentTransaction.addToBackStack("Question");
            fragmentTransaction.commit();

        } else if (position == 8) {

            BookCompiler frag = new BookCompiler();

            FragmentManager fragmentManager = this.getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.relativlaout, frag, "Question");
            fragmentTransaction.addToBackStack("Question");
            fragmentTransaction.commit();

        } else if (position == 9) {

            BookComputerOrg frag = new BookComputerOrg();

            FragmentManager fragmentManager = this.getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.relativlaout, frag, "Question");
            fragmentTransaction.addToBackStack("Question");
            fragmentTransaction.commit();

        } else if (position == 10) {

            BookDigital frag = new BookDigital();
            FragmentManager fragmentManager = this.getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.relativlaout, frag, "Question");
            fragmentTransaction.addToBackStack("Question");
            fragmentTransaction.commit();

        } else if (position == 11) {

            BookMaths frag = new BookMaths();
            FragmentManager fragmentManager = this.getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.relativlaout, frag, "Question");
            fragmentTransaction.addToBackStack("Question");
            fragmentTransaction.commit();

        } else if (position == 12) {

            BookAptitude frag = new BookAptitude();
            FragmentManager fragmentManager = this.getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.relativlaout, frag, "Question");
            fragmentTransaction.addToBackStack("Question");
            fragmentTransaction.commit();

        } else if (position == 13) {

            BookPreviousYearQuestion frag = new BookPreviousYearQuestion();
            FragmentManager fragmentManager = this.getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.relativlaout, frag, "Question");
            fragmentTransaction.addToBackStack("Question");
            fragmentTransaction.commit();

        }

        isLoaded=true;

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
       // isLoaded=false;
        finish();
    }

    public CharSequence GetBookName(int i){
        //String title=new String();
        if(i==0){
            return "Motivational Books";
        }
        if(i==1){
            return "Some Special Books";
        }
        if(i==2){
            return "Algorithm Books";
        }
        if(i==3){
            return "Computer Network Books";
        }
        if(i==4){
            return "TOC Books";
        }
        if(i==5){
            return "Operating System Books";
        }
        if(i==6){
            return "Data Structure Books";
        }
        if(i==7){
            return "Database Books";
        }
        if(i==8){
            return "Compiler Books";
        }
        if(i==9){
            return "Computer Organization Books";
        }
        if(i==10){
            return "Digital Books";
        }
        if(i==11){
            return "Maths Books";
        }
        if(i==12){
            return "Aptitude Books";
        }
        if(i==13){
            return "Previous Year Question Books";
        }

        return null;

    }
}


