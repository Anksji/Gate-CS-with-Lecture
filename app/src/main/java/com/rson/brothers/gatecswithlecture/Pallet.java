package com.rson.brothers.gatecswithlecture;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;

import java.util.ArrayList;

public class Pallet extends AppCompatActivity implements AdapterView.OnItemClickListener {
    Button btn;
    Bundle bundle;
    FragmentManager manager;
    ProceedToQuestion pQ = new ProceedToQuestion();
    Communicator comm;
    GridView Grid;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pallet);

        //grid.setContextObj(this);

        Grid= (GridView) findViewById(R.id.gridView);
        Grid.setAdapter(new GridAdapter(this));

        Grid.setOnItemClickListener(this);



    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        //Toast.makeText(this,"the item is clicked",Toast.LENGTH_SHORT).show();
    }

   /* public  void finsh(){
        this.finish();
        Log.e("finish","finish inside Pallet is called");
    }*/

class QuestNumber{
    int imageid;
    int Question_number;
    public QuestNumber(int imageid,int qnumber){
        this.imageid=imageid;
        this.Question_number=qnumber;
    }
}

class GridAdapter extends BaseAdapter {

    ArrayList<QuestNumber> list;
    Context context;


    PalletColour palletColour = new PalletColour();

    GridAdapter(Context context) {
        this.context = context;

        list = new ArrayList<QuestNumber>();
        //Resources res = context.getResources();
        //String[]tempQuestion=res.getStringArray(R.array.Question_number);
        // int [] pallet={R.drawable.answered,R.drawable.answeredmarked,R.drawable.not_visited2,R.drawable.reviewmarked,R.drawable.not_answered,R.drawable.answered,R.drawable.answeredmarked,R.drawable.not_visited};
        Log.d("ReviewQuestion", "Grid view on array initilization ke saath "+palletColour.getNo_of_Question());
        for (int i = 0; i < palletColour.getNo_of_Question(); i++) {
            QuestNumber temp = new QuestNumber(palletColour.pallet[i], (i + 1));
            list.add(temp);
        }
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    class viewHolder {
        Button Qnumber;

        viewHolder(View v) {
            Qnumber = (Button) v.findViewById(R.id.imageVeiw);
        }
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View row = convertView;
        viewHolder holder = null;
        if (row == null) {

            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.single_item, parent, false);
            holder = new viewHolder(row);
            row.setTag(holder);
        } else {
            holder = (viewHolder) row.getTag();
        }

        QuestNumber temp = list.get(position);
        holder.Qnumber.setBackgroundResource(temp.imageid);
        holder.Qnumber.setText("" + temp.Question_number);


        holder.Qnumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //PalletColour.setId(position);
                PalletColour.setQid(position);

                Helper helper= new Helper();
                helper.setPalletOpen(true);

                //Toast.makeText(context, "the item is clicked inside adapter " + (position + 1), Toast.LENGTH_SHORT).show();
                // Pallet p=new Pallet();
                Pallet.this.finish();
                Log.e("ReviewQuestion", "finish inside adaapter is called");

            }
        });
        return row;

    }
}

}