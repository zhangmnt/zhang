package cn.njupt.day12.Demo01;
/*
基本数据类型，值不会改变
引用数据类型，值是会改变的
 */
public class StringBuffer02 {
    public static void main(String[] args) {
        String s="String";
        System.out.println(s);
        change(s);
        System.out.println(s);

        StringBuffer sb=new StringBuffer(30);
        sb.append("StringBuffer");
        System.out.println(sb);
        change(sb);
        System.out.println(sb);

    }
    public static void change(String s){
        s+="java";

    }
    public static void change(StringBuffer sb){
        sb.append("java");

    }
}
