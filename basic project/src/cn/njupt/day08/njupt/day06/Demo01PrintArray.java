package cn.njupt.day08.njupt.day06;

import java.sql.SQLOutput;
import java.util.Arrays;

/*
面向过程：当需要实现一个功能的时候，每一个具体的步骤都要亲力亲为，详细处理每一个细节
面向对象：当需要实现一个功能的时候，不关心具体的步骤，二十找一个已经具有该功能的人，来帮我做做事儿
 */
public class Demo01PrintArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));
        //使用面向对象
        //找一个JDK给我们提供好的Arrays类
        //其中有一个toString方法，直接就能把数组变成想要的格式的字符串


        System.out.println("======");

        //使用面向过程
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array[i] + "]");
            } else
                System.out.print(array[i] + ", ");
        }

        System.out.println("========");
        int[] arrayA = new int[10];
        System.out.println(Arrays.toString(arrayA));

        System.out.println("========");
        System.out.println(Arrays.toString(array));

    }
}
