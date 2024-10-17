package com.p1.mobile.putong.core.holder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.home.views.OperationItemView;

public class OperationItemView_core_operation_item_view {
  public static void __find_views_core_operation_item_view(
      OperationItemView operationitemview, View view) {
    operationitemview._webview =
        ((immomo.com.mklibrary.core.base.ui.MKWebView) ((ViewGroup) view).getChildAt(0));
  }

  public static View __inflate_view_core_operation_item_view(
      OperationItemView operationitemview, LayoutInflater inflater, ViewGroup parent) {
    View view =
        inflater.inflate(
            com.p1.mobile.putong.core.card.R.layout.core_operation_item_view, parent, false);
    __find_views_core_operation_item_view(operationitemview, view);
    return view;
  }

  public static void __unreference_views_core_operation_item_view(
      OperationItemView operationitemview) {
    operationitemview._webview = null;
  }
}
