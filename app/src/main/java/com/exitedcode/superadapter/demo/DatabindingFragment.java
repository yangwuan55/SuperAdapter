package com.exitedcode.superadapter.demo;

import androidx.databinding.ViewDataBinding;
import android.os.Bundle;
import androidx.fragment.app.ListFragment;
import android.view.View;

import com.exitedcode.superadapter.base.DataAdapter;
import com.exitedcode.superadapter.base.IViewHolder;
import com.exitedcode.superadapter.base.SuperAdapterFactory;

/**
 * Created by ymr on 16/8/3.
 */

public class DatabindingFragment extends ListFragment {

    private DataAdapter<B> mAdapter;

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mAdapter = SuperAdapterFactory.createDataBindingListAdapter(getContext(), new IViewHolder<B, ViewDataBinding>() {
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
        setListAdapter(mAdapter);
        mAdapter.setDatas(Utils.generateDatasB());
    }
}
