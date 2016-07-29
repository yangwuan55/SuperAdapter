package com.exitedcode.common.adapter.multitype;

import android.view.View;

import com.exitedcode.common.adapter.base.AbsHolderTyped;
import com.exitedcode.common.adapter.base.IViewHolder;

/**
 * Created by ymr on 16/7/28.
 */
public abstract class HolderType<D> extends AbsHolderTyped<D,View> {
    public HolderType(IViewHolder<? extends D, View> viewHolder, int type) {
        super(viewHolder, type);
    }
}