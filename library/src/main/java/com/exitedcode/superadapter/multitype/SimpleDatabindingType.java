package com.exitedcode.superadapter.multitype;

import androidx.databinding.ViewDataBinding;

import com.exitedcode.superadapter.base.IViewHolder;

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
    public boolean isCurrType(D object) {
        return object.getClass().equals(mDClass);
    }
}
