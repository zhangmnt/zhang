package cn.njupt.day11.Demo02;

//如果出现了重名现象，那么格式是:
//外部类名称.this.外部类成员变量名
public class Outer {
    int num = 10;//外部类方法的成员变量

    public class Inner {
        int num = 20;//内部类方法的成员变量

        public void methodInner() {
            int num = 30;//内部类方法的局部变量
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(Outer.this.num);
        }
    }
}
