package cn.njupt.chapter04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest04 {
    public static void main(String[] args){
        try {
            FileInputStream fis=new FileInputStream("d:/monkey1024.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            String msg=e.getMessage();
            System.out.println(msg);
        }
        System.out.println("catch语句后面");
    }
}
