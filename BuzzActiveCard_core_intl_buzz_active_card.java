package com.p1.mobile.putong.core.holder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.active.BuzzActiveCard;

public class BuzzActiveCard_core_intl_buzz_active_card {
  public static void __find_views_core_intl_buzz_active_card(
      BuzzActiveCard buzzactivecard, View view) {
    buzzactivecard._card_bg = ((v.VDraweeView) ((ViewGroup) view).getChildAt(0));
    buzzactivecard._card_icon =
        ((v.VDraweeView) ((ViewGroup) ((ViewGroup) view).getChildAt(1)).getChildAt(0));
    buzzactivecard._card_title =
        ((v.VText) ((ViewGroup) ((ViewGroup) view).getChildAt(1)).getChildAt(1));
    buzzactivecard._card_subtitle =
        ((v.VText) ((ViewGroup) ((ViewGroup) view).getChildAt(1)).getChildAt(2));
    buzzactivecard._card_anim =
        ((com.tantan.library.svga.SVGAnimationView)
            ((ViewGroup) ((ViewGroup) view).getChildAt(1)).getChildAt(3));
    buzzactivecard._card_btn =
        ((v.VText) ((ViewGroup) ((ViewGroup) view).getChildAt(1)).getChildAt(4));
  }

  public static View __inflate_view_core_intl_buzz_active_card(
      BuzzActiveCard buzzactivecard, LayoutInflater inflater, ViewGroup parent) {
    View view =
        inflater.inflate(
            com.p1.mobile.putong.core.card.R.layout.core_intl_buzz_active_card, parent, false);
    __find_views_core_intl_buzz_active_card(buzzactivecard, view);
    return view;
  }

  public static void __unreference_views_core_intl_buzz_active_card(BuzzActiveCard buzzactivecard) {
    buzzactivecard._card_bg = null;
    buzzactivecard._card_icon = null;
    buzzactivecard._card_title = null;
    buzzactivecard._card_subtitle = null;
    buzzactivecard._card_anim = null;
    buzzactivecard._card_btn = null;
  }
}
