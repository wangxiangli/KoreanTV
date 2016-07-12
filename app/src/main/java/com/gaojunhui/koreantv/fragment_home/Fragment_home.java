package com.gaojunhui.koreantv.fragment_home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gaojunhui.koreantv.BaseFragmen;
import com.gaojunhui.koreantv.R;
import com.gaojunhui.koreantv.fragment_home.fragment_home_adapter.Myadapter_fragment;
import com.gaojunhui.koreantv.fragment_home.fragment_movie.Fragment_movie;
import com.gaojunhui.koreantv.fragment_home.fragment_mv.Fragment_mv;
import com.gaojunhui.koreantv.fragment_home.fragment_news.Fragment_news;
import com.gaojunhui.koreantv.fragment_home.fragment_recommend.Fragment_recommend;
import com.gaojunhui.koreantv.fragment_home.fragment_tv.Fragment_tv;
import com.gaojunhui.koreantv.fragment_home.fragment_variety.Fragment_variety;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by Administrator on 2016/7/11.
 */
public class Fragment_home extends BaseFragmen implements Fragment_home_contract.View {
    @InjectView(R.id.toolbar_home)
    Toolbar toolbarHome;
    @InjectView(R.id.tablelayout)
    TabLayout tablelayout;
    @InjectView(R.id.viewPager_home)
    ViewPager viewPagerHome;
    private View view;
    private Fragment fragment_recommend,fragment_tv,fragment_movie,fragment_variety,fragment_mv,fragment_news;
    private List<Fragment> fragments=new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = LayoutInflater.from(getActivity()).inflate(R.layout.fragment_home, null);
        ButterKnife.inject(this, view);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbarHome);
        setHasOptionsMenu(true);//
        addFragmens();
        Myadapter_fragment myadapter_fragment=new Myadapter_fragment(getActivity().getSupportFragmentManager(),fragments);
        viewPagerHome.setAdapter(myadapter_fragment);
        tablelayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        tablelayout.setupWithViewPager(viewPagerHome);

        return view;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        menu.clear();
        inflater.inflate(R.menu.toolbar_home_menu, menu);
    }

    /**
     * 填充fragments集合
     */
    public void addFragmens(){
        fragment_recommend=new Fragment_recommend();
        fragment_tv=new Fragment_tv();
        fragment_movie=new Fragment_movie();
        fragment_variety=new Fragment_variety();
        fragment_mv=new Fragment_mv();
        fragment_news=new Fragment_news();

        fragments.add(fragment_recommend);
        fragments.add(fragment_tv);
        fragments.add(fragment_movie);
        fragments.add(fragment_variety);
        fragments.add(fragment_mv);
        fragments.add(fragment_news);
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.reset(this);
    }
}
