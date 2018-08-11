package com.example.tenx.groupliststest;

import java.util.ArrayList;
import java.util.List;

public class ResourceUtils {
    public static List<ListItem> getData(){
        List<ListItem> list = new ArrayList<>();
        list.add(new Headeritem("28 August 2018"));
        list.add(new EventItem("event1"));
        list.add(new EventItem("event2"));
        list.add(new EventItem("event3"));
        list.add(new EventItem("event4"));
        list.add(new EventItem("event5"));
        list.add(new EventItem("event6"));
        list.add(new Headeritem("29 August 2019"));
        list.add(new EventItem("event7"));
        list.add(new EventItem("event8"));
        list.add(new EventItem("event9"));
        list.add(new EventItem("event10"));
        list.add(new EventItem("event11"));
        list.add(new EventItem("event12"));
        list.add(new Headeritem("30 August 2019"));
        list.add(new EventItem("event13"));
        list.add(new EventItem("event14"));
        list.add(new EventItem("event15"));
        list.add(new EventItem("event16"));
        list.add(new EventItem("event17"));
        list.add(new EventItem("event18"));
        return list;

    }
}
