package com.example.myapplication_daxueshengzaixian;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.example.myapplication_daxueshengzaixian.app.App;
import com.example.myapplication_daxueshengzaixian.base.BaseFrament;


/**
 * Created by 齐天大圣 on 2017/11/27.
 */
public class FramentBuilder {
    private static volatile FramentBuilder framentBuilder;
    private FragmentManager fragmentManager;
    private FragmentTransaction transaction;
    private Fragment fragment;
    private BaseFrament baseFrament;
    public FramentBuilder(){

    }
    public static FramentBuilder getbaseFrament(){
        if(framentBuilder==null){
            synchronized (FramentBuilder.class){
                framentBuilder=new FramentBuilder();
            }
        }
        return framentBuilder;
    }
    public FramentBuilder init(){
        fragmentManager = App.baseActivity.getSupportFragmentManager();
        transaction = fragmentManager.beginTransaction();
        return this;
    }



    public FramentBuilder add(int containerId, Class<? extends BaseFrament> fragmentclass){
        String tag = fragmentclass.getSimpleName();
        fragment = fragmentManager.findFragmentByTag(tag);
        if(fragment ==null){
            try {
                fragment =fragmentclass.newInstance();
                transaction.add(containerId,fragment,tag);
                transaction.addToBackStack(tag);
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }


        }
        if(App.mframent!=null){
            transaction.hide(App.mframent);

        }

        transaction.show(fragment);
        return this;

    }
    public void Builder(){
        App.mframent= (BaseFrament) fragment;
        transaction.commit();
    }
}
