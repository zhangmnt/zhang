package cn.njupt.day08.njupt.day04;

/*
使用方法的时候，注意事项：

1、方法应该定义在类当中，但是不能在方法中再定义方法。不能嵌套
2、方法定义的先后顺序无所谓
3、如果定义之后不会执行，如果想要执行，一定要调用：单独调用、打印调用和赋值调用
4、如果方法有返回值，必须写上return 返回值
5、return返回值数据类和方法的返回值类型对应起来
6、对于一个void没有返回值的方法只写return
7、void方法最后一行return可以不写
8、return不能连写

 */
public class Demo08MethodNotice {
    public static void main(String[] args) {
        method3();

    }

    public static int method1(){
        return 10;
    }

    public static void method2(){
//        return 10;//方法没有返回值
        return;//没有返回值，只是结束方法
    }

    public static void method3(){
        System.out.println("AAA");
        System.out.println("BBB");
//        return;//可以省略
    }
}
