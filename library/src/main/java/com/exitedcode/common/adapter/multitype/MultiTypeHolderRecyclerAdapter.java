package com.exitedcode.common.adapter.multitype;

import android.content.Context;
import android.view.View;

import com.exitedcode.common.adapter.base.IViewHolder;
import com.exitedcode.common.adapter.normal.ViewHolderRecyclerAdapter;

import java.util.List;

/**
 * Created by ymr on 16/7/27.
 */
public abstract class MultiTypeHolderRecyclerAdapter extends ViewHolderRecyclerAdapter<Object> implements IMultiTypeAdapter {

    private MultiTypeDelegate multiTypeDelegate;

    public MultiTypeHolderRecyclerAdapter(Context context) {
        super(context);
        multiTypeDelegate = new MultiTypeDelegate(this);
        multiTypeDelegate.init();
    }

    public MultiTypeHolderRecyclerAdapter(Context context, List<Object> datas) {
        super(context, datas);
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

    public void addTypedHolderAdapter(DatabindingType typedHolderAdapter) {
        multiTypeDelegate.addTypedHolderAdapter(typedHolderAdapter);
    }
}
