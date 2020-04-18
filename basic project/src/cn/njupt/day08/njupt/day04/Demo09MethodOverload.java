package cn.njupt.day08.njupt.day04;

/*
对于功能类似的方法来说，因为参数列表不一样，却需要记住这么多不同的方法名称，太麻烦

方法的重载（Overload）：多个方法的名称一样，但是参数列表不一样

好处：只需要记住一个方法名称，就可以实现多个类似的功能

方法重载与下列因素有关：
1、参数个数不同
2、参数类型不同
3、参数的多类型书顺序不同
 */
public class Demo09MethodOverload {
    public static void main(String[] args) {
        /*System.out.println(sumTwo(10,20));
        System.out.println(sumThree(10,20,30));
        System.out.println(sumFour(10,20,30,40));*/

        System.out.println(sum(10,20,30,40));
        System.out.println(sum(10,20,30));
        System.out.println(sum(10,209));
    }

    public static int sum(double a,double b){
        System.out.println("ffffff");
        return (int)(a+b);
    }

    public static int sum(int a,int b){
        System.out.println("2222222");
        return a+b;
    }

    public static int sum(int a,int b,int c){
        System.out.println("333333333");
        return a+b+c;
    }

    public static int sum(int a,int b,int c,int d){
        System.out.println("4444444444");
        return a+b+c+d;
    }
}
