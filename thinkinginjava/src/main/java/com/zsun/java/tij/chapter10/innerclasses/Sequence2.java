package com.zsun.java.tij.chapter10.innerclasses;

/**
 * Created by zsun.
 * DateTime: 2019/05/01 18:50
 */
public class Sequence2 {
    private Object[] items;
    private int next = 0;
    private String s;

    public Sequence2(int size) {
        items = new Object[size];
        s = "xxx";
    }

    public class Item2 {
        @Override
        public String toString() {
            return "Item2{" +
                    "s='" + s + '\'' +
                    '}';
        }
    }

    public Item2 item() {
        return new Item2();
    }

    public void add(Object x) {
        if (next < items.length) {
            items[next++] = x;
        }
    }

    private class SequenceSelector implements Selector {
        private int i = 0;

        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if (i < items.length) {
                i++;
            }
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Sequence2 sequence = new Sequence2(10);
        for (int i = 0; i < 10; i++) {
            sequence.add(Integer.toString(i));
        }
        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
        System.out.println();

        Sequence2 s2 = new Sequence2(10);
        for (int i = 0; i < 10; i++) {
            s2.add(s2.item());
        }

        selector = s2.selector();
        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
        System.out.println();
    }
}
