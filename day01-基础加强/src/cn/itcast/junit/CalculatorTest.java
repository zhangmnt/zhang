package cn.itcast.junit;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator c=new Calculator();

        int result=c.add(1,23);
        System.out.println(result);

        int result1=c.sub(23,2);
        System.out.println(result1);

        String str = "abc";
        System.out.println("=========");
    }
}
