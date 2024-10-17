package com.p1.mobile.putong.core.holder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.freetrial.FreeTrialCard;

public class FreeTrialCard_core_free_trial_card {
  public static void __find_views_core_free_trial_card(FreeTrialCard freetrialcard, View view) {
    freetrialcard._background = ((View) ((ViewGroup) view).getChildAt(0));
    freetrialcard._icon =
        ((ImageView) ((ViewGroup) ((ViewGroup) view).getChildAt(1)).getChildAt(1));
    freetrialcard._title =
        ((TextView) ((ViewGroup) ((ViewGroup) view).getChildAt(1)).getChildAt(2));
    freetrialcard._sub_title =
        ((TextView) ((ViewGroup) ((ViewGroup) view).getChildAt(1)).getChildAt(3));
    freetrialcard._trial =
        ((TextView) ((ViewGroup) ((ViewGroup) view).getChildAt(1)).getChildAt(5));
    freetrialcard._desc = ((TextView) ((ViewGroup) ((ViewGroup) view).getChildAt(1)).getChildAt(6));
  }

  public static View __inflate_view_core_free_trial_card(
      FreeTrialCard freetrialcard, LayoutInflater inflater, ViewGroup parent) {
    View view =
        inflater.inflate(
            com.p1.mobile.putong.core.card.R.layout.core_free_trial_card, parent, false);
    __find_views_core_free_trial_card(freetrialcard, view);
    return view;
  }

  public static void __unreference_views_core_free_trial_card(FreeTrialCard freetrialcard) {
    freetrialcard._background = null;
    freetrialcard._icon = null;
    freetrialcard._title = null;
    freetrialcard._sub_title = null;
    freetrialcard._trial = null;
    freetrialcard._desc = null;
  }
}
