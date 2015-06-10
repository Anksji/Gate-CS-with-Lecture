package com.rson.brothers.gatecswithlecture;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Calculate extends Activity implements View.OnClickListener{
    private TextView outputResult;
    private TextView shiftDisplay;
    private TextView degreeRad;
    private boolean isDegree = false;
    private boolean isInverse = false;
    private String lastResultObtain = "";
    private String currentDisplayedInput = "";
    private String inputToBeParsed = "";
    private Calculator mCalculator;
    boolean logBase2=false;
    private static String PREFS_NAME = "memory";
    private Button button0, button1, button2,button3,button4,button5,button6,button7,
            button8,button9,buttonClear, buttonDivide,buttonMultiply,buttonSubtract,
            buttonAdd, buttonPercentage, buttonEqual, buttonDecimal, closeParenthesis, openParenthesis, buttonAnswer,
            buttonSingleDelete, buttonExp,Back, AnsBtn;
    private Button nFacorial,inverse_cos,inverse_sin,inverse_tan,one_by_x,xcube,xcube_root,pie,expon;

    private TextView  labelRCL, labelSTO, labelMMinus, labelFloat, labelDeg;

    private Button buttonSin, buttonLn,buttonCos, buttonLog, buttonTan, buttonSquareRoot,  buttonXSquare, buttonYPowerX,
            buttonRnd;
    private Button buttonShift, buttonRad, buttonAbs, buttonMr, buttonMs, buttonMPlus;

    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_calculate);
        //StartAppSDK.init(this, "104130031", "204644773", true);


        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        mCalculator = new Calculator();
        outputResult = (TextView)findViewById(R.id.display);
        outputResult.setText("");
        //shiftDisplay = (TextView)findViewById(R.id.shift_display);


        mAdView= (AdView) findViewById(R.id.adView);

       AdRequest Request = new AdRequest.Builder().build();
        mAdView.loadAd(Request);



        nFacorial= (Button) findViewById(R.id.nfacorial);
        one_by_x= (Button) findViewById(R.id.one_by_x);
        inverse_cos= (Button) findViewById(R.id.cos_inverse);
        inverse_sin= (Button) findViewById(R.id.sin_inverse);
        inverse_tan= (Button) findViewById(R.id.tan_inverse);
        xcube= (Button) findViewById(R.id.xcube);
        xcube_root= (Button) findViewById(R.id.xcube_root);
        pie= (Button) findViewById(R.id.pie);
        expon= (Button) findViewById(R.id.expon);



        Back= (Button) findViewById(R.id.back);

        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        degreeRad = (TextView)findViewById(R.id.degree);
        button0 = (Button)findViewById(R.id.zero_button);
        button1 = (Button)findViewById(R.id.one_button);
        button2 = (Button)findViewById(R.id.two_button);
        button3 = (Button)findViewById(R.id.three_button);
        button4 = (Button)findViewById(R.id.four_button);
        button5 = (Button)findViewById(R.id.five_button);
        button6 = (Button)findViewById(R.id.six_button);
        button7 = (Button)findViewById(R.id.seven_button);
        button8 = (Button)findViewById(R.id.eight_button);
        button9 = (Button)findViewById(R.id.nine_button);
        buttonDivide = (Button)findViewById(R.id.division);
        buttonMultiply = (Button)findViewById(R.id.multiplication);
        buttonSubtract = (Button)findViewById(R.id.subtraction);
        buttonAdd = (Button)findViewById(R.id.addition);
        buttonPercentage = (Button)findViewById(R.id.percent);
        buttonDecimal = (Button)findViewById(R.id.dot);
        closeParenthesis = (Button)findViewById(R.id.close_bracket);
        openParenthesis = (Button)findViewById(R.id.open_bracket);
        buttonExp = (Button)findViewById(R.id.exp);
        buttonSquareRoot = (Button)findViewById(R.id.square_root);
        buttonXSquare = (Button)findViewById(R.id.x_square);
        buttonYPowerX = (Button)findViewById(R.id.x_power_y);
        buttonSin = (Button)findViewById(R.id.sin_sign);
        buttonCos = (Button)findViewById(R.id.cos_sign);
        buttonTan = (Button)findViewById(R.id.tan_sign);

        buttonLn = (Button)findViewById(R.id.natural_log);

        buttonLog = (Button)findViewById(R.id.log);
        buttonRnd = (Button)findViewById(R.id.hys);
        buttonDivide.setText(Html.fromHtml(Helpers.division));

        buttonLn.setText(Html.fromHtml(Helpers.Log_base_2));

        inverse_cos.setText(Html.fromHtml(Helpers.inverseCos));
        inverse_tan.setText(Html.fromHtml(Helpers.inverseTan));
        inverse_sin.setText(Html.fromHtml(Helpers.inverseSin));
        xcube.setText(Html.fromHtml(Helpers.cubeRoot));
        xcube_root.setText(Html.fromHtml(Helpers.cubeSquare));

        buttonSquareRoot.setText(Html.fromHtml(Helpers.squareRoot));
        buttonXSquare.setText(Html.fromHtml(Helpers.xSquare));
        buttonYPowerX.setText(Html.fromHtml(Helpers.yPowerX));
        //buttonShift = (Button)findViewById(R.id.shift);
        buttonRad = (Button)findViewById(R.id.rad);
        buttonAbs = (Button)findViewById(R.id.abs);
        buttonMr = (Button)findViewById(R.id.mr);
        buttonMs = (Button)findViewById(R.id.ms);
        buttonMPlus = (Button)findViewById(R.id.m_plus);
        buttonClear = (Button)findViewById(R.id.clear);
        buttonSingleDelete = (Button)findViewById(R.id.single_delete);
        buttonEqual = (Button)findViewById(R.id.equal_sign);
        buttonAnswer = (Button)findViewById(R.id.ans);
        //labelFactorial = (TextView)findViewById(R.id.factorial);
        //labelCombination = (TextView)findViewById(R.id.combination);
        //labelPermutation = (TextView)findViewById(R.id.permutation);
        //labelPi = (TextView)findViewById(R.id.pi);
        //labelE = (TextView)findViewById(R.id.e);
        //labelComma = (TextView)findViewById(R.id.comma);
        //labelCubeRoot = (TextView)findViewById(R.id.cube_root);
        //labelCube = (TextView)findViewById(R.id.cube);
        //labelInverseX = (TextView)findViewById(R.id.one_over_x);
        // labelInverseSin = (TextView)findViewById(R.id.inverse_sin);
        //labelInverseCos = (TextView)findViewById(R.id.inverse_cos);
        //labelInverseTan = (TextView)findViewById(R.id.inverse_tan);
        //labelExponential = (TextView)findViewById(R.id.expo);
        //labelTenPowerX = (TextView)findViewById(R.id.ten_power_x);
       // labelRCL = (TextView)findViewById(R.id.rcl);
        //labelSTO = (TextView)findViewById(R.id.sto);
        labelMMinus = (TextView)findViewById(R.id.m_minus);
       // labelFloat = (TextView)findViewById(R.id.float_number);
        labelDeg = (TextView) findViewById(R.id.degree);
