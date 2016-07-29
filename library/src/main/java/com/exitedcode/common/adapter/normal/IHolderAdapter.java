package com.exitedcode.common.adapter.normal;

import com.exitedcode.common.adapter.base.IViewHolder;

/**
 * Created by ymr on 16/7/28.
 */
public interface IHolderAdapter<Data, GView> {
    IViewHolder<Data, GView> createViewHolder(int viewType);
    int getItemViewType(int position);
}
