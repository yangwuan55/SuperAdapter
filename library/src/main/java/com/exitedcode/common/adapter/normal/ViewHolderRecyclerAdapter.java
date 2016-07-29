package com.exitedcode.common.adapter.normal;

import android.content.Context;
import android.view.View;

import com.exitedcode.common.adapter.base.IViewHolder;

import java.util.List;

/**
 * Created by ymr on 16/3/26.
 */
public abstract class ViewHolderRecyclerAdapter<Data> extends HolderRecyclerAdapter<Data, View> {
    private final ViewHolderDelegate<Data> viewHolderDelegate = new ViewHolderDelegate<>(getContext());

    public ViewHolderRecyclerAdapter(Context context) {
        super(context);
    }

    public ViewHolderRecyclerAdapter(Context context, List<Data> datas) {
        super(context,datas);
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
