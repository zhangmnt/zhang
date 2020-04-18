package cn.njupt.chapter04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest02 {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis=new FileInputStream("d:/monkey1024.txt");
    }
}
