package com.p1.mobile.putong.core.holder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.active.SeeActiveHeadItem;

public class SeeActiveHeadItem_core_intl_see_active_head {
  public static void __find_views_core_intl_see_active_head(
      SeeActiveHeadItem seeactiveheaditem, View view) {
    seeactiveheaditem._vv_head = ((v.VDraweeView) ((ViewGroup) view).getChildAt(0));
    seeactiveheaditem._iv_more = ((v.VImage) ((ViewGroup) view).getChildAt(1));
  }

  public static View __inflate_view_core_intl_see_active_head(
      SeeActiveHeadItem seeactiveheaditem, LayoutInflater inflater, ViewGroup parent) {
    View view =
        inflater.inflate(
            com.p1.mobile.putong.core.card.R.layout.core_intl_see_active_head, parent, false);
    __find_views_core_intl_see_active_head(seeactiveheaditem, view);
    return view;
  }

  public static void __unreference_views_core_intl_see_active_head(
      SeeActiveHeadItem seeactiveheaditem) {
    seeactiveheaditem._vv_head = null;
    seeactiveheaditem._iv_more = null;
  }
}
