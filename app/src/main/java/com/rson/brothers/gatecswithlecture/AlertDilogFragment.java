package com.rson.brothers.gatecswithlecture;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;


/**
 * Created by Brother's on 5/6/2016.
 */
public class AlertDilogFragment extends DialogFragment {

    static int TopicClicked;



    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Select Year");
        builder.setItems(R.array.YearWise, new DialogInterface.OnClickListener() {
    @Override
    public void onClick(DialogInterface dialog, int which) {
       // Toast.makeText(getActivity(), "This is list clicked at "+which+" and Topic position is "+getTopicClicked(), Toast.LENGTH_SHORT).show();


        Intent in = new Intent(getActivity(), Instruction.class);
        in.putExtra("TopicWise",true);
        in.putExtra("Subject",getTopicClicked());
        in.putExtra("position",which);
        startActivity(in);
    }
});
       /* builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int which) {
                Toast.makeText(getActivity(), "This is negative buttons", Toast.LENGTH_SHORT).show();
            }
        });

        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int which) {
                Toast.makeText(getActivity(), "This is Positive button", Toast.LENGTH_SHORT).show();
            }
        });*/

        Dialog dialog = builder.create();
        return dialog;

    }

    public static void setTopicClicked(int topicClicked) {
        TopicClicked = topicClicked;
    }

    public static int getTopicClicked() {
        return TopicClicked;
    }
}
