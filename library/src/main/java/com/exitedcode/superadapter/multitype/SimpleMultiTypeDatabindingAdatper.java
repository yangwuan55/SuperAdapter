package com.exitedcode.superadapter.multitype;

import android.content.Context;

import java.util.List;

/**
 * Created by ymr on 16/7/28.
 */
public abstract class SimpleMultiTypeDatabindingAdatper extends MultiTypeDatabindingAdapter {
    public SimpleMultiTypeDatabindingAdatper(Context context) {
        super(context);
    }

    public SimpleMultiTypeDatabindingAdatper(Context context, List<Object> objects) {
        super(context, objects);
    }

    @Override
    public List<? extends IType> createMultiTypes() {
        return createSimpleTypedViewHolderAdapter();
    }

    protected abstract List<SimpleDatabindingType> createSimpleTypedViewHolderAdapter();
}
