package com.example.ripan.demolistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {

    Context mContext;
    LayoutInflater mLayoutInflater;

    int img[]={R.drawable.arntflag,R.drawable.brzlflag,R.drawable.gerflag,R.drawable.indflag,R.drawable.porflag};
    String name[]={"AGENTINA","BRAZIL","GERMANY","INDIA","PORTUGAL"};

    public MyAdapter(Context mContext, int[] img, String[] name) {
        this.mContext = mContext;
        this.img = img;
        this.name = name;
        mLayoutInflater=LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return img.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view==null){
            view=mLayoutInflater.inflate(R.layout.row,viewGroup,false);
        }
        ImageView rowIv=(ImageView)view.findViewById(R.id.rowImg_iv);
        TextView rowTv=(TextView)view.findViewById(R.id.rowFlag_tv);
        rowIv.setImageResource(img[i]);
        rowTv.setText(name[i]);
        return view;
    }
}
