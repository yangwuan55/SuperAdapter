package com.exitedcode.common.adapter.multitype;

import android.databinding.ViewDataBinding;

import com.exitedcode.common.adapter.base.IViewHolder;

/**
 * Created by ymr on 16/7/28.
 */
public class SimpleDatabindingType<D> extends DatabindingType<D> {

    private final Class<D> mDClass;

    public SimpleDatabindingType(Class<D> dClass, IViewHolder<? extends D, ViewDataBinding> viewHolder) {
        super(viewHolder, dClass.hashCode());
        this.mDClass = dClass;
    }

    @Override
    public boolean isCurrType(Object object) {
        return object.getClass().equals(mDClass);
    }
}
