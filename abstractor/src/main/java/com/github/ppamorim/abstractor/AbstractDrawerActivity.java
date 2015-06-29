package com.github.ppamorim.abstractor;

import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;

public abstract class AbstractDrawerActivity extends AbstractToolbarActivity {

  @Override public boolean onOptionsItemSelected(MenuItem item) {
    return (getActionBarDrawerToggle() != null && getActionBarDrawerToggle().onOptionsItemSelected(item))
        || super.onOptionsItemSelected(item);
  }

  protected abstract ActionBarDrawerToggle getActionBarDrawerToggle();

}
