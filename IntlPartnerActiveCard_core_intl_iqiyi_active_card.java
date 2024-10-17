package com.p1.mobile.putong.core.holder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.active.IntlPartnerActiveCard;

public class IntlPartnerActiveCard_core_intl_iqiyi_active_card {
  public static void __find_views_core_intl_iqiyi_active_card(
      IntlPartnerActiveCard intlpartneractivecard, View view) {
    intlpartneractivecard._card_bg = ((v.VDraweeView) ((ViewGroup) view).getChildAt(0));
    intlpartneractivecard._us_card_bg = ((v.VDraweeView) ((ViewGroup) view).getChildAt(1));
    intlpartneractivecard._card_bottom_bg = ((v.VDraweeView) ((ViewGroup) view).getChildAt(2));
    intlpartneractivecard._user_info =
        ((v.VLinear) ((ViewGroup) ((ViewGroup) view).getChildAt(3)).getChildAt(0));
    intlpartneractivecard._user_info_title =
        ((v.VText)
            ((ViewGroup) ((ViewGroup) ((ViewGroup) view).getChildAt(3)).getChildAt(0))
                .getChildAt(0));
    intlpartneractivecard._user_info_age =
        ((v.VText)
            ((ViewGroup) ((ViewGroup) ((ViewGroup) view).getChildAt(3)).getChildAt(0))
                .getChildAt(1));
    intlpartneractivecard._desc_text =
        ((TextView) ((ViewGroup) ((ViewGroup) view).getChildAt(3)).getChildAt(1));
    intlpartneractivecard._btn_bottom =
        ((com.p1.mobile.putong.core.ui.roundcorners.view.RoundLinearLayout)
            ((ViewGroup) ((ViewGroup) view).getChildAt(3)).getChildAt(2));
    intlpartneractivecard._btn_bottom_btn_bottom_text =
        ((TextView)
            ((ViewGroup) ((ViewGroup) ((ViewGroup) view).getChildAt(3)).getChildAt(2))
                .getChildAt(0));
    intlpartneractivecard._buttons_us = ((v.VLinear) ((ViewGroup) view).getChildAt(4));
    intlpartneractivecard._buttons_us_like_us =
        ((View) ((ViewGroup) ((ViewGroup) view).getChildAt(4)).getChildAt(0));
    intlpartneractivecard._buttons_us_dislike_us =
        ((View) ((ViewGroup) ((ViewGroup) view).getChildAt(4)).getChildAt(1));
  }

  public static View __inflate_view_core_intl_iqiyi_active_card(
      IntlPartnerActiveCard intlpartneractivecard, LayoutInflater inflater, ViewGroup parent) {
    View view =
        inflater.inflate(
            com.p1.mobile.putong.core.card.R.layout.core_intl_iqiyi_active_card, parent, false);
    __find_views_core_intl_iqiyi_active_card(intlpartneractivecard, view);
    return view;
  }

  public static void __unreference_views_core_intl_iqiyi_active_card(
      IntlPartnerActiveCard intlpartneractivecard) {
    intlpartneractivecard._card_bg = null;
    intlpartneractivecard._us_card_bg = null;
    intlpartneractivecard._card_bottom_bg = null;
    intlpartneractivecard._user_info = null;
    intlpartneractivecard._user_info_title = null;
    intlpartneractivecard._user_info_age = null;
    intlpartneractivecard._desc_text = null;
    intlpartneractivecard._btn_bottom = null;
    intlpartneractivecard._btn_bottom_btn_bottom_text = null;
    intlpartneractivecard._buttons_us = null;
    intlpartneractivecard._buttons_us_like_us = null;
    intlpartneractivecard._buttons_us_dislike_us = null;
  }
}
