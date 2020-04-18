package cn.njupt.mianshi.huawei.biancheng2017;

import java.util.Scanner;
import java.util.TreeSet;

public class suijishu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){

            TreeSet<Integer> a=new TreeSet<Integer>();//有序
            int n=sc.nextInt();
            if(n>0){
                for(int i=0;i<n;i++){
                    a.add(sc.nextInt());//a[i]=sc,nextInt();
                }
            }
            for(Integer i:a){
                System.out.println(i);
            }
            System.out.println(a);
        }
    }
}