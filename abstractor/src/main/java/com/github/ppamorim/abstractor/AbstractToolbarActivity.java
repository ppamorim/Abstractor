package com.github.ppamorim.abstractor;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import butterknife.ButterKnife;

public abstract class AbstractToolbarActivity extends AbstractActivity {

  private Toolbar toolbar;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    toolbar = ButterKnife.findById(this, getToolbarId());
    ToolbarUtil.config(
        this,
        toolbar,
        getToolbarTitle(),
        getHomeButtonEnabled(),
        getDisplayHomeButtonAsUpEnabled());
  }

  @Override public boolean onOptionsItemSelected(MenuItem item) {
    switch (item.getItemId()) {
      case android.R.id.home:
        onBackPressed();
        return true;
      default:
        return super.onOptionsItemSelected(item);
    }
  }

  public Toolbar getToolbar() {
    return toolbar;
  }

  protected abstract int getToolbarId();
  protected abstract boolean getHomeButtonEnabled();
  protected abstract boolean getDisplayHomeButtonAsUpEnabled();
  protected abstract String getToolbarTitle();

}
