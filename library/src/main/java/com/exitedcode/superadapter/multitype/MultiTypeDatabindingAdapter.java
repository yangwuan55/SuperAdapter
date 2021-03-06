package com.exitedcode.superadapter.multitype;

import android.content.Context;
import androidx.databinding.ViewDataBinding;

import com.exitedcode.superadapter.base.IViewHolder;
import com.exitedcode.superadapter.databinding.DataBindingAdapter;

import java.util.List;

/**
 * Created by ymr on 16/7/27.
 */
public abstract class MultiTypeDatabindingAdapter extends DataBindingAdapter<Object> implements IMultiTypeAdapter<ViewDataBinding> {

    private MultiTypeDelegate<ViewDataBinding> multiTypeDelegate;

    public MultiTypeDatabindingAdapter(Context context) {
        super(context);
        multiTypeDelegate = new MultiTypeDelegate<>(this);
        multiTypeDelegate.init();
    }

    public MultiTypeDatabindingAdapter(Context context, List<Object> objects) {
        super(context, objects);
        multiTypeDelegate = new MultiTypeDelegate<>(this);
        multiTypeDelegate.init();
    }

    @Override
    public IViewHolder<Object, ViewDataBinding> createViewHolder(int viewType) {
        return multiTypeDelegate.createViewHolder(viewType);
    }

    @Override
    public int getItemViewType(int position) {
        return multiTypeDelegate.getItemViewType(position);
    }

    public void addTypedHolderAdapter(DatabindingType typedHolderAdapter) {
        multiTypeDelegate.addTypedHolderAdapter(typedHolderAdapter);
    }
}
