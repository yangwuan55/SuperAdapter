package com.exitedcode.superadapter.base;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

/**
 * Created by ymr on 15/11/4.
 */
public abstract class DataRecyclerAdapter<D> extends RecyclerView.Adapter implements IDataManager<D> {

    private final Context mContext;
    private final DataManagerDelegate<D> mDataManagerDelegate;

    public DataRecyclerAdapter(Context context) {
        mContext = context;
        mDataManagerDelegate = new DataManagerDelegate<>(this);
    }

    public DataRecyclerAdapter(Context context, List<? extends D> datas) {
        mContext = context;
        mDataManagerDelegate = new DataManagerDelegate<>(this);
        setDatas(datas);
    }

    @Override
    public int getItemCount() {
        return getCount();
    }

    @Override
    public void addDatas(List<? extends D> datas) {
        mDataManagerDelegate.addDatas(datas);
    }

    @Override
    public void setDatas(List<? extends D> datas) {
        mDataManagerDelegate.setDatas(datas);
    }

    @Override
    public List<D> getDatas() {
        return mDataManagerDelegate.getDatas();
    }

    @Override
    public int getCount() {
        return mDataManagerDelegate.getCount();
    }

    @Override
    public D getItem(int position) {
        return mDataManagerDelegate.getItem(position);
    }

    @Override
    public long getItemId(int position) {
        return mDataManagerDelegate.getItemId(position);
    }

    @Override
    public Context getContext() {
        return mContext;
    }
}
