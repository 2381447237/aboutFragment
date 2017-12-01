package com.youli.testfragmentandvp2017_10_13;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

import com.youli.testfragmentandvp2017_10_13.fragment.FragmentSecondOne;
import com.youli.testfragmentandvp2017_10_13.fragment.FragmentSecondThree;
import com.youli.testfragmentandvp2017_10_13.fragment.FragmentSecondTwo;

/**
 * 作者: zhengbin on 2017/11/20.
 * <p>
 * 邮箱:2381447237@qq.com
 * <p>
 * github:2381447237
 */

public class SecondActivity extends FragmentActivity {


    private FragmentManager fm=this.getSupportFragmentManager();

    private FragmentSecondOne oneF;
    private FragmentSecondThree threeF;
    private FragmentSecondTwo twoF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        oneF = new FragmentSecondOne();
        twoF = new FragmentSecondTwo();
        threeF = new FragmentSecondThree();
        fm.beginTransaction()
                .add(R.id.mainfl, oneF)
                .add(R.id.mainfl, twoF)
                .add(R.id.mainfl, threeF)
                .commit();
        fm.beginTransaction().hide(threeF).hide(twoF).show(oneF).commit();

    }

    public void onChange(View v){

        switch (v.getId()) {

            case R.id.rb_one:
                fm.beginTransaction().hide(threeF).hide(twoF).show(oneF).commit();
                break;
            case R.id.rb_two:
                fm.beginTransaction().hide(threeF).hide(oneF).show(twoF).commit();
                break;
            case R.id.rb_three:
                fm.beginTransaction().show(threeF).hide(twoF).hide(oneF).commit();
                break;
        }

    }
    @Override
    public void onBackPressed() {
        finish();
    }
}
