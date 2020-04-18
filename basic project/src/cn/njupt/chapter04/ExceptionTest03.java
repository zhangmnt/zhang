package cn.njupt.chapter04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
/*
使用throws关键字并不是真正的处理异常，而是交给调用者去处理
并不是说使用throws就不好，而是使用throws将问题暴露出来
 */
public class ExceptionTest03 {
    public static void main(String[] args) {

    }
    public static void m1() throws FileNotFoundException {
        m2();

    }
    public static void m2() throws FileNotFoundException {
        m3();

    }
    public static void m3()throws FileNotFoundException {
        FileInputStream fis =new FileInputStream("d:/monkey.text");


    }
}
