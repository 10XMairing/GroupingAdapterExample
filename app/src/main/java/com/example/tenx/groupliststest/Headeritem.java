package com.example.tenx.groupliststest;

public class Headeritem extends ListItem{

    String name;

    public Headeritem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    int getType() {
        return ListItem.TYPE_HEADER;
    }
}
