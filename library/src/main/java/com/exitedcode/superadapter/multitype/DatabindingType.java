package com.exitedcode.superadapter.multitype;

import androidx.databinding.ViewDataBinding;

import com.exitedcode.superadapter.base.AbsHolderTyped;
import com.exitedcode.superadapter.base.IViewHolder;

/**
 * Created by ymr on 16/7/28.
 */
public abstract class DatabindingType<D> extends AbsHolderTyped<D,ViewDataBinding> {
    public DatabindingType(IViewHolder<? extends D, ViewDataBinding> viewHolder, int type) {
        super(viewHolder, type);
    }
}
