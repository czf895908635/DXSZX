package com.example.myapplication_daxueshengzaixian.base;

/******************************************
 * 类名称：BasePresenter
 * 类描述：
 *
 * @version: 1.0
 * @author: chj
 * @time: 2017/11/17
 * @email: chj294671171@126.com
 * @github: https://github.com/cngmsy
 ******************************************/
public abstract  class BasePresenter<M, V> {
    public M baseModel;
    public V baseView;
    public void setVM(M m,V v){
        baseModel=m;
        baseView=v;
        this.onStart();
    }

    public abstract void onStart();
    
}
