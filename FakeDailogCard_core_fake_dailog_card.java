package com.p1.mobile.putong.core.holder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.fakecard.FakeDailogCard;

public class FakeDailogCard_core_fake_dailog_card {
  public static void __find_views_core_fake_dailog_card(FakeDailogCard fakedailogcard, View view) {
    fakedailogcard._card_body = ((com.p1.mobile.putong.core.ui.fakecard.FakeDailogCard) view);
    fakedailogcard._card_body_cl_body =
        ((androidx.constraintlayout.widget.ConstraintLayout) ((ViewGroup) view).getChildAt(0));
    fakedailogcard._card_body_cl_body_fake_bg =
        ((v.VDraweeView) ((ViewGroup) ((ViewGroup) view).getChildAt(0)).getChildAt(0));
    fakedailogcard._card_body_cl_body_iv_icon =
        ((ImageView) ((ViewGroup) ((ViewGroup) view).getChildAt(0)).getChildAt(1));
    fakedailogcard._card_body_cl_body_tv_dailog_title =
        ((TextView) ((ViewGroup) ((ViewGroup) view).getChildAt(0)).getChildAt(2));
    fakedailogcard._card_body_cl_body_tv_content =
        ((TextView) ((ViewGroup) ((ViewGroup) view).getChildAt(0)).getChildAt(3));
    fakedailogcard._card_body_cl_body_fake_center_view =
        ((v.VDraweeView) ((ViewGroup) ((ViewGroup) view).getChildAt(0)).getChildAt(4));
    fakedailogcard._card_body_cl_body_tv_update =
        ((TextView) ((ViewGroup) ((ViewGroup) view).getChildAt(0)).getChildAt(5));
  }

  public static View __inflate_view_core_fake_dailog_card(
      FakeDailogCard fakedailogcard, LayoutInflater inflater, ViewGroup parent) {
    View view =
        inflater.inflate(
            com.p1.mobile.putong.core.card.R.layout.core_fake_dailog_card, parent, false);
    __find_views_core_fake_dailog_card(fakedailogcard, view);
    return view;
  }

  public static void __unreference_views_core_fake_dailog_card(FakeDailogCard fakedailogcard) {
    fakedailogcard._card_body = null;
    fakedailogcard._card_body_cl_body = null;
    fakedailogcard._card_body_cl_body_fake_bg = null;
    fakedailogcard._card_body_cl_body_iv_icon = null;
    fakedailogcard._card_body_cl_body_tv_dailog_title = null;
    fakedailogcard._card_body_cl_body_tv_content = null;
    fakedailogcard._card_body_cl_body_fake_center_view = null;
    fakedailogcard._card_body_cl_body_tv_update = null;
  }
}
