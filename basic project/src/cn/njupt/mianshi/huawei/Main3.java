package cn.njupt.mianshi.huawei;

import java.util.*;

public class Main3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()) {
            String str1 = sc.next();
            String str2 = sc.next();
            String[] a=str2.split(",");
            int n=a.length/3;
            String[] b=new String[n];
            for(int i=0,j=0;i<a.length;i=i+3){
                b[j]=a[i]+a[i+1]+a[i+2];
                j++;

            }
            List<String> list=new ArrayList<>();
            for(int m=0;m<b.length;m++){
                if(b[m].indexOf(str1)!=-1){
                    list.add(b[m]);
                }
            }
            if(list.size()==0){
                System.out.println("FALL");
            }
            for(int z=0;z<list.size();z++){
                StringBuffer at=new StringBuffer();
                String[] g=list.get(z).split("=");

            }

        }

    }
}