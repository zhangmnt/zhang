package cn.njupt.day08.njupt.day07.Demo02;
import java.util.Scanner;
import java.util.Random;

public class Demo02Random {
    public static void main(String[] args) {
        Random r= new Random();
        int random=r.nextInt(100)+1;
        Scanner sc=new Scanner(System.in);

        int num=r.nextInt();
        System.out.println(num);
    }
}
