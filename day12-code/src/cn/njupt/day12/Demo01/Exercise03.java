package cn.njupt.day12.Demo01;
/*
统计一个字符串中大写字母出现的次数
 */
public class Exercise03 {
    public static void main(String[] args) {
        String src="monKEY";
        int count=0;

        char[] c=src.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if(c[i]>='A'&&c[i]<='Z'){
                count++;
            }
        }
        System.out.println("大写字母出现的次数是"+count);

        StringBuffer sc=new StringBuffer();
        System.out.println(sc.capacity());

        StringBuffer sc1=new StringBuffer(100);
        System.out.println(sc1.capacity());

        StringBuffer sc2=new StringBuffer("zhang");
        System.out.println(sc2.capacity());
    }
}
