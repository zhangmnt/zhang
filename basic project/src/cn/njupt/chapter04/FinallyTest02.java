package cn.njupt.chapter04;

public class FinallyTest02 {
    public static void main(String[] args) {

        int result=m1();
        System.out.println(result);
    }

    public static int m1() {
        try {
            int i = 1024;
            return i;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally中的语句");
        }
        return 10;
//        System.out.println(i);
    }
}
