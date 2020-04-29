package cn.njupt.day08.Demo01;
//import
//对于引用类型来说，==进行的是地址值的比较
/*
如果确实需要字符串的内容比较，可以使用两个方法
public boolean equals(Object obj):参数可以是任何对象，只有参数是一个字符串并且内容相同的才会给true，否则返回false
备注：任何对象都能用Object进行接收
equals方法具有对称性，a.equals(b)和b.equals(a)是一样的
 */
//双引号直接写的字符串在常量池当中，new的不在池当中
public class Demo01String {
    public static void main(String[] args) {
        //使用空参构造
        String str1=new String();//小括号留空，说明字符串什么内容都没有
        System.out.println(str1);

        //根据字符数创建字符串合
        char[] charArray={'A','B','C'};
        String str2=new String(charArray);
        System.out.println(str2);

        //根据字节数组创建字符串
        byte[] byteArray={97,98,99};
        String str3=new String(byteArray);
        System.out.println(str3);

        //直接创建
        String str4="Hello";//不管new不new，直接加上双引号，就是字符串对象
        System.out.println(str4);

        String str5="abc";
        String str6="abc";

        char[] charArray1={'a','b','c'};
        String str7=new String(charArray1);


        //对于基本类型，比较的是数量，
        //对于引用类型，比较的是地址值
        System.out.println(str5==str6);//true
        System.out.println(str5==str7);//false
        System.out.println(str6==str7);//false

        System.out.println("======");

        String str8="Hello";
        String str9="Hello";
        char[] charArray2={'H','e','l','l','o'};
        String str10=new String(charArray2);

        System.out.println(str8.equals(str9));//true
        System.out.println(str9.equals(str10));//true
        System.out.println(str10.equals("Hello"));//true
        System.out.println("Hello".equals(str8));//true

        String str11="hello";
        System.out.println(str8.equals(str11));//false
        System.out.println("===============");

        String str12="abc";
        System.out.println("abc".equals(str12));//推荐
        System.out.println(str12.equals("abc"));//不推荐

        String str13=null;
        System.out.println("abc".equals(str13));//推荐，false
//        System.out.println(str13.equals("abc"));//不推荐，报错
//        Exception in thread "main" java.lang.NullPointerException
//        at cn.njupt.day08.Demo01.Demo01String.main(Demo01String.java:66)


        System.out.println("==========");
        String strA="java";
        String strB="Java";
        System.out.println(strA.equals(strB));//false,严格区分大小写
        System.out.println(strA.equalsIgnoreCase(strB));//true,忽略大小写

        System.out.println("String当中与获取相关的常用方法");
        //
        int length="sbdcjgadsjbfvkzsbj,vbgf,zdjr".length();
        System.out.println(length);

        String str31="Hello";
        String str32="World";
        String str33=str31.concat(str32);
        System.out.println(str31);//Hello
        System.out.println(str32);//World
        System.out.println(str33);//HelloWorld


        System.out.println("==============获取指定索引位置的单个字符");
        char ch="Hello".charAt(1);
        System.out.println(ch);//e

        //查找参数字符串在本来字符串当中出现的第一次索引位置
        //如果根本没有，返回-1值
        String original="HelloWorldHelloWorld";
        int index=original.indexOf("llo");
        System.out.println(index);//2

        System.out.println("HelloWorld".indexOf("abc"));//-1

        System.out.println("字符串的截取方式");
//        String  substring(int index):截取从参数位置一直到字符串末尾，返回新字符串
//        String substring(int begin,int end);截取中间字符串

        String str41="HelloWorld";
        String str42=str41.substring(5);
        System.out.println(str41);//HelloWorld
        System.out.println(str42);//World

        String str43=str41.substring(5,7);
        System.out.println(str43);//Wo

        System.out.println("String当中与转换相关的常用方法");
//        char[] toCharArray();将当前字符串拆分成为字符串数组作为返回值
//        byte[] getBytes();获得当前字符串底层的字节数组
//        String replace(CharSequence oldString,CharSequence newString);
//        将所有出现的老字符串替换成为新的字符串，返回新字符串
        char[] chars="Hello".toCharArray();
        System.out.println(chars[0]);//H
        System.out.println(chars.length);//5

        System.out.println("转换成为字节数组");
        byte[] bytes="abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        String str51="How do you do?";
        String str52=str51.replace("o","*");
        System.out.println(str51);//How do you do?
        System.out.println(str52);//H*w d* y*u d*?


        String lang1="会不会玩儿呀";

        System.out.println("字符串的分割方法");
        /*
        分割字符串的方法：
        public String[] split(String regex):按照参数的规则，将字符串切分成若干部分
         */

    }
}
