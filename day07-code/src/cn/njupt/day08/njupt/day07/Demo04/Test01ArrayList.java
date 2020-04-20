package cn.njupt.day08.njupt.day07.Demo04;

import java.util.ArrayList;
import java.util.Random;

public class Test01ArrayList {
    public static void main(String[] args) {
        Random random = new Random();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            int r=random.nextInt(33)+1;
            list.add(r);
        }

        for (int i = 0; i < 6; i++) {
            System.out.println(list.get(i));
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
