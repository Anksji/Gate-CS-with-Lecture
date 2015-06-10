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
public class Book_motivation extends Fragment {


    WebView amazon1,flipkart1;
    Button info;
    String s, js;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.book_motivation,container,false);

    }

    @Override
    public void onActivityCreated( Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        amazon1= (WebView) getActivity().findViewById(R.id.webView);

        info= (Button) getActivity().findViewById(R.id.bookinfo);

        flipkart1= (WebView) getActivity().findViewById(R.id.webView2);


        if(isNetworkAvaliable(getActivity())){
            //Toast.makeText(getActivity(),"Net is connected",Toast.LENGTH_SHORT).show();

            loadAmazonAds("<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"//ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ac&ref=tf_til&ad_type=product_link&tracking_id=rsonsdevel-21&marketplace=amazon&region=IN&placement=8186775587&asins=8186775587&linkId=&show_border=false&link_opens_in_new_window=true\">\n" +
                    "</iframe>",flipkart1);


            loadAmazonAds("<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"//ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ac&ref=tf_til&ad_type=product_link&tracking_id=rsonsdevel-21&marketplace=amazon&region=IN&placement=0091906385&asins=0091906385&linkId=&show_border=false&link_opens_in_new_window=true\">\n" +
                    "</iframe>",amazon1);



            amazon1=(WebView) getActivity().findViewById(R.id.webViewrow2);
            loadAmazonAds("<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"//ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ac&ref=tf_til&ad_type=product_link&tracking_id=rsonsdevel-21&marketplace=amazon&region=IN&placement=0143419765&asins=0143419765&linkId=&show_border=false&link_opens_in_new_window=true\">\n" +
                    "</iframe>",amazon1);

            amazon1= (WebView) getActivity().findViewById(R.id.webView2row2);
            loadFlipkartAds("<div data-WRID=\"WRID-146930468125283031\" data-widgetType=\"productBanner\"  data-class=\"affiliateAdsByFlipkart\" height=\"240px\" width=\"120px\"></div><script async src=\"//affiliate.flipkart.com/affiliate/widgets/FKAffiliateWidgets.js\"></script>",amazon1);



            amazon1=(WebView) getActivity().findViewById(R.id.webViewrow3);
            loadAmazonAds("<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"//ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ac&ref=tf_til&ad_type=product_link&tracking_id=rsonsdevel-21&marketplace=amazon&region=IN&placement=8184005210&asins=8184005210&linkId=&show_border=false&link_opens_in_new_window=true\">\n" +
                    "</iframe>",amazon1);


            amazon1= (WebView) getActivity().findViewById(R.id.webView2row3);
            loadFlipkartAds("<div data-WRID=\"WRID-146930601857131226\" data-widgetType=\"productBanner\"  data-class=\"affiliateAdsByFlipkart\" height=\"240px\" width=\"120px\"></div><script async src=\"//affiliate.flipkart.com/affiliate/widgets/FKAffiliateWidgets.js\"></script>",
                    amazon1);


            amazon1=(WebView) getActivity().findViewById(R.id.webViewrow4);
            loadAmazonAds("<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"//ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ac&ref=tf_til&ad_type=product_link&tracking_id=rsonsdevel-21&marketplace=amazon&region=IN&placement=9384030163&asins=9384030163&linkId=&show_border=false&link_opens_in_new_window=true\">\n" +
                    "</iframe>",amazon1);


            amazon1= (WebView) getActivity().findViewById(R.id.webView2row4);
            loadFlipkartAds("<div data-WRID=\"WRID-146930623302855575\" data-widgetType=\"productBanner\"  data-class=\"affiliateAdsByFlipkart\" height=\"240px\" width=\"120px\"></div><script async src=\"//affiliate.flipkart.com/affiliate/widgets/FKAffiliateWidgets.js\"></script>",
                    amazon1);


            amazon1=(WebView) getActivity().findViewById(R.id.webViewrow5);
            loadAmazonAds("<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"//ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ac&ref=tf_til&ad_type=product_link&tracking_id=rsonsdevel-21&marketplace=amazon&region=IN&placement=9351770508&asins=9351770508&linkId=&show_border=false&link_opens_in_new_window=true\">\n" +
                    "</iframe>",amazon1);

            amazon1= (WebView) getActivity().findViewById(R.id.webView2row5);

            loadFlipkartAds("<div data-WRID=\"WRID-146930489174674883\" data-widgetType=\"productBanner\"  data-class=\"affiliateAdsByFlipkart\" height=\"240px\" width=\"120px\"></div><script async src=\"//affiliate.flipkart.com/affiliate/widgets/FKAffiliateWidgets.js\"></script>",
                    amazon1);

            amazon1=(WebView) getActivity().findViewById(R.id.webViewrow6);
            loadAmazonAds("<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"//ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ac&ref=tf_til&ad_type=product_link&tracking_id=rsonsdevel-21&marketplace=amazon&region=IN&placement=938439162X&asins=938439162X&linkId=&show_border=false&link_opens_in_new_window=true\">\n" +
                    "</iframe>",amazon1);

            amazon1= (WebView) getActivity().findViewById(R.id.webView2row6);
            loadAmazonAds("<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"//ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ac&ref=tf_til&ad_type=product_link&tracking_id=rsonsdevel-21&marketplace=amazon&region=IN&placement=8186775269&asins=8186775269&linkId=&show_border=false&link_opens_in_new_window=true\">\n" +
                            "</iframe>",
                    amazon1);

            amazon1=(WebView) getActivity().findViewById(R.id.webViewrow7);
            loadAmazonAds("<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"//ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ac&ref=tf_til&ad_type=product_link&tracking_id=rsonsdevel-21&marketplace=amazon&region=IN&placement=9383416602&asins=9383416602&linkId=&show_border=false&link_opens_in_new_window=true\">\n" +
                    "</iframe>",amazon1);

            amazon1= (WebView) getActivity().findViewById(R.id.webView2row7);
            loadFlipkartAds("<div data-WRID=\"WRID-146930540371488330\" data-widgetType=\"productBanner\"  data-class=\"affiliateAdsByFlipkart\" height=\"240px\" width=\"120px\"></div><script async src=\"//affiliate.flipkart.com/affiliate/widgets/FKAffiliateWidgets.js\"></script>",
                    amazon1);


        }
        else{
            Toast.makeText(getActivity(),"Check your Internet Connection",Toast.LENGTH_LONG).show();


        }


        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenDialog("The Power of Positive Thinking by Norman","To imbibe shaken confidence, The Power " +
                        "of Positive Thinking is a book written to help men and women who are haunted with living " +
                        "in a inferiority complex and have lost faith in themselves. Sharing his life experiences, Norman Peale speaks about " +
                        "faith in yourself being the ultimate key to happiness and that will bring back all good things into the believers life. " +
                        "\nBest quote: Action is a great restorer and builder of confidence. Inaction is not only the result, but the cause, of " +
                        "fear. Perhaps the action you take will be successful; " +
                        "perhaps different action or adjustments will have to follow. But any action is better than no action at all." +
                        "One is in Hindi and another is in English");

            }
        });


        Button info2 = (Button) getActivity().findViewById(R.id.bookinforow2);

        info2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                OpenDialog("100 Tips to Crack the IIT ","The book has been written by two ex-IITians, Vivek Pandey and Paras Arora. " +
                        "This is a comprehensive collection of tips and tricks that can be used to crack the IIT entrance examination." +
                        " The book can come very handy to students trying to boost their preparation for IIT. " +
                        "From the time this book has been launched, it has been very popular amongst students.");
            }
        });

        Button info3= (Button) getActivity().findViewById(R.id.bookinforow3);

        info3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenDialog("How to Memorize Anything: The Ultimate Handbook to Enlighten and Improve Your Memory","This book comes as a life for the people who tend to forget more with more information! Yes," +
                        " our memory is not at all bound with such restrictions. Rather, it’s like the more we bring it to work the more effectively it works!\n" +
                        "They provide the readers with logical reasoning and explanations along with full-proof techniques in order to make most of your grey cells. " +
                        "The techniques are effective and easy to learn and get hold of.");

            }
        });

        Button info4= (Button) getActivity().findViewById(R.id.bookinforow4);

        info4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenDialog("Six Secrets Smart Students Don't Tell You ","The book, 'Six Secrets Smart Students Don't Tell You’ is a useful book that helps the readers to improve their studying skills. This book tries to answer the pressing question which is generally asked by all students and parents -" +
                        " how to become smarter at studies? It is really amazing book you should read one time at least.");


            }
        });

        Button info5= (Button) getActivity().findViewById(R.id.bookinforow5);

        info5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenDialog("The Topper Prepares","As the water rose in his village during the floods in Bihar forcing him and his " +
                        "family to live in tents, Chiranjeev dreamt of a future working in a plush office in a city. " +
                        "Hundreds of kilometres away in Chhattisgarh, Sudoku whizkid Vipul" +
                        " focused on the international Physics Olympiad and winning a top rank in the All-India Joint Entrance test.");


            }
        });

        Button info6= (Button) getActivity().findViewById(R.id.bookinforow6);

        info6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenDialog("Wasted in Engineering : Story of India's Youth","Engineering padicha nalla future _ If you study engineering, you will have a good future. This is a claim often repeated to children and teenagers by parents and teachers in many parts of India. But only those who have gone through an engineering" +
                        " college life know that it's not completely true. This is another great book which can direct you to choose right path." +
                        "Other book is in Hindi Badi Soch Ka Bada Jadoo (The Magic of Thinking Big) Thinking big and staying positive and motivated all the time is a tiresome process in itself. Many people might say that " +
                        "thinking big is the key to success, but in this book, the author goes on the detail on exactly how this is possible.");
            }
        });

        Button info7= (Button) getActivity().findViewById(R.id.bookinforow7);

        info7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenDialog("Become an Engineer Not Just an Engineering Graduate","This book is written with the aim of encouraging engineering" +
                        " graduates to be passionate engineers, help them enhance their employability potential and enable them to sculpt their" +
                        " career as exuberant engineers. Need of the hour is not just the IT professionals, " +
                        "but exuberant engineers who have the courage to confidently take-on the technological challenges of today and tomorrow.");
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
