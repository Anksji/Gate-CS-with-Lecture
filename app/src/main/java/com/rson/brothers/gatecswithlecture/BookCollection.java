package com.rson.brothers.gatecswithlecture;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by Brother's on 7/20/2016.
 */
public class BookCollection extends Activity {

   // ViewPager viewPager;
   ListView l;
    Typeface fontstyle;
    public static String [] BookList={"Motivational Books","Some Special Books","Algorithm Books","Computer Network Books","TOC Books",
            "Operating System Books","Data Structure Books","Database Books","Compiler Books",
            "Computer Organization Books","Digital Books","Maths Books","Aptitude Books","Previous Year Question Books"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.topic_screen);
        l= (ListView) findViewById(R.id.listView);
        l.setAdapter(new CustomAdapter(BookCollection.this, BookList));


        fontstyle= Typeface.createFromAsset(this.getAssets(), "Regular.ttf");

        Log.d("Reah", "we reach at oncreate of TopicScreen");
    }



    public class CustomAdapter extends BaseAdapter {
        String [] result;
        Context context;

        private LayoutInflater inflater=null;

        public CustomAdapter(Context mainActivity, String[] YearList) {
            // TODO Auto-generated constructor stub
            result=YearList;
            context=mainActivity;

            inflater = ( LayoutInflater )context.
                    getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        @Override
        public int getCount() {
            // TODO Auto-generated method stub
            return result.length;
        }

        @Override
        public Object getItem(int position) {
            // TODO Auto-generated method stub
            return position;
        }

        @Override
        public long getItemId(int position) {
            // TODO Auto-generated method stub
            return position;
        }

        public class Holder
        {
            TextView tv;

        }
        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            // TODO Auto-generated method stub
            Holder holder=new Holder();
            View rowView;
            rowView = inflater.inflate(R.layout.listview, null);
            holder.tv=(TextView) rowView.findViewById(R.id.listItems);
            holder.tv.setTypeface(fontstyle);
            holder.tv.setText(result[position]);

            rowView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    if(position>=0) {
                        Intent in = new Intent(BookCollection.this, Book_Seller.class);
                        in.putExtra("position",position);
                        startActivity(in);
                        Log.d("Reah", "List Click event after intent Start");
                    }

                }
            });
            return rowView;
        }

    }
}
