package com.rson.brothers.gatecswithlecture;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Brother's on 5/15/2016.
 */

public class TopicListFrag extends Fragment implements AdapterView.OnItemClickListener {

ListView listView;
Comm comm;
    static View clickedAt=null;
    static  int clickedatPosition=-1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.topic_list_frag,container,false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        comm= (Comm) getActivity();
        listView = (ListView) getActivity().findViewById(R.id.TopicList);
        Helper helper=new Helper();
        ArrayAdapter adapter;
        if(helper.isAboutUsIntro()){
            adapter=ArrayAdapter.createFromResource(getActivity(), R.array.About,android.R.layout.simple_list_item_1);
        }else{
             adapter=ArrayAdapter.createFromResource(getActivity(), R.array.topic_name,android.R.layout.simple_list_item_1);
        }

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
        ;
    }

    @Override
    public void onItemClick(AdapterView<?> parent,final View view, final int position, long id) {
        //parent.setBackgroundColor(Color.parseColor("#32446c"));


        view.setBackgroundColor(Color.parseColor("#f48fe0"));
            comm.respond(position);

        if(clickedAt==null){

        }else{
            if(clickedatPosition==position){

            }else {
                clickedAt.setBackgroundColor(Color.parseColor("#32446c"));
            }

        }

                clickedAt = view;
        clickedatPosition=position;

    }
}
