package com.example.myapplication_daxueshengzaixian;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;
import com.example.myapplication_daxueshengzaixian.adapter.ViewPagerAdapter;
import com.example.myapplication_daxueshengzaixian.base.BaseActivity;
import com.example.myapplication_daxueshengzaixian.contract.Model;
import com.example.myapplication_daxueshengzaixian.contract.Presenter;
import com.example.myapplication_daxueshengzaixian.frament.HuoDong;
import com.example.myapplication_daxueshengzaixian.frament.JiuYe;
import com.example.myapplication_daxueshengzaixian.frament.KeTang;
import com.example.myapplication_daxueshengzaixian.frament.ToutiaoFrament;
import com.example.myapplication_daxueshengzaixian.frament.XiaiYuanFrament;
import com.example.myapplication_daxueshengzaixian.frament.YiJieYiTuiXuan;
import java.util.ArrayList;
public class MainActivity extends BaseActivity<Presenter,Model> {

    private Button button;
    private ViewPager viewPager;
    private ViewPagerAdapter viewPagerAdapter;
    private HuoDong huoDong;
    private JiuYe jiuYe;
    private KeTang keTang;
    private ToutiaoFrament toutiaoFrament;
    private XiaiYuanFrament xiaiYuanFrament;
    private YiJieYiTuiXuan yiJieYiTuiXuan;
    private ArrayList<Fragment> list = new ArrayList<>();
    private TabLayout tabLayout;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }
    @Override
    public void initView() {

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        tabLayout = (TabLayout) findViewById(R.id.table_one);
        button = (Button) findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,BiaoQianActivity.class);
                startActivity(intent);
            }
        });
        TabLayout();
        initDate();
        ListView_init();
        adaPter();
        initGet();
    }

    private void initGet() {
        tabLayout.getTabAt(0).setText("头条");
        tabLayout.getTabAt(1).setText("校园");
        tabLayout.getTabAt(2).setText("一节一推选");
        tabLayout.getTabAt(3).setText("活动");
        tabLayout.getTabAt(4).setText("就业");
        tabLayout.getTabAt(5).setText("课堂");
    }

    private void adaPter() {
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(),list);
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void ListView_init() {
        list.add(huoDong);
        list.add(jiuYe);
        list.add(keTang);
        list.add(toutiaoFrament);
        list.add(xiaiYuanFrament);
        list.add(yiJieYiTuiXuan);
    }

    private void initDate() {
        huoDong = new HuoDong();
        jiuYe = new JiuYe();
        keTang = new KeTang();
        toutiaoFrament = new ToutiaoFrament();
        xiaiYuanFrament = new XiaiYuanFrament();
        yiJieYiTuiXuan = new YiJieYiTuiXuan();
    }

    private void TabLayout() {
        tabLayout.addTab(tabLayout.newTab().setText("头条"));
        tabLayout.addTab(tabLayout.newTab().setText("校园"));
        tabLayout.addTab(tabLayout.newTab().setText("一节一推选"));
        tabLayout.addTab(tabLayout.newTab().setText("活动"));
        tabLayout.addTab(tabLayout.newTab().setText("就业"));
        tabLayout.addTab(tabLayout.newTab().setText("课堂"));
    }
}
