package com.example.tenx.groupliststest;

public class EventItem extends ListItem{
    String name;

    public EventItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    int getType() {
        return ListItem.TYPE_EVENT;
    }
}
