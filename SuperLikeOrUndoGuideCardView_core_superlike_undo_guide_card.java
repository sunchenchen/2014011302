package com.p1.mobile.putong.core.holder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.home.virtualcard.SuperLikeOrUndoGuideCardView;

public class SuperLikeOrUndoGuideCardView_core_superlike_undo_guide_card {
  public static void __find_views_core_superlike_undo_guide_card(
      SuperLikeOrUndoGuideCardView superlikeorundoguidecardview, View view) {
    superlikeorundoguidecardview._card_bg = ((View) ((ViewGroup) view).getChildAt(0));
    superlikeorundoguidecardview._stage_view =
        ((com.sunshine.engine.bone.StageView) ((ViewGroup) view).getChildAt(1));
    superlikeorundoguidecardview._icon =
        ((ImageView) ((ViewGroup) ((ViewGroup) view).getChildAt(2)).getChildAt(0));
    superlikeorundoguidecardview._guide_title =
        ((TextView) ((ViewGroup) ((ViewGroup) view).getChildAt(2)).getChildAt(1));
    superlikeorundoguidecardview._guide_desc =
        ((TextView) ((ViewGroup) ((ViewGroup) view).getChildAt(2)).getChildAt(2));
    superlikeorundoguidecardview._button =
        ((TextView) ((ViewGroup) ((ViewGroup) view).getChildAt(2)).getChildAt(3));
  }

  public static View __inflate_view_core_superlike_undo_guide_card(
      SuperLikeOrUndoGuideCardView superlikeorundoguidecardview,
      LayoutInflater inflater,
      ViewGroup parent) {
    View view =
        inflater.inflate(
            com.p1.mobile.putong.core.card.R.layout.core_superlike_undo_guide_card, parent, false);
    __find_views_core_superlike_undo_guide_card(superlikeorundoguidecardview, view);
    return view;
  }

  public static void __unreference_views_core_superlike_undo_guide_card(
      SuperLikeOrUndoGuideCardView superlikeorundoguidecardview) {
    superlikeorundoguidecardview._card_bg = null;
    superlikeorundoguidecardview._stage_view = null;
    superlikeorundoguidecardview._icon = null;
    superlikeorundoguidecardview._guide_title = null;
    superlikeorundoguidecardview._guide_desc = null;
    superlikeorundoguidecardview._button = null;
  }
}
