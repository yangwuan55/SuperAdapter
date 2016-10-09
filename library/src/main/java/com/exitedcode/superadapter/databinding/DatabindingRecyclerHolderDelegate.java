package com.exitedcode.superadapter.databinding;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.exitedcode.superadapter.base.IViewHolder;

/**
 * Created by ymr on 2016/10/9.
 */
public class DatabindingRecyclerHolderDelegate<Data> extends DatabindingHolderDelegate<Data>{
    public DatabindingRecyclerHolderDelegate(Context context) {
        super(context);
    }

    public ViewDataBinding createView(IViewHolder<Data, ViewDataBinding> viewHolder, ViewGroup parent) {
        return DataBindingUtil.inflate(LayoutInflater.from(mContext), viewHolder.getItemLayout(), parent, false);
    }
}
