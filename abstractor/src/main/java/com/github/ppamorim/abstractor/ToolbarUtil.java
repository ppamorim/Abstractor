package com.github.ppamorim.abstractor;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class ToolbarUtil {

  public static void config(AppCompatActivity appCompatActivity, Toolbar toolbar,
      String title, boolean homeButtonEnabled, boolean displayHomeButtonAsUpEnabled) {
    if (toolbar == null || appCompatActivity == null) {
      throw new IllegalStateException("toolbar or appCompatActivity is null");
    }
    if (title != null) {
      toolbar.setTitle(title);
    }
    appCompatActivity.setSupportActionBar(toolbar);
    ActionBar actionBar = appCompatActivity.getSupportActionBar();
    if (actionBar == null) {
      return;
    }
    actionBar.setHomeButtonEnabled(homeButtonEnabled);
    actionBar.setDisplayHomeAsUpEnabled(displayHomeButtonAsUpEnabled);
  }

}
