package cn.njupt.day12.Demo02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
FileInputStream读取文件
 */
public class FileInputSteamTest01 {
    public static void main(String[] args) {
        try {
            FileInputStream fis=new FileInputStream("H:\\IDEA\\IDEA Project\\day12-code\\src\\monkey.txt");
            try {
                System.out.println(fis.read());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
//        Shishi();
    }

//    public void Shishi(){
//        System.out.println("shishi");
//    }
}
