package com.p1.mobile.putong.core.holder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.svip.opads.BoostIntroCardView;

public class BoostIntroCardView_core_svip_ads_boost_card {
  public static void __find_views_core_svip_ads_boost_card(
      BoostIntroCardView boostintrocardview, View view) {
    boostintrocardview._fixed_radio_frame = ((v.VFrame_FixRatio) ((ViewGroup) view).getChildAt(0));
    boostintrocardview._fixed_radio_frame_avatars =
        ((v.VImage) ((ViewGroup) ((ViewGroup) view).getChildAt(0)).getChildAt(0));
    boostintrocardview._title = ((v.VText) ((ViewGroup) view).getChildAt(1));
    boostintrocardview._sub_title = ((v.VText) ((ViewGroup) view).getChildAt(2));
    boostintrocardview._boost = ((v.VText) ((ViewGroup) view).getChildAt(3));
    boostintrocardview._skip = ((v.VText) ((ViewGroup) view).getChildAt(4));
    boostintrocardview._free_tag = ((v.VText) ((ViewGroup) view).getChildAt(5));
  }

  public static View __inflate_view_core_svip_ads_boost_card(
      BoostIntroCardView boostintrocardview, LayoutInflater inflater, ViewGroup parent) {
    View view =
        inflater.inflate(
            com.p1.mobile.putong.core.card.R.layout.core_svip_ads_boost_card, parent, false);
    __find_views_core_svip_ads_boost_card(boostintrocardview, view);
    return view;
  }

  public static void __unreference_views_core_svip_ads_boost_card(
      BoostIntroCardView boostintrocardview) {
    boostintrocardview._fixed_radio_frame = null;
    boostintrocardview._fixed_radio_frame_avatars = null;
    boostintrocardview._title = null;
    boostintrocardview._sub_title = null;
    boostintrocardview._boost = null;
    boostintrocardview._skip = null;
    boostintrocardview._free_tag = null;
  }
}
