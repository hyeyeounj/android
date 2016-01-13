package net.balbum.hello;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by hyes on 2016. 1. 13..
 */
public class SubFragment2 extends Fragment {

    //fragment는 뷰가 아님, 뭔지 모르는 애, 굳이 말하면 걍 container

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup view = (ViewGroup) inflater.inflate(R.layout.sub_layout2, container, false);
        return view;
    }
}
