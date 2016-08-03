package com.exitedcode.superadapter.demo;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;

import com.exitedcode.superadapter.base.DataAdapter;
import com.exitedcode.superadapter.base.IViewHolder;
import com.exitedcode.superadapter.base.SuperAdapterFactory;

/**
 * Created by ymr on 16/8/3.
 */

public class NormalFragment extends ListFragment {

    private DataAdapter<A> mAdapter;

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mAdapter = SuperAdapterFactory.createListAdapter(getContext(), new IViewHolder<A, View>() {
            @Override
            public void reset(View view) {

            }

            @Override
            public void onSetView(A item, View view, int position) {

            }

            @Override
            public int getItemLayout() {
                return R.layout.layout_a_normal;
            }
        });
        setListAdapter(mAdapter);
        mAdapter.setDatas(Utils.generateDatasA());
    }
}
