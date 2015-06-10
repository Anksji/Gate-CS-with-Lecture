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
public class Book_Motivational2 extends Fragment {


    WebView amazon1,flipkart1;
    Button info;
    String s, js;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.book_motivational2,container,false);

    }

    @Override
    public void onActivityCreated( Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

       // amazon1= (WebView) getActivity().findViewById(R.id.webView);

        //info= (Button) getActivity().findViewById(R.id.bookinfo);

       // flipkart1= (WebView) getActivity().findViewById(R.id.webView2);


        if(isNetworkAvaliable(getActivity())){
            //Toast.makeText(getActivity(),"Net is connected",Toast.LENGTH_SHORT).show();


            amazon1=(WebView) getActivity().findViewById(R.id.webViewrow8);
            loadAmazonAds("<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"//ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ac&ref=tf_til&ad_type=product_link&tracking_id=rsonsdevel-21&marketplace=amazon&region=IN&placement=8170289262&asins=8170289262&linkId=&show_border=false&link_opens_in_new_window=true\">\n" +
                    "</iframe>",amazon1);

            amazon1= (WebView) getActivity().findViewById(R.id.webView2row8);
            loadFlipkartAds("<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"//ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ac&ref=tf_til&ad_type=product_link&tracking_id=rsonsdevel-21&marketplace=amazon&region=IN&placement=8170286840&asins=8170286840&linkId=&show_border=false&link_opens_in_new_window=true\">\n" +
                            "</iframe>",
                    amazon1);


            amazon1=(WebView) getActivity().findViewById(R.id.webViewrow9);
            loadAmazonAds("<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"//ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ac&ref=tf_til&ad_type=product_link&tracking_id=rsonsdevel-21&marketplace=amazon&region=IN&placement=1847370292&asins=1847370292&linkId=&show_border=false&link_opens_in_new_window=true\">\n" +
                    "</iframe>",amazon1);

            amazon1= (WebView) getActivity().findViewById(R.id.webView2row9);
            loadAmazonAds("<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"//ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ac&ref=tf_til&ad_type=product_link&tracking_id=rsonsdevel-21&marketplace=amazon&region=IN&placement=8183220940&asins=8183220940&linkId=&show_border=false&link_opens_in_new_window=true\">\n" +
                            "</iframe>",
                    amazon1);

            amazon1=(WebView) getActivity().findViewById(R.id.webViewrow10);
            loadAmazonAds("<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"//ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ac&ref=tf_til&ad_type=product_link&tracking_id=rsonsdevel-21&marketplace=amazon&region=IN&placement=9382951717&asins=9382951717&linkId=&show_border=false&link_opens_in_new_window=true\">\n" +
                    "</iframe>",amazon1);

            amazon1= (WebView) getActivity().findViewById(R.id.webView2row10);
            loadAmazonAds("<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"//ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ac&ref=tf_til&ad_type=product_link&tracking_id=rsonsdevel-21&marketplace=amazon&region=IN&placement=9382951849&asins=9382951849&linkId=&show_border=false&link_opens_in_new_window=true\">\n" +
                            "</iframe>",
                    amazon1);

            amazon1=(WebView) getActivity().findViewById(R.id.webViewrow11);
            loadAmazonAds("<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"//ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ac&ref=tf_til&ad_type=product_link&tracking_id=rsonsdevel-21&marketplace=amazon&region=IN&placement=0743409388&asins=0743409388&linkId=&show_border=false&link_opens_in_new_window=true\">\n" +
                    "</iframe>",amazon1);

            amazon1= (WebView) getActivity().findViewById(R.id.webView2row11);
            loadAmazonAds("<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"//ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ac&ref=tf_til&ad_type=product_link&tracking_id=rsonsdevel-21&marketplace=amazon&region=IN&placement=0743409396&asins=0743409396&linkId=&show_border=false&link_opens_in_new_window=true\">\n" +
                            "</iframe>",
                    amazon1);

            amazon1=(WebView) getActivity().findViewById(R.id.webViewrow12);
            loadAmazonAds("<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"//ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ac&ref=tf_til&ad_type=product_link&tracking_id=rsonsdevel-21&marketplace=amazon&region=IN&placement=8172234988&asins=8172234988&linkId=&show_border=false&link_opens_in_new_window=true\">\n" +
                    "</iframe>",amazon1);

            amazon1= (WebView) getActivity().findViewById(R.id.webView2row12);
            loadAmazonAds("<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"//ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ac&ref=tf_til&ad_type=product_link&tracking_id=rsonsdevel-21&marketplace=amazon&region=IN&placement=8186685693&asins=8186685693&linkId=&show_border=false&link_opens_in_new_window=true\">\n" +
                            "</iframe>",
                    amazon1);

            amazon1=(WebView) getActivity().findViewById(R.id.webViewrow13);
            loadAmazonAds("<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"//ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ac&ref=tf_til&ad_type=product_link&tracking_id=rsonsdevel-21&marketplace=amazon&region=IN&placement=8192910911&asins=8192910911&linkId=&show_border=false&link_opens_in_new_window=true\">\n" +
                    "</iframe>",amazon1);

            amazon1= (WebView) getActivity().findViewById(R.id.webView2row13);
            loadAmazonAds("<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"//ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ac&ref=tf_til&ad_type=product_link&tracking_id=rsonsdevel-21&marketplace=amazon&region=IN&placement=8186775552&asins=8186775552&linkId=&show_border=false&link_opens_in_new_window=true\">\n" +
                            "</iframe>",
                    amazon1);

            amazon1=(WebView) getActivity().findViewById(R.id.webViewrow14);
            loadAmazonAds("<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"//ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ac&ref=tf_til&ad_type=product_link&tracking_id=rsonsdevel-21&marketplace=amazon&region=IN&placement=034914043X&asins=034914043X&linkId=&show_border=false&link_opens_in_new_window=true\">\n" +
                    "</iframe>",amazon1);

            amazon1= (WebView) getActivity().findViewById(R.id.webView2row14);
            loadFlipkartAds("<div data-WRID=\"WRID-146931006578575014\" data-widgetType=\"productBanner\"  data-class=\"affiliateAdsByFlipkart\" height=\"240px\" width=\"120px\"></div><script async src=\"//affiliate.flipkart.com/affiliate/widgets/FKAffiliateWidgets.js\"></script>",
                    amazon1);

            amazon1=(WebView) getActivity().findViewById(R.id.webViewrow15);
            loadAmazonAds("<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"//ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ac&ref=tf_til&ad_type=product_link&tracking_id=rsonsdevel-21&marketplace=amazon&region=IN&placement=1471131823&asins=1471131823&linkId=&show_border=false&link_opens_in_new_window=true\">\n" +
                    "</iframe>",amazon1);

            amazon1= (WebView) getActivity().findViewById(R.id.webView2row15);
            loadAmazonAds("<iframe style=\"width:120px;height:240px;\" marginwidth=\"0\" marginheight=\"0\" scrolling=\"no\" frameborder=\"0\" src=\"//ws-in.amazon-adsystem.com/widgets/q?ServiceVersion=20070822&OneJS=1&Operation=GetAdHtml&MarketPlace=IN&source=ac&ref=tf_til&ad_type=product_link&tracking_id=rsonsdevel-21&marketplace=amazon&region=IN&placement=8186775994&asins=8186775994&linkId=&show_border=false&link_opens_in_new_window=true\">\n" +
                            "</iframe>",
                    amazon1);


        }
        else{
            Toast.makeText(getActivity(),"Check your Internet Connection",Toast.LENGTH_LONG).show();


        }


        Button info8= (Button) getActivity().findViewById(R.id.bookinforow8);

        info8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenDialog("Inspiring Thoughts ","'Inspiring Thoughts’ is a collection of some of the most famous quotations by Swami Vivekananda. " +
                        "Swami Vivekananda was a world famous Hindu monk known for his deep wisdom," +
                        " knowledge and understanding of humanity. another is by APJ Abdul Kalam's Thoughts");


            }
        });


        Button info9= (Button) getActivity().findViewById(R.id.bookinforow9);

        info9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenDialog("The Secret by Rhonda Byrne ","For more than twenty centuries, words within a sacred text have mystified, confused, and been misunderstood by almost all who read them. Only a very few people through history have realized that the words are a riddle, and that once you solve " +
                        "the riddle—once you uncover the mystery—a new world will appear before your eyes. other is its Hindi version.");


            }
        });


        Button info10= (Button) getActivity().findViewById(R.id.bookinforow10);

        info10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenDialog("You Can Win","There are no shortcut to success, inspiration and motivation are needed as much as hard work " +
                        "to be successful in life is how Shiv Khera put it in You Can Win, a book that has become an international bestseller." +
                        " The core of this book is about improvising ones though processes by gaining from ancient wisdom and modern philosophy. " +
                        "Using both " +
                        "traditional and modern day concepts and ideologies, one can easily sort out their daily life problems with simple yet " +
                        "effective solutions. Other is its Hindi version.");


            }
        });


        Button info11= (Button) getActivity().findViewById(R.id.bookinforow11);

        info11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenDialog("Awaken the Giant Within by Anthony Robbins","Anthony Robbins is unlike most motivational writers in " +
                        "two ways. First, he treats training the mind and body as a technological challenge rather than moral " +
                        "imperative. Second, he somehow manages to be both an inspirational role model and the most annoying " +
                        "guy on the planet.\n" +
                        "Best quote: If you can't, you must. If you must, you can.");

            }
        });


        Button info12= (Button) getActivity().findViewById(R.id.bookinforow12);

        info12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenDialog("The Alchemist in English and Hindi (Best Book)","This is the one of the greatest book you should read it. The Alchemist has been read and loved by over 62 million readers," +
                        " topping bestseller lists in 74 countries worldwide. It's a story about a person who want to turns his dreams into reality. The author has described everything in story form," +
                        " which is needed to turn one's goal or dream into reality. Its written in very simple " +
                        "words and is indeed very interesting. one is in Hindi and another is in English language.");

            }
        });


        Button info13= (Button) getActivity().findViewById(R.id.bookinforow13);

        info13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenDialog("Think and Grow Rich by Napoleon Hill","Napoleon Hill interviewed \"40 millionaires\" to discover the common thought processes and " +
                        "behaviors that had led to their success. His study of these \"best practices\" was revolutionary in a world where it was" +
                        " largely assumed that great wealth resulted from a combination of greed and luck.\n" +
                        "Best quote: All the breaks you need in life wait within your imagination. Imagination is the workshop of your mind, " +
                        "capable of turning mind energy into accomplishment and wealth. One us is in Hindi and  other is in English");


            }
        });


        Button info14= (Button) getActivity().findViewById(R.id.bookinforow14);

        info14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenDialog("Steve Jobs by Walter Isaacson","Walter Isaacson provides an in-depth account the professional and personal life of Steve Jobs, drawing upon interviews with Jobs himself," +
                        " as well as family members, friends, competitors and colleagues. This book is incredibly inspiring, as it " +
                        "shares the tale of a driven perfectionist, admittedly difficult to deal with, that was the greatest innovator " +
                        "of his generation.\n" +
                        "Best Quotes:\n" +
                        "“Steve Jobs: “The best way to predict the future is to invent it.”\n");


            }
        });


        Button info15= (Button) getActivity().findViewById(R.id.bookinforow15);

        info15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenDialog("The 7 Habits of Highly Effective People","While he gets a bit preachy sometimes, Stephen Covey's road map for living doesn't" +
                        " just help you develop better habits. It also convinces you that acquiring them will make you a better person.\n" +
                        "Best quote: \"Sow a thought, reap an action; sow an action, reap a habit; sow a habit, reap a character; " +
                        "sow a character, reap a destiny.\"\n");


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
