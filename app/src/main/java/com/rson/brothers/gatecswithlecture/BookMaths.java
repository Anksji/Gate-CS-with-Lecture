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
 * Created by Brother's on 7/23/2016.
 */
public class BookMaths extends Fragment {


    WebView amazon1,flipkart1;
    Button info;
    String s, js;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.book_maths,container,false);

    }

    @Override
    public void onActivityCreated( Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        amazon1= (WebView) getActivity().findViewById(R.id.webView);

        info= (Button) getActivity().findViewById(R.id.bookinfo);

        flipkart1= (WebView) getActivity().findViewById(R.id.webView2);


        if(isNetworkAvaliable(getActivity())){
            //Toast.makeText(getActivity(),"Net is connected",Toast.LENGTH_SHORT).show();

            loadAmazonAds("<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"//ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ac&ref=tf_til&ad_type=product_link&tracking_id=rsonsdevel-21&marketplace=amazon&region=IN&placement=8177583611&asins=8177583611&linkId=&show_border=false&link_opens_in_new_window=true\">\n" +
                    "</iframe>",flipkart1);


            loadAmazonAds("<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"//ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ac&ref=tf_til&ad_type=product_link&tracking_id=rsonsdevel-21&marketplace=amazon&region=IN&placement=9332519072&asins=9332519072&linkId=&show_border=false&link_opens_in_new_window=true\">\n" +
                    "</iframe>",amazon1);



            amazon1=(WebView) getActivity().findViewById(R.id.webViewrow2);
            loadAmazonAds("<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"//ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ac&ref=tf_til&ad_type=product_link&tracking_id=rsonsdevel-21&marketplace=amazon&region=IN&placement=8126518057&asins=8126518057&linkId=&show_border=false&link_opens_in_new_window=true\">\n" +
                    "</iframe>",amazon1);

            amazon1= (WebView) getActivity().findViewById(R.id.webView2row2);
            loadFlipkartAds("<div data-WRID=\"WRID-146927924040661779\" data-widgetType=\"productBanner\"  data-class=\"affiliateAdsByFlipkart\" height=\"240px\" width=\"120px\"></div><script async src=\"//affiliate.flipkart.com/affiliate/widgets/FKAffiliateWidgets.js\"></script>",amazon1);



            amazon1=(WebView) getActivity().findViewById(R.id.webViewrow3);
            loadAmazonAds("<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"//ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ac&ref=tf_til&ad_type=product_link&tracking_id=rsonsdevel-21&marketplace=amazon&region=IN&placement=0070681880&asins=0070681880&linkId=&show_border=false&link_opens_in_new_window=true\">\n" +
                    "</iframe>",amazon1);

            amazon1= (WebView) getActivity().findViewById(R.id.webView2row3);
            loadFlipkartAds("<div data-WRID=\"WRID-146928136478030274\" data-widgetType=\"productBanner\"  data-class=\"affiliateAdsByFlipkart\" height=\"240px\" width=\"120px\"></div><script async src=\"//affiliate.flipkart.com/affiliate/widgets/FKAffiliateWidgets.js\"></script>",amazon1);



            amazon1=(WebView) getActivity().findViewById(R.id.webViewrow4);
            loadAmazonAds("<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"//ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ac&ref=tf_til&ad_type=product_link&tracking_id=rsonsdevel-21&marketplace=amazon&region=IN&placement=8174091955&asins=8174091955&linkId=&show_border=false&link_opens_in_new_window=true\">\n" +
                    "</iframe>",amazon1);

            amazon1= (WebView) getActivity().findViewById(R.id.webView2row4);
            loadFlipkartAds("<div data-WRID=\"WRID-146928213493175001\" data-widgetType=\"productBanner\"  data-class=\"affiliateAdsByFlipkart\" height=\"240px\" width=\"120px\"></div><script async src=\"//affiliate.flipkart.com/affiliate/widgets/FKAffiliateWidgets.js\"></script>",
                    amazon1);


            amazon1=(WebView) getActivity().findViewById(R.id.webViewrow5);
            loadAmazonAds("<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"//ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ac&ref=tf_til&ad_type=product_link&tracking_id=rsonsdevel-21&marketplace=amazon&region=IN&placement=8131501728&asins=8131501728&linkId=&show_border=false&link_opens_in_new_window=true\">\n" +
                    "</iframe>",amazon1);

            amazon1= (WebView) getActivity().findViewById(R.id.webView2row5);
            loadFlipkartAds("<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"//ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ac&ref=tf_til&ad_type=product_link&tracking_id=rsonsdevel-21&marketplace=amazon&region=IN&placement=9351471977&asins=9351471977&linkId=&show_border=false&link_opens_in_new_window=true\">\n" +
                            "</iframe>",
                    amazon1);

            //line 6


        }
        else{
            Toast.makeText(getActivity(),"Check your Internet Connection",Toast.LENGTH_LONG).show();


        }


        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenDialog("A First Course in Probability by sheldon Ross","clear and intuitive explanations of the mathematics of probability theory, outstanding problem sets and a variety of diverse examples and applications");

            }
        });


        Button info2 = (Button) getActivity().findViewById(R.id.bookinforow2);

        info2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenDialog("An Introduction to Probability Theory and its Applications by william feller","The book includes various concepts like Laplace Transforms, Harmonic Analysis, Renewal Theory, Probability" +
                        " Distributions in Rr, Probability Measures and Spaces," +
                        " and other theorems, analysis and theories. The book also has answers to the problems given for every topic. ");
            }
        });

        Button info3= (Button) getActivity().findViewById(R.id.bookinforow3);

        info3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenDialog("Discrete Mathematics and Its Applications with Combinatorics and Graph Theory by Kenneth H. Rosen","Kenneth H. Rosen’s " +
                        "Discrete Mathematics and Its Applications " +
                        "with Combinatorics, this is good book.");
            }
        });

        Button info4= (Button) getActivity().findViewById(R.id.bookinforow4);

        info4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenDialog("Higher Engineering Mathematics by B.S.Grewal","This book covers Linear algebra and Calculus which is sufficient for gate." +
                        " This book is enough for Gate. It provides a clear exposition of essential tools of applied mathematics from a modern" +
                        "point of view and meets complete requirements of engineering and computer science students. " +
                        "Every effort has been made to keep the presentation at once simple and lucid." +
                        "\n Another book is For complete mathematics for Gate exam.");
            }
        });

        Button info5= (Button) getActivity().findViewById(R.id.bookinforow5);

        info5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenDialog("Linear Algebra and Its Applications by Gilbert Strang","One is Gilbert's book another is Made easy Solved Papers of Maths. You can go with this if you to learn from best. Gilbert Strang " +
                        "demonstrates that linear algebra is a fascinating subject by showing both its beauty and value. He explains concepts, " +
                        "rather than deduces. This book is written in an informal and personal style and teaches real mathematics.");
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
