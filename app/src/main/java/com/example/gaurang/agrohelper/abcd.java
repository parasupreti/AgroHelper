package com.example.gaurang.agrohelper;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class abcd extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abcd);

        final RadioGroup rg=(RadioGroup)findViewById(R.id.rg);

        RadioButton r1=(RadioButton)findViewById(R.id.r1);
        final RadioButton r2=(RadioButton)findViewById(R.id.r1);
        RadioButton r3=(RadioButton)findViewById(R.id.r1);
        RadioButton r4=(RadioButton)findViewById(R.id.r1);
        RadioButton r5=(RadioButton)findViewById(R.id.r1);
        RadioButton r6=(RadioButton)findViewById(R.id.r1);
        RadioButton r7=(RadioButton)findViewById(R.id.r1);
        RadioButton r8=(RadioButton)findViewById(R.id.r1);
        RadioButton r9=(RadioButton)findViewById(R.id.r1);
        RadioButton r10=(RadioButton)findViewById(R.id.r1);
        RadioButton r11=(RadioButton)findViewById(R.id.r1);
        RadioButton r12=(RadioButton)findViewById(R.id.r1);
        RadioButton r13=(RadioButton)findViewById(R.id.r1);
        RadioButton r14=(RadioButton)findViewById(R.id.r1);
        RadioButton r15=(RadioButton)findViewById(R.id.r1);
        RadioButton r16=(RadioButton)findViewById(R.id.r1);

        EditText area=(EditText)findViewById(R.id.editText12);


        final String ar=area.getText().toString().trim();
/*
        SharedPreferences spf0=  getApplicationContext().getSharedPreferences("ab0",getApplicationContext().MODE_PRIVATE);
        SharedPreferences.Editor editor0= spf0.edit();
        editor0.putString("area",ar);
        editor0.apply();
*/
        // Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        //intent.putExtra("message", ar);
        //startActivity(intent);


        Button b1=(Button)findViewById(R.id.b1);


        b1.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
