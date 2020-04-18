package cn.njupt.day08.njupt.day04;

/*
题目要求：
定义一个方法，用来打印指定次数的HelloWorld
 */
public class Demo07MethodPrint {
    public static void main(String[] args) {
        GetPrint(3);
    }

    /*
    三要素
    返回值类型：只是进行一大堆打印操作而已，没有计算，也没有结果要告诉调用处
    方法名称：GetPrint
    参数列表：到底要打印多少次？必须告诉我，否则我不知道多少次，没法打印，次数：int
     */

    public static void GetPrint(int N) {
        for (int i = 0; i < N; i++) {
            System.out.println("HelloWorld");
        }
    }

}

