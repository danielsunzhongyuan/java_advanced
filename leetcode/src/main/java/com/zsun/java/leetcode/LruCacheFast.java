package com.zsun.java.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : zsun
 * @date : 2020/09/02 17:52
 */
public class LruCacheFast {
    class Node {
        int key;
        int value;
        Node pre;
        Node next;
        public Node() {
        }

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private Map<Integer, Node> map = new HashMap<>();
    private Node head;
    private Node tail;
    private int capacity;
    private int size;

    public LruCacheFast(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.pre = head;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            removeNode(node);
            addFirst(node);
            size++;
            return node.value;
        }
        return -1;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.value = value;
            map.put(key, node);
            removeNode(node);
            addFirst(node);
        } else {
            if (size >= capacity) {
                size--;
                Node lastNode = tail.pre;
                map.remove(lastNode.key);
                removeNode(lastNode);
            }
            size++;
            Node node = new Node(key, value);
            addFirst(node);
            map.put(key, node);
        }
    }

    private void removeNode(Node x) {
        x.next.pre = x.pre;
        x.pre.next = x.next;
    }

    private void addFirst(Node x) {
        x.next = head.next;
        x.pre = head;
        x.next.pre = x;
        head.next = x;
    }
}
