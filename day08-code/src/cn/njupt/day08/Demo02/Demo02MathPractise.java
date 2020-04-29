package cn.njupt.day08.Demo02;
//import java.Math;
public class Demo02MathPractise {
    public static void main(String[] args) {
        int count=0;

        double min=-10.8;
        double max=5.9;

        System.out.println((int)min);
        for (int i = (int)min; i < max; i++) {
            if(6<Math.abs(i)||Math.abs(i)<=2){
                count++;
                System.out.println(i);
            }
        }
        System.out.println("符合要求的整数有"+count+"个");

    }
}
