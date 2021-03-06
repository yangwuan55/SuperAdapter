package com.exitedcode.superadapter.normal;

import android.content.Context;
import android.view.View;

import com.exitedcode.superadapter.base.IViewHolder;

public class ViewAdapterDelegate<Data> {

    private final Context mContext;

    public ViewAdapterDelegate(Context context) {
        mContext = context;
    }

    protected View createRealView(View view) {
        return view;
    }

    protected View createView(IViewHolder<Data, View> viewHolder) {
        return View.inflate(mContext, viewHolder.getItemLayout(), null);
    }
}