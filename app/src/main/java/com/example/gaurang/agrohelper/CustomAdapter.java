package com.example.gaurang.agrohelper;


 import android.content.Context;
 import android.view.View;
 import android.view.ViewGroup;
 import android.view.LayoutInflater;
 import android.widget.*;

 import com.firebase.client.ChildEventListener;
 import com.firebase.client.DataSnapshot;
 import com.firebase.client.Firebase;


class CustomAdapter extends ArrayAdapter<String>{





 public CustomAdapter(Context context, String[] arr1) {

 super(context,R.layout.custom_listview ,arr1);
 }

 @Override
 public View getView(int position, View convertView, ViewGroup parent) {
 LayoutInflater pinflater=LayoutInflater.from(getContext());
 View customview=pinflater.inflate(R.layout.custom_listview,parent,false);



 TextView t1=(TextView)customview.findViewById(R.id.t1);
 TextView t2=(TextView)customview.findViewById(R.id.textView);
 TextView t3=(TextView)customview.findViewById(R.id.textView2);
  TextView t4=(TextView)customview.findViewById(R.id.textView3);


  t1.setText(farmerafterlogin.arr1[position]);
 t2.setText(farmerafterlogin.arr2[position]);
 t3.setText(farmerafterlogin.arr3[position]);
  t4.setText(farmerafterlogin.arr4[position]);
 return customview;

 }
 }
