package com.rson.brothers.gatecswithlecture;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Brother's on 7/20/2016.
 */
public class BookDataStructure extends Fragment {

    WebView amazon1,flipkart1;
    Button info;
    String s, js;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.book_data_structure,container,false);
    }

    @Override
    public void onActivityCreated( Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        amazon1= (WebView) getActivity().findViewById(R.id.webView);

        info= (Button) getActivity().findViewById(R.id.bookinfo);

        flipkart1= (WebView) getActivity().findViewById(R.id.webView2);


        if(isNetworkAvaliable(getActivity())){
            //Toast.makeText(getActivity(),"Net is connected",Toast.LENGTH_SHORT).show();

            loadFlipkartAds("<div data-WRID=\"WRID-146927246515981274\" data-widgetType=\"productBanner\"  data-class=\"affiliateAdsByFlipkart\" height=\"240px\" width=\"120px\"></div><script async src=\"//affiliate.flipkart.com/affiliate/widgets/FKAffiliateWidgets.js\"></script>",flipkart1);


            loadAmazonAds("<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"//ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ac&ref=tf_til&ad_type=product_link&tracking_id=rsonsdevel-21&marketplace=amazon&region=IN&placement=8120305965&asins=8120305965&linkId=&show_border=false&link_opens_in_new_window=true\">\n" +
                    "</iframe>",amazon1);

            amazon1=(WebView) getActivity().findViewById(R.id.webViewrow2);
            loadAmazonAds("<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"//ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ac&ref=tf_til&ad_type=product_link&tracking_id=rsonsdevel-21&marketplace=amazon&region=IN&placement=9332549311&asins=9332549311&linkId=&show_border=false&link_opens_in_new_window=true\">\n" +
                    "</iframe>",amazon1);

            amazon1= (WebView) getActivity().findViewById(R.id.webView2row2);
            loadFlipkartAds("<div data-WRID=\"WRID-146927286130169652\" data-widgetType=\"productBanner\"  data-class=\"affiliateAdsByFlipkart\" height=\"240px\" width=\"120px\"></div><script async src=\"//affiliate.flipkart.com/affiliate/widgets/FKAffiliateWidgets.js\"></script>",amazon1);


//3 line
            amazon1=(WebView) getActivity().findViewById(R.id.webViewrow3);
            loadAmazonAds("<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"//ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ac&ref=tf_til&ad_type=product_link&tracking_id=rsonsdevel-21&marketplace=amazon&region=IN&placement=8126515228&asins=8126515228&linkId=&show_border=false&link_opens_in_new_window=true\">\n" +
                    "</iframe>",amazon1);

            amazon1= (WebView) getActivity().findViewById(R.id.webView2row3);
            loadFlipkartAds("<div data-WRID=\"WRID-146927325259946589\" data-widgetType=\"productBanner\"  data-class=\"affiliateAdsByFlipkart\" height=\"240px\" width=\"120px\"></div><script async src=\"//affiliate.flipkart.com/affiliate/widgets/FKAffiliateWidgets.js\"></script>",amazon1);


            //4 line
            amazon1=(WebView) getActivity().findViewById(R.id.webViewrow4);
            loadAmazonAds("<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"//ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ac&ref=tf_til&ad_type=product_link&tracking_id=rsonsdevel-21&marketplace=amazon&region=IN&placement=1466304162&asins=1466304162&linkId=&show_border=false&link_opens_in_new_window=true\">\n" +
                    "</iframe>",amazon1);

            amazon1= (WebView) getActivity().findViewById(R.id.webView2row4);
            loadFlipkartAds("<div data-WRID=\"WRID-146927339121376033\" data-widgetType=\"productBanner\"  data-class=\"affiliateAdsByFlipkart\" height=\"240px\" width=\"120px\"></div><script async src=\"//affiliate.flipkart.com/affiliate/widgets/FKAffiliateWidgets.js\"></script>",
                    amazon1);



            amazon1=(WebView) getActivity().findViewById(R.id.webViewrow5);
            loadAmazonAds("<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"//ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ac&ref=tf_til&ad_type=product_link&tracking_id=rsonsdevel-21&marketplace=amazon&region=IN&placement=8131715841&asins=8131715841&linkId=&show_border=false&link_opens_in_new_window=true\">\n" +
                    "</iframe>",amazon1);

            amazon1= (WebView) getActivity().findViewById(R.id.webView2row5);
            loadFlipkartAds("<div data-WRID=\"WRID-146927412755856119\" data-widgetType=\"productBanner\"  data-class=\"affiliateAdsByFlipkart\" height=\"240px\" width=\"120px\"></div><script async src=\"//affiliate.flipkart.com/affiliate/widgets/FKAffiliateWidgets.js\"></script>",
                    amazon1);



            amazon1=(WebView) getActivity().findViewById(R.id.webViewrow6);
            loadAmazonAds("<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"//ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ac&ref=tf_til&ad_type=product_link&tracking_id=rsonsdevel-21&marketplace=amazon&region=IN&placement=9351101398&asins=9351101398&show_border=true&link_opens_in_new_window=true&linkId=\">\n" +
                    "</iframe>\n",amazon1);

            amazon1= (WebView) getActivity().findViewById(R.id.webView2row6);
            loadFlipkartAds("<div data-WRID=\"WRID-146927426580444896\" data-widgetType=\"productBanner\"  data-class=\"affiliateAdsByFlipkart\" height=\"240px\" width=\"120px\"></div><script async src=\"//affiliate.flipkart.com/affiliate/widgets/FKAffiliateWidgets.js\"></script>",
                    amazon1);





        }
        else{
            Toast.makeText(getActivity(),"Check your Internet Connection",Toast.LENGTH_LONG).show();


        }


        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenDialog("The C Programming Language (Ansi C Version) by Dennis Ritchie ","Best book for programming in c. It covers all the topics and explained in very well manner. " +
                        "The C language is a general purpose computer programming language developed by Dennis Ritchie. It is a " +
                        "structured programming language. C is one of the most widely used programming languages of all time. This book," +
                        " The C Programming Language (Ansi C Version), comes from the author who indeed developed the language.");

            }
        });


        Button info2 = (Button) getActivity().findViewById(R.id.bookinforow2);

        info2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenDialog("Data Structures Using C by Tenenbaum, Langsam and Augenstein","This book is meant for those students who wish to learn the art of creating efficient data structures using C." +
                        " This handbook teaches the readers the steps to be followed for enhancing program execution using data structures.");
            }
        });

        Button info3= (Button) getActivity().findViewById(R.id.bookinforow3);

        info3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenDialog("Data Structures and Algorithms in Java by Michael and Roberto ","This conceptually elegant and pedagogically " +
                        "innovative text continues to incorporate the object-oriented design paradigm, using Java as the implementation language," +
                        " while also providing intuition and analysis of fundamental data structures and algorithms. All of this is done in a clear, " +
                        "friendly writing style that uses visuals " +
                        "to introduce and simplify important analytic and mathematical concepts. This is only recommended for them who has interest in " +
                        "java.");
            }
        });

        Button info4= (Button) getActivity().findViewById(R.id.bookinforow4);

        info4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenDialog("Data Structures and Algorithms Made Easy in Java","This book deploys an interactive approach to help clear many concepts with easy-to-grasp explanations." +
                        " Data structure is a method of organizing computer data so that it can further be used effectively. " +
                        "These organized data structures are the key to effective algorithm-designing for different databases and " +
                        "internet indexing services. ");
            }
        });

        Button info5= (Button) getActivity().findViewById(R.id.bookinforow5);

        info5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenDialog("Pointers on C by Kenneth Reek","Designed for professionals and advanced students, Pointers On C " +
                        "provides a comprehensive resource for those needing in-depth coverage of the C programming language." +
                        " An extensive explanation of pointer basics and a thorough exploration of their advanced" +
                        " features allow programmers to incorporate the power of pointers into their C programs.");
            }
        });

        Button info6= (Button) getActivity().findViewById(R.id.bookinforow6);

        info6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenDialog("Understanding and Using C Pointers by Richard Reese","Improve your programming through a solid understanding of C pointers and memory management. " +
                        "With this practical book, you'll learn how pointers provide the mechanism to dynamically manipulate memory, enhance support for data structures and enable access to hardware. " +
                        "Author Richard Reese shows you how to use pointers with arrays, strings, structures and functions, using memory models throughout the book.");
            }
        });



    }

    public void loadAmazonAds(String s,WebView amazonWeb){
        js = "<!DOCTYPE html><head>" +

                "</head><body>";
        js = js + s;

        js = js +"</body></html>";
        WebSettings webSettings = amazon1.getSettings();
        webSettings = amazonWeb.getSettings();
        //webView.setWebViewClient(new WebViewClient());
        webSettings.setJavaScriptEnabled(true);

        amazonWeb.loadDataWithBaseURL("http://www.amazon.in/", js, "text/html", "UTF-8", null);

    }

    public void loadFlipkartAds(String s,WebView flipweb){

        js = "<!DOCTYPE html><head>" +

                "</head><body>";
        js = js + s;

        js = js +"</body></html>";

        WebSettings webSettings;
        webSettings = flipweb.getSettings();

        webSettings.setJavaScriptEnabled(true);

        flipweb.loadDataWithBaseURL("http://www.amazon.in/", js, "text/html", "UTF-8", null);

    }
    public void OpenDialog(String Title,String s){

        AlertDialog alertDialog = new AlertDialog.Builder(getActivity()).create();
        alertDialog.setIcon(R.drawable.bookinfo2);

        alertDialog.setTitle(Title);
        alertDialog.setMessage(s);
        alertDialog.show();

    }

    public static boolean isNetworkAvaliable(Context ctx) {

        // Log.d("Internet","we are now in Internet connection");
        boolean token=false;

        ConnectivityManager cm = (ConnectivityManager) ctx.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        if (activeNetwork != null) { // connected to the internet
            if (activeNetwork.getType() == ConnectivityManager.TYPE_WIFI||activeNetwork.getType()==ConnectivityManager.TYPE_MOBILE) {

                token= true;

            }
        } else {

            token=  false;
            //
        }
        return token;
    }

}
