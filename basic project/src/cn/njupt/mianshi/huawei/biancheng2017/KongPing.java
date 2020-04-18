import java.util.Scanner;

public class KongPing{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int drink=0;
            int remain=0;
            if(n>0&&n<=100){
                if(n==1){
                    drink=0;
                }else if(n==2){
                    drink=1;
                }while(n>2){
                    drink+=n/3;
                    remain=n%3;
                    n=n/3+remain;
                    if(n==2){drink++;}
                }
                System.out.println(drink);
            }
        }


    }
}