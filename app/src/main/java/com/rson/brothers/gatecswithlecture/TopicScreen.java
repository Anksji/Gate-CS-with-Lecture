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
 * Created by Brother's on 3/30/2016.
 */
public class TopicScreen extends Activity {

    ListView l;
    Typeface fontstyle;
    public static String [] YearList={"2016 - (I)","2016 - (II)","2015 - (I)","2015 - (II)","2015 - (III)","2014 - (I)","2014 - (II)","2014 - (III)","2013",
            "2012","2011","2010","2009","2008","2007","2006","2005"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.topic_screen);
        l= (ListView) findViewById(R.id.listView);
        l.setAdapter(new CustomAdapter(TopicScreen.this, YearList));
       // ArrayAdapter adapter=ArrayAdapter.createFromResource(this,R.array.YearWise,R.layout.listview);

        fontstyle= Typeface.createFromAsset(this.getAssets(), "Regular.ttf");

       // l.setAdapter(adapter);

       // l.setOnItemClickListener(this);
        Log.d("Reah", "we reach at oncreate of TopicScreen");
    }

  /*  @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Log.d("Reah","we reach at list Click event");
        if(position>=0) {
            Intent in = new Intent(TopicScreen.this, Instruction.class);
            in.putExtra("TopicWise",false);
            in.putExtra("Subject",0);
            in.putExtra("position",position);
            startActivity(in);
            Log.d("Reah", "List Click event after intent Start");
        }
    }*/

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
                        Intent in = new Intent(TopicScreen.this, Instruction.class);
                        in.putExtra("TopicWise",false);
                        in.putExtra("Subject",0);
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
