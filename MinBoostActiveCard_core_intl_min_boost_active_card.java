package com.p1.mobile.putong.core.holder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.active.MinBoostActiveCard;

public class MinBoostActiveCard_core_intl_min_boost_active_card {
  public static void __find_views_core_intl_min_boost_active_card(
      MinBoostActiveCard minboostactivecard, View view) {
    minboostactivecard._iv_cardpic = ((v.VDraweeView) ((ViewGroup) view).getChildAt(0));
    minboostactivecard._boost_title =
        ((v.VText) ((ViewGroup) ((ViewGroup) view).getChildAt(1)).getChildAt(0));
    minboostactivecard._guideline1 =
        ((androidx.constraintlayout.widget.Guideline)
            ((ViewGroup) ((ViewGroup) view).getChildAt(1)).getChildAt(1));
    minboostactivecard._guideline2 =
        ((androidx.constraintlayout.widget.Guideline)
            ((ViewGroup) ((ViewGroup) view).getChildAt(1)).getChildAt(2));
    minboostactivecard._boost_logo =
        ((v.VDraweeView) ((ViewGroup) ((ViewGroup) view).getChildAt(1)).getChildAt(3));
    minboostactivecard._boost_subtitle =
        ((v.VText) ((ViewGroup) ((ViewGroup) view).getChildAt(1)).getChildAt(4));
    minboostactivecard._btn_bottom =
        ((v.VImage) ((ViewGroup) ((ViewGroup) view).getChildAt(1)).getChildAt(5));
    minboostactivecard._btn_title =
        ((v.VText) ((ViewGroup) ((ViewGroup) view).getChildAt(1)).getChildAt(6));
  }

  public static View __inflate_view_core_intl_min_boost_active_card(
      MinBoostActiveCard minboostactivecard, LayoutInflater inflater, ViewGroup parent) {
    View view =
        inflater.inflate(
            com.p1.mobile.putong.core.card.R.layout.core_intl_min_boost_active_card, parent, false);
    __find_views_core_intl_min_boost_active_card(minboostactivecard, view);
    return view;
  }

  public static void __unreference_views_core_intl_min_boost_active_card(
      MinBoostActiveCard minboostactivecard) {
    minboostactivecard._iv_cardpic = null;
    minboostactivecard._boost_title = null;
    minboostactivecard._guideline1 = null;
    minboostactivecard._guideline2 = null;
    minboostactivecard._boost_logo = null;
    minboostactivecard._boost_subtitle = null;
    minboostactivecard._btn_bottom = null;
    minboostactivecard._btn_title = null;
  }
}
