package com.rson.brothers.gatecswithlecture;

import android.util.Log;

/**
 * Created by Brother's on 5/1/2016.
 */
public class Helper {


    static boolean OnReview=false,setFinish=false,PalletOpen=false,AboutUsIntro=false;

    public static void setOnReview(boolean onReview) {
        Log.d("ReviewQuestion", "On Reviewing setting helper ");
        OnReview = onReview;
    }

   public static boolean getOnReview(){
       Log.d("ReviewQuestion","On Reviewing getting helper ");
       return OnReview;
   }
    public static void isSetFinish(boolean temp){
        setFinish=temp;
    }
    public static boolean getfinish(){
        return setFinish;
    }

    public static void setPalletOpen(boolean palletOpen) {
        PalletOpen = palletOpen;
    }

    public static boolean isPalletOpen() {
        return PalletOpen;
    }

    public static void setAboutUsIntro(boolean aboutUsIntro) {
        AboutUsIntro = aboutUsIntro;
    }

    public static boolean isAboutUsIntro() {
        return AboutUsIntro;
    }
}
