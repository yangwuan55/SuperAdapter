package com.exitedcode.superadapter.normal;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import com.exitedcode.superadapter.R;
import com.exitedcode.superadapter.base.DataAdapter;
import com.exitedcode.superadapter.base.IViewHolder;

import java.util.List;

/**
 * Created by ymr on 15/9/22.
 */
public abstract class HolderAdapter<Data, GView> extends DataAdapter<Data> implements IHolderAdapter<Data, GView> {

    public HolderAdapter(Context context) {
        super(context);
    }

    public HolderAdapter(Context context, List<? extends Data> datas) {
        super(context, datas);
    }

    @Override
    public android.view.View getView(int position, android.view.View convertView, ViewGroup parent) {
        android.view.View v = null;
        IViewHolder<Data, GView> viewHolder = null;
        if (verifyConvertView(convertView,position)) {
            v = convertView;
            viewHolder = (IViewHolder<Data, GView>) v.getTag(R.id.tag_view_holder);
            viewHolder.reset((GView) v.getTag(R.id.tag_g_view));
        } else {
            int itemViewType = getItemViewType(position);
            viewHolder = createViewHolder(itemViewType);
            v = inflate(viewHolder);
            setItemViewType(v,itemViewType,viewHolder);
        }
        Data item = getItem(position);
        viewHolder.onSetView(item, (GView) v.getTag(R.id.tag_g_view), position);
        return v;
    }

    private void setItemViewType(android.view.View v, int itemViewType, IViewHolder<Data, GView> viewHolder) {
        v.setTag(R.id.tag_item_type,itemViewType);
        v.setTag(R.id.tag_view_holder,viewHolder);
    }

    protected View inflate(IViewHolder<Data, GView> viewHolder) {
        GView gView = createView(viewHolder);
        View view = createRealView(gView);
        view.setTag(R.id.tag_g_view,gView);
        return view;
    }

    protected abstract View createRealView(GView gView);

    protected abstract GView createView(IViewHolder<Data, GView> viewHolder);

    private boolean verifyConvertView(android.view.View convertView, int position) {
        boolean result = false;
        if (convertView != null) {
            int viewType = (int) convertView.getTag(R.id.tag_item_type);
            if (viewType == getItemViewType(position)) {
                result = true;
            }
        }
        return result;
    }
}
