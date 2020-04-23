package com.exitedcode.superadapter.databinding;

import android.content.Context;
import androidx.databinding.ViewDataBinding;
import android.view.View;

import com.exitedcode.superadapter.base.HolderAdapter;
import com.exitedcode.superadapter.base.IViewHolder;

import java.util.List;

/**
 * Created by ymr on 15/10/13.
 */
public abstract class DataBindingAdapter<D> extends HolderAdapter<D,ViewDataBinding> {
    private final DatabindingHolderDelegate<D> mDatabindingHolderDelegate = new DatabindingHolderDelegate<D>(getContext());

    public DataBindingAdapter(Context context) {
        super(context);
    }

    public DataBindingAdapter(Context context, List<D> ds) {
        super(context, ds);
    }

    @Override
    protected View createRealView(ViewDataBinding viewDataBinding) {
        return mDatabindingHolderDelegate.createRealView(viewDataBinding);
    }

    @Override
    protected ViewDataBinding createView(IViewHolder<D, ViewDataBinding> viewHolder) {
        return mDatabindingHolderDelegate.createView(viewHolder);
    }
}
