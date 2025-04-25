package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(6);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        for (int i = 0; i < list.size(); i++) {
            int x = list.get(i) + 2;
            list.set(i, x);
        }
        for (Integer i: list) {
            System.out.println(i);
        }
    }
}