// Toast.makeText(abcd.this,"DSA",Toast.LENGTH_LONG).show();
                                      int selectedId = rg.getCheckedRadioButtonId();
                                      Log.i("paras",""+selectedId);
                                      if(selectedId==2131427424)
                                      {
                                          SharedPreferences spf=  getApplicationContext().getSharedPreferences("ab",getApplicationContext().MODE_PRIVATE);
                                          SharedPreferences.Editor editor= spf.edit();
                                          editor.putString("counter","1");
                                          editor.apply();
                                          Intent nextScree = new Intent(getApplicationContext(), Main2Activity.class);
                                          //nextScree.putExtra("message", ar);

                                          startActivity(nextScree);
                                      }
                                      if(selectedId==2131427425)
                                      {
                                          SharedPreferences spf=  getApplicationContext().getSharedPreferences("ab",getApplicationContext().MODE_PRIVATE);
                                          SharedPreferences.Editor editor= spf.edit();
                                          editor.putString("counter","2");
                                          editor.apply();
                                          Intent nextScree = new Intent(getApplicationContext(), Main2Activity.class);
                                          startActivity(nextScree);
                                      }
                                      if(selectedId==2131427426)
                                      {
                                          SharedPreferences spf=  getApplicationContext().getSharedPreferences("ab",getApplicationContext().MODE_PRIVATE);
                                          SharedPreferences.Editor editor= spf.edit();
                                          editor.putString("counter","3");
                                          editor.apply();
                                          Intent nextScree = new Intent(getApplicationContext(), Main2Activity.class);
                                          startActivity(nextScree);
                                      }
                                      if(selectedId==2131427427)
                                      {SharedPreferences spf=  getApplicationContext().getSharedPreferences("ab",getApplicationContext().MODE_PRIVATE);
                                          SharedPreferences.Editor editor= spf.edit();
                                          editor.putString("counter","4");
                                          editor.apply();
                                          Intent nextScree = new Intent(getApplicationContext(), Main2Activity.class);
                                          startActivity(nextScree);
                                      }
                                      if(selectedId==2131427428)
                                      {
                                          SharedPreferences spf=  getApplicationContext().getSharedPreferences("ab",getApplicationContext().MODE_PRIVATE);
                                          SharedPreferences.Editor editor= spf.edit();
                                          editor.putString("counter","5");
                                          editor.apply();
                                          Intent nextScree = new Intent(getApplicationContext(), Main2Activity.class);
                                          startActivity(nextScree);
                                      }
                                      if(selectedId==2131427429)
                                      {
                                          SharedPreferences spf=  getApplicationContext().getSharedPreferences("ab",getApplicationContext().MODE_PRIVATE);
                                          SharedPreferences.Editor editor= spf.edit();
                                          editor.putString("counter","6");
                                          editor.apply();
                                          Intent nextScree = new Intent(getApplicationContext(), Main2Activity.class);
                                          startActivity(nextScree);
                                      }
                                      if(selectedId==2131427430)
                                      {
                                          SharedPreferences spf=  getApplicationContext().getSharedPreferences("ab",getApplicationContext().MODE_PRIVATE);
                                          SharedPreferences.Editor editor= spf.edit();
                                          editor.putString("counter","7");
                                          editor.apply();
                                          Intent nextScree = new Intent(getApplicationContext(), Main2Activity.class);
                                          startActivity(nextScree);
                                      }
                                      if(selectedId==2131427431)
                                      {
                                          SharedPreferences spf=  getApplicationContext().getSharedPreferences("ab",getApplicationContext().MODE_PRIVATE);
                                          SharedPreferences.Editor editor= spf.edit();
                                          editor.putString("counter","8");
                                          editor.apply();
                                          Intent nextScree = new Intent(getApplicationContext(), Main2Activity.class);
                                          startActivity(nextScree);
                                      }
                                      if(selectedId==2131427432)
                                      {
                                          SharedPreferences spf=  getApplicationContext().getSharedPreferences("ab",getApplicationContext().MODE_PRIVATE);
                                          SharedPreferences.Editor editor= spf.edit();
                                          editor.putString("counter","9");
                                          editor.apply();
                                          Intent nextScree = new Intent(getApplicationContext(), Main2Activity.class);
                                          startActivity(nextScree);
                                      }
                                      if(selectedId==2131427433)
                                      {
                                          SharedPreferences spf=  getApplicationContext().getSharedPreferences("ab",getApplicationContext().MODE_PRIVATE);
                                          SharedPreferences.Editor editor= spf.edit();
                                          editor.putString("counter","10");
                                          editor.apply();
                                          Intent nextScree = new Intent(getApplicationContext(), Main2Activity.class);
                                          startActivity(nextScree);
                                      }
                                      if(selectedId==2131427434)
                                      {
                                          SharedPreferences spf=  getApplicationContext().getSharedPreferences("ab",getApplicationContext().MODE_PRIVATE);
                                          SharedPreferences.Editor editor= spf.edit();
                                          editor.putString("counter","11");
                                          editor.apply();
                                          Intent nextScree = new Intent(getApplicationContext(), Main2Activity.class);
                                          startActivity(nextScree);
                                      }
                                      if(selectedId==2131427435)
                                      {
                                          SharedPreferences spf=  getApplicationContext().getSharedPreferences("ab",getApplicationContext().MODE_PRIVATE);
                                          SharedPreferences.Editor editor= spf.edit();
                                          editor.putString("counter","12");
                                          editor.apply();
                                          Intent nextScree = new Intent(getApplicationContext(), Main2Activity.class);
                                          startActivity(nextScree);
                                      }
                                      if(selectedId==2131427436)
                                      {SharedPreferences spf=  getApplicationContext().getSharedPreferences("ab",getApplicationContext().MODE_PRIVATE);
                                          SharedPreferences.Editor editor= spf.edit();
                                          editor.putString("counter","13");
                                          editor.apply();
                                          Intent nextScree = new Intent(getApplicationContext(), Main2Activity.class);
                                          startActivity(nextScree);
                                      }
                                      if(selectedId==2131427437)
                                      {
                                          SharedPreferences spf=  getApplicationContext().getSharedPreferences("ab",getApplicationContext().MODE_PRIVATE);
                                          SharedPreferences.Editor editor= spf.edit();
                                          editor.putString("counter","14");
                                          editor.apply();
                                          Intent nextScree = new Intent(getApplicationContext(), Main2Activity.class);
                                          startActivity(nextScree);
                                      }
                                      if(selectedId==2131427438)
                                      {
                                          SharedPreferences spf=  getApplicationContext().getSharedPreferences("ab",getApplicationContext().MODE_PRIVATE);
                                          SharedPreferences.Editor editor= spf.edit();
                                          editor.putString("counter","15");
                                          editor.apply();
                                          Intent nextScree = new Intent(getApplicationContext(), Main2Activity.class);
                                          startActivity(nextScree);
                                      }
                                      if(selectedId==2131427439)
                                      {
                                          SharedPreferences spf=  getApplicationContext().getSharedPreferences("ab",getApplicationContext().MODE_PRIVATE);
                                          SharedPreferences.Editor editor= spf.edit();
                                          editor.putString("counter","16");
                                          editor.apply();
                                          Intent nextScree = new Intent(getApplicationContext(), Main2Activity.class);
                                          startActivity(nextScree);
                                      }



                                  }
                              }
        );



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

  /*  @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/
}
