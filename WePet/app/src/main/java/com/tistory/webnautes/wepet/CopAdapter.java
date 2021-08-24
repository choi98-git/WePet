package com.tistory.webnautes.wepet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class CopAdapter extends BaseAdapter {
    private Context mContext = null;
    private int layout = 0;
    private ArrayList<CopInfor> data = null;
    private LayoutInflater inflater = null;

    public CopAdapter(Context c, int l, ArrayList<CopInfor> f) {
        this.mContext = c;
        this.layout = l;
        this.data = f;
        this.inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return data;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub

        if(convertView == null) {
            convertView = inflater.inflate(this.layout, parent, false);
        }
        ImageView Co_image = (ImageView) convertView.findViewById(R.id.infor_image);
        TextView Co_information = (TextView) convertView.findViewById(R.id.infor_text);
        TextView Co_date = (TextView) convertView.findViewById(R.id.infor_text2);

        Co_image.setImageBitmap(data.get(position).image);
        Co_information.setText(data.get(position).information);
        Co_date.setText(data.get(position).date);


        return convertView;
    }
}