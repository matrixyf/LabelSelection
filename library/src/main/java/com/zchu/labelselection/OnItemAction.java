package com.zchu.labelselection;

import java.util.List;

public interface OnItemAction {

    /** 点击未选中label的时候回调*/
    void onAppendItem(Label label, Action0 action);
    /** 编辑状态下点击已选中label的回调*/
    void onRemoveItem(Label label);
    /** 未编辑状态下点击选中label的回调*/
    void onClickItem(Label label);
    /** 编辑状态下移动选中label进行重排序的回调，回调参数是新的排序选中列表*/
    void onMoveItem(List<Label> labels);
}
