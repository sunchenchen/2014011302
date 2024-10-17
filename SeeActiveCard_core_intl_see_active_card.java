package com.p1.mobile.putong.core.holder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.active.SeeActiveCard;

public class SeeActiveCard_core_intl_see_active_card {
  public static void __find_views_core_intl_see_active_card(
      SeeActiveCard seeactivecard, View view) {
    seeactivecard._iv_cardpic = ((v.VDraweeView) ((ViewGroup) view).getChildAt(0));
    seeactivecard._iv_see_logo =
        ((v.VDraweeView) ((ViewGroup) ((ViewGroup) view).getChildAt(1)).getChildAt(0));
    seeactivecard._vl_head_layout =
        ((v.VLinear) ((ViewGroup) ((ViewGroup) view).getChildAt(1)).getChildAt(1));
    seeactivecard._tv_see_title =
        ((v.VText) ((ViewGroup) ((ViewGroup) view).getChildAt(1)).getChildAt(2));
    seeactivecard._tv_see_subtitle =
        ((v.VText) ((ViewGroup) ((ViewGroup) view).getChildAt(1)).getChildAt(3));
    seeactivecard._btn_bottom =
        ((v.VButton) ((ViewGroup) ((ViewGroup) view).getChildAt(1)).getChildAt(4));
    seeactivecard._tv_price =
        ((v.VText) ((ViewGroup) ((ViewGroup) view).getChildAt(1)).getChildAt(5));
  }

  public static View __inflate_view_core_intl_see_active_card(
      SeeActiveCard seeactivecard, LayoutInflater inflater, ViewGroup parent) {
    View view =
        inflater.inflate(
            com.p1.mobile.putong.core.card.R.layout.core_intl_see_active_card, parent, false);
    __find_views_core_intl_see_active_card(seeactivecard, view);
    return view;
  }

  public static void __unreference_views_core_intl_see_active_card(SeeActiveCard seeactivecard) {
    seeactivecard._iv_cardpic = null;
    seeactivecard._iv_see_logo = null;
    seeactivecard._vl_head_layout = null;
    seeactivecard._tv_see_title = null;
    seeactivecard._tv_see_subtitle = null;
    seeactivecard._btn_bottom = null;
    seeactivecard._tv_price = null;
  }
}
