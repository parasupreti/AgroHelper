package com.example.gaurang.agrohelper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class Main2Activity extends AppCompatActivity {
    String a="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        //ap= Integer.parseInt(ar);
        //String  a1 = "1 Kharif Jowar 6-7.5 50 25";
        // Log.i("jaja","ap");
        // int ap=Integer.valueOf(area.getText().toString());
        //String ar=(String.valueOf(area.getText()));

/*
        SharedPreferences sp0 = getSharedPreferences("ab", Context.MODE_PRIVATE);
        String ar = sp0.getString("area", String.valueOf(1));
*/
        //int ap=Integer.parseInt(ar);
        /*Bundle bundle = getIntent().getExtras();
        String message = bundle.getString("message");*/
        int ap;
      /*  try {
            ap = Integer.parseInt(ar);
            Log.i("intint ", String.valueOf(ap));
        } catch (NumberFormatException nfe)
      */
       /* Log.i("Aad",message);*/
        String sk = "";

        int ax=1;
        SharedPreferences spf = getApplicationContext().getSharedPreferences("ab", getApplicationContext().MODE_PRIVATE);
        SharedPreferences.Editor editor = spf.edit();
        editor.putString("value", "1\n" +
                "खरीफ ज्वार\n" +
                "खाद "  + 6*ax + "-" + 7.5 * ax + "\n" +
                "नाइट्रोजन" + ax * 50 + "\n" +
                "फास्फोरस" + ax * 625 + "\n" +
                "\n" +
                "आधा नाइट्रोजन ड्रेसिगें  के समय में आऔर.आधा नाइट्रोजन बुवाई के समय मेफास्फोरस की पूरी खुराक और बुवाई के समय में पोटेशियमं  .");
        editor.apply();

        SharedPreferences spf1 = getApplicationContext().getSharedPreferences("ab1", getApplicationContext().MODE_PRIVATE);
        SharedPreferences.Editor editor1 = spf1.edit();
        editor1.putString("value1", "2\n" +
                "ज्वार की संकर\n" +
                "खाद 6 - 7.5\n" +
                "नाइट्रोजन 75\n" +
                "फास्फोरस 62\n" +
                "पोटैशियम 62\n" +
                "आधा नाइट्रोजन ड्रेसिगें  के समय में आऔर.आधा नाइट्रोजन बुवाई के समय मेफास्फोरस की पूरी खुराक और बुवाई के समय में पोटेशियमं  ");
        editor1.apply();


        SharedPreferences spf2 = getApplicationContext().getSharedPreferences("ab2", getApplicationContext().MODE_PRIVATE);
        SharedPreferences.Editor editor2 = spf2.edit();
        editor2.putString("value2", "3.\n" +
                "मक्का बारानी \n" +
                "खाद 12-15\n" +
                "नाइट्रोजन 90\n" +
                "फास्फोरस 40\n" +
                "पोटैशियम 40\n" +
                "आधा नाइट्रोजन ड्रेसिगें  के समय में आऔर.आधा नाइट्रोजन बुवाई के समय मेफास्फोरस की पूरी खुराक और बुवाई के समय में पोटेशियमं  ");
        editor2.apply();

        SharedPreferences spf3 = getApplicationContext().getSharedPreferences("ab3", getApplicationContext().MODE_PRIVATE);
        SharedPreferences.Editor editor3 = spf3.edit();
        editor3.putString("value3", "4.\n" +
                "बाजरा  की संकर\n" +
                "खाद 5-6\n" +
                "नाइट्रोजन 50\n" +
                "फास्फोरस 25\n" +
                "-\n" +
                "बुवाई के समय में नाइट्रोजन और फास्फोरस की पूरी खुराक डाल.");
        editor3.apply();


        SharedPreferences spf4 = getApplicationContext().getSharedPreferences("ab4", getApplicationContext().MODE_PRIVATE);
        SharedPreferences.Editor editor4 = spf4.edit();
        editor4.putString("value4", "5.\n" +
                "बाजरा \n" +
                "खाद 5-6\n" +
                "नाइट्रोजन 25\n" +
                "फास्फोरस 25\n" +
                "-\n" +
                "बुवाई के समय में नाइट्रोजन और फास्फोरस की पूरी खुराक डाल.");
        editor4.apply();

        SharedPreferences spf5 = getApplicationContext().getSharedPreferences("ab5", getApplicationContext().MODE_PRIVATE);
        SharedPreferences.Editor editor5 = spf5.edit();
        editor5.putString("value5", "6.\n" +
                "पहाड़ी बाजरा\n" +
                "खाद 5-6\n" +
                "नाइट्रोजन 50\n" +
                "फास्फोरस 25\n" +
                "पोटैशियम 25\n" +
                "नाइट्रोजन, फास्फोरस, पोटेशियम, की पूरी मात्रा बुवाई के समय में.\n");
        editor5.apply();

        SharedPreferences spf6 = getApplicationContext().getSharedPreferences("ab6", getApplicationContext().MODE_PRIVATE);
        SharedPreferences.Editor editor6 = spf6.edit();
        editor6.putString("value6", "7.\n" +
                "मूंगफली\n" +
                "खाद 5\n" +
                "नाइट्रोजन 12.5\n" +
                "फास्फोरस 25\n" +
                "\n" +
                "बुवाई के समय में नाइट्रोजन और फास्फोरस की पूरी खुराक डाल.");
        editor6.apply();

        SharedPreferences spf7 = getApplicationContext().getSharedPreferences("ab7", getApplicationContext().MODE_PRIVATE);
        SharedPreferences.Editor editor7 = spf7.edit();
        editor7.putString("value7", "8.\n" +
                "सूरजमुखी\n" +
                "खाद 5-6\n" +
                "नाइट्रोजन 25\n" +
                "फास्फोरस 25\n" +
                "-\n" +
                "बुवाई के समय में नाइट्रोजन और फास्फोरस की पूरी खुराक डाल.");
        editor7.apply();

        SharedPreferences spf8 = getApplicationContext().getSharedPreferences("ab8", getApplicationContext().MODE_PRIVATE);
        SharedPreferences.Editor editor8 = spf8.edit();
        editor8.putString("value8", "9.\n" +
                "नाइजर\n" +
                "खाद 5\n" +
                "नाइट्रोजन 25\n" +
                "फास्फोरस 25\n" +
                "-\n" +
                "बुवाई के समय में नाइट्रोजन और फास्फोरस की पूरी खुराक डाल.");
        editor8.apply();

        SharedPreferences spf9 = getApplicationContext().getSharedPreferences("ab9", getApplicationContext().MODE_PRIVATE);
        SharedPreferences.Editor editor9 = spf9.edit();
        editor9.putString("value9", "10.\n" + "राजमा \n" + "खाद  5\n" + "नाइट्रोजन 12.5\n" + "फास्फोरस 25\n" +
                "-");
        editor9.apply();

        SharedPreferences spf10 = getApplicationContext().getSharedPreferences("ab10", getApplicationContext().MODE_PRIVATE);
        SharedPreferences.Editor editor10 = spf10.edit();
        editor10.putString("value10", "11.\n" + "अरहर\n" +
                "खाद 5\n" +
                "नाइट्रोजन 25\n" +
                "फास्फोरस 50\n" +
                "-");
        editor10.apply();

        SharedPreferences spf11 = getApplicationContext().getSharedPreferences("ab11", getApplicationContext().MODE_PRIVATE);
        SharedPreferences.Editor editor11 = spf11.edit();
        editor11.putString("value11", "12.\n" +
                "रबी ज्वार\n" +
                "खाद 6-8\n" +
                "नाइट्रोजन 50\n" +
                "फास्फोरस 25\n" +
                "पोटैशियम --\n" +
                "बुवाई के समय में नाइट्रोजन और फास्फोरस की पूरी खुराक डाल.");
        editor11.apply();


        SharedPreferences spf15 = getApplicationContext().getSharedPreferences("ab15", getApplicationContext().MODE_PRIVATE);
        SharedPreferences.Editor editor15 = spf15.edit();
        editor15.putString("value15", "16.\n" +
                "सूरजमुखी\n" +
                "खाद 3-5\n" +
                "नाइट्रोजन 50\n" +
                "फास्फोरस 25\n" +
                "पोटैशियम --\n" +
                "बुवाई के समय में नाइट्रोजन और फास्फोरस की पूरी खुराक डाल.");
        editor15.apply();

        SharedPreferences spf12 = getApplicationContext().getSharedPreferences("ab12", getApplicationContext().MODE_PRIVATE);
        SharedPreferences.Editor editor12 = spf12.edit();
        editor12.putString("value12", "13.\n" +
                "कुसुम\n" +
                "खाद 5-6\n" +
                "नाइट्रोजन 50\n" +
                "फास्फोरस 25\n" +
                "पोटैशियम --\n" +
                "बुवाई के समय में नाइट्रोजन और फास्फोरस की पूरी खुराक डाल.");
        editor12.apply();

        SharedPreferences spf13 = getApplicationContext().getSharedPreferences("ab13", getApplicationContext().MODE_PRIVATE);
        SharedPreferences.Editor editor13 = spf13.edit();
        editor13.putString("value13", "14.\n" +
                "चना\n" +
                "खाद 6-7\n" +
                "नाइट्रोजन 12.5\n" +
                "फास्फोरस 25\n" +
                "पोटैशियम --\n" +
                "बुवाई के समय में नाइट्रोजन और फास्फोरस की पूरी खुराक डाल");
        editor13.apply();

        SharedPreferences spf14 = getApplicationContext().getSharedPreferences("ab14", getApplicationContext().MODE_PRIVATE);
        SharedPreferences.Editor editor14 = spf14.edit();
        editor14.putString("value14", "15.\n" +
                "अलसी का बीज\n" +
                "खाद 3-5\n" +
                "नाइट्रोजन 30\n" +
                "फास्फोरस 15\n" +
                "पोटैशियम --\n" +
                "बुवाई के समय में नाइट्रोजन और फास्फोरस की पूरी खुराक डाल.");
        editor14.apply();


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
     /*   Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);*/
      /*  setSupportActionBar(toolbar);
*/
        TextView ta = (TextView) findViewById(R.id.ta);

        SharedPreferences sp = getSharedPreferences("ab", Context.MODE_PRIVATE);
        a = sp.getString("counter", "");
        Log.i("kaka", a);

        if (Integer.parseInt(a) == 1) {
            /*SharedPreferences s=getSharedPreferences("ab1", Context.MODE_PRIVATE);
            sk = s.getString("value1", "");
            ta.setText(sk);*/


            SharedPreferences s = getSharedPreferences("ab", Context.MODE_PRIVATE);
            sk = s.getString("value", "");
            ta.setText(sk);

        }
        if (Integer.parseInt(a) == 2) {
            Log.i("haha", a);
            SharedPreferences s = getSharedPreferences("ab1", Context.MODE_PRIVATE);
            sk = s.getString("value1", "");
            ta.setText(sk);
        }
        if (Integer.parseInt(a) == 3) {
            Log.i("haha", a);
            SharedPreferences s = getSharedPreferences("ab2", Context.MODE_PRIVATE);
            sk = s.getString("value2", "");
            ta.setText(sk);
        }
        if (Integer.parseInt(a) == 4) {
            SharedPreferences s = getSharedPreferences("ab3", Context.MODE_PRIVATE);
            sk = s.getString("value3", "");
            ta.setText(sk);
        }
        if (Integer.parseInt(a) == 5) {
            SharedPreferences s = getSharedPreferences("ab4", Context.MODE_PRIVATE);
            sk = s.getString("value4", "");
            ta.setText(sk);
        }
        if (Integer.parseInt(a) == 6) {
            SharedPreferences s = getSharedPreferences("ab5", Context.MODE_PRIVATE);
            sk = s.getString("value5", "");
            ta.setText(sk);
        }
        if (Integer.parseInt(a) == 7) {
            SharedPreferences s = getSharedPreferences("ab6", Context.MODE_PRIVATE);
            sk = s.getString("value6", "");
            ta.setText(sk);
        }
        if (Integer.parseInt(a) == 8) {
            SharedPreferences s = getSharedPreferences("ab7", Context.MODE_PRIVATE);
            sk = s.getString("value7", "");
            ta.setText(sk);
        }
        if (Integer.parseInt(a) == 9) {
            SharedPreferences s = getSharedPreferences("ab8", Context.MODE_PRIVATE);
            sk = s.getString("value8", "");
            ta.setText(sk);
        }
        if (Integer.parseInt(a) == 10) {
            SharedPreferences s = getSharedPreferences("ab9", Context.MODE_PRIVATE);
            sk = s.getString("value9", "");
            ta.setText(sk);

        }
        if (Integer.parseInt(a) == 11) {
            SharedPreferences s = getSharedPreferences("ab10", Context.MODE_PRIVATE);
            sk = s.getString("value10", "");
            ta.setText(sk);

        }
        if (Integer.parseInt(a) == 12) {
            SharedPreferences s = getSharedPreferences("ab11", Context.MODE_PRIVATE);
            sk = s.getString("value11", "");
            ta.setText(sk);

        }
        if (Integer.parseInt(a) == 13) {
            SharedPreferences s = getSharedPreferences("ab12", Context.MODE_PRIVATE);
            sk = s.getString("value12", "");
            ta.setText(sk);

        }
        if (Integer.parseInt(a) == 14) {
            SharedPreferences s = getSharedPreferences("ab13", Context.MODE_PRIVATE);
            sk = s.getString("value13", "");
            ta.setText(sk);

        }
        if (Integer.parseInt(a) == 15) {
            SharedPreferences s = getSharedPreferences("ab14", Context.MODE_PRIVATE);
            sk = s.getString("value14", "");
            ta.setText(sk);

        }
        if (Integer.parseInt(a) == 16) {
            SharedPreferences s = getSharedPreferences("ab15", Context.MODE_PRIVATE);
            sk = s.getString("value15", "");
            ta.setText(sk);

        }
/*
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }

    public void conve(float land,float val)
    {



    }

}
