package com.example.myapplication_daxueshengzaixian.frament;

import android.view.View;

import com.example.myapplication_daxueshengzaixian.R;
import com.example.myapplication_daxueshengzaixian.base.BaseFrament;
import com.example.myapplication_daxueshengzaixian.contract.Contract;
import com.example.myapplication_daxueshengzaixian.contract.Model;
import com.example.myapplication_daxueshengzaixian.contract.Presenter;

/**
 * Created by 齐天大圣 on 2017/11/27.
 */
public class YiJieYiTuiXuan extends BaseFrament<Presenter,Model> implements Contract.View {
    private String url="http://mapi.univs.cn/mobile/index.php?app=mobile&type=mobile&catid=14&controller=content&action=index&page=0&time=0";


    @Override
    protected void initDate() {

    }

    @Override
    protected void initView(View view) {

    }

    @Override
    public int getLayoutId() {
        return R.layout.yijieyituixuanframent;
    }

    @Override
    public void show(String ss) {

    }
}
