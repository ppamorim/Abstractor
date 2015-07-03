package com.github.ppamorim.abstractor;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.Window;
import butterknife.ButterKnife;

public abstract class AbstractDialogFragment extends DialogFragment {

  @Override public Dialog onCreateDialog(Bundle savedInstanceState) {
    Dialog dialog = new Dialog(getActivity(), R.style.DialogTransparent);
    dialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
    View view = getActivity().getLayoutInflater().inflate(getLayoutId(), null, false);
    ButterKnife.bind(this, view);
    dialog.setContentView(view);
    bind(view);
    return dialog;
  }

  @Override public void show(FragmentManager manager, String tag) {
    FragmentTransaction ft = manager.beginTransaction();
    ft.add(this, tag);
    ft.commitAllowingStateLoss();
  }

  protected abstract int getLayoutId();
  protected abstract void bind(View view);

}

