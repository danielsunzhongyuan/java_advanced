package com.zsun.java.tij.chapter10.innerclasses;

/**
 * Created by zsun.
 * DateTime: 2019/05/06 19:35
 */
public class MultiNestingAccess {
    public static void main(String[] args) {
        MNA mna = new MNA();
        MNA.A a = mna.new A();
        MNA.A.B b = a.new B();
        b.h();
    }
}

class MNA {
    private void f() {
    }

    class A {
        private void g() {
        }

        public class B {
            void h() {
                g();
                f();
            }
        }
    }
}
