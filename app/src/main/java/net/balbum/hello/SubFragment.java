package net.balbum.hello;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by hyes on 2016. 1. 13..
 */
public class SubFragment extends Fragment {

    //fragment는 뷰가 아님

    public interface FragmentChangedCallback{
        void onFragmentChanged(int position);
    }

    FragmentChangedCallback callback;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup view = (ViewGroup) inflater.inflate(R.layout.sub_layout, container, false);
        //바로 붙여주지 마! fragment는 view가 아니니까
        Button btn = (Button)view.findViewById(R.id.button_sub1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                MainActivity activity = (MainActivity)getActivity();
//                다른 activity에서 부르면 난리나지 ㅋㅋㅋㅋㅋ

//                Activity activity = getActivity();
//                if(activity instanceof MainActivity || activity instanceof ManuActivity || ....)
//                activity.onFragmentChanged(1);
//                이런식으로 사용하면 재사용성이 떨어지니까 문제가 생김!
//                제대로 하려면 interface를 작성한 후 activity에서 implement해서 할 것!!

                callback.onFragmentChanged(1);
            }
        });
        return view;
    }

    @Override
    public void onAttach(Activity activity) {

        callback = (FragmentChangedCallback) getActivity();
        super.onAttach(activity);
        //이때 activity를 알 수 있음
    }
}
