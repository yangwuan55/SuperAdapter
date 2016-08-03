package com.exitedcode.superadapter.databinding;

import android.content.Context;
import android.databinding.ViewDataBinding;
import android.view.View;

import com.exitedcode.superadapter.base.HolderRecyclerAdapter;
import com.exitedcode.superadapter.base.IViewHolder;

import java.util.List;

/**
 * Created by ymr on 16/3/26.
 */
public abstract class DataBindingRecyclerAdapter<Data> extends HolderRecyclerAdapter<Data, ViewDataBinding> {

    private final DatabindingHolderDelegate<Data> mDatabindingHolderDelegate = new DatabindingHolderDelegate<>(getContext());

    public DataBindingRecyclerAdapter(Context context) {
        super(context);
    }

    public DataBindingRecyclerAdapter(Context context, List<Data> objects) {
        super(context,objects);
    }

    @Override
    protected View createRealView(ViewDataBinding viewDataBinding) {
        return mDatabindingHolderDelegate.createRealView(viewDataBinding);
    }

    @Override
    protected ViewDataBinding createView(IViewHolder<Data, ViewDataBinding> viewHolder) {
        return mDatabindingHolderDelegate.createView(viewHolder);
    }
}
