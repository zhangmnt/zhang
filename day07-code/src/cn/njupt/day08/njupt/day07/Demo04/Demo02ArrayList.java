package cn.njupt.day08.njupt.day07.Demo04;

import java.util.ArrayList;

/*
数组的长度不可以发生改变
但是ArrayList集合的长度是可以随意变化的

对于Arraylist来说，有一个尖括号<E>代表泛型
泛型：也就是装在集合当中的所有元素，全都是统一的什么类型
注意：泛型只能是引用类型，不能是基本类型

扩展一丢丢：随意ArrayList集合来说，直接打印得到的不是地址值，而是内容
如果内容是空，得到的是空的中括号
 */
public class Demo02ArrayList {
    public static void main(String[] args) {
        //创建了一个ArrayList集合，集合的名称是List，里面装的全都是String字符串类型的数据
        //备注：从JDK1.7+开始，右侧的尖括号内部可以不写内容，但是<>本身还是要写的
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);//输出[]

        //向集合中添加一些数据，需要用到add方法
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
        System.out.println(list.add("赵丽颖"));//true
        System.out.println(list);//[赵丽颖, dilireba, Gulkinazha]

//        list.add(100);//错误写法！因为创建的时候尖括号泛型已经说明是字符串，添加进去的元素就必须是字符串才行

        //获取元素
        String name=list.get(2);
        System.out.println(name);

        //删除元素
        String delete= list.remove(3);
        System.out.println( delete);
        System.out.println(list);

        //获取集合长度
        System.out.println(list.size());

    }
}
