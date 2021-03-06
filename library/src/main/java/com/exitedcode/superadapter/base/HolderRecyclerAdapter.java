package com.exitedcode.superadapter.base;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.exitedcode.superadapter.R;

import java.util.List;

/**
 * Created by ymr on 16/3/26.
 */
public abstract class HolderRecyclerAdapter<Data,GView> extends DataRecyclerAdapter<Data> {

    public HolderRecyclerAdapter(Context context) {
        super(context);
    }

    public HolderRecyclerAdapter(Context context, List<Data> datas) {
        super(context,datas);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        IViewHolder<Data, GView> viewHolder = createViewHolder(viewType);
        MyViewHolder recyclerViewHolder = new MyViewHolder(viewHolder,parent);
        recyclerViewHolder.setIViewHolder(viewHolder);
        return recyclerViewHolder;
    }

    protected abstract IViewHolder<Data,GView> createViewHolder(int viewType);

    protected View inflate(IViewHolder<Data, GView> viewHolder, ViewGroup parent) {
        GView gView = createView(viewHolder,parent);
        View view = createRealView(gView);
        view.setTag(R.id.tag_g_view,gView);
        return view;
    }

    protected abstract View createRealView(GView gView);

    protected abstract GView createView(IViewHolder<Data, GView> viewHolder, ViewGroup parent);

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        IViewHolder<Data, GView> iViewHolder = ((MyViewHolder) holder).getIViewHolder();
        iViewHolder.onSetView(getItem(position), (GView) holder.itemView.getTag(R.id.tag_g_view),position);
    }

    private class MyViewHolder extends RecyclerView.ViewHolder {
        private IViewHolder<Data, GView> mIViewHolder;

        public MyViewHolder(IViewHolder<Data, GView> viewHolder, ViewGroup parent) {
            super(HolderRecyclerAdapter.this.inflate(viewHolder,parent));
        }

        public void setIViewHolder(IViewHolder<Data,GView> IViewHolder) {
            this.mIViewHolder = IViewHolder;
        }

        public IViewHolder<Data, GView> getIViewHolder() {
            return mIViewHolder;
        }
    }
}
