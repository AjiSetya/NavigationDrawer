package com.blogsetyaaji.smafuturegate;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by AJISETYA on 5/8/2017.
 */

class CustomAdapter extends BaseAdapter{

    private String[] hewan;
    private Integer[] gambar;
    private Activity activity;

    public CustomAdapter(Activity fragmentHewan, String[] hewan, Integer[] gamabar) {
        this.hewan = hewan;
        this.gambar = gamabar;
        activity = fragmentHewan;
    }

    @Override
    public int getCount() {
        return hewan.length;
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
        LayoutInflater inflater = (LayoutInflater)activity.getSystemService(activity
                .LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.list_hewan, null);

        TextView nama_hewan = (TextView) v.findViewById(R.id.txthewan);
        ImageView gambar_hewan = (ImageView) v.findViewById(R.id.imglist);

        // tampilkan data pada komponen
        nama_hewan.setText(hewan[i]);
        gambar_hewan.setImageResource(gambar[i]);

        return v;
    }
}
