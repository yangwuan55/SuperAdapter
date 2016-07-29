package com.exitedcode.common.adapter.base;

import android.content.Context;
import android.databinding.ViewDataBinding;
import android.view.View;

import com.exitedcode.common.adapter.databinding.DataBindingAdapter;
import com.exitedcode.common.adapter.databinding.DataBindingRecyclerAdapter;
import com.exitedcode.common.adapter.multitype.IType;
import com.exitedcode.common.adapter.multitype.MultiTypeDatabindingRecyclerAdapter;
import com.exitedcode.common.adapter.multitype.MultiTypeHolderRecyclerAdapter;
import com.exitedcode.common.adapter.multitype.SimpleDatabindingType;
import com.exitedcode.common.adapter.multitype.SimpleMultiTypeDatabindingAdatper;
import com.exitedcode.common.adapter.multitype.SimpleMultiTypeHolderAdatper;
import com.exitedcode.common.adapter.multitype.SimpleHolderTyped;
import com.exitedcode.common.adapter.normal.ViewHolderAdapter;
import com.exitedcode.common.adapter.normal.ViewHolderRecyclerAdapter;

import java.util.List;

/**
 * Created by ymr on 16/7/29.
 */
public class SuperAdapterFactory {

    public static <D> DataAdapter<D> createDataBindingListAdapter(Context context, final IViewHolder<D,ViewDataBinding> viewHolder) {
        return new DataBindingAdapter<D>(context) {
            @Override
            public IViewHolder<D,ViewDataBinding> createViewHolder(int viewType) {
                return viewHolder;
            }
        };
    }

    public static <D> DataAdapter<D> createListAdapter(Context context, final IViewHolder<D,View> viewHolder) {
        return new ViewHolderAdapter<D>(context) {
            @Override
            public IViewHolder<D,View> createViewHolder(int viewType) {
                return viewHolder;
            }
        };
    }

    public static DataAdapter createMultiTypeDatabindingAdapter(Context context, final List<SimpleDatabindingType> simpleTypedDatabindingHolderAdapters) {
        return new SimpleMultiTypeDatabindingAdatper(context) {
            @Override
            protected List<SimpleDatabindingType> createSimpleTypedViewHolderAdapter() {
                return simpleTypedDatabindingHolderAdapters;
            }
        };
    }

    public static DataAdapter createMultiTypeHolderAdapter(Context context, final List<SimpleHolderTyped> multiTypeDatabindingAdatpers) {
        return new SimpleMultiTypeHolderAdatper(context) {
            @Override
            protected List<SimpleHolderTyped> createSimpleTypedViewHolderAdapter() {
                return multiTypeDatabindingAdatpers;
            }
        };
    }

    public static <D> DataRecyclerAdapter<D> createDatabindingRecyclerAdapter(Context context, final IViewHolder<D,ViewDataBinding> viewHolder) {
        return new DataBindingRecyclerAdapter<D>(context) {
            @Override
            public IViewHolder<D,ViewDataBinding> createViewHolder(int viewType) {
                return viewHolder;
            }
        };
    }

    public static <D> DataRecyclerAdapter<D> createRecyclerAdapter(Context context, final IViewHolder<D,View> viewHolder) {
        return new ViewHolderRecyclerAdapter<D>(context) {
            @Override
            public IViewHolder<D,View> createViewHolder(int viewType) {
                return viewHolder;
            }
        };
    }

    public static DataRecyclerAdapter createMultiTypeDatabindingRecyclerAdapter(Context context,final List<SimpleDatabindingType> multiTypeDatabindingAdatpers) {
        return new MultiTypeDatabindingRecyclerAdapter(context) {
            @Override
            public List<? extends IType> createMultiTypes() {
                return multiTypeDatabindingAdatpers;
            }
        };
    }

    public static DataRecyclerAdapter createMultiTypeHolderRecyclerAdapter(Context context,final List<SimpleHolderTyped> multiTypeDatabindingAdatpers) {
        return new MultiTypeHolderRecyclerAdapter(context) {
            @Override
            public List<? extends IType> createMultiTypes() {
                return multiTypeDatabindingAdatpers;
            }
        };
    }

}
