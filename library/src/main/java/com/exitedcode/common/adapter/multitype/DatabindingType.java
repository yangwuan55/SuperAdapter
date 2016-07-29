package com.exitedcode.common.adapter.multitype;

import android.databinding.ViewDataBinding;

import com.exitedcode.common.adapter.base.AbsHolderTyped;
import com.exitedcode.common.adapter.base.IViewHolder;

/**
 * Created by ymr on 16/7/28.
 */
public abstract class DatabindingType<D> extends AbsHolderTyped<D,ViewDataBinding> {
    public DatabindingType(IViewHolder<? extends D, ViewDataBinding> viewHolder, int type) {
        super(viewHolder, type);
    }
}
