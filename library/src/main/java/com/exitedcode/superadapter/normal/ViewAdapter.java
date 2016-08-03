package com.exitedcode.superadapter.normal;

import android.content.Context;
import android.view.View;

import com.exitedcode.superadapter.base.HolderAdapter;
import com.exitedcode.superadapter.base.IViewHolder;

import java.util.List;

/**
 * Created by ymr on 16/3/26.
 */
public abstract class ViewAdapter<Data> extends HolderAdapter<Data, View> {

    private final ViewAdapterDelegate<Data> mViewAdapterDelegate = new ViewAdapterDelegate<>(getContext());

    public ViewAdapter(Context context) {
        super(context);
    }

    public ViewAdapter(Context context, List<Data> datas) {
        super(context, datas);
    }

    @Override
    protected View createRealView(View view) {
        return mViewAdapterDelegate.createRealView(view);
    }

    @Override
    protected View createView(IViewHolder<Data, View> viewHolder) {
        return mViewAdapterDelegate.createView(viewHolder);
    }
}
