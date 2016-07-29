package com.exitedcode.superadapter.base;

import android.content.Context;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by ymr on 15/9/22.
 */
public abstract class DataAdapter<D> extends BaseAdapter implements IDataManager<D> {

    private final Context mContext;
    private IDataManager<D> mDataManagerDelegate;

    public DataAdapter(Context context) {
        mContext = context;
        mDataManagerDelegate = new DataManagerDelegate<>(this);
    }

    public DataAdapter(Context context, List<? extends D> datas) {
        mContext = context;
        mDataManagerDelegate = new DataManagerDelegate<>(this);
        setDatas(datas);
    }

    @Override
    public void addDatas(List<? extends D> datas) {
        mDataManagerDelegate.addDatas(datas);
    }

    @Override
    public void setDatas(List< ? extends D> datas) {
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
