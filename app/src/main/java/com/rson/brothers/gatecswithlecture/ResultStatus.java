package com.rson.brothers.gatecswithlecture;

import android.util.Log;

/**
 * Created by Brother's on 4/29/2016.
 */

public class ResultStatus {

   static Arrayset[] ResultArray=new Arrayset[12];
    //static int i=0;
    static ResultStatus context;
static boolean Subjective;
    static   int Topic;
    Arrayset arrayset = new Arrayset();

    static long TotalTimeTaken;

    public void setToZero(){
        arrayset.setToZero();
        Subjective=false;
        Topic=0;
        TotalTimeTaken=0;
        context=null;
//        ResultArray[0].setToZero();
//        Arrays.fill(ResultArray, 0);
    }

    public static void setSubjective(boolean subjective) {
        Subjective = subjective;
    }
    public static boolean getSubjective(){
        return Subjective;
    }

    public void setTopic(int topic) {
        Topic = topic;
    }

    public int getTopic() {
        return Topic;
    }

    public static void setTotalTimeTaken(long totalTimeRequired) {
        TotalTimeTaken = totalTimeRequired;
    }

    public static long getTotalTimeTaken() {
        return TotalTimeTaken;
    }

    public static void setContext(ResultStatus c){
        context=c;
    }

    public static ResultStatus getContext() {
        return context;
    }

    public static void setCorrect(int i,int correct) {
        ResultArray[i].setCorrect(i,correct);
        //Arrayset.correct = correct;
    }

    public static void setMarked(int i,int marked) {
        ResultArray[i].setMarked(i,marked);
        //Arrayset.marked = ;
    }

    public static void setNoOfQuestion(int i,int noOfQuestion) {
        ResultArray[i].setNoOfQuestion(i,noOfQuestion);
        //NoOfQuestion = noOfQuestion;
    }

    public static void setTopicName(int i,String topicName) {
        ResultArray[i].setTopicName(i,topicName);
        //TopicName = topicName;
    }

    public static void setUnmarked(int i,int unmarked) {
        ResultArray[i].setUnmarked(i,unmarked);
       // Arrayset.unmarked = unmarked;
    }

    public static void setWrong(int i,int wrong) {
        ResultArray[i].setWrong(i,wrong);
        // Arrayset.wrong = wrong;
    }


    public static int getCorrect(int i) {

        return ResultArray[i].getCorrect(i);
    }

    public static int getMarked(int i) {
        return ResultArray[i].getMarked(i);
    }

    public static int getNoOfQuestion(int i) {
        return ResultArray[i].getNoOfQuestion(i);
    }

    public static int getUnmarked(int i) {
        return ResultArray[i].getUnmarked(i);
    }

    public static int getWrong(int i) {
        return ResultArray[i].getWrong(i);
    }

    public static String getTopicName(int i) {
        return ResultArray[i].getTopicName(i);
    }



    public static class Arrayset{

       public static String[] TopicName = new String[12];
        public static int[] NoOfQuestion=new int[12];
        public static int[] wrong=new int[12];
        public static int[] correct = new int[12];
        public  static  int []marked = new int[12];
        public  static  int []unmarked = new int [12];

        public static void setToZero(){
            for(int i=0;i<12;i++){

                TopicName[i]="";
                NoOfQuestion[i]=0;
                wrong[i]=0;
                correct[i]=0;
                marked[i]=0;
                unmarked[i]=0;
                Log.d("SetToZero","Here we setting to zero");

            }
            //Arrays.fill(TopicName, 0);
           // Arrays.fill(NoOfQuestion, 0);
           // Arrays.fill(wrong, 0);
           // Arrays.fill(correct, 0);
           // Arrays.fill(marked, 0);
           // Arrays.fill(unmarked, 0);

        }

       public static int getCorrect(int i) {
            return correct[i];
        }

       public static int getMarked(int i) {
            return marked[i];
        }

        public static int getNoOfQuestion(int i) {
            return NoOfQuestion[i];
        }

        public static int getUnmarked(int i) {
            return unmarked[i];
        }

        public static int getWrong(int i) {
            return wrong[i];
        }

        public static String getTopicName(int i) {
            return TopicName[i];
        }

        //seting the values...

        public static void setCorrect(int i,int correct) {
            Arrayset.correct[i] = correct;
        }

        public static void setMarked(int i,int marked) {
            Arrayset.marked[i] = marked;
        }

        public static void setNoOfQuestion(int i,int noOfQuestion) {
            NoOfQuestion[i] = noOfQuestion;
        }

        public static void setTopicName(int i,String topicName) {
            TopicName[i] = topicName;
        }

        public static void setUnmarked(int i,int unmarked) {
            Arrayset.unmarked[i] = unmarked;
        }

        public static void setWrong(int i,int wrong) {
            Arrayset.wrong[i] = wrong;
        }

    }
}
