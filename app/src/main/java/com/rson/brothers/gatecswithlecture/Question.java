package com.rson.brothers.gatecswithlecture;

/**
 * Created by Brother's on 3/30/2016.
 */
public class Question {

    private int ID;
    private String QUESTION;
    private String QUESTION_NO;
    private String TOPIC;
    private String YEAR;
    private String ANSWER;
    private String MARKS;
    private byte[] image;
    private  int row_no;
    private String Explanation;
    private String subjective;
    private boolean demo;
    public Question()
    {
        ID=0;
        QUESTION="";
        QUESTION_NO="";
        TOPIC="";
        YEAR="";
        ANSWER="";
        MARKS="";
        row_no=10;
        Explanation="";
        subjective="";
    }

    public Question(String qUESTION,String aNSWER, String qUESTION_NO, String tOPIC,String mARKS, String yEAR ,String exp,boolean type) {
        QUESTION = qUESTION;
        QUESTION_NO = qUESTION_NO;
        TOPIC = tOPIC;
        YEAR = yEAR;
        ANSWER = aNSWER;
        MARKS = mARKS;
        Explanation=exp;
        subjective="";
    }

    public Question(String qUESTION,String aNSWER, String qUESTION_NO, String tOPIC,String mARKS, String yEAR ,String exp, String type) {
        QUESTION = qUESTION;
        QUESTION_NO = qUESTION_NO;
        TOPIC = tOPIC;
        YEAR = yEAR;
        ANSWER = aNSWER;
        MARKS = mARKS;
        Explanation=exp;
        subjective=type;
    }

    public void setExplanation(String exp){
        Explanation=exp;
    }
    public String getExplanation(){
        return Explanation;
    }

    public void setSubjective(String subjective) {
        this.subjective = subjective;
    }

    public String getSubjective() {
        return subjective;
    }

    public int getID()
    {
        return ID;
    }
    public String getQUESTION() {
        return QUESTION;
    }
    public String getTOPIC() {
        return TOPIC;
    }
    public String getYEAR() {
        return YEAR;
    }
    public String getQUESTION_NO() {
        return QUESTION_NO;
    }
    public String getMARKS(){ return MARKS; }
    public String getANSWER() {
        return ANSWER;
    }

    public void setID(int id)
    {
        ID=id;
    }
    public void setQUESTION(String qUESTION) {
        QUESTION = qUESTION;
    }
    public void setMARKS(String mARKS){ MARKS = mARKS; }
    public void setTOPIC(String tOPIC) {
        TOPIC= tOPIC;
    }
    public void setYEAR(String yEAR) {
        YEAR= yEAR;
    }
    public void setQUESTION_NO(String qUESTION_NO) {
        QUESTION_NO = qUESTION_NO;
    }
    public void setANSWER(String aNSWER) {
        ANSWER = aNSWER;
    }
    public byte[] getImage() {
        return image;
    }
    public void setImage(byte[] image) {
        this.image = image;
    }
    public void setRow_no(int ques){
        row_no = ques;
    }
    public int getRow_no(){
        return row_no;
    }
}
