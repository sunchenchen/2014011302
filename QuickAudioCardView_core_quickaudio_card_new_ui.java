package com.p1.mobile.putong.core.holder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.quickaudio.view.QuickAudioCardView;

public class QuickAudioCardView_core_quickaudio_card_new_ui {
  public static void __find_views_core_quickaudio_card_new_ui(
      QuickAudioCardView quickaudiocardview, View view) {
    quickaudiocardview._title_layout = ((v.VLinear) ((ViewGroup) view).getChildAt(1));
    quickaudiocardview._title_layout_title_img =
        ((v.VImage) ((ViewGroup) ((ViewGroup) view).getChildAt(1)).getChildAt(0));
    quickaudiocardview._title_layout_title =
        ((v.VText) ((ViewGroup) ((ViewGroup) view).getChildAt(1)).getChildAt(1));
    quickaudiocardview._title_layout_sub_title =
        ((v.VText) ((ViewGroup) ((ViewGroup) view).getChildAt(1)).getChildAt(2));
    quickaudiocardview._avatar_bg = ((v.VImage) ((ViewGroup) view).getChildAt(2));
    quickaudiocardview._avatar_parent = ((v.VRelative) ((ViewGroup) view).getChildAt(3));
    quickaudiocardview._avatar =
        ((v.VDraweeView) ((ViewGroup) ((ViewGroup) view).getChildAt(3)).getChildAt(0));
    quickaudiocardview._tv_online =
        ((v.VText) ((ViewGroup) ((ViewGroup) view).getChildAt(3)).getChildAt(2));
    quickaudiocardview._name =
        ((TextView)
            ((ViewGroup) ((ViewGroup) ((ViewGroup) view).getChildAt(3)).getChildAt(3))
                .getChildAt(0));
    quickaudiocardview._name_subtitle =
        ((v.VText)
            ((ViewGroup) ((ViewGroup) ((ViewGroup) view).getChildAt(3)).getChildAt(3))
                .getChildAt(1));
    quickaudiocardview._wave =
        ((com.tantan.library.svga.SVGAnimationView)
            ((ViewGroup) ((ViewGroup) view).getChildAt(3)).getChildAt(4));
    quickaudiocardview._bottom_layout = ((FrameLayout) ((ViewGroup) view).getChildAt(4));
    quickaudiocardview._chat_match_btn =
        ((v.VText) ((ViewGroup) ((ViewGroup) view).getChildAt(4)).getChildAt(0));
  }

  public static View __inflate_view_core_quickaudio_card_new_ui(
      QuickAudioCardView quickaudiocardview, LayoutInflater inflater, ViewGroup parent) {
    View view =
        inflater.inflate(
            com.p1.mobile.putong.core.card.R.layout.core_quickaudio_card_new_ui, parent, false);
    __find_views_core_quickaudio_card_new_ui(quickaudiocardview, view);
    return view;
  }

  public static void __unreference_views_core_quickaudio_card_new_ui(
      QuickAudioCardView quickaudiocardview) {
    quickaudiocardview._title_layout = null;
    quickaudiocardview._title_layout_title_img = null;
    quickaudiocardview._title_layout_title = null;
    quickaudiocardview._title_layout_sub_title = null;
    quickaudiocardview._avatar_bg = null;
    quickaudiocardview._avatar_parent = null;
    quickaudiocardview._avatar = null;
    quickaudiocardview._tv_online = null;
    quickaudiocardview._name = null;
    quickaudiocardview._name_subtitle = null;
    quickaudiocardview._wave = null;
    quickaudiocardview._bottom_layout = null;
    quickaudiocardview._chat_match_btn = null;
  }
}
