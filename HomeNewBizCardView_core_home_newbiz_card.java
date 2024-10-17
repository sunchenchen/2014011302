package com.p1.mobile.putong.core.holder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.home.virtualcard.HomeNewBizCardView;

public class HomeNewBizCardView_core_home_newbiz_card {
  public static void __find_views_core_home_newbiz_card(
      HomeNewBizCardView homenewbizcardview, View view) {
    homenewbizcardview._card_bg = ((v.VImage) ((ViewGroup) view).getChildAt(0));
    homenewbizcardview._icon =
        ((v.VImage) ((ViewGroup) ((ViewGroup) view).getChildAt(1)).getChildAt(0));
    homenewbizcardview._title =
        ((v.VText) ((ViewGroup) ((ViewGroup) view).getChildAt(1)).getChildAt(1));
    homenewbizcardview._subtitle =
        ((v.VText) ((ViewGroup) ((ViewGroup) view).getChildAt(1)).getChildAt(2));
    homenewbizcardview._img = ((v.VDraweeView) ((ViewGroup) view).getChildAt(2));
    homenewbizcardview._ok = ((v.VButton) ((ViewGroup) view).getChildAt(3));
  }

  public static View __inflate_view_core_home_newbiz_card(
      HomeNewBizCardView homenewbizcardview, LayoutInflater inflater, ViewGroup parent) {
    View view =
        inflater.inflate(
            com.p1.mobile.putong.core.card.R.layout.core_home_newbiz_card, parent, false);
    __find_views_core_home_newbiz_card(homenewbizcardview, view);
    return view;
  }

  public static void __unreference_views_core_home_newbiz_card(
      HomeNewBizCardView homenewbizcardview) {
    homenewbizcardview._card_bg = null;
    homenewbizcardview._icon = null;
    homenewbizcardview._title = null;
    homenewbizcardview._subtitle = null;
    homenewbizcardview._img = null;
    homenewbizcardview._ok = null;
  }
}
