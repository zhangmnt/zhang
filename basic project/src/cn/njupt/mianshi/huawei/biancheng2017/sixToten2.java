package cn.njupt.mianshi.huawei.biancheng2017;

import java.util.Scanner;
public class sixToten2 {
/**
 * Created by 华夏紫云 on 2015/11/23.
 */

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            StringBuffer a=new StringBuffer();
            a.append(sc.next());
            //String str=sc.next();
            String str=a.reverse().substring(0,a.length()-2);
            char ch[]=str.toCharArray();
            int sum=0;
            for(int i=0;i<ch.length;i++){
                if(ch[i]>='A'&&ch[i]<='F'){
                    sum+=(Integer.valueOf(ch[i])-55)*Math.pow(16,i);
                }else {
                    sum+=(Integer.valueOf(ch[i])-48)*Math.pow(16,i);
                }
            }
            System.out.println(sum);
            // System.out.println(Integer.valueOf('6'));
        }
    }

}