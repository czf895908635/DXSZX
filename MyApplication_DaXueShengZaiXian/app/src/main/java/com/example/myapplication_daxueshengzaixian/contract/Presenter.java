package com.example.myapplication_daxueshengzaixian.contract;

/**
* Created by TMVPHelper on 2017/11/20
*/
public class Presenter extends Contract.Presenter{

    @Override
    public void getDataFromModel(String url) {
        baseModel.getDataFromNer(url, new CallBacks() {
            @Override
            public void succ(String result) {
                baseView.show(result);
            }
        });
    }
}