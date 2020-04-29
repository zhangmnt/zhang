package cn.njupt.day09.Demo05;

import java.util.ArrayList;
public class Manager extends User {
    public Manager(){

    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalmoney,int count){
        //首先需要一个集合，用来存储若干个红包的金额
        ArrayList<Integer> redList=new ArrayList<>();

        //首先看一下群主自己有多少钱
        int leftMoney=super.getMoney();
        if(totalmoney>leftMoney){
            System.out.println("余额不足");
            return redList;
        }

        super.setMoney(leftMoney-totalmoney);

        int avg=totalmoney/count;
        int mod=totalmoney%count;

        for (int i = 0; i < count-1; i++) {
            redList.add(avg);
        }

        int last=avg+mod;
        redList.add(last);

        return  redList;
    }
}
