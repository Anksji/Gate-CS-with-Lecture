package com.rson.brothers.gatecswithlecture;

import android.util.Log;

/**
 * Created by Brother's on 6/21/2016.
 */
public class RatingClass {

    public static int[] nptelTOCRating = {3,3,3,3,3,2,3,3,3,3,3,3,3,3,3,3,1,3,3,3,
                                          3,3,3,3,3,2,1,3,3,3,3,3,3,3,3,3,3,3,3,2,3,3};

    public static int[] nptelCDRating = {3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3
                                            ,3,3,3,3,3,3,3,3};

    public static int[] nptelCNRating = {2,2,3, 3,2,3,3,2,2, 3,3,3,3,2,3, 3,3,3,3,3, 3,3,3,1, 2,3,3,3, 2,2,3,3,3,
            3,3,3,2, 3,3,3,3, 3,3,3,3, 3,3,3, 2,3,3,3, 3,3,3,3, 3,1,3, 2,3,2, 3,3,3,3, 3,3,3,3,2,2, 2,1,2,
            3,2,3,3, 3,2,2,3, 3,3,2,2,3, 3,3,2,2};

    public static int[] nptelDSARating ={3,3, 3,2,3,3,3, 2,3,3,3,3,3,3,
            3,3,3, 3,2,3,3,2,3, 3,3,2, 3,2,3,2, 3,3,3, 3,3,3};

    public static int[] nptelOSRating = {3,3,3, 3,3,3,3, 3,3,3,3,3, 3,3,3,3,3, 3,3,3,3, 3,3,3,3,3, 3,3,3, 3,3};

    public static int[] nptelDBMSRating = {3,3, 3,3,3,3, 3,3,3, 3,3,3, 3,3,3, 3,3,3, 3,3, 3,3,3,3,
            3,3,3, 3,3,3, 2,1, 2,1,1, 1,2,2, 1,1,1,2, 2};

    public static int[] nptelCORating = {3,3, 3,3,3, 3,3,3, 3,3,3, 3,2,2,3,
            3,3,3,3, 3,3,3,3, 3,3,3,3, 3,3,3,3,3,3,
            3,3,3,3,
            3,3};

    public static int[] nptelDIGITALRating = {3,3, 3,3,3,3, 3,3, 3,3,3,3, 3,3,3,3,
            3,3,3, 3,3,3,3, 3,3,2, 3,3,3,3, 2,2,2, 3,3,3, 2,2,3, 3};

    public static int[] nptelDiscreteRating ={3,3, 3,3,2, 1,1,1, 1,3,3,3, 3,3,3,3,3,3,
            3,3,3,3, 3,3,3,3,1, 2,2,3, 3,3,3,3, 3,3,3,1,1, 3};


    public static int ReturnRating(int subject, int lectureNumber){
        int rating=2;
        Log.d("Rating","subject is :"+subject+" and lecture number is "+lectureNumber);

        if(subject==0){
            rating= nptelTOCRating[lectureNumber];
        }
        if(subject==1){
            rating=nptelCDRating[lectureNumber];
        }
        if(subject==2){
            rating= nptelCNRating[lectureNumber];
        }
        if(subject==3){
            rating=nptelDSARating[lectureNumber];
        }
        if(subject==4){
            rating=nptelOSRating[lectureNumber];
        }
        if(subject==5){
            rating=nptelDBMSRating[lectureNumber];
        }
        if(subject==6){
            rating=nptelCORating[lectureNumber];
        }
        if(subject==7){
            rating=nptelDIGITALRating[lectureNumber];
        }
        if(subject==8){
            rating=nptelDiscreteRating[lectureNumber];
        }
        return rating;
    }
    public static int ReturnNptelTocRating(int Position){

        return nptelTOCRating[Position];
    }

    public static int ReturnNptelCDRating(int Position){

        return nptelCDRating[Position];
    }
    public static int ReturnNptelCNRating(int Position){

        return nptelCNRating[Position];
    }
    public static int ReturnNptelDSARating(int Position){

        return nptelDSARating[Position];
    }
    public static int ReturnNptelOSRating(int Position){

        return nptelOSRating[Position];
    }
    public static int ReturnNptelDBMSRating(int Position){

        return nptelDBMSRating[Position];
    }
    public static int ReturnNptelCORating(int Position){

        return nptelCORating[Position];
    }

    public static int ReturnNptelDIGITALRating(int Position){

        return nptelDIGITALRating[Position];
    }

    public static int ReturnDiscreteRating(int Position){

        return nptelDiscreteRating[Position];
    }

}
