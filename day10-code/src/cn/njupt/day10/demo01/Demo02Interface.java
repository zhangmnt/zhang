package cn.njupt.day10.demo01;

public class Demo02Interface {
    public static void main(String[] args) {
        MyInterfaceDefaultA a=new MyInterfaceDefaultA();
        a.methods();

        a.methodDefault();

        MyInterfaceDefaultB b=new MyInterfaceDefaultB();
        b.methods();
        b.methodDefault();
    }
}
