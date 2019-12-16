package com.zsun.java.chapter1;

/**
 * @author : zsun
 * @date : 2019/12/16 19:56
 */
public class GetCurrentThread {
    public static void main(String[] args) {
        CountOperate c = new CountOperate();
        c.setName("B");
        Thread t1 = new Thread(c);
        c.setName("C");
        t1.setName("A");
        c.setName("D");
        t1.start();
        // 如果 setName("E") 在 t1.start() 之前运行，则是E，否则是 D
        c.setName("E");
    }
}
