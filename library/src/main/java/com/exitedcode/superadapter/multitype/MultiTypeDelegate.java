package com.exitedcode.superadapter.multitype;

import com.exitedcode.superadapter.base.AbsHolderTyped;
import com.exitedcode.superadapter.base.IViewHolder;
import com.exitedcode.superadapter.normal.IHolderAdapter;

import java.util.ArrayList;
import java.util.List;

public class MultiTypeDelegate<GView> implements IHolderAdapter<Object,GView> {
    private final IMultiTypeAdapter mMultiTypeViewAdapter;
    private List<IType> mTypeds = new ArrayList<>();

    public MultiTypeDelegate(IMultiTypeAdapter multiTypeViewAdapter) {
        this.mMultiTypeViewAdapter = multiTypeViewAdapter;
    }

    public void init() {
        List<? extends IType> multiTypes = mMultiTypeViewAdapter.createMultiTypes();
        if (multiTypes != null && !multiTypes.isEmpty()) {
            mTypeds.addAll(multiTypes);
        }
    }

    public IViewHolder<Object, GView> createViewHolder(int viewType) {
        for (IType iType : mTypeds) {
            if (viewType == iType.getType()) {
                return iType.getTypedViewHolder();
            }
        }
        return null;
    }

    public int getItemViewType(int position) {
        if (!mTypeds.isEmpty()) {
            for (IType typedHolderAdapter : mTypeds) {
                if (typedHolderAdapter.isCurrType(mMultiTypeViewAdapter.getItem(position))) {
                    return typedHolderAdapter.getType();
                }
            }
        }
        return 0;
    }

    public void addTypedHolderAdapter(AbsHolderTyped typedHolderAdapter) {
        mTypeds.add(typedHolderAdapter);
    }
}