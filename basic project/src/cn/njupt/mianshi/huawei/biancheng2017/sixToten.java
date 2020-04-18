package cn.njupt.mianshi.huawei.biancheng2017;

import java.util.Scanner;
public class sixToten {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String a=sc.next().substring(2);
            System.out.println(Integer.parseInt(a,16));
        }

    }
}