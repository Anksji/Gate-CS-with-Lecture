package com.rson.brothers.gatecswithlecture;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

/**
 * Created by Brother's on 5/15/2016.
 */
public class DescriptionFrag extends Fragment {

    WebView description;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.descriptionfrag, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        description= (WebView) getActivity().findViewById(R.id.discription);
    }

    public void changeData(int i){
        Resources resources=getResources();
        Helper helper=new Helper();
        String[] Description;
        if(helper.isAboutUsIntro()){
            Description= resources.getStringArray(R.array.About_description);
        }
        else{
            Description= resources.getStringArray(R.array.topic_description);
        }

        WebSettings webSettings = description.getSettings();
        webSettings.setJavaScriptEnabled(true);


        String string=getInFormat(Description[i]);
            description.setBackgroundColor(Color.parseColor("#c5fafa"));

        description.loadDataWithBaseURL("file:///android_assets/mathscribe/",string , "text/html", "UTF-8", null);

    }

    public String getInFormat(String s) {
        String path = "file:///android_asset/mathscribe/";
        String js = "<!DOCTYPE html><head>" +
                "<style type=\"text/css\">\n" +
                "                    @font-face {\n" +
                "                       font-family: MyFont;\n" +
                "                       src: url(\'file:///android_asset/fonts/Regular.ttf')\n" +
                "                    }\n" +
                "                    body {\n" +
                "                        font-family: MyFont;\n" +
                "                        font-size: medium;\n" +
                "                    }\n" +
                "                 </style>\n"
                + "<link rel='stylesheet' href='" + path + "jqmath-0.4.3.css'>"
                + "<script src='" + path + "jquery-1.4.3.min.js'></script>"
                + "<script src='" + path + "jqmath-etc-0.4.3.min.js'></script>"
                + "</head><body>";
        js = js + s;
        js = js + "</script></body></html>";
        //+ "<script>var s = 'If $ax^2+bx+c=0$ with $a≠0$ then: $$ $$ $A. x={-b±√{b^2-4ac}}/{2a}$  $B. y-y_0=m(x-x_0)$     $$ $$     $C. ∫_\\Δd\\bo ω=∫_{∂\\Δ}\\bo ω$ $D. {1+√5}/2=1+1/{1+1/{1+⋯}}$';M.parseMath(s);document.write(s);</script></body>";

        return js;
    }
}
