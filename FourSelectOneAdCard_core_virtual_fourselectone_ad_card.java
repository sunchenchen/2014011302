package com.p1.mobile.putong.core.holder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.home.view.FourSelectOneAdCard;

public class FourSelectOneAdCard_core_virtual_fourselectone_ad_card {
  public static void __find_views_core_virtual_fourselectone_ad_card(
      FourSelectOneAdCard fourselectoneadcard, View view) {
    fourselectoneadcard._card_bg_img = ((v.VDraweeView) ((ViewGroup) view).getChildAt(0));
    fourselectoneadcard._ad_title =
        ((com.p1.mobile.putong.core.ui.VText_Bold)
            ((ViewGroup) ((ViewGroup) view).getChildAt(1)).getChildAt(1));
    fourselectoneadcard._ad_content =
        ((v.VText) ((ViewGroup) ((ViewGroup) view).getChildAt(1)).getChildAt(2));
    fourselectoneadcard._select_imag1 =
        ((v.VDraweeView)
            ((ViewGroup)
                    ((ViewGroup) ((ViewGroup) ((ViewGroup) view).getChildAt(1)).getChildAt(3))
                        .getChildAt(0))
                .getChildAt(0));
    fourselectoneadcard._select_imag2 =
        ((v.VDraweeView)
            ((ViewGroup)
                    ((ViewGroup) ((ViewGroup) ((ViewGroup) view).getChildAt(1)).getChildAt(3))
                        .getChildAt(0))
                .getChildAt(1));
    fourselectoneadcard._select_imag3 =
        ((v.VDraweeView)
            ((ViewGroup)
                    ((ViewGroup) ((ViewGroup) ((ViewGroup) view).getChildAt(1)).getChildAt(3))
                        .getChildAt(0))
                .getChildAt(2));
    fourselectoneadcard._select_imag4 =
        ((v.VDraweeView)
            ((ViewGroup)
                    ((ViewGroup) ((ViewGroup) ((ViewGroup) view).getChildAt(1)).getChildAt(3))
                        .getChildAt(0))
                .getChildAt(3));
    fourselectoneadcard._action_btn =
        ((com.p1.mobile.putong.core.ui.VText_Bold)
            ((ViewGroup) ((ViewGroup) view).getChildAt(1)).getChildAt(4));
  }

  public static View __inflate_view_core_virtual_fourselectone_ad_card(
      FourSelectOneAdCard fourselectoneadcard, LayoutInflater inflater, ViewGroup parent) {
    View view =
        inflater.inflate(
            com.p1.mobile.putong.core.card.R.layout.core_virtual_fourselectone_ad_card,
            parent,
            false);
    __find_views_core_virtual_fourselectone_ad_card(fourselectoneadcard, view);
    return view;
  }

  public static void __unreference_views_core_virtual_fourselectone_ad_card(
      FourSelectOneAdCard fourselectoneadcard) {
    fourselectoneadcard._card_bg_img = null;
    fourselectoneadcard._ad_title = null;
    fourselectoneadcard._ad_content = null;
    fourselectoneadcard._select_imag1 = null;
    fourselectoneadcard._select_imag2 = null;
    fourselectoneadcard._select_imag3 = null;
    fourselectoneadcard._select_imag4 = null;
    fourselectoneadcard._action_btn = null;
  }
}
