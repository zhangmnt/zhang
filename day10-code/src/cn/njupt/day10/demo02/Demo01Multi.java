package cn.njupt.day10.demo02;
/*

代码当中体现多态性：父类指向子类对象
父类名称 对象名=new 子类名称（）；
或者
接口名称 对象名=new 实现类名称（）；
 */
public class Demo01Multi {
    public static void main(String[] args) {
        //使用多态的写法
        Fu obj=new Zi();

        obj.method();
        obj.methodFu();

    }
}
