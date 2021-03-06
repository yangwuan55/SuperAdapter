package com.exitedcode.superadapter.multitype;

import android.content.Context;
import android.view.View;

import com.exitedcode.superadapter.base.IViewHolder;
import com.exitedcode.superadapter.normal.ViewRecyclerAdapter;

import java.util.List;

/**
 * Created by ymr on 16/7/27.
 */
public abstract class MultiTypeRecyclerAdapter extends ViewRecyclerAdapter<Object> implements IMultiTypeAdapter<View> {

    private MultiTypeDelegate<View> multiTypeDelegate;

    public MultiTypeRecyclerAdapter(Context context) {
        super(context);
        multiTypeDelegate = new MultiTypeDelegate<>(this);
        multiTypeDelegate.init();
    }

    public MultiTypeRecyclerAdapter(Context context, List<Object> datas) {
        super(context, datas);
        multiTypeDelegate = new MultiTypeDelegate<>(this);
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
