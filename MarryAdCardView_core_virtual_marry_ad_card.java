package com.p1.mobile.putong.core.holder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.home.view.MarryAdCardView;

public class MarryAdCardView_core_virtual_marry_ad_card {
  public static void __find_views_core_virtual_marry_ad_card(
      MarryAdCardView marryadcardview, View view) {
    marryadcardview._marry_card_bg_img = ((v.VDraweeView) ((ViewGroup) view).getChildAt(0));
    marryadcardview._marry_avatar_img =
        ((com.facebook.drawee.view.SimpleDraweeView)
            ((ViewGroup)
                    ((ViewGroup)
                            ((ViewGroup)
                                    ((ViewGroup) ((ViewGroup) view).getChildAt(1)).getChildAt(3))
                                .getChildAt(0))
                        .getChildAt(1))
                .getChildAt(0));
    marryadcardview._ad_info_text =
        ((com.p1.mobile.putong.core.ui.VText_Bold)
            ((ViewGroup)
                    ((ViewGroup)
                            ((ViewGroup)
                                    ((ViewGroup) ((ViewGroup) view).getChildAt(1)).getChildAt(3))
                                .getChildAt(0))
                        .getChildAt(1))
                .getChildAt(3));
    marryadcardview._ad_name_text =
        ((com.p1.mobile.putong.core.ui.VText_Bold)
            ((ViewGroup)
                    ((ViewGroup)
                            ((ViewGroup)
                                    ((ViewGroup) ((ViewGroup) view).getChildAt(1)).getChildAt(3))
                                .getChildAt(0))
                        .getChildAt(1))
                .getChildAt(4));
    marryadcardview._action_btn =
        ((com.p1.mobile.putong.core.ui.VText_Bold)
            ((ViewGroup) ((ViewGroup) view).getChildAt(1)).getChildAt(4));
  }

  public static View __inflate_view_core_virtual_marry_ad_card(
      MarryAdCardView marryadcardview, LayoutInflater inflater, ViewGroup parent) {
    View view =
        inflater.inflate(
            com.p1.mobile.putong.core.card.R.layout.core_virtual_marry_ad_card, parent, false);
    __find_views_core_virtual_marry_ad_card(marryadcardview, view);
    return view;
  }

  public static void __unreference_views_core_virtual_marry_ad_card(
      MarryAdCardView marryadcardview) {
    marryadcardview._marry_card_bg_img = null;
    marryadcardview._marry_avatar_img = null;
    marryadcardview._ad_info_text = null;
    marryadcardview._ad_name_text = null;
    marryadcardview._action_btn = null;
  }
}
