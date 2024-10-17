package com.p1.mobile.putong.core.holder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.active.IntlRecallMembershipCard;

public class IntlRecallMembershipCard_core_intl_recall_membership_card {
  public static void __find_views_core_intl_recall_membership_card(
      IntlRecallMembershipCard intlrecallmembershipcard, View view) {
    intlrecallmembershipcard._card_bg = ((v.VDraweeView) ((ViewGroup) view).getChildAt(0));
    intlrecallmembershipcard._card_icon =
        ((v.VDraweeView) ((ViewGroup) ((ViewGroup) view).getChildAt(1)).getChildAt(0));
    intlrecallmembershipcard._card_title =
        ((v.VText) ((ViewGroup) ((ViewGroup) view).getChildAt(1)).getChildAt(1));
    intlrecallmembershipcard._card_subtitle =
        ((v.VText) ((ViewGroup) ((ViewGroup) view).getChildAt(1)).getChildAt(2));
    intlrecallmembershipcard._card_big_icon =
        ((v.VDraweeView) ((ViewGroup) ((ViewGroup) view).getChildAt(1)).getChildAt(3));
    intlrecallmembershipcard._card_btn_bg =
        ((v.VDraweeView) ((ViewGroup) ((ViewGroup) view).getChildAt(1)).getChildAt(4));
    intlrecallmembershipcard._card_btn =
        ((v.VText) ((ViewGroup) ((ViewGroup) view).getChildAt(1)).getChildAt(5));
  }

  public static View __inflate_view_core_intl_recall_membership_card(
      IntlRecallMembershipCard intlrecallmembershipcard,
      LayoutInflater inflater,
      ViewGroup parent) {
    View view =
        inflater.inflate(
            com.p1.mobile.putong.core.card.R.layout.core_intl_recall_membership_card,
            parent,
            false);
    __find_views_core_intl_recall_membership_card(intlrecallmembershipcard, view);
    return view;
  }

  public static void __unreference_views_core_intl_recall_membership_card(
      IntlRecallMembershipCard intlrecallmembershipcard) {
    intlrecallmembershipcard._card_bg = null;
    intlrecallmembershipcard._card_icon = null;
    intlrecallmembershipcard._card_title = null;
    intlrecallmembershipcard._card_subtitle = null;
    intlrecallmembershipcard._card_big_icon = null;
    intlrecallmembershipcard._card_btn_bg = null;
    intlrecallmembershipcard._card_btn = null;
  }
}
