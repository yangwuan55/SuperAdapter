package com.exitedcode.superadapter.base;

import com.exitedcode.superadapter.multitype.IType;
import com.exitedcode.superadapter.multitype.TypedViewHolder;

/**
 * Created by ymr on 16/7/28.
 */
public abstract class AbsHolderTyped<Data,GView> implements IType<Data,GView> {

    private int type;
    private TypedViewHolder<? extends Data,GView> typedViewHolder;

    public AbsHolderTyped(IViewHolder<? extends Data, GView> viewHolder, int type) {
        this.typedViewHolder = new TypedViewHolder<>(viewHolder);
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public TypedViewHolder<? extends Data,GView> getTypedViewHolder() {
        return typedViewHolder;
    }
}
