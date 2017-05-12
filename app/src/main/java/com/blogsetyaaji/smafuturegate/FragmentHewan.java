package com.blogsetyaaji.smafuturegate;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentHewan extends Fragment {


    public FragmentHewan() {
        // Required empty public constructor
    }

    private String[] hewan = {"Bebek", "Gajah", "Harimau", "Kucing", "Kuda"};
    private Integer[] gamabar = {R.drawable.bebek, R.drawable.gajah, R.drawable.harimau, R.drawable.kucing, R.drawable.kuda};
    private ListView lvhewan;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // return inflater.inflate(R.layout.fragment_fragment_hewan, container, false);
        View view = inflater.inflate(R.layout.fragment_fragment_hewan, null);

        lvhewan = (ListView) view.findViewById(R.id.lvhewan);

        CustomAdapter customAdapter = new CustomAdapter(getActivity(), hewan, gamabar);
        lvhewan.setAdapter(customAdapter);

        return view;
    }

}
