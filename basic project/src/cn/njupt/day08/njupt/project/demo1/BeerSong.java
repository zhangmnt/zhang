package cn.njupt.day08.njupt.project.demo1;


public class BeerSong {
    public static void main (String[] args){
        int beerNum = 99;
        String word = "bottles";

        while (beerNum>0) {
            if(beerNum==1) {
                word="bottle";//单数的瓶子
            }

            System.out.println(beerNum+" " + word + " of beer on the wall");
            System.out.println(beerNum+" "+ word + " of beer.");
            System.out.println("Take one down.");
            System.out.println("Pass it around.");
            beerNum = beerNum-1;

            if (beerNum==0) {
                System.out.println("No more bottles of beer on the wall");
            }//else结束
        }//while循环结束
    }//main方法结束
}//class结束


