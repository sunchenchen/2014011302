package com.p1.mobile.putong.core.holder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.active.VipActiveCard;

public class VipActiveCard_core_intl_vip_active_card {
  public static void __find_views_core_intl_vip_active_card(
      VipActiveCard vipactivecard, View view) {
    vipactivecard._iv_cardpic = ((v.VDraweeView) ((ViewGroup) view).getChildAt(0));
    vipactivecard._iv_vip_logo =
        ((v.VDraweeView) ((ViewGroup) ((ViewGroup) view).getChildAt(1)).getChildAt(0));
    vipactivecard._tv_vip_title =
        ((v.VText) ((ViewGroup) ((ViewGroup) view).getChildAt(1)).getChildAt(1));
    vipactivecard._tv_vip_subtitle =
        ((v.VText) ((ViewGroup) ((ViewGroup) view).getChildAt(1)).getChildAt(2));
    vipactivecard._btn_bottom =
        ((v.VButton) ((ViewGroup) ((ViewGroup) view).getChildAt(1)).getChildAt(3));
    vipactivecard._tv_price =
        ((v.VText) ((ViewGroup) ((ViewGroup) view).getChildAt(1)).getChildAt(4));
  }

  public static View __inflate_view_core_intl_vip_active_card(
      VipActiveCard vipactivecard, LayoutInflater inflater, ViewGroup parent) {
    View view =
        inflater.inflate(
            com.p1.mobile.putong.core.card.R.layout.core_intl_vip_active_card, parent, false);
    __find_views_core_intl_vip_active_card(vipactivecard, view);
    return view;
  }

  public static void __unreference_views_core_intl_vip_active_card(VipActiveCard vipactivecard) {
    vipactivecard._iv_cardpic = null;
    vipactivecard._iv_vip_logo = null;
    vipactivecard._tv_vip_title = null;
    vipactivecard._tv_vip_subtitle = null;
    vipactivecard._btn_bottom = null;
    vipactivecard._tv_price = null;
  }
}
