package cn.njupt.day08.njupt.day07.Demo01;

import java.util.Scanner;//1、导包
/*
Scanner类的功能：可以实现键盘输入数据到程序当中
引用类型的一般使用步骤：

1、导包
import 包路径.类名称
如果需要使用的目标类，和当前类位于同一个包下，则可以省略导包语句不写
只有Java.lang包下的内容不需要导包，其他的包都需要import语句

2、创建
类名称 对象名=new类名称（）；

3、使用
对象名。成员方法名（）

获取键盘输入的一个int数字；int num = sc.nextInt();
获取键盘输入的一个字符：String str= sc.next();
 */
public class Demo01Scanner {
    public static void main(String[] args) {
        System.out.println("===========");

        //2、创建
        Scanner sc = new Scanner(System.in);//System.in代表从键盘输入

        int num=sc.nextInt();
        System.out.println("输入的数字是： "+num);

        String str=sc.next();
        System.out.println("输入的字符串是： "+str);

        System.out.println("请输入第一个数：");
        int a=sc.nextInt();
        System.out.println("请输入第二个数：");
        int b=sc.nextInt();
        System.out.println("请输入第三个数：");
        int c=sc.nextInt();
        int sum=a+b+c;
//        int max;
//        if(a>b){
//            max=a;
//        }else max=b;
//        if (max<c){
//            max=c;
//        }
        //三元运算符
        int temp=a>b?a:b;
        int max = temp>c?temp:c;

        System.out.println("三个数的和是："+sum);
        System.out.println("其中最大的数是："+max);
    }


}



