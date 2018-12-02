package com.zchu.labelselection;

public interface OnItemAction {

    void onAppendItem(Label label);
    void onRemoveItem(Label label);
    void onClickItem(Label label);
}
