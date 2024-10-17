package com.p1.mobile.putong.core.holder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.home.virtualcard.BarLoverGuideCardAdapter;

public class BarLoverGuideCardAdapter_core_bar_lover_card {
  public static void __find_views_core_bar_lover_card(
      BarLoverGuideCardAdapter barloverguidecardadapter, View view) {
    barloverguidecardadapter._title =
        ((v.VText)
            ((ViewGroup) ((ViewGroup) ((ViewGroup) view).getChildAt(3)).getChildAt(0))
                .getChildAt(1));
    barloverguidecardadapter._btn =
        ((v.VText) ((ViewGroup) ((ViewGroup) view).getChildAt(3)).getChildAt(2));
  }

  public static View __inflate_view_core_bar_lover_card(
      BarLoverGuideCardAdapter barloverguidecardadapter,
      LayoutInflater inflater,
      ViewGroup parent) {
    View view =
        inflater.inflate(
            com.p1.mobile.putong.core.card.R.layout.core_bar_lover_card, parent, false);
    __find_views_core_bar_lover_card(barloverguidecardadapter, view);
    return view;
  }

  public static void __unreference_views_core_bar_lover_card(
      BarLoverGuideCardAdapter barloverguidecardadapter) {
    barloverguidecardadapter._title = null;
    barloverguidecardadapter._btn = null;
  }
}
