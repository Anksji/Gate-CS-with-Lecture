package com.rson.brothers.gatecswithlecture;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by Brother's on 5/6/2016.
 */
public class TopicWise extends Activity {

    ListView l;

    String[] Topic = {"Maths", "Theory of Computation", "Compiler", "Computer Network", "Programing and Data Structure", "Algorithm",
            "Operating System", "Database", "Computer Organization", "Digital", "Aptitude", "Other Sub"};

        Typeface fontstyle;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.topic_wise);


        l = (ListView) findViewById(R.id.listView2);
        //ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.Topic, android.R.layout.simple_list_item_1);
       // l.setAdapter(adapter);
        //l.setOnItemClickListener(this);
        l.setAdapter(new CustomAdapter(TopicWise.this,Topic));
        fontstyle= Typeface.createFromAsset(this.getAssets(), "Regular.ttf");
    }

   /* @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if(position>=0){
            AlertDilogFragment alertDilogFragment = new AlertDilogFragment();
            alertDilogFragment.setTopicClicked(position);
            alertDilogFragment.show(getFragmentManager(),"My Dialog");
            Toast.makeText(this, "This is list clicked at ", Toast.LENGTH_SHORT).show();
        }
        /*Intent in = new Intent(TopicWise.this, Instruction.class);
        in.putExtra("position",position);
        startActivity(in);


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
                    if(position>=0){
                        AlertDilogFragment alertDilogFragment = new AlertDilogFragment();
                        alertDilogFragment.setTopicClicked(position);
                        alertDilogFragment.show(getFragmentManager(), "My Dialog");
                       // Toast.makeText(this, "This is list clicked at ", Toast.LENGTH_SHORT).show();
                    }

                }
            });
            return rowView;
        }

    }
}



