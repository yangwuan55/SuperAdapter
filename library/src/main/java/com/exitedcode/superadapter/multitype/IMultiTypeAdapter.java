package com.exitedcode.superadapter.multitype;

import java.util.List;

/**
 * Created by ymr on 16/7/28.
 */
public interface IMultiTypeAdapter<GView> {

    List<? extends IType<?,GView>> createMultiTypes();

    Object getItem(int position);
}
