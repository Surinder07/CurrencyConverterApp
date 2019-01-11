package com.example.mss.currencyconverterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.Formatter;

public class MainActivity extends AppCompatActivity {

    Button euro, pound, dollar, yen , dinar, bitcoin, aud, cad, clear;
    EditText editText;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // all the buttons
        euro = findViewById(R.id.euro);
        pound = findViewById(R.id.pound);
        dollar = findViewById(R.id.dollar);
        yen = findViewById(R.id.yen);
        dinar = findViewById(R.id.dinar);
        bitcoin = findViewById(R.id.bitcoin);
        aud = findViewById(R.id.aud);
        cad = findViewById(R.id.cad);
        clear = findViewById(R.id.clear); // to clear the edittext

        editText = findViewById(R.id.editText2);
        textView = findViewById(R.id.textView);


        euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String euroText = editText.getText().toString();

                if(TextUtils.isEmpty(euroText)){



                    editText.setError("Empty User input");
                }
                else{

                    double n, k;

                    n = Double.parseDouble(euroText);
                    textView.setText(null);
                    Formatter formatter = new Formatter();

                    k = n * 0.012;
                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText(""+numberFormat.format(k));

                }

            }
        });




        pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                //

                String poundText = editText.getText().toString();

                if(TextUtils.isEmpty(poundText)){



                    editText.setError("Empty User input");
                }
                else{

                    double n, k;

                    n = Double.parseDouble(poundText);
                    textView.setText(null);
                    Formatter formatter = new Formatter();

                    k = n * 0.011;
                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText(""+numberFormat.format(k));

                }

                //




            }
        });


        dollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //



                String dollarText = editText.getText().toString();

                if(TextUtils.isEmpty(dollarText)){



                    editText.setError("Empty User input");
                }
                else{

                    double n, k;

                    n = Double.parseDouble(dollarText);
                    textView.setText(null);
                    Formatter formatter = new Formatter();

                    k = n * 0.014;
                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText(""+numberFormat.format(k));

                }

                //





            }
        });



        yen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //


                String yenText = editText.getText().toString();

                if(TextUtils.isEmpty(yenText)){



                    editText.setError("Empty User input");
                }
                else{

                    double n, k;

                    n = Double.parseDouble(yenText);
                    textView.setText(null);
                    Formatter formatter = new Formatter();

                    k = n * 1.54;
                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText(""+numberFormat.format(k));

                }


                //




            }
        });

        dinar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //



                String dinarText = editText.getText().toString();

                if(TextUtils.isEmpty(dinarText)){



                    editText.setError("Empty User input");
                }
                else{

                    double n, k;

                    n = Double.parseDouble(dinarText);
                    textView.setText(null);
                    Formatter formatter = new Formatter();

                    k = n * 0.0043;
                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText(""+numberFormat.format(k));

                }
                //


            }
        });


        cad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                //

                String cadText = editText.getText().toString();

                if(TextUtils.isEmpty(cadText)){



                    editText.setError("Empty User input");
                }
                else{

                    double n, k;

                    n = Double.parseDouble(cadText);
                    textView.setText(null);
                    Formatter formatter = new Formatter();

                    k = n * 0.019;
                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText(""+numberFormat.format(k));

                }
                //


            }
        });


        aud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //


                String audText = editText.getText().toString();

                if(TextUtils.isEmpty(audText)){



                    editText.setError("Empty User input");
                }
                else{

                    double n, k;

                    n = Double.parseDouble(audText);
                    textView.setText(null);
                    Formatter formatter = new Formatter();

                    k = n * 0.020;
                    DecimalFormat numberFormat = new DecimalFormat("#.00");
                    textView.setText(""+numberFormat.format(k));

                }



                //


            }
        });


        bitcoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //


                String bitcoinText = editText.getText().toString();

                if(TextUtils.isEmpty(bitcoinText)){



                    editText.setError("Empty User input");
                }
                else{

                    double n, k;

                    n = Double.parseDouble(bitcoinText);
                    textView.setText(null);
                    Formatter formatter = new Formatter();

                    k = n * 0.0000039;
                    DecimalFormat numberFormat = new DecimalFormat("#.00000000");
                    textView.setText(""+numberFormat.format(k));

                }
                //



            }
        });


        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                String clearText = editText.getText().toString();

                if(TextUtils.isEmpty(clearText)){


                //

                }
                else{


                    //clear.setText("");
                    editText.setText("");
                   // textView.setText("");


                }



            }
        });

    }
}


