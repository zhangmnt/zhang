package cn.njupt.day09.Demo01;
/*
定义父类和普通类一样：public class 父类
定义子类：public class 子类 extends 父类
 */
public class Demo01Extends {
    public static void main(String[] args) {
        Teacher teacher=new Teacher();

        teacher.method();//继承父类的method

        Assistant assistant=new Assistant();

        assistant.method();
    }
}
