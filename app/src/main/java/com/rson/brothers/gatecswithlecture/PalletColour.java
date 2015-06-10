package com.rson.brothers.gatecswithlecture;

import android.util.Log;

import java.util.Arrays;

/**
 * Created by Brother's on 4/28/2016.
 */
public class PalletColour {
    public static int[] QuestionStatus = new int[90];
    public static int [] pallet = new int[90];
    public static  String[] response = new String[90];
    public static int [] Marks = new int[90];
    public static int No_of_Question=0;
    static int Id;
    static int qid;
    static  double finalScore;

    boolean raw;

    public static void setToZero(){

        Arrays.fill(QuestionStatus, 0);
        Arrays.fill(pallet, 0);
        Arrays.fill(Marks,0);
        Arrays.fill(response, "Not Answered");
        No_of_Question=0;
        Id=0;
        qid=0;
        finalScore=0;

    }



    public static void setDefaultResponse(){
        Arrays.fill(response, "Not Answered");
    }


    public static void setArray(int questId){


        if(QuestionStatus[questId]==0){
            pallet[questId]= R.drawable.not_visited3;
        }
        else if(QuestionStatus[questId]==1){
            pallet[questId]= R.drawable.reviewmarked1;
        }
        else if(QuestionStatus[questId]==2){
            pallet[questId]= R.drawable.answeredmarked1;
        }
        else if(QuestionStatus[questId]==3){
            pallet[questId]= R.drawable.not_answered1;
        }
        else if(QuestionStatus[questId]==4){
            pallet[questId]= R.drawable.answered1;
        }

    }

    public static void setResponse(int QuestId, String s1){
        response[QuestId]=s1;
        Log.d("Resetting","Resetting response");
    }
    public static void setMarks(int QuestId,int Mark){
        Marks[QuestId]=Mark;
    }
public static int getMarks(int QuestId){
    return Marks[QuestId];
}
    public  static  String getResponse(int QuestId){
        return response[QuestId];
    }

    public static void setQuestionStatus(int questId, int status){


            QuestionStatus[questId]=status;

            setArray(questId);

    }

    public static void setNo_of_Question(int no_of_Question) {
        No_of_Question = no_of_Question;
    }

    public static int getNo_of_Question() {
        return No_of_Question;
    }

    public static void setId(int id) {
        Id = id;
    }

    public static int getId() {
        return Id;
    }

    /*public void setQid(int qi) {
        qid = qi;
        raw=true;
        Log.d("Pallet", "we setting setqid qid =" + qid);
        SharedPreferences sharedPreferences=this.getSharedPreferences("MyData", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putInt("Id",qid);
        editor.putBoolean("Status",raw);
        editor.commit();
        //setQuestionView();
    }
*/
    public static void setQid(int qid) {
        PalletColour.qid = qid;
    }

    public static int getQid() {
        return qid;
    }

    public static void setFinalScore(double finalScore) {
        PalletColour.finalScore = finalScore;
        Log.e("ScoreCheck","we are setting final score in palletcolour");
    }

    public static double getFinalScore() {
        Log.e("ScoreCheck","we are getting final score in palletcolour");
        return finalScore;

    }
}
