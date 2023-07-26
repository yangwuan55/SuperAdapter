# SuperAdapter
A framework for create an adapter when using the listview gridview or recyclerview.

- multitype

![MacDown Screenshot](https://github.com/yangwuan55/SuperAdapter/raw/master/imgs/Screenshot_2016-08-16-16-30-47.png)

- normal

![MacDown Screenshot](https://github.com/yangwuan55/SuperAdapter/raw/master/imgs/Screenshot_2016-08-16-16-30-34.png)

- databinding

![MacDown Screenshot](https://github.com/yangwuan55/SuperAdapter/raw/master/imgs/Screenshot_2016-08-16-16-30-39.png)

## gradle

```
compile 'com.github.yangwuan55:SuperAdapter:1.1.7'

```

# Usage
- ListAdapter:

```

DataAdapter<A> listAdapter = SuperAdapterFactory.createListAdapter(context, new IViewHolder<A, View>() {
    @Override
    public void reset(View view) {
		// when the view is reusing if you want reset somethings
    }

    @Override
    public void onSetView(A item, View view, int position) {
	//do something use the view and the data
    }

    @Override
    public int getItemLayout() {
	return R.layout.layout_a;
    }
});
listView.setAdapter(listAdapter);
ArrayList<A> datas = new ArrayList<>();
listAdapter.setDatas(datas);        
```

- Use databinding

```

DataAdapter<A> dataBindingListAdapter = SuperAdapterFactory.createDataBindingListAdapter(context, new IViewHolder<A, ViewDataBinding>() {
    @Override
    public void reset(ViewDataBinding viewDataBinding) {

    }

    @Override
    public void onSetView(A item, ViewDataBinding viewDataBinding, int position) {
	LayoutABinding dataBinding = (LayoutABinding) viewDataBinding;
	dataBinding.setA(item);
    }

    @Override
    public int getItemLayout() {
	return R.layout.layout_a;
    }
});
listView.setAdapter(dataBindingListAdapter);
ArrayList<A> datas = new ArrayList<>();
dataBindingListAdapter.setDatas(datas);
	

```
so easy...


- Multi type

```

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

```

- RecyclerView support

``` 

 SuperAdapterFactory.createRecyclerAdapter(context,viewholder);
 SuperAdapterFactory.createDatabindingRecyclerAdapter(context,viewholder);
 SuperAdapterFactory.createMultiTypeDatabindingRecyclerAdapter(context, typedHolderAdapters);
 SuperAdapterFactory.createMultiTypeHolderRecyclerAdapter(context, typedHolderAdapters);

```
