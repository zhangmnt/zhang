package cn.njupt.mianshi.huawei.biancheng2016;

import java.util.LinkedList;
import java.util.Scanner;

public class shuzushanchu3 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       while(sc.hasNext()){
            int n = sc.nextInt();
            LinkedList  list=new LinkedList();
            if(n> 1000){n= 999;}
            for(int i = 0; i <n; i ++){
                list.add(i);
            }
            while(list.size()!= 1){
               for(int j = 0; j <2; j ++){
                    list.add(list.poll());
                }
                list.poll();
            }

            System.out.println(list.poll());
       }
    }
}
