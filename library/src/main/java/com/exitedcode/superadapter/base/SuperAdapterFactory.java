package com.exitedcode.superadapter.base;

import android.content.Context;
import android.databinding.ViewDataBinding;
import android.view.View;

import com.exitedcode.superadapter.databinding.DataBindingAdapter;
import com.exitedcode.superadapter.databinding.DataBindingRecyclerAdapter;
import com.exitedcode.superadapter.multitype.IType;
import com.exitedcode.superadapter.multitype.MultiTypeAdapter;
import com.exitedcode.superadapter.multitype.MultiTypeDatabindingAdapter;
import com.exitedcode.superadapter.multitype.MultiTypeDatabindingRecyclerAdapter;
import com.exitedcode.superadapter.multitype.MultiTypeRecyclerAdapter;
import com.exitedcode.superadapter.multitype.SimpleDatabindingType;
import com.exitedcode.superadapter.multitype.SimpleHolderTyped;
import com.exitedcode.superadapter.normal.ViewAdapter;
import com.exitedcode.superadapter.normal.ViewRecyclerAdapter;

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
        return new ViewAdapter<D>(context) {
            @Override
            public IViewHolder<D,View> createViewHolder(int viewType) {
                return viewHolder;
            }
        };
    }

    public static DataAdapter createMultiTypeDatabindingAdapter(Context context, final List<SimpleDatabindingType<?>> simpleTypedDatabindingHolderAdapters) {
        return new MultiTypeDatabindingAdapter(context) {
            @Override
            public List<? extends IType<?, ViewDataBinding>> createMultiTypes() {
                return simpleTypedDatabindingHolderAdapters;
            }
        };
    }

    public static DataAdapter createMultiTypeHolderAdapter(Context context, final List<SimpleHolderTyped<?>> multiTypeDatabindingAdatpers) {
        return new MultiTypeAdapter(context) {
            @Override
            public List<? extends IType<?, View>> createMultiTypes() {
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
        return new ViewRecyclerAdapter<D>(context) {
            @Override
            public IViewHolder<D,View> createViewHolder(int viewType) {
                return viewHolder;
            }
        };
    }

    public static DataRecyclerAdapter createMultiTypeDatabindingRecyclerAdapter(Context context,final List<SimpleDatabindingType<?>> multiTypeDatabindingAdatpers) {
        return new MultiTypeDatabindingRecyclerAdapter(context) {
            @Override
            public List<? extends IType<?, ViewDataBinding>> createMultiTypes() {
                return multiTypeDatabindingAdatpers;
            }
        };
    }

    public static DataRecyclerAdapter createMultiTypeHolderRecyclerAdapter(Context context,final List<SimpleHolderTyped<?>> multiTypeDatabindingAdatpers) {
        return new MultiTypeRecyclerAdapter(context) {
            @Override
            public List<? extends IType<?, View>> createMultiTypes() {
                return multiTypeDatabindingAdatpers;
            }
        };
    }

}
