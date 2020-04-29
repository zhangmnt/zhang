package cn.njupt.day12.Demo01;
/*
使用StringBuffer进行字符串的拼接
 */
public class StringBuffer01 {
    public static void main(String[] args) {
        StringBuffer sb1=new StringBuffer(30);
        sb1.append("www");
        sb1.append(".");
        sb1.append("ZHangm");
        sb1.append(".");
        sb1.append("com");
        System.out.println(sb1);//会自动调用字符串方法
        System.out.println(sb1.toString());

        sb1.insert(4,"41024");
        System.out.println(sb1);

        sb1.delete(5,8);
        System.out.println(sb1);
    }
}
