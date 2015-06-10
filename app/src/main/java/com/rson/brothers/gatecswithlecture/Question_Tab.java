package com.rson.brothers.gatecswithlecture;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Brother's on 3/30/2016.
 */
public class Question_Tab extends Fragment {
    private static List<Question> quesList;
    public  double[] score =new double[90];
   // public static int qid;
    String marks;
    static int id;
    private  static Question currentQ;
    private static boolean NoQuestion=false;
    static boolean Selecttopic;
    static  int Topic_Position;


    WebView wb;
   static Button butNext,butPrev,ClearButtton,ReviewButton,ReviewNext,ReviewPrev,ReviewFinish;
    static RadioButton rd1,rd2,rd3,rd4;
   static TextView tx1,tx2,Answer,YourAnswer,MarksDisplay,yearView,marksView,questView;

    static TextView Question_result;
    static EditText InputAnswer;
    public static int question;
    public static int Item=1;
    Toolbar mToolbar;
    private  static String s;
    public  static Bundle bundle;
    boolean raw=false;
    boolean check=false,markedReview=false;
    static  int which_type_questio;
    static boolean Onreview=false;
    static boolean Subjectiv=false;
    static Context context;
    int counter=0;
    static DbHelper db=null;

    ViewFlipper viewFlipper;
    String[] topic={"Maths","Theory of Computation","Compiler","Computer Network","Programing and Data Structure","Algorithm",
            "Operating System","Database","Computer Organization","Digital","Aptitude","Other Sub"};

    ResultStatus resultStatus=new ResultStatus();

    PalletColour Pcolour = new PalletColour();

    AlertDialog alertDialog=null;

    Toolbar toolbar;

    RadioGroup grp;


    private MyCountDownTimer countDownTimer;
    private long timeElapsed;
    private boolean timerHasStarted = false;
    private Button startB;
    private TextView timeElapsedView;
    private TextView text;
    private  long startTime = (60000);
    private long interval = 1000;
     long TimeEndForThisQuestion=(60000),PresentTime=0;


    private AdView mAdView;


    Typeface fontstyle;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView;

        Helper helper =new Helper();
        if(helper.getOnReview()){
            Log.d("Onreview","On Reviewing the question ");

            rootView = inflater.inflate(R.layout.review_question,container,false);
                Onreview=true;
            helper.setOnReview(false);

        }else{
            Log.d("Onreview","On Normal open the question ");
            rootView = inflater.inflate(R.layout.question_tab,container,false);

        }



        Log.d("Onreview","on create is called");



        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("Onreview", "onActivityCreated is called");
        fontstyle=Typeface.createFromAsset(getActivity().getAssets(), "Regular.ttf");
        which_type_questio = 0;

        mAdView= (AdView) getActivity().findViewById(R.id.adView);

        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        if (savedInstanceState == null) {
            Log.d("Onreview", "here saved instance is null we set default value");
            SharedPreferences sharedPreferences = getActivity().getSharedPreferences("MyData", Context.MODE_PRIVATE);
            raw = sharedPreferences.getBoolean("Status", false);
            if (raw) {
                Log.d("Onreview", "we get value from shared pref");
                //qid=sharedPreferences.getInt("Id",0);
                //id=Pcolour.getQid();

                Item = 2021 - Item;
                if(Item>2013){
                    if(Item==2014){
                        Item=2016;
                    }else if(Item==2015){
                        Item=2015;
                    }
                    else if(Item==2016){
                        Item=2014;
                    }
                    else if(Item==2017){
                        Item=2019;
                    }
                    else if(Item==2018){
                        Item=2018;
                    }
                    else if(Item==2019){
                        Item=2017;
                    }
                    else if(Item==2020){
                        Item=2021;
                    }
                    else if(Item==2021){
                        Item=2020;
                    }

                }
            } else {
                Pcolour.setQid(0);
                // qid = 0;
                Item = 2021 - Item;
                if(Item>2013){
                    if(Item==2014){
                        Item=2016;
                    }else if(Item==2015){
                        Item=2015;
                    }
                    else if(Item==2016){
                        Item=2014;
                    }
                    else if(Item==2017){
                        Item=2019;
                    }
                    else if(Item==2018){
                        Item=2018;
                    }
                    else if(Item==2019){
                        Item=2017;
                    }
                    else if(Item==2020){
                        Item=2021;
                    }
                    else if(Item==2021){
                        Item=2020;
                    }

                }
            }

        } else {
            Log.d("Onreview", "we are fetching data from saved instance");
            //qid = savedInstanceState.getInt("Qid", 0);
            Item = savedInstanceState.getInt("Item", 0);

        }


        Log.e("Onreview", "item position is : " + Item);

                //context=getActivity();



             db = new DbHelper(getActivity());

