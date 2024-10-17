package com.p1.mobile.putong.core.holder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.home.view.DailySelectionAdCardView;

public class DailySelectionAdCardView_core_virtual_daily_selection_card {
  public static void __find_views_core_virtual_daily_selection_card(
      DailySelectionAdCardView dailyselectionadcardview, View view) {
    dailyselectionadcardview._title =
        ((com.p1.mobile.putong.core.ui.VText_Bold)
            ((ViewGroup) ((ViewGroup) ((ViewGroup) view).getChildAt(2)).getChildAt(1))
                .getChildAt(1));
    dailyselectionadcardview._subtitle =
        ((v.VText) ((ViewGroup) ((ViewGroup) view).getChildAt(2)).getChildAt(2));
    dailyselectionadcardview._introduce_icon =
        ((v.VDraweeView)
            ((ViewGroup)
                    ((ViewGroup) ((ViewGroup) ((ViewGroup) view).getChildAt(2)).getChildAt(3))
                        .getChildAt(0))
                .getChildAt(0));
    dailyselectionadcardview._action_btn =
        ((com.p1.mobile.putong.core.ui.VText_Bold)
            ((ViewGroup) ((ViewGroup) view).getChildAt(2)).getChildAt(4));
  }

  public static View __inflate_view_core_virtual_daily_selection_card(
      DailySelectionAdCardView dailyselectionadcardview,
      LayoutInflater inflater,
      ViewGroup parent) {
    View view =
        inflater.inflate(
            com.p1.mobile.putong.core.card.R.layout.core_virtual_daily_selection_card,
            parent,
            false);
    __find_views_core_virtual_daily_selection_card(dailyselectionadcardview, view);
    return view;
  }

  public static void __unreference_views_core_virtual_daily_selection_card(
      DailySelectionAdCardView dailyselectionadcardview) {
    dailyselectionadcardview._title = null;
    dailyselectionadcardview._subtitle = null;
    dailyselectionadcardview._introduce_icon = null;
    dailyselectionadcardview._action_btn = null;
  }
}
