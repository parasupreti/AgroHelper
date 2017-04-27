package com.example.gaurang.agrohelper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.firebase.client.ChildEventListener;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class farmerafterlogin extends AppCompatActivity {
FirebaseAuth auth;
    FirebaseUser user;
    Button b;
    int i=0;
    static String[] arr1={"APPLE","BALL","CAT","DOG"};
    static   String[] arr2={"dsaE","BAdsaas","Cdas","Ddsa"};
    static
    String[] arr3={"dassaE","dasdaCdas","Ddasdasa","sdsaasa"};
   static String[] arr4={"dassaE","dasdaCdas","Ddasdasa","sdsaasa"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farmerafterlogin);
        b = (Button) findViewById(R.id.button2);
        Firebase.setAndroidContext(farmerafterlogin.this);

        Firebase ref = new Firebase("https://agrohelper1.firebaseio.com/supp");

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
                arr4[i]=post.getprice();

               // Toast.makeText(getApplicationContext(), ""+arr1[i] , Toast.LENGTH_LONG).show();

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





    }
  public   void logout (View view)
        {
            FirebaseAuth.getInstance().signOut();
            finish();
            Intent nextScree = new Intent(getApplicationContext(), farmerlogin.class);
            startActivity(nextScree);

        }
    public   void chat (View view)
    {

        finish();
        Intent nextScree = new Intent(getApplicationContext(), chat.class);
        startActivity(nextScree);

    }
    public   void supp (View view)
    {

        finish();
        Intent nextScree = new Intent(getApplicationContext(), Supplier.class);
        startActivity(nextScree);

    }
    public   void meg (View view)
    {

        finish();
        Intent nextScree = new Intent(getApplicationContext(),abcd.class);
        startActivity(nextScree);

    }



}


