package cn.njupt.day08.njupt.day07.Demo04;
import java.util.ArrayList;
public class Demo05ArrayListbasic {
    public static void main(String[] args) {
        ArrayList<String> listA=new ArrayList<>();
//        ArrayList<int> listB=new ArrayList<>();//错误写法，泛型只能使用引用类型，不能是基本类型
        ArrayList<Integer> listB=new ArrayList<>();
        listB.add(100);
        listB.add(200);
        listB.add(300);
        System.out.println(listB);//[100, 200, 300]

        int num=listB.get(1);
        System.out.println(num);//200
    }
}
