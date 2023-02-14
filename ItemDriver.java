package com.cdl.supermarket;

import java.util.HashMap;
import java.util.Map;


public class ItemDriver {
    public static void main(String[] args) {
        Map<Character,Double> map = new HashMap<>();
        ItemMap itemMap = new ItemMap();
        itemMap.setItemMap(map);
        itemMap.checkout();

    }

}
