package cn.njupt.day10.demo01;

/*
接口就是多个类的公共规范
接口是一种引用数据类型，最重要的内容就是其中的抽象方法
定义接口格式
public interface 接口名称{

}

接口使用步骤：
1、接口不能直接使用，必须有一个实现类来实现该接口
格式：
 */
public class Demo01Interface {
    public static void main(String[] args) {
        //错误写法：不能直接new接口对象使用
//        MyInterfaceAbstract inter =new MyInterfaceAbstract();
        MyInterfaceAbstractlmpl impl=new MyInterfaceAbstractlmpl();
        impl.methodAbs1();
        impl.methodAbs2();
        impl.methodAbs3();
        impl.methodAbs4();

    }
}
