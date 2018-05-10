package com.example.li.demo1;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

@SuppressLint("ValidFragment")
public class MyFragment extends Fragment {

    private String content;
    @SuppressLint("ValidFragment")
    public MyFragment(String content){
        this.content = content;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_my_fragment,container,false);
        TextView txt_content = (TextView)view.findViewById(R.id.txt_content);
        txt_content.setText(content);
        return view;
    }
}
