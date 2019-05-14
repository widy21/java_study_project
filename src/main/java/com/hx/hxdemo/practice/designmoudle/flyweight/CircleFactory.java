package com.hx.hxdemo.practice.designmoudle.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CircleFactory {
    private static Map<String, Circle> cm = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = cm.get(color);
        if (circle == null) {
            circle = new Circle(color);
            cm.put(color, circle);
            System.out.println("create a new Cicle...");
        }
        return circle;
    }
}
