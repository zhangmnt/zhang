package cn.njupt.mianshi.huawei;

import java.util.Arrays;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){

            String str=sc.next();
            if(str.length()==0){
                System.out.println("error.0001");
            }
            String[] a=str.split(",");
            Arrays.sort(a);
            int[] b = new int[100];

            for(int i=0;i<a.length;i++){
                b[i]=i;
                for(int j=0;j<a.length;j++){
                    if(a[i]==a[j]){
                        b[i]++;
                    }
                }
            }
            for(int i=0;i<b.length-1;i++){
                if(b[i]==b[i+1]){
                    b[i+1]=0;
                }
            }
            int max=1;
            for(int i=0;i<b.length;i++){
                if(max<b[i]){
                    max=i;
                }

            }
            int n=max;
            System.out.println(a[0]);

        }

    }
}