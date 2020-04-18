package cn.njupt.day08.njupt.day04;

/*
方法基础知识

定义格式：
方法名称（）；

注意事项：
1、方法定义的先后顺序无所谓
2、方法定义必须是挨着的，不能在一个方法的内部定义另一个方法
3、方法定义之后，不会自动执行；如果想要执行，一定要进行方法的调用
 */
public class Demo01Method {
    public static void main(String[] args) {
        printMethod();
        printMethod2();
        for (int m = 0; m < 5; m++) {
            for (int n = 0; n < 20; n++) {
                System.out.print("*");
            }
            System.out.println("I");
        }

    }

    public static void printMethod() {
        for (int m = 0; m < 5; m++) {
            for (int n = 0; n < 20; n++) {
                System.out.print("*");
            }
            System.out.println("D");
        }
    }

    public static void printMethod2() {
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 20; i++) {
                System.out.print("*");
            }
            System.out.println("E");
        }
    }
}