package cn.njupt.jichubiancheng;

import java.util.Scanner;

public class quchongfu2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            while (sc.hasNext()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
                String a = sc.next();
                StringBuffer b=new StringBuffer();
                for(int i=0;i<a.length();i++){
                    char c=a.charAt(i);
                    int firstIndex=a.indexOf(c);
                    int lastIndex=a.lastIndexOf(c);
                    if(lastIndex==firstIndex||firstIndex==i){
                        b.append(c);
                    }
                }
                System.out.println(b.toString());
            }
        }

}
