package cn.njupt.day12.Demo01;

import java.util.Scanner;

/*
问题：字符串反转，例如将"abc"变成"cba"

 */
public class Exercise01 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String input =s.next();

        char [] c=input.toCharArray();
        for (int i = c.length-1;i >= 0;  i--) {
            System.out.println(c[i]);

        }
    }
}
