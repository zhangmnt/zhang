package cn.njupt.day08;

import java.util.Scanner;

public class Mianshi {

    public static void main(String[] args){
        int result1 = 0;
        int result2 = 0;
        int multiply = 0;
        try {
            Scanner xx = new Scanner(System.in);
            int input = xx.nextInt();
            if (input != 0) {
                int factor = input > 0 ? 1 : -1;
                for (;;) {
                    if (factor == input) {
                        break;
                    }
                    if ((input - factor) * factor > multiply) {
                        multiply = (input - factor) * factor;
                        result1 = input - factor;
                        result2 = factor;
                    }
                    if (input > 0) {
                        factor++;
                    } else {
                        factor--;
                    }
                }
            } else {
                result1 = -1;
                result2 = 1;
            }
        } catch (Exception e) {
        }
        System.out.println(Integer.min(result1, result2)*Integer.max(result1, result2));
    }

}