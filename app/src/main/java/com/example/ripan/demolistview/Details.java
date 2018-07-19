package com.example.ripan.demolistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Details extends AppCompatActivity {

    private ImageView mDetailsIv;
    private TextView mDetailsTv;
    int img[]={R.drawable.arntflag,R.drawable.brzlflag,R.drawable.gerflag,R.drawable.indflag,R.drawable.porflag};
    String name[]={"AGENTINA","BRAZIL","GERMANY","INDIA","PORTUGAL"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        mDetailsIv=(ImageView)findViewById(R.id.details_iv);
        mDetailsTv=(TextView)findViewById(R.id.details_tv);
        int position=getIntent().getIntExtra("POSITON",0);
        mDetailsIv.setImageResource(img[position]);
        mDetailsTv.setText(name[position]);
    }
}
