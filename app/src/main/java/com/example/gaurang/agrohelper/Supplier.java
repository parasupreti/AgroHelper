package com.example.gaurang.agrohelper;

import android.app.ProgressDialog;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.firebase.client.ChildEventListener;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.Transaction;
import com.firebase.client.ValueEventListener;

public class Supplier extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_supplier);
        Firebase.setAndroidContext(Supplier.this);

    /*    Firebase ref = new Firebase("https://agrohelper1.firebaseio.com/supp");

                ref.addChildEventListener(new ChildEventListener() {

            @Override
            public void onChildAdded(DataSnapshot snapshot, String previousChildKey) {

             Data post = snapshot.getValue(Data.class);

               post.getaddress();
               post.getname();
               post.getphoneno();
               post.getprice();

                arr1[i]=post.getaddress();
                arr2[i]=post.getname();
                arr3[i]=post.getphoneno();

                Toast.makeText(getApplicationContext(), ""+arr1[i] , Toast.LENGTH_LONG).show();

                i++;
            }



                    @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {


            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {
                System.out.println("The read failed: " + firebaseError.getMessage());
            }
        });



        Thread closeActivity = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                    // Do some stuff
                } catch (Exception e) {
                    e.getLocalizedMessage();
                }
            }
        });
*/


        ListAdapter ladapter=new CustomAdapter(this,farmerafterlogin.arr1);
        ListView l1=(ListView)findViewById(R.id.listView);
        l1.setAdapter(ladapter);

        l1.setOnItemClickListener(
                new AdapterView.OnItemClickListener(){
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                        String alphabets=String.valueOf(parent.getItemAtPosition(position));
                       // Toast.makeText(MainActivity.this,alphabets,Toast.LENGTH_LONG).show();

                    }
                }
        );




/*
        //Adding values
        alu1.setName(
                "पारस");
        alu1.setPhoneno(
                "9818796334"
        );
        alu1.setAddress("मेरठ");
        alu1.setPrice("40");



        //Storing values to firebase
        ref.child("3").setValue(alu1);
        alu1.setName(

                        "नमन");
        alu1.setPhoneno(
                "9643283142"
        );
        alu1.setAddress("सहारनपुर");
        alu1.setPrice("175");
        ref.child("4").setValue(alu1);
*/





    }
}
