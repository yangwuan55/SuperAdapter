package com.exitedcode.superadapter.multitype;

import android.view.View;

import com.exitedcode.superadapter.base.IViewHolder;

/**
 * Created by ymr on 16/7/28.
 */
public class SimpleHolderTyped<D> extends HolderType<D> {

    private final Class<D> mDClass;

    public SimpleHolderTyped(Class<D> dClass, IViewHolder<? extends D, View> viewHolder) {
        super(viewHolder, dClass.hashCode());
        this.mDClass = dClass;
    }

    @Override
    public boolean isCurrType(Object object) {
        return object.getClass().equals(mDClass);
    }
}
