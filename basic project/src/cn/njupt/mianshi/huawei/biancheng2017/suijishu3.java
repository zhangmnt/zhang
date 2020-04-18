package cn.njupt.mianshi.huawei.biancheng2017;


import java.util.Arrays;
import java.util.Scanner;

public class suijishu3
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);//对输入的数组进行排序
            //对排好序的数组中重复的数组进行选择输出，首先输出第一个数
            System.out.println(a[0]);
            for(int i=1;i<n;i++){
                if(a[i] != a[i-1])
                    System.out.println(a[i]);
            }
        }
    }
}