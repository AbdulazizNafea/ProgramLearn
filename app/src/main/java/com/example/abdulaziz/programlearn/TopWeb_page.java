package com.example.abdulaziz.programlearn;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TopWeb_page extends AppCompatActivity
{

    Button b1,b11,b2,b22,b3,b33,b4,b44;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_web_page);


        b1=findViewById(R.id.b1);
        b11=findViewById(R.id.b11);
        b2=findViewById(R.id.b2);
        b22=findViewById(R.id.b22);
        b3=findViewById(R.id.b3);
        b33=findViewById(R.id.b33);
        b4=findViewById(R.id.b4);
        b44=findViewById(R.id.b44);


        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://stackoverflow.com/"));
                startActivity(intent);
            }
        });

        b11.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://developers.google.com/"));
                startActivity(intent);
            }
        });


        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://github.com/"));
                startActivity(intent);
            }
        });


        b22.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.codeproject.com/"));
                startActivity(intent);
            }
        });


        b3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.quora.com/"));
                startActivity(intent);
            }
        });


        b33.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://groups.google.com/forum/#!overview"));
                startActivity(intent);
            }
        });



        b4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://stackexchange.com/"));
                startActivity(intent);
            }
        });



        b44.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://stackshare.io/"));
                startActivity(intent);
            }
        });

    }
}
