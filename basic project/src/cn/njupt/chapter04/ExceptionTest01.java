package cn.njupt.chapter04;

public class ExceptionTest01 {
    public static void main(String[] args) {
        int a=1024;
        int b=0;
        if(b==0){
            System.out.println("b的值不能为0");
        }else{
            int c=a/b;
        }
        System.out.println("chenggong");
    }
}
