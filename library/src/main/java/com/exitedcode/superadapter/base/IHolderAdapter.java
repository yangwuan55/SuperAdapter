package com.exitedcode.superadapter.base;

import com.exitedcode.superadapter.base.IViewHolder;

/**
 * Created by ymr on 16/7/28.
 */
public interface IHolderAdapter<Data, GView> {
    IViewHolder<Data, GView> createViewHolder(int viewType);
    int getItemViewType(int position);
}
