package cn.njupt.day08.njupt.day07.Demo04;

import java.util.ArrayList;

public class Demo04ArrayListEach {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("赵丽颖");
        list.add("dilireba");
        list.add("Gulkinazha");
        list.add("赵");
        list.add("赵丽");
        list.add("丽");
        list.add("颖");
        list.add("丽颖");
        list.add("赵丽颖21");
        list.add("赵丽颖2");
        list.add("赵丽颖3");
        
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list);
        }
    }
}