        Log.d("NoOfQ", " No of rows " + (db.rowcount("" + Item, topic[getTopic_Position()])));
            if ((db.rowcount("" + Item)) == 0 || (db.rowcount("" + Item, topic[getTopic_Position()])) == 0) {
                Log.d("NoOfQ", " we are inside dialog creation " + (db.rowcount("" + Item, topic[getTopic_Position()])));
                NoQuestion=true;
                AlertDialog.Builder alert = new AlertDialog.Builder(getActivity());
                alert.setTitle("This Year Has No Question On " + topic[getTopic_Position()]);


                alert.setCancelable(false);

                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {

                        FragmentManager fragmentManager = getFragmentManager();
                        fragmentManager.popBackStack();
                    }


                });


                alertDialog = alert.create();
                alertDialog.show();


            }

            else {

                    NoQuestion=false;

                if (getSelecttopic()) {
                    String Subject = topic[getTopic_Position()];
                   resultStatus.setSubjective(true);
                    resultStatus.setTopic(getTopic_Position());
                    //Toast.makeText(getActivity(), topic[getTopic_Position()] + "This topic is selected ", Toast.LENGTH_SHORT).show();
                    quesList = db.getAllQuestions("" + Item, topic[getTopic_Position()]);
                } else {
                    quesList = db.getAllQuestions("" + Item);
                }


                Log.d("Check", "after dbHelper class");
                Log.d("Pallet", "before error qid= " + Pcolour.getQid());


                currentQ = quesList.get(Pcolour.getQid());

                Log.d("Pallet", "after error qid = " + Pcolour.getQid());
                question = currentQ.getRow_no();

                if(getSelecttopic()){
                    startTime=startTime*3*question;
                    TimeEndForThisQuestion=TimeEndForThisQuestion*3*question;
                }else{
                    startTime=startTime*180;
                    TimeEndForThisQuestion=TimeEndForThisQuestion*180;
                }

                if (currentQ.getMARKS() == "1") {

                    Subjectiv = true;

                } else if (currentQ.getMARKS() == "0") {

                    Subjectiv = false;

                } else {

                }

                if (!Onreview) {
                    setQuestion();
                }
                currentQ = quesList.get(Pcolour.getQid());


                Pcolour.setNo_of_Question(question);



            tx1 = (TextView) getActivity().findViewById(R.id.questio_no);
            tx2 = (TextView) getActivity().findViewById(R.id.year);
            wb = (WebView) getActivity().findViewById(R.id.webView);
               // yearView,marksView,questView
                yearView= (TextView) getActivity().findViewById(R.id.YearView);
                marksView= (TextView) getActivity().findViewById(R.id.MarksView);
                questView= (TextView) getActivity().findViewById(R.id.QuestView);
                MarksDisplay = (TextView) getActivity().findViewById(R.id.quest_marks);


                yearView.setTypeface(fontstyle);
                marksView.setTypeface(fontstyle);
                questView.setTypeface(fontstyle);

            Question_result = (TextView) getActivity().findViewById(R.id.question_result_status);
            toolbar = (Toolbar) getActivity().findViewById(R.id.app_bar);

            try {
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                activity.setSupportActionBar(toolbar);
                activity.getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            } catch (Exception e) {
                e.printStackTrace();
            }


            if (Onreview) {

                Question_result = (TextView) getActivity().findViewById(R.id.question_result_status);

                YourAnswer = (TextView) getActivity().findViewById(R.id.your_answer);

                Answer = (TextView) getActivity().findViewById(R.id.answer);
                ReviewFinish = (Button) getActivity().findViewById(R.id.reviewfinish);
                ReviewNext = (Button) getActivity().findViewById(R.id.reviewnext);
                ReviewPrev = (Button) getActivity().findViewById(R.id.reviewprev);

            } else {
                grp = (RadioGroup) getActivity().findViewById(R.id.radiogroup);

                rd1 = (RadioButton) getActivity().findViewById(R.id.radioButton);
                rd2 = (RadioButton) getActivity().findViewById(R.id.radioButton2);
                rd3 = (RadioButton) getActivity().findViewById(R.id.radioButton3);
                rd4 = (RadioButton) getActivity().findViewById(R.id.radioButton4);

                butNext = (Button) getActivity().findViewById(R.id.button2);
                butPrev = (Button) getActivity().findViewById(R.id.button3);
                ClearButtton = (Button) getActivity().findViewById(R.id.button4);
                ReviewButton = (Button) getActivity().findViewById(R.id.button5);
                viewFlipper = (ViewFlipper) getActivity().findViewById(R.id.ViewFlipper01);
                InputAnswer = (EditText) getActivity().findViewById(R.id.input_answer);

                text = (TextView) getActivity().findViewById(R.id.timertask);
                timeElapsedView = (TextView) getActivity().findViewById(R.id.timer);
                text.setTypeface(fontstyle);
                timeElapsedView.setTypeface(fontstyle);

                countDownTimer = new MyCountDownTimer(startTime, interval);
                text.setText(text.getText() + String.valueOf(startTime));

                countDownTimer.start();
                timerHasStarted = true;

            }
            setQuestionView();

            for (int i = 0; i < 12; i++) {
                resultStatus.setTopicName(i, topic[i]);
            }

            resultStatus.setContext(resultStatus);


            if (Onreview) {

                ReviewNext.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.d("ScoreCheck", "Your Answer is " + currentQ.getMARKS());
                        Log.d("ScoreCheck", "Actual Ans is" + currentQ.getANSWER());
                        //  qid++;
                        Pcolour.setQid(Pcolour.getQid() + 1);

                        counter++;
                        if(counter>1) {
                            ProceedToQuestion p = new ProceedToQuestion();
                            p.j = 0;
                            p.k=0;
                            p.counter = 0;

                            p.list.clear();

                            p.HardwareBack = false;
                            p.fill = false;
                            p.Farward = false;
                            p.backward = false;
                            counter=0;
                        }


                        if (Pcolour.getQid() < question) {

                            setQuestionView();
                        }
                        //}
                        else {
                            Toast.makeText(getActivity(), "End of Questions", Toast.LENGTH_LONG).show();
                            AlertDialog.Builder alert = new AlertDialog.Builder(getActivity());
                            alert.setTitle("Finish Review");

                            alert.setPositiveButton("Finish", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int whichButton) {


                                    Intent intent = new Intent(getActivity(), ScoreWindow.class);
                                    startActivity(intent);


                                }


                            });

                            alert.setNegativeButton("Cancel",
                                    new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int whichButton) {
                                            dialog.cancel();

                                            //dec Qid
                                            Pcolour.setQid((Pcolour.getQid() - 1));
                                        }

                                    });
                            alertDialog = alert.create();
                            alertDialog.show();


                        }

                    }
                });

                ReviewPrev.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (Pcolour.getQid() > 0) {
                            Log.d("score", "we are inside previous step if statement qid =" + Pcolour.getQid());
                            Pcolour.setQid(Pcolour.getQid() - 1);




                            //qid=qid-2;
                            //currentQ = quesList.get(qid);
                            setQuestionView();
                            Log.d("score", "we are inside previous step if statement qid =" + Pcolour.getQid() + " after set question");
                        } else {
                            Log.d("score", "we are inside previous step else statement qid=" + Pcolour.getQid());
                        }
                    }
                });

                ReviewFinish.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        AlertDialog.Builder alert = new AlertDialog.Builder(getActivity());
                        alert.setTitle("Finish Review");

                        alert.setPositiveButton("Finish", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int whichButton) {


                                Intent intent = new Intent(getActivity(), ScoreWindow.class);
                                startActivity(intent);


                            }


                        });

                        alert.setNegativeButton("Cancel",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int whichButton) {
                                        dialog.cancel();

                                        //dec Qid
                                        Pcolour.setQid((Pcolour.getQid() - 1));
                                    }

                                });
                        alertDialog = alert.create();
                        alertDialog.show();


                    }
                });
            } else {

                // enable the soft numeric keyboard
                InputAnswer.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {

                        InputAnswer.clearFocus();
                        InputAnswer.requestFocus();
                        InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
                        imm.showSoftInput(InputAnswer, InputMethodManager.SHOW_IMPLICIT);
                    }
                });


                butNext.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        TimeEndForThisQuestion = PresentTime;
                        Log.d("ScoreCheck", "Your Answer is " + currentQ.getMARKS());
                        Log.d("ScoreCheck", "Actual Ans is" + currentQ.getANSWER());

                        Log.e("Subjective", "we are Pressing next buttons  =>" + InputAnswer.getText().toString());

                        InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
                        imm.hideSoftInputFromWindow(InputAnswer.getWindowToken(), 0);
                        //  qid++;
                        if(Pcolour.getQid()<question){
                            Pcolour.setQid(Pcolour.getQid() + 1);
                        }
                        counter++;
                        if(counter>1) {
                            ProceedToQuestion p = new ProceedToQuestion();
                            p.j = 0;
                            p.k=0;
                            p.counter = 0;

                            p.list.clear();

                            p.HardwareBack = false;
                            p.fill = false;
                            p.Farward = false;
                            p.backward = false;
                            counter=0;
                        }

                        Log.d("Check", "after radio group " + grp.getCheckedRadioButtonId());

                        //Log.d("score", "after radio answer  "+answer.getText());
                        final boolean NullAnswerSet;

                        if (Subjectiv) {
                            if (("" + InputAnswer.getText()).equals("")) {
                                NullAnswerSet = true;
                            } else {
                                NullAnswerSet = false;
                            }

                        } else {
                            if (grp.getCheckedRadioButtonId() == -1) {
                                NullAnswerSet = true;
                            } else {
                                NullAnswerSet = false;
                            }
                        }


                        if (NullAnswerSet && Pcolour.getQid() < question) {

                            Log.e("setNotAnswered", "Question is not answered ");
                            //not answered
                            Pcolour.setQuestionStatus((Pcolour.getQid() - 1), 3);
                            Pcolour.setResponse((Pcolour.getQid() - 1), "Not Answered");
                            //QuestionStatus[qid - 1] = 3;

                            setQuestionView();
                        } else if (Pcolour.getQid() < question) {

                            Pcolour.setQuestionStatus((Pcolour.getQid() - 1), 4);

                            RadioButton Rbuttons;
                            String answer = "";

                            if (Subjectiv) {
                                answer = "" + InputAnswer.getText();
                            } else {

                                Rbuttons = (RadioButton) getActivity().findViewById(grp.getCheckedRadioButtonId());
                                answer = "" + Rbuttons.getText();

                            }
                            Pcolour.setResponse((Pcolour.getQid() - 1), answer);
                            setQuestionView();
                        } else {
                            //last Question

                            AlertDialog.Builder alert = new AlertDialog.Builder(getActivity());
                            alert.setTitle("Test Complted");

                            resultStatus.setTotalTimeTaken(startTime - PresentTime);



                            if (NullAnswerSet) {

                                Log.e("setNotAnswered", "Question is not answered ");
                                //not answered
                                Pcolour.setQuestionStatus((Pcolour.getQid() - 1), 3);
                                Pcolour.setResponse((Pcolour.getQid() - 1), "Not Answered");

                            } else {

                                Pcolour.setQuestionStatus((Pcolour.getQid() - 1), 4);

                                RadioButton Rbuttons;
                                String answer = "";

                                if (Subjectiv) {
                                    answer = "" + InputAnswer.getText();
                                } else {

                                    Rbuttons = (RadioButton) getActivity().findViewById(grp.getCheckedRadioButtonId());
                                    answer = "" + Rbuttons.getText();

                                }
                                Pcolour.setResponse((Pcolour.getQid() - 1), answer);
                            }

                            if(Pcolour.getQid()>=question){
                                Pcolour.setQid(question - 1);
                            }
                            //alert.setCancelable(false);

                            alert.setPositiveButton("Submit", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int whichButton) {

                                    int QuestId;
                                    int j;
                                    for (QuestId = 0; QuestId < question; QuestId++) {
                                        currentQ = quesList.get(QuestId);
                                        j=Integer.parseInt(currentQ.getMARKS());
                                        Pcolour.setMarks(QuestId,j);

                                        setType_Of_Question();

                                        if (currentQ.getSubjective().equals("1")) {
                                            Subjectiv = true;
                                        } else {
                                            Subjectiv = false;
                                        }

                                        if ((Pcolour.getResponse(QuestId)).equals("Not Answered") ||
                                                (Pcolour.getResponse(QuestId)).equals("")) {

                                            Pcolour.setResponse(QuestId, "Not Answered");

                                        } else {
                                            resultStatus.setMarked(which_type_questio, (resultStatus.getMarked(which_type_questio) + 1));

                                            resultStatus.setUnmarked(which_type_questio, (resultStatus.getUnmarked(which_type_questio) - 1));

                                            Log.d("Final_out", "Response is : " + Pcolour.getResponse(QuestId) + " And Correct answer is : " + currentQ.getANSWER());
                                            Log.e("Final_out", "Response is : " + getResponseAnswer(Pcolour.getResponse(QuestId)));

                                            if (("" + currentQ.getANSWER()).equals(getResponseAnswer(Pcolour.getResponse(QuestId)))) {


                                                resultStatus.setCorrect(which_type_questio, (resultStatus.getCorrect(which_type_questio) + 1));
                                                marks = currentQ.getMARKS();

                                                score[QuestId] = Integer.parseInt(marks);


                                            } else {
                                                resultStatus.setWrong(which_type_questio, (resultStatus.getWrong(which_type_questio) + 1));
                                                marks = currentQ.getMARKS();
                                                Log.d("Marks", "Now marks is " + marks);
                                                int mark = Integer.parseInt(marks);
                                                if (mark == 2) {
                                                    score[QuestId] = -0.66;
                                                }
                                                if (mark == 1) {
                                                    score[QuestId] = -0.33;
                                                }

                                            }

                                        }
                                    }

                                    double sco = 0;
                                    for (int i = 0; i < question; i++) {
                                        sco = sco + score[i];
                                    }

                                    Pcolour.setFinalScore(sco);


                                    //RadioButton answer = (RadioButton) getActivity().findViewById(grp.getCheckedRadioButtonId());
                                    Intent intent = new Intent(getActivity(), ScoreWindow.class);
                                    startActivity(intent);


                                }


                            });

                            alert.setNegativeButton("Cancel",
                                    new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int whichButton) {
                                            dialog.cancel();

                                            //dec Qid
                                           // Pcolour.setQid((Pcolour.getQid() ));
                                        }

                                    });
                            alertDialog = alert.create();
                            alertDialog.show();

                        }
                    }
                });

                ClearButtton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if (((Pcolour.getResponse(Pcolour.getQid()))).equals("Not Answered") ||
                                ((Pcolour.getResponse(Pcolour.getQid()))).equals("")) {

                        } else {
                            resultStatus.setMarked(which_type_questio, (resultStatus.getMarked(which_type_questio) - 1));

                            resultStatus.setUnmarked(which_type_questio, (resultStatus.getUnmarked(which_type_questio) + 1));

                            Pcolour.setResponse(Pcolour.getQid(), "Not Answered");
                            Log.d("Resetting", "Resetting response after clear");
                            Log.d("Resetting", "Actual response is " + Pcolour.getResponse(Pcolour.getQid()));

                            marks = currentQ.getMARKS();
                            float mark = Integer.parseInt(marks);
                            if (mark == 2) {
                                score[(Pcolour.getQid())] = 0;
                            }
                            if (mark == 1) {
                                score[(Pcolour.getQid())] = 0;
                            }
                        }
                        //not visited
                        Log.e("palletbutton", "Question is Cleared ");
                        if (Subjectiv) {
                            InputAnswer.setText("");
                        } else {
                            grp.clearCheck();
                        }

                        Pcolour.setQuestionStatus(Pcolour.getQid(), 0);
                        // QuestionStatus[qid]=0;
                    }
                });


                ReviewButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        TimeEndForThisQuestion = PresentTime;
                        Log.d("ScoreCheck", "Your Answer is " + currentQ.getMARKS());
                        Log.d("ScoreCheck", "Actual Ans is" + currentQ.getANSWER());

                        Log.e("Subjective", "we are Pressing next buttons  =>" + InputAnswer.getText().toString());

                        InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
                        imm.hideSoftInputFromWindow(InputAnswer.getWindowToken(), 0);
                        //  qid++;
                        if(Pcolour.getQid()<question){
                            Pcolour.setQid(Pcolour.getQid() + 1);
                        }

                        counter++;
                        if(counter>1) {
                            ProceedToQuestion p = new ProceedToQuestion();
                            p.j = 0;
                            p.k=0;
                            p.counter = 0;

                            p.list.clear();

                            p.HardwareBack = false;
                            p.fill = false;
                            p.Farward = false;
                            p.backward = false;
                            counter=0;
                        }

                        Log.d("Check", "after radio group " + grp.getCheckedRadioButtonId());

                        //Log.d("score", "after radio answer  "+answer.getText());
                        final boolean NullAnswerSet;

                        if (Subjectiv) {
                            if (("" + InputAnswer.getText()).equals("")) {
                                NullAnswerSet = true;
                            } else {
                                NullAnswerSet = false;
                            }

                        } else {
                            if (grp.getCheckedRadioButtonId() == -1) {
                                NullAnswerSet = true;
                            } else {
                                NullAnswerSet = false;
                            }
                        }


                        if (NullAnswerSet && Pcolour.getQid() < question) {

                            Log.e("setNotAnswered", "Question is not answered ");
                            //not answered
                            Pcolour.setQuestionStatus((Pcolour.getQid() - 1), 1);
                            Pcolour.setResponse((Pcolour.getQid() - 1), "Not Answered");
                            //QuestionStatus[qid - 1] = 3;

                            setQuestionView();
                        } else if (Pcolour.getQid() < question) {

                            Pcolour.setQuestionStatus((Pcolour.getQid() - 1), 2);

                            RadioButton Rbuttons;
                            String answer = "";

                            if (Subjectiv) {
                                answer = "" + InputAnswer.getText();
                            } else {

                                Rbuttons = (RadioButton) getActivity().findViewById(grp.getCheckedRadioButtonId());
                                answer = "" + Rbuttons.getText();

                            }
                            Pcolour.setResponse((Pcolour.getQid() - 1), answer);
                            setQuestionView();
                        } else {
                            //last Question

                            AlertDialog.Builder alert = new AlertDialog.Builder(getActivity());
                            alert.setTitle("Test Complted");
                            resultStatus.setTotalTimeTaken(startTime - PresentTime);



                            if (NullAnswerSet) {

                                Log.e("setNotAnswered", "Question is not answered ");
                                //not answered
                                Pcolour.setQuestionStatus((Pcolour.getQid() - 1), 3);
                                Pcolour.setResponse((Pcolour.getQid() - 1), "Not Answered");

                            } else {

                                Pcolour.setQuestionStatus((Pcolour.getQid() - 1), 4);

                                RadioButton Rbuttons;
                                String answer = "";

                                if (Subjectiv) {
                                    answer = "" + InputAnswer.getText();
                                } else {

                                    Rbuttons = (RadioButton) getActivity().findViewById(grp.getCheckedRadioButtonId());
                                    answer = "" + Rbuttons.getText();

                                }
                                Pcolour.setResponse((Pcolour.getQid() - 1), answer);
                            }

                            if(Pcolour.getQid()>=question){
                                Pcolour.setQid(question-1);
                            }
                            //alert.setCancelable(false);

                            alert.setPositiveButton("Submit", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int whichButton) {

                                    int QuestId;

                                    for (QuestId = 0; QuestId < question; QuestId++) {
                                        currentQ = quesList.get(QuestId);
                                        setType_Of_Question();

                                        if (currentQ.getSubjective().equals("1")) {
                                            Subjectiv = true;
                                        } else {
                                            Subjectiv = false;
                                        }

                                        if ((Pcolour.getResponse(QuestId)).equals("Not Answered") ||
                                                (Pcolour.getResponse(QuestId)).equals("")) {

                                            Pcolour.setResponse(QuestId, "Not Answered");

                                        } else {
                                            resultStatus.setMarked(which_type_questio, (resultStatus.getMarked(which_type_questio) + 1));

                                            resultStatus.setUnmarked(which_type_questio, (resultStatus.getUnmarked(which_type_questio) - 1));

                                            Log.d("Final_out", "Response is : " + Pcolour.getResponse(QuestId) + " And Correct answer is : " + currentQ.getANSWER());
                                            Log.e("Final_out", "Response is : " + getResponseAnswer(Pcolour.getResponse(QuestId)));

                                            if (("" + currentQ.getANSWER()).equals(getResponseAnswer(Pcolour.getResponse(QuestId)))) {


                                                resultStatus.setCorrect(which_type_questio, (resultStatus.getCorrect(which_type_questio) + 1));
                                                marks = currentQ.getMARKS();

                                                score[QuestId] = Integer.parseInt(marks);


                                            } else {
                                                resultStatus.setWrong(which_type_questio, (resultStatus.getWrong(which_type_questio) + 1));
                                                marks = currentQ.getMARKS();
                                                int mark = Integer.parseInt(marks);
                                                if (mark == 2) {
                                                    score[QuestId] = -0.66;
                                                }
                                                if (mark == 1) {
                                                    score[QuestId] = -0.33;
                                                }

                                            }

                                        }
                                    }

                                    double sco = 0;
                                    for (int i = 0; i < question; i++) {
                                        sco = sco + score[i];
                                    }

                                    Pcolour.setFinalScore(sco);


                                    Intent intent = new Intent(getActivity(), ScoreWindow.class);
                                    startActivity(intent);


                                }


                            });

                            alert.setNegativeButton("Cancel",
                                    new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int whichButton) {
                                            dialog.cancel();

                                            //dec Qid
                                            //Pcolour.setQid((Pcolour.getQid() - 1));
                                        }

                                    });
                            alertDialog = alert.create();
                            alertDialog.show();
                        }
                    }
                });


                butPrev.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        final boolean NullAnswerSet;



                        if (Pcolour.getQid() > 0) {
                            Log.d("score", "we are inside previous step if statement qid =" + Pcolour.getQid());
                            Pcolour.setQid(Pcolour.getQid() - 1);

                            if (Subjectiv) {
                                if (("" + InputAnswer.getText()).equals("")) {
                                    NullAnswerSet = true;
                                } else {
                                    NullAnswerSet = false;
                                }

                            } else {
                                if (grp.getCheckedRadioButtonId() == -1) {
                                    NullAnswerSet = true;
                                } else {
                                    NullAnswerSet = false;
                                }
                            }


                            if (NullAnswerSet && Pcolour.getQid() < question) {

                                Log.e("setNotAnswered", "Question is not answered ");
                                //not answered
                                Pcolour.setQuestionStatus((Pcolour.getQid() + 1), 3);
                                Pcolour.setResponse((Pcolour.getQid() + 1), "Not Answered");
                                //QuestionStatus[qid - 1] = 3;

                                setQuestionView();
                            } else if (Pcolour.getQid() < question) {

                                Pcolour.setQuestionStatus((Pcolour.getQid() + 1), 4);

                                RadioButton Rbuttons;
                                String answer = "";

                                if (Subjectiv) {
                                    answer = "" + InputAnswer.getText();
                                } else {

                                    Rbuttons = (RadioButton) getActivity().findViewById(grp.getCheckedRadioButtonId());
                                    answer = "" + Rbuttons.getText();

                                }
                                Pcolour.setResponse((Pcolour.getQid() + 1), answer);
                                setQuestionView();

                                //qid=qid-2;
                                //currentQ = quesList.get(qid);
                                setQuestionView();
                                Log.d("score", "we are inside previous step if statement qid =" + Pcolour.getQid() + " after set question");
                            } else {
                                Log.d("score", "we are inside previous step else statement qid=" + Pcolour.getQid());
                            }
                        }
                    }
                });


            }
        }
    }

    public static void setSelecttopic(boolean selecttopic) {
        Selecttopic = selecttopic;
    }
    public static boolean getSelecttopic(){
        return Selecttopic;
    }

    public static void setTopic_Position(int topic_Position) {
        Topic_Position = topic_Position;
    }

    public static int getTopic_Position() {
        return Topic_Position;
    }

