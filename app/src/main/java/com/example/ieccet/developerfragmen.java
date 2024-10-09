package com.example.ieccet;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.credentials.CreateCredentialException;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
public class developerfragmen extends Fragment {
    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        TextView textView,textView1,textView2,textView3,textView4;
//        ImageView imageView;
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_developerfragmen, container, false);
        textView=view.findViewById(R.id.linkedin);
        textView1=view.findViewById(R.id.github);
        textView2=view.findViewById(R.id.whatsapp);
        textView3=view.findViewById(R.id.email);
        textView4=view.findViewById(R.id.contact);
//        imageView=view.findViewById(R.id.camera);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setType("text/plain");
                intent.setData(Uri.parse("https://www.linkedin.com/in/rahul-singh-769438220/"));
                startActivity(intent);
            }
        });
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://github.com/rah-uls"));
                startActivity(intent);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("smsto:"+Uri.encode("+917880741600")));
                startActivity(intent);
            }
        });
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("message/rfc822");
                intent.putExtra(Intent.EXTRA_EMAIL,new String[]{"rs9110719@gmail.com"});
                startActivity(Intent.createChooser(intent, "Share Via:- "));
            }
        });
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: +917880741600"));
                startActivity(intent);
            }
        });
//        imageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//                startActivity(intent);
//            }
//        });
        return view;
    }
}