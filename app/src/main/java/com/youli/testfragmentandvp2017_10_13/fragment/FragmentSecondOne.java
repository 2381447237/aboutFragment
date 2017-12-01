package com.youli.testfragmentandvp2017_10_13.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.youli.testfragmentandvp2017_10_13.R;
import com.youli.testfragmentandvp2017_10_13.adapter.LvAdapter;
import com.youli.testfragmentandvp2017_10_13.entity.Content;

/**
 * 作者: zhengbin on 2017/11/20.
 * <p>
 * 邮箱:2381447237@qq.com
 * <p>
 * github:2381447237
 */

public class FragmentSecondOne extends MyBaseFragment{

    private View contentView;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        isFirst=true;//如果是第一个fragment就给它赋值true，其他的fragment不用管这个变量

        contentView=LayoutInflater.from(getContext()).inflate(R.layout.fragment_second_one,container,false);


        return contentView;
    }

    @Override
    protected void loadData() {
        Log.e("2017/11/24","2017/11/24 fragmentOne");
    }












}
