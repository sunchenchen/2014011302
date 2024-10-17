package com.p1.mobile.putong.core.holder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.CardHolderView;

public class CardHolderView_core_test {
  public static void __find_views_core_test(CardHolderView cardholderview, View view) {
    cardholderview._text1 = ((FrameLayout) view);
    cardholderview._test2 = ((TextView) ((ViewGroup) view).getChildAt(0));
  }

  public static View __inflate_view_core_test(
      CardHolderView cardholderview, LayoutInflater inflater, ViewGroup parent) {
    View view = inflater.inflate(com.p1.mobile.putong.core.card.R.layout.core_test, parent, false);
    __find_views_core_test(cardholderview, view);
    return view;
  }

  public static void __unreference_views_core_test(CardHolderView cardholderview) {
    cardholderview._text1 = null;
    cardholderview._test2 = null;
  }
}
