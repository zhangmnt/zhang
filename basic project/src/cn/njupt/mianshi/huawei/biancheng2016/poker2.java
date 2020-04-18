package cn.njupt.mianshi.huawei.biancheng2016;

import java.util.Scanner;
public class poker2 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            String A=scanner.nextLine();
            System.out.println(new poker2().judge2(A));
        }
        scanner.close();
    }
    //得到牌的张数
    public int judge(String a){
        String[] A=a.split(" ");
        if(A.length==1)
            return 1;
        else if(A.length==3)
            return 3;
        else if(A.length==4)
            return 4;
        else if(A.length==5)
            return 5;
        else return 2;
    }
    //得到输出结果的方法
    public String judge2(String A){
        String[] op=A.split("-");
        int a=judge(op[0]);
        int b=judge(op[1]);
        if(op[0].equals("joker JOKER")||op[1].equals("joker JOKER"))
            return "joker JOKER";
        if(a!=b){
            if(a==4)
                return op[0];
            else if(b==4)
                return op[1];
            else return "ERROR";
        }
        else {
            String a1=op[0].split(" ")[0];
            String a2=op[1].split(" ")[0];
            return lk(a1,a2)?op[0]:op[1];
        }
    }
    //判断字符串A是否大于字符串b
    public boolean lk(String a,String b){
        String[] s=new String[]{"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        int c=0,d=0;
        for(int i=0;i<s.length;i++){
            if(s[i].equals(a))
                c=i;
            if(s[i].equals(b))
                d=i;
        }
        return c>=d?true:false;
    }
}