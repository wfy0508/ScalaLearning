package org.wfy.java;

/*
 * @Author wfy
 * @Date 2020/9/22 14:03
 * org.wfy.java
 */

public class JavaConstructor {
    public static void main(String[] args) {
        B b = new B();
        B b1 = new B("java");

    }
}

class A {
    public A() {
        System.out.println("A()");
    }

    public A(String name) {
        System.out.println("A(String name): " + name);
    }
}

class B extends A {
    public B() {
        System.out.println("B()");
    }

    public B(String name) {
        super(name);
        System.out.println("B(String name): " + name);
    }
}