package com.exitedcode.common.adapter.multitype;

import java.util.List;

/**
 * Created by ymr on 16/7/28.
 */
public interface IMultiTypeAdapter {

    List<? extends IType> createMultiTypes();

    Object getItem(int position);
}
