package com.exitedcode.superadapter.normal;

import android.content.Context;
import android.view.View;

import com.exitedcode.superadapter.base.IViewHolder;

import java.util.List;

/**
 * Created by ymr on 16/3/26.
 */
public abstract class ViewHolderAdapter<Data> extends HolderAdapter<Data, View> {

    private final ViewHolderDelegate<Data> viewHolderDelegate = new ViewHolderDelegate<>(getContext());

    public ViewHolderAdapter(Context context) {
        super(context);
    }

    public ViewHolderAdapter(Context context, List<Data> datas) {
        super(context, datas);
    }

    @Override
    protected View createRealView(View view) {
        return viewHolderDelegate.createRealView(view);
    }

    @Override
    protected View createView(IViewHolder<Data, View> viewHolder) {
        return viewHolderDelegate.createView(viewHolder);
    }
}
