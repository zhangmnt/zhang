package cn.njupt.mianshi.huawei.biancheng2016;

import java.util.Scanner;

public class Strlength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String []a = new String[100];
            for (int i = 0; i < 100;i++ ) {
                a[i] = sc.nextLine();
                if (i == 1) {
                        System.out.println(a[i]);
                    } else {
                        for (int j = 0; j < i; j++) {
                            if (a[i] == a[j]) {
                                i++;
                            }else{
                            System.out.println(a[i]);}
                        }
                    }

            }

        }
    }
}
