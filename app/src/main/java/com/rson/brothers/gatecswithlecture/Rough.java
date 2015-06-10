package com.rson.brothers.gatecswithlecture;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by Brother's on 3/30/2016.
 */
public class Rough extends Fragment {


    int i = 556;
    Button quest, next;
       /* public Rough_fragment(Context con){
            context=con;
        }*/

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.frag, container, false);


        RelativeLayout relativeLayout = (RelativeLayout) rootView.findViewById(R.id.lay);
        relativeLayout.addView(new Rectangle2(getActivity()));
        Rectangle2 r1 = new Rectangle2(getActivity());
        //relativeLayout.addView(r1.btnEraseAll);
        relativeLayout.addView(r1, r1.params);
        //Button b = new Button(getActivity());
        // b.setText("Question!!");
       // relativeLayout=(RelativeLayout) rootView.findViewById(R.id.pageNo);
       // relativeLayout.addView(r1.page);
        relativeLayout = (RelativeLayout) rootView.findViewById(R.id.questButton);
        relativeLayout.addView(r1.quest);

        relativeLayout = (RelativeLayout) rootView.findViewById(R.id.RoughNext);
        relativeLayout.addView(r1.next);


        // RelativeLayout.LayoutParams rl = new RelativeLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT,FrameLayout.LayoutParams.WRAP_CONTENT);


        //relativeLayout.addView(r1.next);
        //relativeLayout.addView(r1, r1.params1);
       /* if(savedInstanceState!=null){
            Log.d("canvas","Canvas s recreated");
            canvas.restore();
            Log.d("canvas", "Canvas s recreated");
        }*/
        ProceedToQuestion p = new ProceedToQuestion();
        p.HardwareBack=false;p.sleep=true;
        p.getPath();
        Log.d("frag", "we are in on Create view method");
        if (p.path != null) {
            r1.setpathInRough(p.path);
            Log.d("Rough", "we are getting value from saved instance");
        }

        // r1.passContext(this);
        return rootView;

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d("Rough", "onAttach is called");
    }

    @Override
    public void onStart() {
        super.onStart();


       // Log.d("Rough", "onStart is called");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("Rough", "onStop is called");
    }

    @Override
    public void onResume() {
        super.onResume();

        Log.d("Rough", "onResume is called");
    }

    @Override
    public void onDetach() {
        save();
        super.onDetach();
        Log.d("Rough", "onDeatch is called");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("Rough", "onDestroyView is called");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("Rough", "onDestroy is called");
    }

    @Override
    public void onDestroyOptionsMenu() {
        super.onDestroyOptionsMenu();
        Log.d("Rough", "onDestroyOptionsMenu is called");
    }

    @Override
    public void onPause() {
        ProceedToQuestion p=new ProceedToQuestion();




        super.onPause();
        //onSaveInstanceState(new Bundle());
      //  Log.d("Rough", "onPause is called");
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        Log.d("Rough", "OnCreate is called");

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        // canvas.save();
        outState.putInt("integer", i);
        Log.d("Rough", "onSavedInstanceState is called");

    }

    public void save() {
        ProceedToQuestion p = new ProceedToQuestion();
        Rectangle2 r = new Rectangle2(getActivity());
         p.setPath(r.path2);

        if(p.HardwareBack==false){
            if(p.Farward && p.counter<=p.j){
                p.counter=p.k+1;
                Log.e("status","we are saving counter="+p.counter);
            }else if(p.backward && p.counter<=p.k) {
                p.counter = p.k+1;
            }
              p.RoughAdd=false;
            Log.e("status","status of Hardware ="+p.HardwareBack);
        }

Log.e("status","status of RoughAdd ="+p.RoughAdd);
        Log.d("Rough", "Save is called");
    }

}

class Rectangle2 extends View {
    private Paint brush = new Paint();
    public static Path path2 = new Path();
    Path p2 = new Path();
    Context context;
    public Button btnEraseAll;
    public Button quest, next;
    public FrameLayout.LayoutParams params;
    ProceedToQuestion p = new ProceedToQuestion();
    Rough rough = new Rough();

    public Rectangle2(final Context context) {
        super(context);
        brush.setAntiAlias(true);
        brush.setColor(Color.BLACK);
        brush.setStyle(Paint.Style.STROKE);
        brush.setStrokeJoin(Paint.Join.ROUND);
        brush.setStrokeWidth(5f);
        next = new Button(context);
        next.setText("Erase All");
        quest = new Button(context);
        quest.setText("Erase");
        btnEraseAll = new Button(context);
        btnEraseAll.setText("Erase Everything!!");
        TextView page = new TextView(context);
        page.setText("Page No.");
      // page.setId(5);
        params = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        page.setLayoutParams(params);


        params = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        btnEraseAll.setLayoutParams(params);
        params = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        quest.setLayoutParams(params);
        params = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        next.setLayoutParams(params);
        //params1=new FrameLayout.LayoutParams(1,50);
        // next.setLayoutParams(params);

        btnEraseAll.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                //reset the path
                // p2= new Path();
                p2.reset();

                //path2.moveTo(1, 1);
                //path2.lineTo(1, 1);
                //invalidate the view
                postInvalidate();
            }
        });

        quest.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                p2.reset();
                postInvalidate();
                //Toast.makeText(context, "hai bro what's up  am Quest", Toast.LENGTH_LONG).show();
            }
        });

        next.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                p2.reset();
                postInvalidate();
                ProceedToQuestion p = new ProceedToQuestion();
                p.clear();
               // Rough.this.save();

                Log.d("Rough", "after setPath");
               /// Toast.makeText(context, "hai bro what's up  am NextPage", Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float pointX = event.getX();
        float pointY = event.getY();
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                p2.moveTo(pointX, pointY);
                return true;
            case MotionEvent.ACTION_MOVE:
                p2.lineTo(pointX, pointY);
                break;

            default:
                return false;

        }
        postInvalidate();
        return false;
    }

    public void passContext(Context con) {
        context = con;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        // TODO Auto-generated method stub
        path2 = p2;
        canvas.drawColor(-1);
        canvas.drawPath(p2, brush);

   /* DrawingView dv;
    dv = new DrawingView(ActivityName.this);
    dv.setDrawingCacheEnabled(true);*/
        //save();


    }

    public void setpathInRough(Path p1) {
        p2 = p1;
        postInvalidate();
    }

}


