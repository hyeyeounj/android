package net.balbum.hello;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

/**
 * Created by hyes on 2016. 1. 13..
 */
public class SubLayout extends LinearLayout {


    public SubLayout(Context context) {
        super(context);
        init(context);
    }

    public SubLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.sub_layout, this, true);
        //true를 붙이면 바로 붙임
    }

}
