package main;

import entity.Item;
import utils.GenerateUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author GreedyStar
 * Date   2018/3/26
 */
public class Main {

    public static void main(String[] args) throws Exception {
        Map<Object, Object> data = new HashMap<>();
        List<Item> items = new ArrayList<>();
        items.add(new Item("a1", "b1", "c1", "d1", "e1", "f1"));
        items.add(new Item("a2", "b2", "c2", "d2", "e2", "f2"));
        items.add(new Item("a3", "b3", "c3", "d3", "e3", "f3"));
        items.add(new Item("a4", "b4", "c4", "d4", "e4", "f4"));
        items.add(new Item("a5", "b5", "c5", "d5", "e5", "f5"));
        items.add(new Item("a6", "b6", "c6", "d6", "e6", "f6"));
        data.put("list", items);
        GenerateUtil.generatePDF(data, "demo");
    }

}
