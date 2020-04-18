package cn.njupt.mianshi.huawei.biancheng2017;

import java.util.Scanner;

public class suijishu2 {
/**
 * 1、测试数据有多组，一定要有while
 * 2、需要手动输入数据，而不是计算机产生随机数
 * @author Administrator
 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int[] c = qucong(a);

            for(int i = 0; i < 1000; i++) {
                if(c[i] == 1) {
                    System.out.println(i);
                }
            }
        }
    }

    public static int[] qucong(int[] a) {
        int[] b = new int[1000];
        for(int i = 0; i < 1000; i++) {
            b[i] = 0;
        }
        for(int i = 0; i < a.length; i++) {
            b[a[i]] = 1;
        }
        return b;
    }
}