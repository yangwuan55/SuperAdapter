package com.exitedcode.common.adapter.normal;

import android.content.Context;
import android.view.View;

import com.exitedcode.common.adapter.base.IViewHolder;

public class ViewHolderDelegate<Data> {

    private final Context mContext;

    public ViewHolderDelegate(Context context) {
        mContext = context;
    }

    protected View createRealView(View view) {
        return view;
    }

    protected View createView(IViewHolder<Data, View> viewHolder) {
        return View.inflate(mContext, viewHolder.getItemLayout(), null);
    }
}