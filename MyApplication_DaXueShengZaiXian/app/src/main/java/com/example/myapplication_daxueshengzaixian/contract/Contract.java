package com.example.myapplication_daxueshengzaixian.contract;


import com.example.myapplication_daxueshengzaixian.base.BaseModel;
import com.example.myapplication_daxueshengzaixian.base.BasePresenter;
import com.example.myapplication_daxueshengzaixian.base.BaseView;

/**
 * Created by 齐天大圣 on 2017/11/20.
 */
public class Contract {

    public interface View extends BaseView {
      void show(String ss);
    }

    interface Model extends BaseModel {
        void getDataFromNer(String url, CallBacks callBacks);

    }

    abstract static class Presenter extends BasePresenter<Model, View> {

        @Override
        public void onStart() {

        }
        public abstract void getDataFromModel(String url);
        
    }
}