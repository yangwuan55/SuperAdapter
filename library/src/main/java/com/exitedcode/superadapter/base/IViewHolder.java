package com.exitedcode.superadapter.base;

/**
 * Created by ymr on 16/3/26.
 */
public interface IViewHolder<Data,Dis> {
    void reset(Dis dis);

    void onSetView(Data item,Dis dis,int position);

    int getItemLayout();
}
