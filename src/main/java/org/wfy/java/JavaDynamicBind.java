package org.wfy.java;

public class JavaDynamicBind {
    public static void main(String[] args) {
        //将一个子类的对象地址，交给了一个父类的引用
        A1 a1 = new B1();
        System.out.println(a1.sum()); //返回30
        System.out.println(a1.getI());//返回20
    }
}

class A1 {
    public int i = 10;

    public int sum() {
        return getI() + 10;
    }

    public int getI() {
        return i;
    }
}

class B1 extends A1 {
    public int i = 20;

    public int getI() {
        return i;
    }
}