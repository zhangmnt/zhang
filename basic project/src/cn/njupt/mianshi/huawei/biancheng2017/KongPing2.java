package cn.njupt.mianshi.huawei.biancheng2017;
import java.util.Scanner;
public class KongPing2 {
 //   private static int blank;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n= sc.nextInt();
            int drink = 0;
            int remain;
            if (n > 0 && n <= 100) {
                if (n == 1) {
                    n = 0;
                } else if (n == 2) {
                    n = 1;
                }
                while (n > 2) {  //10,4,5
                    drink += n / 3;   //3 drink,4 drink
                    remain = n % 3;  //1 remain,1 remain
                    n = n / 3 + remain;   //4 blank,2 blank
                    if (n == 2) {
                        drink++;
                    }
                }
            }
            System.out.println(drink + "");
        }
    }
}
