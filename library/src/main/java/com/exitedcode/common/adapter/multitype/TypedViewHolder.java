
package com.exitedcode.common.adapter.multitype;

import com.exitedcode.common.adapter.base.IViewHolder;

/**
 * Created by ymr on 16/7/19.
 */
public class TypedViewHolder<D,GView> implements IViewHolder<Object, GView> {

    private final IViewHolder<D, GView> mDelegateViewHolder;

    public TypedViewHolder(IViewHolder<D,GView> viewHolder) {
        mDelegateViewHolder = viewHolder;
    }

    @Override
    public void reset(GView viewDataBinding) {
        mDelegateViewHolder.reset(viewDataBinding);
    }

    @Override
    public void onSetView(Object o, GView viewDataBinding, int i) {
        mDelegateViewHolder.onSetView((D) o,viewDataBinding,i);
    }

    @Override
    public int getItemLayout() {
        return mDelegateViewHolder.getItemLayout();
    }
}
