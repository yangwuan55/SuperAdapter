package com.exitedcode.superadapter;

import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ListViewCompat;

import com.exitedcode.common.adapter.base.DataAdapter;
import com.exitedcode.common.adapter.base.IViewHolder;
import com.exitedcode.common.adapter.base.SuperAdapterFactory;
import com.exitedcode.common.adapter.multitype.SimpleDatabindingType;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListViewCompat listView = (ListViewCompat) findViewById(R.id.list_view);
        /*MultiTypeDatabindingAdapter adapter = new MultiTypeDatabindingAdapter(this) {
            @Override
            public ArrayList<IType> createMultiTypes() {

            }
        };*/
        /*SimpleMultiTypeDatabindingAdatper multiTypeViewAdapter = new SimpleMultiTypeDatabindingAdatper(this) {

            @Override
            protected List<SimpleDatabindingType> createSimpleTypedViewHolderAdapter() {

                return typedHolderAdapters;
            }
        };*/

        ArrayList<SimpleDatabindingType> typedHolderAdapters = new ArrayList<>();
        typedHolderAdapters.add(new SimpleDatabindingType<>(A.class, new IViewHolder<A, ViewDataBinding>() {
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
        }));
        typedHolderAdapters.add(new SimpleDatabindingType<>(B.class, new IViewHolder<B, ViewDataBinding>() {
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
        }));
        typedHolderAdapters.add(new SimpleDatabindingType<>(C.class, new IViewHolder<C, ViewDataBinding>() {
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
        }));
        typedHolderAdapters.add(new SimpleDatabindingType<>(D.class, new IViewHolder<D, ViewDataBinding>() {
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
        }));
        DataAdapter adapter = SuperAdapterFactory.createMultiTypeDatabindingAdapter(this, typedHolderAdapters);
        listView.setAdapter(adapter);
        ArrayList<Object> datas = generateDatas();
        adapter.setDatas(datas);
    }

    @NonNull
    private ArrayList<Object> generateDatas() {
        ArrayList<Object> datas = new ArrayList<>();
        datas.add(new A());
        datas.add(new A());
        datas.add(new A());
        datas.add(new B());
        datas.add(new A());
        datas.add(new C());
        datas.add(new D());
        datas.add(new A());
        datas.add(new D());
        datas.add(new B());
        datas.add(new A());
        datas.add(new A());
        datas.add(new A());
        datas.add(new B());
        datas.add(new A());
        datas.add(new C());
        datas.add(new D());
        datas.add(new A());
        datas.add(new D());
        datas.add(new B());
        datas.add(new A());
        datas.add(new A());
        datas.add(new A());
        datas.add(new B());
        datas.add(new A());
        datas.add(new C());
        datas.add(new D());
        datas.add(new A());
        datas.add(new D());
        datas.add(new B());
        datas.add(new A());
        datas.add(new A());
        datas.add(new A());
        datas.add(new B());
        datas.add(new A());
        datas.add(new C());
        datas.add(new D());
        datas.add(new A());
        datas.add(new D());
        datas.add(new B());
        return datas;
    }

    class A{
        String test = "1122";
    }
    class B{

    }
    class C{

    }
    class D{

    }
}
