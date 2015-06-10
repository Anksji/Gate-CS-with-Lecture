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

public class BookAlgorithm extends Fragment {

    WebView amazon1,flipkart1;
    Button info;
    String s, js;
    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        return inflater.inflate(R.layout.book_algorithm,container,false);

    }

    @Override
    public void onActivityCreated( Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        amazon1= (WebView) getActivity().findViewById(R.id.webView);

        info= (Button) getActivity().findViewById(R.id.bookinfo);

        flipkart1= (WebView) getActivity().findViewById(R.id.webView2);


        if(isNetworkAvaliable(getActivity())){
            //Toast.makeText(getActivity(),"Net is connected",Toast.LENGTH_SHORT).show();

            loadFlipkartAds("<div data-WRID=\"WRID-146921368116869041\" data-widgetType=\"productBanner\"  data-class=\"affiliateAdsByFlipkart\" height=\"240px\" width=\"120px\"></div><script async src=\"//affiliate.flipkart.com/affiliate/widgets/FKAffiliateWidgets.js\"></script>",flipkart1);


            loadAmazonAds("<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"//ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ac&ref=tf_til&ad_type=product_link&tracking_id=rsonsdevel-21&marketplace=amazon&region=IN&placement=8120340078&asins=8120340078&linkId=&show_border=true&link_opens_in_new_window=true\">\n" +
                    "</iframe>",amazon1);

            amazon1=(WebView) getActivity().findViewById(R.id.webViewrow2);
            loadAmazonAds("<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"//ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ac&ref=tf_til&ad_type=product_link&tracking_id=rsonsdevel-21&marketplace=amazon&region=IN&placement=B00IZ0FXUE&asins=B00IZ0FXUE&linkId=&show_border=false&link_opens_in_new_window=true\">\n" +
                    "</iframe>",amazon1);

            amazon1= (WebView) getActivity().findViewById(R.id.webView2row2);
            loadFlipkartAds("<div data-WRID=\"WRID-146921318099993736\" data-widgetType=\"productBanner\"  data-class=\"affiliateAdsByFlipkart\" height=\"240px\" width=\"120px\"></div><script " +
                    "async src=\"//affiliate.flipkart.com/affiliate/widgets/FKAffiliateWidgets.js\"></script>",amazon1);



            amazon1=(WebView) getActivity().findViewById(R.id.webViewrow3);
            loadAmazonAds("<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"//ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ac&ref=tf_til&ad_type=product_link&tracking_id=rsonsdevel-21&marketplace=amazon&region=IN&placement=032157351X&asins=032157351X&linkId=&show_border=false&link_opens_in_new_window=true\">\n" +
                    "</iframe>",amazon1);

            amazon1= (WebView) getActivity().findViewById(R.id.webView2row3);
            loadAmazonAds("<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"//ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ac&ref=tf_til&ad_type=product_link&tracking_id=rsonsdevel-21&marketplace=amazon&region=IN&placement=B00I50LKYW&asins=B00I50LKYW&linkId=&show_border=false&link_opens_in_new_window=true\">\n" +
                    "</iframe>",amazon1);

            amazon1=(WebView) getActivity().findViewById(R.id.webViewrow4);
            loadFlipkartAds("<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"//ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ac&ref=tf_til&ad_type=product_link&tracking_id=rsonsdevel-21&marketplace=amazon&region=IN&placement=8181287371&asins=8181287371&linkId=&show_border=false&link_opens_in_new_window=true\">\n" +
                    "</iframe>",amazon1);

            amazon1= (WebView) getActivity().findViewById(R.id.webView2row4);
            loadFlipkartAds("<div data-WRID=\"WRID-146921568622544639\" data-widgetType=\"productBanner\"  data-class=\"affiliateAdsByFlipkart\" height=\"240px\" width=\"120px\"></div><script async src=\"//affiliate.flipkart.com/affiliate/widgets/FKAffiliateWidgets.js\"></script>",
                    amazon1);

            amazon1=(WebView) getActivity().findViewById(R.id.webViewrow5);
            loadAmazonAds("<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"//ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ac&ref=tf_til&ad_type=product_link&tracking_id=rsonsdevel-21&marketplace=amazon&region=IN&placement=0262518805&asins=0262518805&linkId=&show_border=false&link_opens_in_new_window=true\">\n" +
                    "</iframe>",amazon1);

            amazon1= (WebView) getActivity().findViewById(R.id.webView2row5);
            loadFlipkartAds("<div data-WRID=\"WRID-146921677554384783\" data-widgetType=\"productBanner\"  data-class=\"affiliateAdsByFlipkart\" height=\"240px\" width=\"120px\"></div><script async src=\"//affiliate.flipkart.com/affiliate/widgets/FKAffiliateWidgets.js\"></script>",
                    amazon1);

            amazon1=(WebView) getActivity().findViewById(R.id.webViewrow6);
            loadAmazonAds("<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"//ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ac&ref=tf_til&ad_type=product_link&tracking_id=rsonsdevel-21&marketplace=amazon&region=IN&placement=B008YRGRNA&asins=B008YRGRNA&linkId=&show_border=false&link_opens_in_new_window=true\">\n" +
                    "</iframe>",amazon1);

            amazon1= (WebView) getActivity().findViewById(R.id.webView2row6);
            loadFlipkartAds("<div data-WRID=\"WRID-146921714013096146\" data-widgetType=\"productBanner\"  data-class=\"affiliateAdsByFlipkart\" height=\"240px\" width=\"120px\"></div><script async src=\"//affiliate.flipkart.com/affiliate/widgets/FKAffiliateWidgets.js\"></script>",
                    amazon1);

            amazon1=(WebView) getActivity().findViewById(R.id.webViewrow7);
            loadAmazonAds("<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"//ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ac&ref=tf_til&ad_type=product_link&tracking_id=rsonsdevel-21&marketplace=amazon&region=IN&placement=0615459811&asins=0615459811&linkId=&show_border=false&link_opens_in_new_window=true\">\n" +
                    "</iframe>",amazon1);

            amazon1= (WebView) getActivity().findViewById(R.id.webView2row7);
            loadFlipkartAds("<div data-WRID=\"WRID-146921807336884879\" data-widgetType=\"productBanner\"  data-class=\"affiliateAdsByFlipkart\" height=\"240px\" width=\"120px\"></div><script async src=\"//affiliate.flipkart.com/affiliate/widgets/FKAffiliateWidgets.js\"></script>",
                    amazon1);



        }
        else{
            Toast.makeText(getActivity(),"Check your Internet Connection",Toast.LENGTH_LONG).show();


        }


        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenDialog("Introduction to Algorithms by Cormen","It is considered to be bible of algorithm. It is well structured study of algorithms techniques with good examples and equally good exercises.\n" +
                        "This is one of the most popular algorithm book. " +
                        "The book is much acclaimed for the simplicity with which it introduces a " +
                        "first-time programmer to the complex world of algorithms.\n");

            }
        });


        Button info2 = (Button) getActivity().findViewById(R.id.bookinforow2);

        info2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenDialog("Algorithm Design by Kleinberg and Tardos","Algorithm Design introduces algorithms by looking at the real-world problems that motivate them. " +
                        "The book teaches students a range of design and analysis techniques for problems that arise in " +
                        "computing applications. The text encourages an understanding of the algorithm design process " +
                        "and an appreciation of the role of algorithms in the broader field of computer science.");
            }
        });

        Button info3= (Button) getActivity().findViewById(R.id.bookinforow3);

        info3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenDialog("Algorithms  by Robert Sedgewick and Kevin Wayne","This is the leading textbook on algorithms today, widely used in colleges and universities worldwide." +
                        "This is great book for those who love java.");
            }
        });

        Button info4= (Button) getActivity().findViewById(R.id.bookinforow4);

        info4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenDialog("The Algorithm Design Manual by Steve S. Skiena","This is another excellent book on computer algorithms that goes over a ton of algorithms with a lot of code as well. What I especially like about the book is where he actually gives examples of where he used the algorithms in practice;" +
                        " it really helps you see the class of problems that a particular algorithm  can be used for." +
                        "The code is in C, but it's not very esoteric and it's easy to follow.");
            }
        });

        Button info5= (Button) getActivity().findViewById(R.id.bookinforow5);

        info5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenDialog("Algorithms Unlocked by Thomas Cormen","The book discusses how algorithms translate instructions to make computers work." +
                        " It explains how to describe algorithms, and how to evaluate them.");
            }
        });

        Button info6= (Button) getActivity().findViewById(R.id.bookinforow6);

        info6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenDialog("Algorithm for Interviews by Amit Prakash, Adnan Aziz","Algorithm for Interview by Adnan Aziz is must read book on algorithms, written in terms of keeping programming interview in mind. The cover itself show how interesting the book could be, if you look closely the image on the cover " +
                        "is drawn with thumbnails of famous people, and book explains how you can develop such algorithms");
            }
        });

        Button info7= (Button) getActivity().findViewById(R.id.bookinforow7);

        info7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenDialog("Data Structures and Algorithms Made Easy","This is a comprehensive book for those who aspire to crack interviews and secure their dream jobs. It is a Success Key Book for: " +
                        "programming questions for interviews, campus preparation, degree/masters course preparation");
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
