package cn.njupt.day12.Demo01;
/*
正则表达式
 */
public class Regex {
    public static void main(String[] args) {
        //将下列字符串中的数字修改为中
        String s1="monkey1024study1j2a3v4a";
        String s2=s1.replaceAll("monkey","zhong");

        //String s3="monkey1024study1j2a3v4a";
        String s3=s1.replaceAll("\\d","中");//String中的replaceAll方法,
        //\d表示匹配数字，前面的\表示转义字符
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        String s4="mm";
        System.out.println(s4.matches("^m{2}$"));

        String email="zhangmnt@163.com";
        System.out.println(email.matches("\\w[-\\w.+]*@([A-Za-z0-9][-A-Za-z0-9]+.)+[A-Za-z]{2,14}"));

        String email2="zhangmnt@163";
        System.out.println(email2.matches("\\w[-\\w.+]*@([A-Za-z0-9][-A-Za-z0-9]+.)+[A-Za-z]{2,14}"));

        String phone = "15850785062";
        System.out.println(phone.matches("0?(13|14|15|18)[0-9]{9}"));

        String phone2 = "158507850627";
        System.out.println(phone2.matches("0?(13|14|15|18)[0-9]{9}"));


    }
}
