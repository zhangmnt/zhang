package cn.njupt.jichubiancheng;

public class erjinzhi {

    public static void main(String[] args){
        int a = 1234;
        System.out.println("0"+Integer.toOctalString(a));
        System.out.println("0X"+Integer.toHexString(a).toUpperCase());
        System.out.println("0X"+Integer.toHexString(a).toUpperCase());
        System.out.println("0"+Integer.toOctalString(a));
        String c="ABFFFF";
        System.out.println(Integer.parseInt(c,16));
        String b="156465";
        System.out.println(Integer.parseInt(b,8));

    }
}
