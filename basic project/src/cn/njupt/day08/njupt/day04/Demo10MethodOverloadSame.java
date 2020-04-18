package cn.njupt.day08.njupt.day04;

public class Demo10MethodOverloadSame {
    public static void main(String[] args) {
        byte a=10;
        byte b=20;
        System.out.println(isSame(a,b));

    }

    public static boolean isSame(byte a, byte b) {
//        boolean same;
        return a == b;
    }
}
