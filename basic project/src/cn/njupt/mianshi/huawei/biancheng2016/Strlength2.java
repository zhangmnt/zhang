package cn.njupt.mianshi.huawei.biancheng2016;

import java.util.*;

public class Strlength2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.next();
            int[] a=new int[266];
            for(int i=0;i<str.length();i++){
                a[str.charAt(i)]++;
                if(a[str.charAt(i)]==1)
                    System.out.print(str.charAt(i)+"");
            }
            System.out.println();
        }
    }
}