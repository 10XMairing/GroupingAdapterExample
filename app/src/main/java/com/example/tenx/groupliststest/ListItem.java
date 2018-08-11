package com.example.tenx.groupliststest;

public abstract class ListItem {

    public static int TYPE_HEADER=0;
    public static int TYPE_EVENT=1;

    abstract int getType();
}
