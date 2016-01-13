package net.balbum.hello;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements SubFragment.FragmentChangedCallback{
    SubFragment fragment;
    SubFragment2 fragment2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);  
        setContentView(R.layout.main);

        fragment = new SubFragment();
        fragment2 = new SubFragment2();
        //new로 생긴 이 객체는 fragment가 아님 add등이 되면서 activity를 가지면서 비로소.

        getSupportFragmentManager().beginTransaction().add(R.id.container, fragment).commit();

//        FrameLayout container = (FrameLayout)findViewById(R.id.container);
//        SubLayout layout = new SubLayout(this);
//        container.addView(layout);

    }

    public void onFragmentChanged(int position){
        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment2).commit();
    }

}