//        labelInverseSin.setText(Html.fromHtml(Helpers.inverseSin));
        //labelInverseCos.setText(Html.fromHtml(Helpers.inverseCos));
        // labelInverseTan.setText(Html.fromHtml(Helpers.inverseTan));
        // labelExponential.setText(Html.fromHtml(Helpers.exponential));
        // labelTenPowerX.setText(Html.fromHtml(Helpers.tenPowerX));
        // labelCubeRoot.setText(Html.fromHtml(Helpers.cubeSquare));
        // labelCube.setText(Html.fromHtml(Helpers.cubeRoot));
        // labelPi.setText(Html.fromHtml(Helpers.pi));


        nFacorial.setOnClickListener(this);
        one_by_x.setOnClickListener(this);
        inverse_cos.setOnClickListener(this);
        inverse_sin.setOnClickListener(this);
        inverse_tan.setOnClickListener(this);
        xcube.setOnClickListener(this);
        xcube_root.setOnClickListener(this);
        pie.setOnClickListener(this);
        expon.setOnClickListener(this);

        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        buttonClear.setOnClickListener(this);
        buttonDivide.setOnClickListener(this);
        buttonMultiply.setOnClickListener(this);
        buttonSubtract.setOnClickListener(this);
        buttonAdd.setOnClickListener(this);
        buttonPercentage.setOnClickListener(this);
        buttonEqual.setOnClickListener(this);
        buttonDecimal.setOnClickListener(this);
        closeParenthesis.setOnClickListener(this);
        openParenthesis.setOnClickListener(this);
        buttonSingleDelete.setOnClickListener(this);
        buttonExp.setOnClickListener(this);
        buttonSquareRoot.setOnClickListener(this);
        buttonXSquare.setOnClickListener(this);
        buttonYPowerX.setOnClickListener(this);
        buttonSin.setOnClickListener(this);
        buttonCos.setOnClickListener(this);
        buttonTan.setOnClickListener(this);
        buttonLn.setOnClickListener(this);
        buttonLog.setOnClickListener(this);
        buttonRnd.setOnClickListener(this);
        buttonAnswer.setOnClickListener(this);
