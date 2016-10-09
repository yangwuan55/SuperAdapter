package com.exitedcode.superadapter.normal;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import com.exitedcode.superadapter.base.HolderRecyclerAdapter;
import com.exitedcode.superadapter.base.IViewHolder;

import java.util.List;

/**
 * Created by ymr on 16/3/26.
 */
public abstract class ViewRecyclerAdapter<Data> extends HolderRecyclerAdapter<Data, View> {
    private final ViewAdapterDelegate<Data> viewAdapterDelegate = new ViewAdapterDelegate<>(getContext());

    public ViewRecyclerAdapter(Context context) {
        super(context);
    }

    public ViewRecyclerAdapter(Context context, List<Data> datas) {
        super(context,datas);
    }

    @Override
    protected View createRealView(View view) {
        return viewAdapterDelegate.createRealView(view);
    }

    @Override
    protected View createView(IViewHolder<Data, View> viewHolder, ViewGroup parent) {
        return viewAdapterDelegate.createView(viewHolder);
    }
}
