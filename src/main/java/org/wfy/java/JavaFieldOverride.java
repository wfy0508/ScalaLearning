package org.wfy.java;

/*
 * @Author wfy
 * @Date 2020/9/22 16:08
 * org.wfy.java
 */

public class JavaFieldOverride {
    public static void main(String[] args) {
        Sub c1 = new Sub();
        System.out.println(c1.s); //返回Sub
        System.out.println(((Super) c1).s); //（返回Super）强制转换， 仍然可以访问到被隐藏的字段

        Super c2 = new Sub();
        System.out.println(c2.s); //返回Super
    }
}

class Super {
    String s = "Super";
}

class Sub extends Super {
    String s = "Sub";
}
