package com.gaojunhui.koreantv.main;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.gaojunhui.koreantv.BaseActivity;
import com.gaojunhui.koreantv.R;
import com.gaojunhui.koreantv.fragment_cricle.Fragment_cricle;
import com.gaojunhui.koreantv.fragment_home.Fragment_home;
import com.gaojunhui.koreantv.fragment_mine.Fragment_mine;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class MainActivity extends BaseActivity implements MainContract.View {
    @InjectView(R.id.fragment_all)
    FrameLayout fragmentAll;
    @InjectView(R.id.radioButton_home)
    RadioButton radioButtonHome;
    @InjectView(R.id.radioButton_circle)
    RadioButton radioButtonCircle;
    @InjectView(R.id.radioButton_mine)
    RadioButton radioButtonMine;
    @InjectView(R.id.radioGroup_main)
    RadioGroup radioGroupMain;
    private FragmentManager manager;
    private static final int HOME=1;
    private static final int CIRCLE=2;
    private static final int MINE=3;
    private Fragment homeFragment;
    private Fragment cricleFragment;
    private Fragment mineFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        selectFragment(HOME);
    }

    /**
     * 选择创建Fragment
     * @param i
     */
    public void selectFragment(int i){
        FragmentManager manager=getSupportFragmentManager();
        FragmentTransaction transaction=manager.beginTransaction();
        hideFragment(transaction);
        switch (i){
            case HOME:
                if(homeFragment==null){
                    homeFragment=new Fragment_home();
                    transaction.add(R.id.fragment_all,homeFragment);
                }else {
                    transaction.show(homeFragment);
                }
                break;
            case CIRCLE:
                if(cricleFragment==null){
                    cricleFragment=new Fragment_cricle();
                    transaction.add(R.id.fragment_all,cricleFragment);
                }else {
                    transaction.show(cricleFragment);
                }
                break;
            case MINE:
                if(mineFragment==null){
                    mineFragment=new Fragment_mine();
                    transaction.add(R.id.fragment_all,mineFragment);
                }else {
                    transaction.show(mineFragment);
                }
                break;
        }
        transaction.commit();
    }

    /**
     * 隐藏Fragment
     * @param transaction
     */
    public void hideFragment(FragmentTransaction transaction){
        if(homeFragment!=null){
            transaction.hide(homeFragment);
        }
        if(cricleFragment!=null){
            transaction.hide(cricleFragment);
        }
        if(mineFragment!=null){
            transaction.hide(mineFragment);
        }
    }

    /**
     * 点击按钮跳转
     * @param view
     */
    @OnClick({R.id.radioButton_home, R.id.radioButton_circle, R.id.radioButton_mine})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.radioButton_home:
                selectFragment(HOME);
                break;
            case R.id.radioButton_circle:
                selectFragment(CIRCLE);
                break;
            case R.id.radioButton_mine:
                selectFragment(MINE);
                break;
        }
    }
}
