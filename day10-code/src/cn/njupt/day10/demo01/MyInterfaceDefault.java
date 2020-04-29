package cn.njupt.day10.demo01;

public interface MyInterfaceDefault {
    public abstract void methods();

//    public abstract void methods2();

    public default void methodDefault(){//public是灰色说明可以省略

        System.out.println("这是新添加的默认方法");
    }

}
