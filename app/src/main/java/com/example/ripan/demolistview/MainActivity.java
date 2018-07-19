package com.example.ripan.demolistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView mMyList;
    int img[]={R.drawable.arntflag,R.drawable.brzlflag,R.drawable.gerflag,R.drawable.indflag,R.drawable.porflag};
    String name[]={"AGENTINA","BRAZIL","GERMANY","INDIA","PORTUGAL"};
    private MyAdapter mMyAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMyList=(ListView)findViewById(R.id.myList);

        mMyAdapter=new MyAdapter(this,img,name);

        mMyList.setAdapter(mMyAdapter);

        mMyList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent i=new Intent(MainActivity.this,Details.class);
                i.putExtra("POSITON",position);
                startActivity(i);
            }
        });

    }
}