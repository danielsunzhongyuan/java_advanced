package com.zsun.java.tij.chapter9.interfaces.interfaceprocessor;

/**
 * Created by zsun.
 * DateTime: 2019/05/01 18:43
 */
public class Exchange {
    public String exchange(String a) {
        return new StringBuilder(a).reverse().toString();
    }

    public static void main(String[] args) {
        String a = "abcdefg";
        Apply.process(new ExchangeAdapter(new Exchange()), a);
    }
}

class ExchangeAdapter implements Processor {
    private Exchange e;

    public ExchangeAdapter(Exchange e) {
        this.e = e;
    }

    @Override
    public String name() {
        return getClass().getSimpleName();
    }

    @Override
    public String process(Object o) {
        return e.exchange((String) o);
    }
}
