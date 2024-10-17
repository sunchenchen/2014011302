package com.p1.mobile.putong.core.holder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.active.SpotlightActiveCard;

public class SpotlightActiveCard_core_intl_spotlight_active_card {
  public static void __find_views_core_intl_spotlight_active_card(
      SpotlightActiveCard spotlightactivecard, View view) {
    spotlightactivecard._card_bg = ((v.VDraweeView) ((ViewGroup) view).getChildAt(0));
    spotlightactivecard._title = ((TextView) ((ViewGroup) view).getChildAt(1));
    spotlightactivecard._desc_img = ((v.VDraweeView) ((ViewGroup) view).getChildAt(2));
    spotlightactivecard._desc_text = ((TextView) ((ViewGroup) view).getChildAt(3));
    spotlightactivecard._btn_bottom = ((v.VImage) ((ViewGroup) view).getChildAt(4));
    spotlightactivecard._btn_title = ((TextView) ((ViewGroup) view).getChildAt(5));
  }

  public static View __inflate_view_core_intl_spotlight_active_card(
      SpotlightActiveCard spotlightactivecard, LayoutInflater inflater, ViewGroup parent) {
    View view =
        inflater.inflate(
            com.p1.mobile.putong.core.card.R.layout.core_intl_spotlight_active_card, parent, false);
    __find_views_core_intl_spotlight_active_card(spotlightactivecard, view);
    return view;
  }

  public static void __unreference_views_core_intl_spotlight_active_card(
      SpotlightActiveCard spotlightactivecard) {
    spotlightactivecard._card_bg = null;
    spotlightactivecard._title = null;
    spotlightactivecard._desc_img = null;
    spotlightactivecard._desc_text = null;
    spotlightactivecard._btn_bottom = null;
    spotlightactivecard._btn_title = null;
  }
}
