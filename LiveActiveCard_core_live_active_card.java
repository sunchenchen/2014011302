package com.p1.mobile.putong.core.holder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.p1.mobile.putong.core.card.R;
import com.p1.mobile.putong.core.ui.active.LiveActiveCard;

public class LiveActiveCard_core_live_active_card {
  public static void __find_views_core_live_active_card(LiveActiveCard liveactivecard, View view) {
    liveactivecard._iv_cardpic = (v.VDraweeView) view.findViewById(R.id.iv_cardpic);
    liveactivecard._btn_bottom = (Button) view.findViewById(R.id.btn_bottom);
  }

  public static View __inflate_view_core_live_active_card(
      LiveActiveCard liveactivecard, LayoutInflater inflater, ViewGroup parent) {
    View view =
        inflater.inflate(
            com.p1.mobile.putong.core.card.R.layout.core_live_active_card, parent, false);
    __find_views_core_live_active_card(liveactivecard, view);
    return view;
  }

  public static void __unreference_views_core_live_active_card(LiveActiveCard liveactivecard) {
    liveactivecard._iv_cardpic = null;
    liveactivecard._btn_bottom = null;
  }
}
