package com.exitedcode.common.adapter.multitype;

import android.content.Context;
import android.view.View;

import com.exitedcode.common.adapter.base.IViewHolder;
import com.exitedcode.common.adapter.normal.ViewHolderAdapter;

import java.util.List;

/**
 * Created by ymr on 16/7/27.
 */
public abstract class MultiTypeHolderAdapter extends ViewHolderAdapter<Object> implements IMultiTypeAdapter {

    private MultiTypeDelegate multiTypeDelegate;

    public MultiTypeHolderAdapter(Context context) {
        super(context);
        multiTypeDelegate = new MultiTypeDelegate(this);
        multiTypeDelegate.init();
    }

    public MultiTypeHolderAdapter(Context context, List<Object> objects) {
        super(context, objects);
        multiTypeDelegate = new MultiTypeDelegate(this);
        multiTypeDelegate.init();
    }

    @Override
    public IViewHolder<Object, View> createViewHolder(int viewType) {
        return multiTypeDelegate.createViewHolder(viewType);
    }

    @Override
    public int getItemViewType(int position) {
        return multiTypeDelegate.getItemViewType(position);
    }

    public void addTypedHolderAdapter(HolderType holderType) {
        multiTypeDelegate.addTypedHolderAdapter(holderType);
    }
}
