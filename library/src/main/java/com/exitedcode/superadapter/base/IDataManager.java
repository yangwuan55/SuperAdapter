package com.exitedcode.superadapter.base;

import android.content.Context;

import java.util.List;

/**
 * Created by ymr on 15/11/4.
 */
public interface IDataManager<D>{

    void addDatas(List<? extends D> datas);

    void setDatas(List<? extends D> datas);

    List<D> getDatas();

    int getCount();

    D getItem(int position);

    long getItemId(int position);

    Context getContext();

    void notifyDataSetChanged();
}
