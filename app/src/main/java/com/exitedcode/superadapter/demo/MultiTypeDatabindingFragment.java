package com.exitedcode.superadapter.demo;

import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;

import com.exitedcode.superadapter.base.DataAdapter;
import com.exitedcode.superadapter.base.IViewHolder;
import com.exitedcode.superadapter.base.SuperAdapterFactory;
import com.exitedcode.superadapter.multitype.SimpleDatabindingType;

import java.util.ArrayList;

/**
 * Created by ymr on 16/8/3.
 */

public class MultiTypeDatabindingFragment extends ListFragment {

    private SimpleDatabindingType<A> mTypeA = new SimpleDatabindingType<>(A.class, new IViewHolder<A, ViewDataBinding>() {
        @Override
        public void reset(ViewDataBinding viewDataBinding) {

        }

        @Override
        public void onSetView(A item, ViewDataBinding viewDataBinding, int position) {

        }

        @Override
        public int getItemLayout() {
            return R.layout.layout_a;
        }
    });
    private SimpleDatabindingType<B> mTypeB = new SimpleDatabindingType<>(B.class, new IViewHolder<B, ViewDataBinding>() {
        @Override
        public void reset(ViewDataBinding viewDataBinding) {

        }

        @Override
        public void onSetView(B item, ViewDataBinding viewDataBinding, int position) {

        }

        @Override
        public int getItemLayout() {
            return R.layout.layout_b;
        }
    });
    private SimpleDatabindingType<C> mTypeC = new SimpleDatabindingType<>(C.class, new IViewHolder<C, ViewDataBinding>() {
        @Override
        public void reset(ViewDataBinding viewDataBinding) {

        }

        @Override
        public void onSetView(C item, ViewDataBinding viewDataBinding, int position) {

        }

        @Override
        public int getItemLayout() {
            return R.layout.layout_c;
        }
    });
    private SimpleDatabindingType<D> mTypeD = new SimpleDatabindingType<>(D.class, new IViewHolder<D, ViewDataBinding>() {
        @Override
        public void reset(ViewDataBinding viewDataBinding) {

        }

        @Override
        public void onSetView(D item, ViewDataBinding viewDataBinding, int position) {

        }

        @Override
        public int getItemLayout() {
            return R.layout.layout_d;
        }
    });
    private DataAdapter mMultiTypeDatabindingAdapter;

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ArrayList<SimpleDatabindingType<?>> typedHolderAdapters = new ArrayList<>();
        typedHolderAdapters.add(mTypeA);
        typedHolderAdapters.add(mTypeB);
        typedHolderAdapters.add(mTypeC);
        typedHolderAdapters.add(mTypeD);
        mMultiTypeDatabindingAdapter = SuperAdapterFactory.createMultiTypeDatabindingAdapter(getContext(), typedHolderAdapters);
        mMultiTypeDatabindingAdapter.setDatas(Utils.generateDatas());
        setListAdapter(mMultiTypeDatabindingAdapter);
    }
}
