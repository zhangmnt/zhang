package cn.njupt.mianshi.huawei.biancheng2017;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class suijishu5{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int input = 0;
        if(count>0){
            List list = new ArrayList<Integer>();
            while(count>0){
                input = sc.nextInt();
                list.add(input);
                --count;
            }
            Collections.sort(list);
            int length = list.size();
            List flag = new ArrayList();
            for(int i = 0;i<length-1;i++){
                if(list.get(i)==list.get(i+1)){
                    flag.add(i);
                }
            }
            for(int i = 0;i<flag.size();i++){
                list.remove((int)flag.get(i));
            }

            for(int i = 0;i<list.size();i++){
                System.out.println(list.get(i));
            }
        }
    }

}
