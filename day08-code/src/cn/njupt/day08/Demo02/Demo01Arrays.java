package cn.njupt.day08.Demo02;

import java.util.Arrays;

public class Demo01Arrays {
    public static void main(String[] args) {
//        int[] intArray = {10, 20, 30};
//        String intStr = Arrays.toString(intArray);
//        System.out.println(intStr);
//
//        int[] array1 = {1, 2, 3, 14, 5};
//        Arrays.sort(array1);
//        System.out.println(Arrays.toString(array1));
        
        String str ="sadcnlsbvbcfdjsbvbdflxizsbv235bkjlbjklbl";
        char[] chars=str.toCharArray();
        Arrays.sort(chars);

        for (int i = chars.length-1;i>=0; i--) {
            System.out.print(chars[i]);

        }
    }
}