public String getResponseAnswer(String s1) {
    Log.e("Who", "getResponse answer is called");
    if (Subjectiv) {
        Log.e("Who", "We are inside subjective given string is" + s1);
        String getInputAnswer = "" + s1;
        String getCorrectAnswer = "" + currentQ.getANSWER();
        Log.d("Allans", " Your inputed ans " + getInputAnswer + " Actual answer is" + getCorrectAnswer);
       /* if ((getInputAnswer).equals("Not Answered") || (getInputAnswer).equals("")) {
            //getInputAnswer = "" + InputAnswer.getText();
            Log.e("Who", "We are inside subjective setting InputAnswer" + getInputAnswer);

        }*/
            String startFrom = "";
            String endAt = "";
            //remove spaces
            getCorrectAnswer = getCorrectAnswer.replaceAll("\\s+", "");
            //search for to
            Pattern pattern = Pattern.compile("to");
            Matcher matcher = pattern.matcher(getCorrectAnswer);
        double start_from;
        double end_at;
        if (matcher.find()) {
                startFrom = getCorrectAnswer.substring(0, matcher.start());
                endAt = getCorrectAnswer.substring(matcher.end());
                Scanner in = new Scanner(startFrom).useDelimiter("[^-.0-9]+");
                 start_from = in.nextDouble();
                Scanner in2 = new Scanner(endAt).useDelimiter("[^-.0-9]+");
                 end_at = in2.nextDouble();
            }else{
            start_from=Double.parseDouble(getCorrectAnswer);
            end_at=Double.parseDouble(getCorrectAnswer);
        }

            // extract integer part from string and convert into integer


        double ans=-65478556.621445;
        try{
        ans = Double.parseDouble(getInputAnswer);
        }catch (Exception e){
            e.printStackTrace();
        }




            Log.d("Allans", "start from " + start_from + " ends at " + end_at + " your inputed ans is" + ans);
                    if(ans==start_from){
                        Log.d("Allans", " your ans is equal to actual ans " + ans);
                    }else{
                        Log.d("Allans", " your ans is not equal to actual ans " + ans);
                    }
            if (ans >= start_from && ans <= end_at) {
                Log.d("Allans", " your inputed ans set to actual ans is" + ans);
                s1 = "" + currentQ.getANSWER();
            } else {
                Log.d("Allans", " your remains yours ans " + ans);
                s1 = InputAnswer.getText().toString();
            }
        Log.e("Who", "We are inside subjective return String is " + s1);
            Log.e("Subjective_", "We are setting the answer and its value is" + s1);
            //InputAnswer.setText("");


        return s1;
    } else {
        Log.e("Subjective_", "We are setting the answer and its value is" + s1);
        return s1;
    }
}

    public void setQid(int qi) {

        Pcolour.setQid(Pcolour.getQid() + qi);

        //qid = qi+qid;
        raw=true;
        Log.d("", "we setting setqid qid =" + Pcolour.getQid());
        SharedPreferences sharedPreferences=getActivity().getSharedPreferences("MyData", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putInt("Id", Pcolour.getQid());
        editor.putBoolean("Status", raw);
        editor.commit();
        //setQuestionView();
    }

                public void setType_Of_Question(){
                    s=currentQ.getTOPIC();
                    Log.e("SubjectCheck", "we are initilize the subject type sub is " + s);

                    if (new String(s).equals("Maths") ) {
                        which_type_questio=0;
                        Log.e("SubjectCheck", "This is maths");
                        //resultStatus.setNoOfQuestion(which_type_questio,resultStatus.getNoOfQuestion(which_type_questio)+1);

                    }
                    else if (new String(s).equals("Theory of Computation") ) {
                        which_type_questio=1;
                        Log.d("SubjectCheck", "This is Theory of Computation");
                        //resultStatus.setNoOfQuestion(which_type_questio,resultStatus.getNoOfQuestion(which_type_questio)+1);

                    }
                    else if (new String(s).equals("Compiler") ) {
                        which_type_questio=2;
                        Log.d("SubjectCheck", "This is Aptitude");
                        //resultStatus.setNoOfQuestion(which_type_questio,resultStatus.getNoOfQuestion(which_type_questio)+1);

                    }
                    else if (new String(s).equals("Computer Network") ) {
                        which_type_questio=3;
                        Log.d("SubjectCheck", "This is Computer Network");
                        //resultStatus.setNoOfQuestion(which_type_questio,resultStatus.getNoOfQuestion(which_type_questio)+1);

                    }
                    else if (new String(s).equals("Programing and Data Structure") ) {

                        which_type_questio=4;
                        Log.d("SubjectCheck", "This is Programing And Data Structure");
                        //resultStatus.setNoOfQuestion(which_type_questio,resultStatus.getNoOfQuestion(which_type_questio)+1);
                    }
                    else if (new String(s).equals("Algorithm") ) {

                        which_type_questio=5;
                        Log.d("SubjectCheck", "This is Algorithm");
                        //resultStatus.setNoOfQuestion(which_type_questio,resultStatus.getNoOfQuestion(which_type_questio)+1);
                    }
                    else if (new String(s).equals("Operating System") ) {
                        which_type_questio=6;
                        Log.d("SubjectCheck", "This is Operating System");
                        ///resultStatus.setNoOfQuestion(which_type_questio,resultStatus.getNoOfQuestion(which_type_questio)+1);

                    }
                    else if (new String(s).equals("Database") ) {
                        which_type_questio=7;
                        Log.d("SubjectCheck", "This is Aptitude");
                        //resultStatus.setNoOfQuestion(which_type_questio, resultStatus.getNoOfQuestion(which_type_questio) + 1);

                    }
                    else if (new String(s).equals("Computer Organization") ) {
                        which_type_questio=8;
                        Log.d("SubjectCheck", "This is Computer Organization");
                        //resultStatus.setNoOfQuestion(which_type_questio,resultStatus.getNoOfQuestion(which_type_questio)+1);

                    }
                    else if (new String(s).equals("Digital") ) {
                        which_type_questio=9;
                        Log.d("SubjectCheck", "This is Digital");
                        // resultStatus.setNoOfQuestion(which_type_questio,resultStatus.getNoOfQuestion(which_type_questio)+1);

                    }
                    else if (new String(s).equals("Aptitude") ) {
                        which_type_questio=10;
                        Log.d("SubjectCheck", "This is Aptitude");
                        //resultStatus.setNoOfQuestion(which_type_questio,resultStatus.getNoOfQuestion(which_type_questio)+1);

                    }

                    else if (new String(s).equals("Other Sub") ) {
                        which_type_questio=11;
                        Log.d("SubjectCheck", "This is Other Sub");
                        //resultStatus.setNoOfQuestion(which_type_questio,resultStatus.getNoOfQuestion(which_type_questio)+1);

                    }
                }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        SharedPreferences sharedPreferences=getActivity().getSharedPreferences("MyData",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        Onreview=false;
        editor.putInt("Id",0);
        editor.putBoolean("Status", false);
        editor.commit();
        Log.d("GameOver", "onAttach is called");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("GameOver", "onStart is called");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("GameOver", "onStop is called");
    }

    @Override
    public void onResume() {
        super.onResume();
        if(Onreview) {
            //Question_result = (TextView) getActivity().findViewById(R.id.question_result_status);
        }
        if(NoQuestion){

        }else{
            setQuestionView();
        }
        ScoreWindow scoreWindow =new ScoreWindow();
        if(scoreWindow.getScoreWindowOpensReview()){
            scoreWindow.setScoreWindowOpensReview(false);
            FragmentManager fragmentManager = getFragmentManager();
            fragmentManager.popBackStack();
        }
        Helper helper = new Helper();

        if(helper.isPalletOpen()){
            TimeEndForThisQuestion = PresentTime;
            helper.setPalletOpen(false);
        }

    }

    @Override
    public void onDetach() {
        super.onDetach();
        SharedPreferences sharedPreferences=getActivity().getSharedPreferences("MyData",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putInt("Id", 0);
        editor.putBoolean("Status", false);
        editor.commit();
        Log.d("GameOver", "onDeatch is called");
        Pcolour.setToZero();

        score=null;
        resultStatus.setToZero();
        Pcolour=null;
        resultStatus=null;
        getActivity().finish();

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("GameOver", "onDestroyView is called");

    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        Pcolour.setToZero();

        resultStatus.setToZero();

        Log.d("GameOver", "onDestroy is called");
    }

    @Override
    public void onDestroyOptionsMenu() {
        super.onDestroyOptionsMenu();
        Log.d("GameOver", "onDestroyOptionsMenu is called");
    }

    @Override
    public void onPause() {
        super.onPause();
        //onSaveInstanceState(new Bundle());
        Log.d("GameOver", "onPause is called");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bundle=savedInstanceState;
        Log.d("GameOver", "onCreate is called");

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

       // outState.putInt("Qid", qid);
        Pcolour.setQid(Pcolour.getQid());


        outState.putString("question", s);
        outState.putInt("Item", Item);
        Log.d("GameOver", "OnSavedInstance is  called");

        //outState.putString("year",tx2);
    }
public void clear(){
    WebSettings webSettings = wb.getSettings();
    Log.d("Check", "after web setting ");
    webSettings.setJavaScriptEnabled(true);
    wb.loadUrl("about:blank");
}
   public void setQuestionView(){

       Log.e("Who","set Question view is called");


        tx1.setTypeface(fontstyle);
       tx2.setTypeface(fontstyle);
       MarksDisplay.setTypeface(fontstyle);

       if(!Onreview){
           grp.clearCheck();
           if(Subjectiv){
               InputAnswer.setText("");
               Subjectiv=false;
           }
       }

       if(Pcolour.getQid()>=question){
           Pcolour.setQid(question-1);
       }
       try {
           clear();
           Log.d("Check", "WE ARE IN SET QUESTION AFTER RECREATION");
           tx1.setText("" + (Pcolour.getQid() + 1) + "/" + question);
           Log.d("Check", "WE ARE IN SET QUESTION getText T1");

           if(Item>2013){
               if(Item==2014){
                   tx2.setText("2014 - (I)");
               }else if(Item==2015){
                   tx2.setText("2014 - (II)");
               }
               else if(Item==2016){
                   tx2.setText("2014 - (III)");
               }
               else if(Item==2017){
                   tx2.setText("2015 - (I)");
               }
               else if(Item==2018){
                   tx2.setText("2015 - (II)");
               }
               else if(Item==2019){
                   tx2.setText("2015 - (III)");
               }
               else if(Item==2020){
                   tx2.setText("2016-(I)");
               }
               else if(Item==2021){
                   tx2.setText("2016-(II)");
               }

           }else{
               tx2.setText("" + Item);
           }
           Log.d("Check", "WE ARE IN SET QUESTION AFTER GETIING TEXT VIEW ID");
       }catch (Exception e){
           e.printStackTrace();
       }


       Log.d("Pallet","we are on set question view qid ="+Pcolour.getQid());
       try {
           Log.d("Pallet", "we are on try block set question view qid =" + Pcolour.getQid());
           currentQ = quesList.get(Pcolour.getQid());

           MarksDisplay.setText("" + currentQ.getMARKS());
       }catch (Exception e){
           e.printStackTrace();
       }


       if (("" + currentQ.getSubjective()).equals("1")) {


           Subjectiv = true;
           Log.d("Subjective", "we are Setting Subjective marks is 1 here =>" + currentQ.getSubjective());

       } else {

           Log.d("Subjective", "we are Setting Subjective marks is 2 here =>" + currentQ.getSubjective());
           Subjectiv = false;

       }

        if(!Onreview) {
            //Log.d("Subjective", "we are Setting Subjective marks is 1 here =>"+InputAnswer.getText().toString());


            if (Subjectiv) {
                viewFlipper.setDisplayedChild(1);

                InputAnswer.clearFocus();
                InputAnswer.requestFocus();

            } else {
                viewFlipper.setDisplayedChild(0);
            }
        }



        Log.d("Check", "WE ARE IN SET QUESTION AFTER GETIING web view");
        WebSettings webSettings = wb.getSettings();
        Log.d("Check", "after web setting ");

        webSettings.setJavaScriptEnabled(true);

        Log.d("Check", "after java script ");
        //String path="assets/";

       wb.setBackgroundColor(Color.parseColor("#c5fafa"));
        try{
            Log.d("Check", "we are in try block ");
            s=currentQ.getQUESTION();
            Log.d("Check","the obtained string is : "+s);
            wb.loadDataWithBaseURL("file:///android_assets/mathscribe/", s, "text/html", "UTF-8", null);
            //qid++;
            Log.e("Check","question is is"+Pcolour.getQid()+"this");
        }catch (Throwable e){
            e.printStackTrace();
        }
        Log.d("Check", "WE ARE IN SET QUESTION Ending...");

       markedReview=false;


if(!Onreview) {
    if(Subjectiv){

        if ((""+Pcolour.getResponse(Pcolour.getQid())).equals("") || (""+Pcolour.getResponse(Pcolour.getQid())).equals("Not Answered")) {
            //InputAnswer.setText("");
        }else{
            InputAnswer.setText(""+Pcolour.getResponse(Pcolour.getQid()));
        }



    }else {
        if (Pcolour.getResponse(Pcolour.getQid()).equals("Not Answered")) {


        } else {
            //grp.setC() == -1;
            if (Pcolour.getResponse(Pcolour.getQid()).equals("A")) {
                grp.check(R.id.radioButton);

            } else if (Pcolour.getResponse(Pcolour.getQid()).equals("B")) {
                grp.check(R.id.radioButton2);

            } else if (Pcolour.getResponse(Pcolour.getQid()).equals("C")) {
                grp.check(R.id.radioButton3);

            } else if (Pcolour.getResponse(Pcolour.getQid()).equals("D")) {
                grp.check(R.id.radioButton4);

            }

        }
    }
}



       if(Onreview){
           Answer.setText(""+currentQ.getANSWER());

           if(Pcolour.getResponse(Pcolour.getQid()).equals("Not Answered")){
               Question_result.setBackgroundColor(Color.parseColor("#FF8397A3"));
               Question_result.setText("Not Attempted");

               YourAnswer.setText("Not Answered");

           }
           else{
               if(Subjectiv){
                   if(getResponseAnswer(Pcolour.getResponse(Pcolour.getQid())).equals(""+currentQ.getANSWER())){

                       Question_result.setBackgroundColor(Color.parseColor("#FF27D656"));
                       Question_result.setText("Correct");

                       YourAnswer.setText(Pcolour.getResponse(Pcolour.getQid()));
                       Subjectiv=false;
                   }else{

                       Question_result.setBackgroundColor(Color.parseColor("#FFF9030F"));
                       Question_result.setText("Wrong");

                       YourAnswer.setText(Pcolour.getResponse(Pcolour.getQid()));

                   }

               }else {
                   if(Pcolour.getResponse(Pcolour.getQid()).equals(""+currentQ.getANSWER())){

                       Question_result.setBackgroundColor(Color.parseColor("#FF27D656"));
                       Question_result.setText("Correct");

                       YourAnswer.setText(Pcolour.getResponse(Pcolour.getQid()));
                       Subjectiv=false;
                   }else{

                       Question_result.setBackgroundColor(Color.parseColor("#FFF9030F"));
                       Question_result.setText("Wrong");

                       YourAnswer.setText(Pcolour.getResponse(Pcolour.getQid()));

                   }
               }

           }


       }


       if(currentQ.getMARKS()=="1"){

           Subjectiv=true;

       }else if(currentQ.getMARKS()=="0"){

           Subjectiv=false;

       }else{

       }



    }



    public  void setQuestion(){
        for(int i=0; i<question; i++) {
            Log.e("SubjectCheck","we are inside setQuestion method"+s);
            currentQ = quesList.get(i);

            s=currentQ.getTOPIC();

                Log.e("SubjectCheck", "we are initilize the subject type sub is " + s);

                if (new String(s).equals("Maths") ) {
                    which_type_questio=0;
                    Log.e("SubjectCheck","This is maths");
                    if(Onreview){
                        Log.e("SubjectCheck","Onreview This is maths");
                    }
                    resultStatus.setNoOfQuestion(which_type_questio, resultStatus.getNoOfQuestion(which_type_questio) + 1);
                    resultStatus.setUnmarked(which_type_questio, resultStatus.getUnmarked(which_type_questio) + 1);

                }
                else if (new String(s).equals("Theory of Computation") ) {
                    which_type_questio=1;
                    Log.d("SubjectCheck","This is Theory of Computation");

                    if(Onreview){
                        Log.e("SubjectCheck","Onreview This is maths");
                    }

                    resultStatus.setNoOfQuestion(which_type_questio, resultStatus.getNoOfQuestion(which_type_questio) + 1);
                    resultStatus.setUnmarked(which_type_questio, resultStatus.getUnmarked(which_type_questio) + 1);

                }
                else if (new String(s).equals("Compiler") ) {
                    which_type_questio=2;
                    Log.d("SubjectCheck","This is Aptitude");
                    if(Onreview){
                        Log.e("SubjectCheck","Onreview This is maths");
                    }

                    resultStatus.setNoOfQuestion(which_type_questio, resultStatus.getNoOfQuestion(which_type_questio) + 1);
                    resultStatus.setUnmarked(which_type_questio, resultStatus.getUnmarked(which_type_questio) + 1);

                }
                else if (new String(s).equals("Computer Network") ) {
                    which_type_questio=3;
                    Log.d("SubjectCheck","This is Computer Network");
                    if(Onreview){
                        Log.e("SubjectCheck","Onreview This is maths");
                    }

                    resultStatus.setNoOfQuestion(which_type_questio, resultStatus.getNoOfQuestion(which_type_questio) + 1);
                    resultStatus.setUnmarked(which_type_questio, resultStatus.getUnmarked(which_type_questio) + 1);

                }
                else if (new String(s).equals("Programing and Data Structure") ) {

                    which_type_questio=4;
                    Log.d("SubjectCheck","This is Programing And Data Structure");
                    if(Onreview){
                        Log.e("SubjectCheck","Onreview This is maths");
                    }
                    resultStatus.setNoOfQuestion(which_type_questio, resultStatus.getNoOfQuestion(which_type_questio) + 1);
                    resultStatus.setUnmarked(which_type_questio, resultStatus.getUnmarked(which_type_questio) + 1);
                }
                else if (new String(s).equals("Algorithm") ) {

                    which_type_questio=5;
                    Log.d("SubjectCheck","This is Algorithm");
                    resultStatus.setNoOfQuestion(which_type_questio, resultStatus.getNoOfQuestion(which_type_questio) + 1);
                    resultStatus.setUnmarked(which_type_questio, resultStatus.getUnmarked(which_type_questio) + 1);
                }
                else if (new String(s).equals("Operating System") ) {
                    which_type_questio=6;
                    Log.d("SubjectCheck","This is Operating System");
                    resultStatus.setNoOfQuestion(which_type_questio, resultStatus.getNoOfQuestion(which_type_questio) + 1);
                    resultStatus.setUnmarked(which_type_questio, resultStatus.getUnmarked(which_type_questio) + 1);

                }
                else if (new String(s).equals("Database") ) {
                    which_type_questio=7;
                    Log.d("SubjectCheck","This is Aptitude");
                    resultStatus.setNoOfQuestion(which_type_questio, resultStatus.getNoOfQuestion(which_type_questio) + 1);
                    resultStatus.setUnmarked(which_type_questio, resultStatus.getUnmarked(which_type_questio) + 1);

                }
                else if (new String(s).equals("Computer Organization") ) {
                    which_type_questio=8;
                    Log.d("SubjectCheck","This is Computer Organization");
                    resultStatus.setNoOfQuestion(which_type_questio, resultStatus.getNoOfQuestion(which_type_questio) + 1);
                    resultStatus.setUnmarked(which_type_questio, resultStatus.getUnmarked(which_type_questio) + 1);

                }
                else if (new String(s).equals("Digital") ) {
                    which_type_questio=9;
                    Log.d("SubjectCheck","This is Digital");
                    resultStatus.setNoOfQuestion(which_type_questio, resultStatus.getNoOfQuestion(which_type_questio) + 1);
                    resultStatus.setUnmarked(which_type_questio, resultStatus.getUnmarked(which_type_questio) + 1);

                }
                else if (new String(s).equals("Aptitude") ) {
                    which_type_questio=10;
                    Log.d("SubjectCheck","This is Aptitude");
                    resultStatus.setNoOfQuestion(which_type_questio, resultStatus.getNoOfQuestion(which_type_questio) + 1);
                    resultStatus.setUnmarked(which_type_questio, resultStatus.getUnmarked(which_type_questio) + 1);

                }

                else {
                    which_type_questio=11;
                    Log.d("SubjectCheckElse", "This is the extrA SUB =" + s);
                    resultStatus.setNoOfQuestion(which_type_questio,resultStatus.getNoOfQuestion(which_type_questio) + 1);
                    resultStatus.setUnmarked(which_type_questio,resultStatus.getUnmarked(which_type_questio)+1);

                }

            }


    }

    public void setItem(int item){
        Log.d("Item","Item is set value is "+item);
        this.Item=item;
    }

   /* public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getActivity().getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }*/


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();


        if(id== R.id.pallet){

        }
        return super.onOptionsItemSelected(item);
    }


    // CountDownTimer class
    public class MyCountDownTimer extends CountDownTimer
    {

        public MyCountDownTimer(long startTime, long interval)
        {
            super(startTime, interval);
        }

        @Override
        public void onFinish()
        {
            text.setText("Time's up!");
            timeElapsedView.setText("Time's up!");

            final boolean NullAnswerSet;
            resultStatus.setTotalTimeTaken(startTime);

            if (Subjectiv) {
                if ((""+InputAnswer.getText()).equals("")) {
                    NullAnswerSet = true;
                } else {
                    NullAnswerSet = false;
                }

            } else {
                if (grp.getCheckedRadioButtonId() == -1) {
                    NullAnswerSet = true;
                } else {
                    NullAnswerSet = false;
                }
            }

            try {

                AlertDialog.Builder alert = new AlertDialog.Builder(getActivity());
                    if(alertDialog!=null){
                        if (alertDialog.isShowing()) {
                            alertDialog.dismiss();
                        }

                    }

                alert.setTitle("Time's up!");

                if (NullAnswerSet) {

                    Log.e("setNotAnswered", "Question is not answered ");
                    //not answered
                    Pcolour.setQuestionStatus((Pcolour.getQid()), 3);
                    Pcolour.setResponse((Pcolour.getQid()), "Not Answered");

                } else {

                    Pcolour.setQuestionStatus((Pcolour.getQid()), 4);

                    RadioButton Rbuttons;
                    String answer = "";

                    if (Subjectiv) {
                        answer = "" + InputAnswer.getText();
                    } else {

                        Rbuttons = (RadioButton) getActivity().findViewById(grp.getCheckedRadioButtonId());
                        answer = "" + Rbuttons.getText();

                    }
                    Pcolour.setResponse((Pcolour.getQid()), answer);
                }


                alert.setCancelable(false);

                alert.setPositiveButton("Submit", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        final_submisstion();
                    }


                });
                alertDialog = alert.create();
                alertDialog.show();
           }catch (Exception e){

            }


           /* alert.setNegativeButton("Cancel",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int whichButton) {
                            dialog.cancel();

                            //dec Qid
                            Pcolour.setQid((Pcolour.getQid() - 1));
                        }

                    });*/


        }

        @Override
        public void onTick(long thisTime)
        {
            //text.setText("Time remain:" + millisUntilFinished);
            PresentTime=thisTime;
            long timeForOnQuestion = TimeEndForThisQuestion-thisTime;

            timeElapsedView.setText(String.format("Time On This Quest : " + "%d : %d ",

                    TimeUnit.MILLISECONDS.toMinutes( timeForOnQuestion),
                    TimeUnit.MILLISECONDS.toSeconds( timeForOnQuestion) -
                            TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.
                                    toMinutes(timeForOnQuestion))));


            text.setText(String.format(" "+"%d : %d ",

                    TimeUnit.MILLISECONDS.toMinutes( thisTime),
                    TimeUnit.MILLISECONDS.toSeconds( thisTime) -
                            TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.
                                    toMinutes( thisTime))));
        }
    }

    public void final_submisstion(){

        int QuestId;
        int j;
        for (QuestId = 0; QuestId < question; QuestId++) {
            currentQ = quesList.get(QuestId);
            j=Integer.parseInt(currentQ.getMARKS());
            Pcolour.setMarks(QuestId,j);

            setType_Of_Question();

            if (currentQ.getSubjective().equals("1")) {
                Subjectiv = true;
            } else {
                Subjectiv = false;
            }

            if ((Pcolour.getResponse(QuestId)).equals("Not Answered") ||
                    (Pcolour.getResponse(QuestId)).equals("")) {

                Pcolour.setResponse(QuestId, "Not Answered");

            } else {
                resultStatus.setMarked(which_type_questio, (resultStatus.getMarked(which_type_questio) + 1));

                resultStatus.setUnmarked(which_type_questio, (resultStatus.getUnmarked(which_type_questio) - 1));

                Log.d("Final_out", "Response is : " + Pcolour.getResponse(QuestId) + " And Correct answer is : " + currentQ.getANSWER());
                Log.e("Final_out", "Response is : " + getResponseAnswer(Pcolour.getResponse(QuestId)));

                if (("" + currentQ.getANSWER()).equals(getResponseAnswer(Pcolour.getResponse(QuestId)))) {


                    resultStatus.setCorrect(which_type_questio, (resultStatus.getCorrect(which_type_questio) + 1));
                    marks = currentQ.getMARKS();

                    score[QuestId] = Integer.parseInt(marks);


                } else {
                    resultStatus.setWrong(which_type_questio, (resultStatus.getWrong(which_type_questio) + 1));
                    marks = currentQ.getMARKS();
                    Log.d("Marks", "Now marks is " + marks);
                    int mark = Integer.parseInt(marks);
                    if (mark == 2) {
                        score[QuestId] = -0.66;
                    }
                    if (mark == 1) {
                        score[QuestId] = -0.33;
                    }

                }

            }
        }

        double sco = 0;
        for (int i = 0; i < question; i++) {
            sco = sco + score[i];
        }

        Pcolour.setFinalScore(sco);


        //RadioButton answer = (RadioButton) getActivity().findViewById(grp.getCheckedRadioButtonId());
        Intent intent = new Intent(getActivity(), ScoreWindow.class);
        startActivity(intent);

    }





}




