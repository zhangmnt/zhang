package cn.njupt.day10.demo01;

/*
在任何版本Java中都能定义抽象方法

public abstract 返回值类型 方法名称（参数列表）；

注意事项：
接口当中的抽象方法，修饰符必须是两个固定的关键字

使用步骤：
public class 实现类名称 implements 接口名称
 */
public interface MyInterfaceAbstract {

    //这是一个抽象方法
    public abstract void methodAbs1();

    abstract  void methodAbs2();

    public  void methodAbs3();

    void methodAbs4();
}
