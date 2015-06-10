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
public class BookDatabase extends Fragment {

    WebView amazon1,flipkart1;
    Button info;
    String s, js;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.book_database,container,false);
    }
    @Override
    public void onActivityCreated( Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        amazon1= (WebView) getActivity().findViewById(R.id.webView);

        info= (Button) getActivity().findViewById(R.id.bookinfo);

        flipkart1= (WebView) getActivity().findViewById(R.id.webView2);


        if(isNetworkAvaliable(getActivity())){
            //Toast.makeText(getActivity(),"Net is connected",Toast.LENGTH_SHORT).show();

            loadFlipkartAds("<div data-WRID=\"WRID-146922955222238778\" data-widgetType=\"productBanner\"  data-class=\"affiliateAdsByFlipkart\" height=\"240px\" width=\"120px\"></div><script async src=\"//affiliate.flipkart.com/affiliate/widgets/FKAffiliateWidgets.js\"></script>",flipkart1);


            loadAmazonAds("<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"//ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ac&ref=tf_til&ad_type=product_link&tracking_id=rsonsdevel-21&marketplace=amazon&region=IN&placement=0071289593&asins=0071289593&linkId=&show_border=false&link_opens_in_new_window=true\">\n" +
                    "</iframe>",amazon1);

            amazon1=(WebView) getActivity().findViewById(R.id.webViewrow2);
            loadAmazonAds("<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"//ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ac&ref=tf_til&ad_type=product_link&tracking_id=rsonsdevel-21&marketplace=amazon&region=IN&placement=0716780690&asins=0716780690&linkId=&show_border=false&link_opens_in_new_window=true\">\n" +
                    "</iframe>",amazon1);

            amazon1= (WebView) getActivity().findViewById(R.id.webView2row2);
            loadFlipkartAds("<div data-WRID=\"WRID-146923003016795784\" data-widgetType=\"productBanner\"  data-class=\"affiliateAdsByFlipkart\" height=\"240px\" width=\"120px\"></div><script async src=\"//affiliate.flipkart.com/affiliate/widgets/FKAffiliateWidgets.js\"></script>",amazon1);



            amazon1=(WebView) getActivity().findViewById(R.id.webViewrow3);
            loadAmazonAds("<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"//ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ac&ref=tf_til&ad_type=product_link&tracking_id=rsonsdevel-21&marketplace=amazon&region=IN&placement=9339213114&asins=9339213114&linkId=&show_border=false&link_opens_in_new_window=true\">\n" +
                    "</iframe>",amazon1);

            amazon1= (WebView) getActivity().findViewById(R.id.webView2row3);
            loadAmazonAds("<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"//ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ac&ref=tf_til&ad_type=product_link&tracking_id=rsonsdevel-21&marketplace=amazon&region=IN&placement=0072322063&asins=0072322063&linkId=&show_border=false&link_opens_in_new_window=true\">\n" +
                    "</iframe>",amazon1);

            //line 4

            amazon1=(WebView) getActivity().findViewById(R.id.webViewrow4);
            loadAmazonAds("<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"//ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ac&ref=tf_til&ad_type=product_link&tracking_id=rsonsdevel-21&marketplace=amazon&region=IN&placement=8131792471&asins=8131792471&linkId=&show_border=false&link_opens_in_new_window=true\">\n" +
                    "</iframe>",amazon1);

            amazon1= (WebView) getActivity().findViewById(R.id.webView2row4);
            loadFlipkartAds("<div data-WRID=\"WRID-146925793254768655\" data-widgetType=\"productBanner\"  data-class=\"affiliateAdsByFlipkart\" height=\"240px\" width=\"120px\"></div><script async src=\"//affiliate.flipkart.com/affiliate/widgets/FKAffiliateWidgets.js\"></script>",
                    amazon1);

            //line 5

            amazon1=(WebView) getActivity().findViewById(R.id.webViewrow5);
            loadAmazonAds("<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"//ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ac&ref=tf_til&ad_type=product_link&tracking_id=rsonsdevel-21&marketplace=amazon&region=IN&placement=813172025X&asins=813172025X&linkId=&show_border=false&link_opens_in_new_window=true\">\n" +
                    "</iframe>",amazon1);

            amazon1= (WebView) getActivity().findViewById(R.id.webView2row5);
            loadFlipkartAds("<div data-WRID=\"WRID-146925751344723289\" data-widgetType=\"productBanner\"  data-class=\"affiliateAdsByFlipkart\" height=\"240px\" width=\"120px\"></div><script async src=\"//affiliate.flipkart.com/affiliate/widgets/FKAffiliateWidgets.js\"></script>",
                    amazon1);




        }
        else{
            Toast.makeText(getActivity(),"Check your Internet Connection",Toast.LENGTH_LONG).show();


        }


        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenDialog("Database System Concepts by  Silberschatz, Korth. Sudarshan","Best book for DBMS. The book comprises of ten parts through which it covers all the theoretical concepts behind databases." +
                        " It puts forth the concepts in a way that the students can begin working with databases immediately.");

            }
        });


        Button info2 = (Button) getActivity().findViewById(R.id.bookinforow2);

        info2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenDialog("Principles of Database Systems by J. D. Ullman","The book principles of database systems\n" +
                        "directed towards a well-understood class of application The book attempts to solve the problems associated new kinds of applications\n");
            }
        });

        Button info3= (Button) getActivity().findViewById(R.id.bookinforow3);

        info3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenDialog("Database Management Systems by Raghu Ramakrishnan","This book provides comprehensive and to-date coverage of the fundamentals of databa systems. " +
                        "The book also contains coherent explanation and practical examples of various concepts.");
            }
        });

        Button info4= (Button) getActivity().findViewById(R.id.bookinforow4);

        info4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenDialog("Database Systems: Models, Design and Application Programming by Ramez Elmasri","Ramez Elmasri Clearly explain theory and design, broad coverage of models and real systems and an up-to-date introduction to modern database technologies result in a leading introduction to database systems." +
                        " With fresh new problems and a new lab manual," +
                        " you get more opportunities to practice the fundamentals of design and implementation. ");
            }
        });

        Button info5= (Button) getActivity().findViewById(R.id.bookinforow5);

        info5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenDialog("Database Systems: A Practical Approach to Design, Implementation and Management by CONNOLLY","This book places a strong emphasis on good design practice, allowing students to master design methodology in an accessible, step-by-step fashion. A clear introduction to design implementation and management issues, as well as an extensive treatment of database languages and standards, make this book an indispensable complete reference" +
                        " for database students and professionals. The book is designed to be used in database courses for technical and non-technical students.");
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
