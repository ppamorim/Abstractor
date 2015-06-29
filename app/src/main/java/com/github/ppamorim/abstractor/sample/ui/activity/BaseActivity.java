package com.github.ppamorim.abstractor.sample.ui.activity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import butterknife.Bind;
import com.github.ppamorim.abstractor.AbstractToolbarActivity;
import com.github.ppamorim.abstractor.sample.R;
import com.github.ppamorim.abstractor.sample.ui.fragment.BaseFragment;
import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

public class BaseActivity extends AbstractToolbarActivity {

  @Bind(R.id.smart_tab_layout) SmartTabLayout smartTabLayout;
  @Bind(R.id.view_pager) ViewPager viewPager;

  @Override protected int getLayoutId() {
    return R.layout.activity_base;
  }

  @Override protected int getToolbarId() {
    return R.id.toolbar;
  }

  @Override protected String getToolbarTitle() {
    return getResources().getString(R.string.app_name);
  }

  @Override protected boolean getHomeButtonEnabled() {
    return true;
  }

  @Override protected boolean getDisplayHomeButtonAsUpEnabled() {
    return true;
  }

  @Override protected void onPostCreate(Bundle savedInstanceState) {
    super.onPostCreate(savedInstanceState);
    configViewPager();
  }

  private void configViewPager() {
    FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(
        getSupportFragmentManager(), FragmentPagerItems.with(this)
        .add(R.string.tab_1, BaseFragment.class)
        .add(R.string.tab_2, BaseFragment.class)
        .add(R.string.tab_3, BaseFragment.class)
        .add(R.string.tab_4, BaseFragment.class)
        .create());
    viewPager.setAdapter(adapter);
    smartTabLayout.setViewPager(viewPager);
  }

}
