package com.p1.mobile.putong.core.holder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.newui.home.views.CardBottomBaseInfoView;

public class CardBottomBaseInfoView_core_card_bottom_basic_info {
  public static void __find_views_core_card_bottom_basic_info(
      CardBottomBaseInfoView cardbottombaseinfoview, View view) {
    cardbottombaseinfoview._name = ((v.VText) ((ViewGroup) view).getChildAt(0));
    cardbottombaseinfoview._emoji_icon_intl = ((v.VDraweeView) ((ViewGroup) view).getChildAt(1));
    cardbottombaseinfoview._age = ((v.VText) ((ViewGroup) view).getChildAt(2));
    cardbottombaseinfoview._pic_icon = ((v.VFrame) ((ViewGroup) view).getChildAt(3));
    cardbottombaseinfoview._pic_icon_outer =
        ((v.VIcon) ((ViewGroup) ((ViewGroup) view).getChildAt(3)).getChildAt(0));
    cardbottombaseinfoview._pic_icon_inner =
        ((v.VIcon) ((ViewGroup) ((ViewGroup) view).getChildAt(3)).getChildAt(1));
    cardbottombaseinfoview._age_sex_content = ((LinearLayout) ((ViewGroup) view).getChildAt(4));
    cardbottombaseinfoview._iv_smalltag = ((v.VImage) ((ViewGroup) view).getChildAt(5));
  }

  public static View __inflate_view_core_card_bottom_basic_info(
      CardBottomBaseInfoView cardbottombaseinfoview, LayoutInflater inflater, ViewGroup parent) {
    View view =
        inflater.inflate(
            com.p1.mobile.putong.core.card.R.layout.core_card_bottom_basic_info, parent, false);
    __find_views_core_card_bottom_basic_info(cardbottombaseinfoview, view);
    return view;
  }

  public static void __unreference_views_core_card_bottom_basic_info(
      CardBottomBaseInfoView cardbottombaseinfoview) {
    cardbottombaseinfoview._name = null;
    cardbottombaseinfoview._emoji_icon_intl = null;
    cardbottombaseinfoview._age = null;
    cardbottombaseinfoview._pic_icon = null;
    cardbottombaseinfoview._pic_icon_outer = null;
    cardbottombaseinfoview._pic_icon_inner = null;
    cardbottombaseinfoview._age_sex_content = null;
    cardbottombaseinfoview._iv_smalltag = null;
  }
}
