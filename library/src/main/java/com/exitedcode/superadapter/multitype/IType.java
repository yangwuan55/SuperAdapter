package com.exitedcode.superadapter.multitype;

/**
 * Created by ymr on 16/7/28.
 */
public interface IType<Data, GView> {
    int getType();

    TypedViewHolder<? extends Data,GView> getTypedViewHolder();

    boolean isCurrType(Object data);
}