//        buttonShift.setOnClickListener(this);
        buttonRad.setOnClickListener(this);
        buttonAbs.setOnClickListener(this);
        buttonMr.setOnClickListener(this);
        buttonMs.setOnClickListener(this);
        buttonMPlus.setOnClickListener(this);
    }
    private void obtainInputValues(String input){
        switch (input){
            case "0":
                if(currentDisplayedInput.equals("Error")){
                    currentDisplayedInput = "0";
                    inputToBeParsed="0";
                }else{
                    currentDisplayedInput += "0";
                    inputToBeParsed += "0";
                }

                break;
            case "1":

                if(currentDisplayedInput.equals("Error")){
                    currentDisplayedInput = "1";
                    inputToBeParsed = "1";
                }else{
                    currentDisplayedInput += "1";
                    inputToBeParsed += "1";
                }




               // toggleShiftButton();
                break;
            case "2":

                if(currentDisplayedInput.equals("Error")){
                    currentDisplayedInput = "2";
                    inputToBeParsed = "2";
                }else{
                    currentDisplayedInput += "2";
                    inputToBeParsed += "2";
                }





               // toggleShiftButton();
                break;
            case "3":

                if(currentDisplayedInput.equals("Error")){
                    currentDisplayedInput = "3";
                    inputToBeParsed = "3";
                }else{
                    currentDisplayedInput += "3";
                    inputToBeParsed += "3";
                }





                //toggleShiftButton();
                break;
            case "4":

                if(currentDisplayedInput.equals("Error")){
                    currentDisplayedInput = "4";
                    inputToBeParsed = "4";
                }else{
                    currentDisplayedInput += "4";
                    inputToBeParsed += "4";
                }



               // toggleShiftButton();
                break;
            case "5":

                if(currentDisplayedInput.equals("Error")){
                    currentDisplayedInput = "5";
                    inputToBeParsed = "5";
                }else{
                    currentDisplayedInput += "5";
                    inputToBeParsed += "5";
                }



                //toggleShiftButton();
                break;
            case "6":

                if(currentDisplayedInput.equals("Error")){
                    currentDisplayedInput = "6";
                    inputToBeParsed = "6";
                }else{
                    currentDisplayedInput += "6";
                    inputToBeParsed += "6";
                }



                //toggleShiftButton();
                break;
            case "7":

                if(currentDisplayedInput.equals("Error")){
                    currentDisplayedInput = "7";
                    inputToBeParsed = "7";
                }else{
                    currentDisplayedInput += "7";
                    inputToBeParsed += "7";
                }



                break;
            case "8":

                if(currentDisplayedInput.equals("Error")){
                    currentDisplayedInput = "8";
                    inputToBeParsed = "8";
                }else{
                    currentDisplayedInput += "8";
                    inputToBeParsed += "8";
                }



                break;
            case "9":

                if(currentDisplayedInput.equals("Error")){
                    currentDisplayedInput = "9";
                    inputToBeParsed = "9";
                }else{
                    currentDisplayedInput += "9";
                    inputToBeParsed += "9";
                }


                break;
            case ".":

                if(currentDisplayedInput.equals("Error")){
                    currentDisplayedInput = ".";
                    inputToBeParsed = ".";
                }else{
                    currentDisplayedInput += ".";
                    inputToBeParsed += ".";
                }


                break;
            case "+":

                if(currentDisplayedInput.equals("Error")){
                    currentDisplayedInput = "+";
                    inputToBeParsed = "+";
                }else{
                    currentDisplayedInput += "+";
                    inputToBeParsed += "+";
                }


                break;
            case "-":

                if(currentDisplayedInput.equals("Error")){
                    currentDisplayedInput = "-";
                    inputToBeParsed = "-";
                }else{
                    currentDisplayedInput += "-";
                    inputToBeParsed += "-";
                }


                break;
            case "÷":

                if(currentDisplayedInput.equals("Error")){
                    currentDisplayedInput = "÷";
                    inputToBeParsed = "/";
                }else{
                    currentDisplayedInput += "÷";
                    inputToBeParsed += "/";
                }


                break;
            case "x":

                if(currentDisplayedInput.equals("Error")){
                    currentDisplayedInput = "*";
                    inputToBeParsed = "*";
                }else{
                    currentDisplayedInput += "*";
                    inputToBeParsed += "*";
                }


                break;
            case "(":

                if(currentDisplayedInput.equals("Error")){
                    currentDisplayedInput = "(";
                    inputToBeParsed = "(";
                }else{
                    currentDisplayedInput += "(";
                    inputToBeParsed += "(";
                }


                break;
            case ")":

                if(currentDisplayedInput.equals("Error")){
                    currentDisplayedInput = ")";
                    inputToBeParsed = ")";
                }else{
                    currentDisplayedInput += ")";
                    inputToBeParsed += ")";
                }


                break;
            case "mod":

                if(currentDisplayedInput.equals("Error")){
                    currentDisplayedInput = "%";
                    inputToBeParsed = "%";
                }else{
                    currentDisplayedInput += "%";
                    inputToBeParsed += "%";
                }




                //toggleShiftButton();
                break;
            case "log2":

                logBase2=true;

                if(currentDisplayedInput.equals("Error")){
                    currentDisplayedInput = "log_2(";
                    inputToBeParsed = "ln(";
                }else{
                    currentDisplayedInput += "log_2(";
                    inputToBeParsed += "ln(";
                }





               // toggleShiftButton();
                break;
            case "log":

                if(currentDisplayedInput.equals("Error")){
                    currentDisplayedInput = "log(";
                    inputToBeParsed = "log(";
                }else{
                    currentDisplayedInput += "log(";
                    inputToBeParsed += "log(";
                }



               // toggleShiftButton();
                break;
            case "√":

                if(currentDisplayedInput.equals("Error")){
                    currentDisplayedInput = "√(";
                    inputToBeParsed = "sqrt(";
                }else{
                    currentDisplayedInput += "√(";
                    inputToBeParsed += "sqrt(";
                }



                //toggleShiftButton();
                break;
            case "Yx":

                if(currentDisplayedInput.equals("Error")){
                    currentDisplayedInput = "^";
                    inputToBeParsed = "^";
                }else{
                    currentDisplayedInput += "^";
                    inputToBeParsed += "^";
                }


                break;
            case "x3":

                if(currentDisplayedInput.equals("Error")){
                    currentDisplayedInput = "^3";
                    inputToBeParsed = "^3";
                }else{
                    currentDisplayedInput += "^3";
                    inputToBeParsed += "^3";
                }


                break;
            case "3√":

                if(currentDisplayedInput.equals("Error")){
                    currentDisplayedInput = "3√(";
                    inputToBeParsed = "crt(";
                }else{
                    currentDisplayedInput += "3√(";
                    inputToBeParsed += "crt(";
                }


                break;
            case "1/x":

                if(currentDisplayedInput.equals("Error")){
                    currentDisplayedInput = "1÷";
                    inputToBeParsed = "1÷";
                }else{
                    currentDisplayedInput += "1÷";
                    inputToBeParsed += "1÷";
                }


                break;
            case "n!":

                if(currentDisplayedInput.equals("Error")){
                    currentDisplayedInput = "!(";
                    inputToBeParsed = "!(";
                }else{
                    currentDisplayedInput += "!(";
                    inputToBeParsed += "!(";
                }


                break;

            case "π":

                if(currentDisplayedInput.equals("Error")){
                    currentDisplayedInput = "π";
                    inputToBeParsed = "pi";
                }else{
                    currentDisplayedInput += "π";
                    inputToBeParsed += "pi";
                }



                break;
            case "e":

                if(currentDisplayedInput.equals("Error")){
                    currentDisplayedInput = "e";
                    inputToBeParsed = "e";
                }else{
                    currentDisplayedInput += "e";
                    inputToBeParsed += "e";
                }



                break;
            case "tan-1":

                if(currentDisplayedInput.equals("Error")){
                    currentDisplayedInput = "atan(";
                    inputToBeParsed = "atan(";
                }else{
                    currentDisplayedInput += "atan(";
                    inputToBeParsed += "atan(";
                }


                break;
            case "cos-1":

                if(currentDisplayedInput.equals("Error")){
                    currentDisplayedInput = "acos(";
                    inputToBeParsed = "acos(";
                }else{
                    currentDisplayedInput += "acos(";
                    inputToBeParsed += "acos(";
                }


                break;
            case "sin-1":

                if(currentDisplayedInput.equals("Error")){
                    currentDisplayedInput = "asin(";
                    inputToBeParsed = "asin(";
                }else{
                    currentDisplayedInput += "asin(";
                    inputToBeParsed += "asin(";
                }


                break;
            case "sin":

                if(currentDisplayedInput.equals("Error")){
                    currentDisplayedInput = "sin(";
                    inputToBeParsed = "sin(";
                }else{
                    currentDisplayedInput += "sin(";
                    inputToBeParsed += "sin(";
                }



                //toggleShiftButton();
                break;
            case "cos":

                if(currentDisplayedInput.equals("Error")){
                    currentDisplayedInput = "cos(";
                    inputToBeParsed = "cos(";
                }else{
                    currentDisplayedInput += "cos(";
                    inputToBeParsed += "cos(";
                }



               // toggleShiftButton();
                break;
            case "tan":

                if(currentDisplayedInput.equals("Error")){
                    currentDisplayedInput = "tan(";
                    inputToBeParsed = "tan(";
                }else{
                    currentDisplayedInput += "tan(";
                    inputToBeParsed += "tan(";
                }



                //toggleShiftButton();
                break;
            case "exp":

                if(currentDisplayedInput.equals("Error")){
                    currentDisplayedInput = "E";
                    inputToBeParsed = "E0";
                }else{
                    currentDisplayedInput += "E";
                    inputToBeParsed += "E0";
                }


                break;
            case "x2":


                if(currentDisplayedInput.equals("Error")){
                    currentDisplayedInput = "^2";
                    inputToBeParsed = "^2";
                }else{
                    currentDisplayedInput += "^2";
                    inputToBeParsed += "^2";
                }



               // toggleShiftButton();
                break;
            case "rnd":
                double ran = Math.random();

                if(currentDisplayedInput.equals("Error")){
                    currentDisplayedInput = String.valueOf(ran);
                    inputToBeParsed = String.valueOf(ran);
                }else{
                    currentDisplayedInput += String.valueOf(ran);
                    inputToBeParsed += String.valueOf(ran);
                }



                break;
            case "ABS":

                if(currentDisplayedInput.equals("Error")){
                    currentDisplayedInput = "abs(";
                    inputToBeParsed = "abs(";
                }else{
                    currentDisplayedInput += "abs(";
                    inputToBeParsed += "abs(";
                }

                break;

            case "MR":

                String mValue = getStoredPreferenceValue(Calculate.this);
                String result = removeTrailingZero(mValue);
                if(!result.equals("0")){
                    currentDisplayedInput += result;
                    inputToBeParsed += result;
                }
                break;
            case "M-":
                double inputValueMinus  = isANumber(outputResult.getText().toString());
                if(!Double.isNaN(inputValueMinus)) {
                    subtractMemoryStorage(Calculate.this, inputValueMinus);
                }
                break;
            case "MS":
                clearMemoryStorage(Calculate.this);
                break;
            case "M+":

                    double inputValue  = isANumber(outputResult.getText().toString());
                    if(!Double.isNaN(inputValue)){
                        addToMemoryStorage(Calculate.this, inputValue);
                    }

                toggleInverse();
              //  toggleShiftButton();
                break;
        }
        outputResult.setText(currentDisplayedInput);
    }
    @Override
    public void onClick(View view) {

        Button button = (Button) view;
        String data = button.getText().toString();
        //Toast.makeText(this, "Click " + data, Toast.LENGTH_LONG).show();
        if(data.equals("AC")){
            outputResult.setText("");
            currentDisplayedInput = "";
            inputToBeParsed = "";
        }
        else if(data.equals("del")){
            String enteredInput = outputResult.getText().toString();
            if(enteredInput.length() > 0){

                enteredInput = enteredInput.substring(0, enteredInput.length() - 1);
                currentDisplayedInput = enteredInput;

                if(enteredInput.equals("")){

                    String str = inputToBeParsed.substring(0, inputToBeParsed.length()-1);
                    inputToBeParsed = "";
                    outputResult.setText(currentDisplayedInput);

                }
                else{

                    String str = inputToBeParsed.substring(0, inputToBeParsed.length()-1);
                    inputToBeParsed = str;
                    outputResult.setText(currentDisplayedInput);

                }
                //currentDisplayedInput = enteredInput;


            }
        }else if(data.equals("=")){
            String enteredInput = outputResult.getText().toString();
            // call a function that will return the result of the calculate.
            if(logBase2){
                String s;

                s=inputToBeParsed.substring(inputToBeParsed.length() - 1);
                if(s.equals(")")){
                    inputToBeParsed=inputToBeParsed+"/ln(2)";
                    logBase2=false;
                }else{
                    inputToBeParsed=inputToBeParsed+")/ln(2)";
                    logBase2=false;
                }

            }



            String resultObject = mCalculator.getResult(currentDisplayedInput, inputToBeParsed);
            inputToBeParsed=removeTrailingZero(resultObject);
            currentDisplayedInput=inputToBeParsed;
            lastResultObtain=inputToBeParsed;
            outputResult.setText(removeTrailingZero(resultObject));
        }else if(data.equals("Ans")){

            //Toast.makeText(Calculate.this,"Answer button is clicked",Toast.LENGTH_SHORT).show();

            if(lastResultObtain.equals("Error")){

            }else{
                String enteredInput = outputResult.getText().toString();
                enteredInput += lastResultObtain;
                currentDisplayedInput=enteredInput;
                inputToBeParsed=enteredInput;
                outputResult.setText(enteredInput);
            }
        }else if(data.equals("SHIFT")){
            if(!isInverse){
                isInverse = true;
            }else{
                isInverse = false;
            }
           // toggleShiftButton();
        }else if(data.equals("RAD")){
            buttonRad.setText("DEG");
            buttonRad.setBackgroundColor(Color.parseColor("#9a74c0"));
            degreeRad.setText("RAD");
        }
        else if(data.equals("DEG")){
            buttonRad.setText("RAD");
            buttonRad.setBackgroundColor(Color.parseColor("#7ca3dd"));
            degreeRad.setText("DEG");
        }else{
            obtainInputValues(data);
        }
    }
    private String removeTrailingZero(String formattingInput){
        if(!formattingInput.contains(".")){
            return formattingInput;
        }
        int dotPosition = formattingInput.indexOf(".");
        String newValue = formattingInput.substring(dotPosition, formattingInput.length());
        if(newValue.equals(".0")){
            return formattingInput.substring(0, dotPosition);
        }
        return formattingInput;
    }
    private void toggleInverse(){
        if(isInverse){
            isInverse = false;
        }
    }
   /* private void toggleShiftButton(){
        if(isInverse){
            shiftDisplay.setText("SHIFT");
        }else{
            shiftDisplay.setText("");
        }
    }*/
    /* @Override
     public boolean onCreateOptionsMenu(Menu menu) {
         getMenuInflater().inflate(R.menu.menu_main, menu);
         return true;
     }*/
  /*  @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }*/
    private double isANumber(String numberInput){
        double result = Double.NaN;
        try{
            result = Double.parseDouble(numberInput);
        }catch(NumberFormatException nfe){
        }
        return result;
    }
    private void addToMemoryStorage(Context context, double inputToStore){
        float returnPrefValue = getPreference(context);
        float newValue = returnPrefValue + (float)inputToStore;
        setPreference(context, newValue);
    }
    private void subtractMemoryStorage(Context context, double inputToStore){
        float returnPrefValue = getPreference(context);
        float newValue = returnPrefValue - (float)inputToStore;
        setPreference(context, newValue);
    }
    private void clearMemoryStorage(Context context){
        setPreference(context, 0);
    }
    private String getStoredPreferenceValue(Context context){
        float returnedValue = getPreference(context);
        return String.valueOf(returnedValue);
    }
    static public boolean setPreference(Context c, float value) {
        SharedPreferences settings = c.getSharedPreferences(PREFS_NAME, 0);
        settings = c.getSharedPreferences(PREFS_NAME, 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putFloat("key", value);
        return editor.commit();
    }
    static public float getPreference(Context c) {
        SharedPreferences settings = c.getSharedPreferences(PREFS_NAME, 0);
        settings = c.getSharedPreferences(PREFS_NAME, 0);
        float value = settings.getFloat("key", 0);
        return value;
    }

}
