package cn.njupt.day08.Demo01;
/*
键盘输入字符串，统计各种字符出现次数
 */

import java.util.Scanner;

public class Demo07StringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String input = sc.next();

        int countUpper = 0;
        int countLower = 0;
        int countNumber = 0;
        int countOther = 0;

//        input.toCharArray();
        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if ('A' <= ch && ch <= 'Z') {
                countUpper++;
            } else if ('a' <= ch && ch <= 'z') {
                countLower++;
            } else if ('0'<= ch && ch <= '9') {
                countNumber++;
            } else {
                countOther++;
            }
        }
        System.out.println("大写字母有" + countUpper + "个");
        System.out.println("小写字母有" + countLower + "个");
        System.out.println("数字有" + countNumber + "个");
        System.out.println("其它有" + countOther + "个");
    }
}
