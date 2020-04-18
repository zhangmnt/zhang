package cn.njupt.day08.njupt.project.demo1;

//创建继承类Person的类Student
class Person //创建父类person,
{//定义父类中的变量,名字name,性别sex，年龄age.
    String name;
    String sex;
    int age;

    void getInfo(String n,String s,int a)//定义方法getInfo获取父类的信息。
    {
        name=n;
        sex=s;
        age=a;
    }
    void showInfo() //定义方法showInfo显示父类的信息。

    {
        System.out.println("姓名:"+name);
        System.out.println("性别:"+sex);
        System.out.println("年龄:"+age);
    }
}
public class Student extends Person//创建子类Student继承父类person。
{//定义子类中的变量。学号id,学校school,总分zongfen,排名p。
    String id;
    String school;
    int zongfen;
    int p;
    void setInfo(String num,String school_name,int zf,int pm)//定义方法setInfo获取子类的信息
    {
        id=num;
        school=school_name;
        zongfen=zf;
        p=pm;
    }
    void outputInfo()//定义方法outInfo显示子类的信息
    {
        System.out.println("学校："+school);
        System.out.println("学号："+id);
        System.out.println("姓名："+name);
        System.out.println("性别："+sex);
        System.out.println("年龄："+age);
        System.out.println("总分:"+zongfen);
        System.out.println("班级排名："+p);
    }
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        System.out.println("输出第一学生的信息");
        Student zhang;
        zhang=new Student();//
        zhang.name="张三";
        zhang.sex="男";
        zhang.age=23;
        zhang.showInfo();

        System.out.println("输出第二个学生的信息");
        Student li=new Student();
        li.getInfo("李玲","女",20);
        li.setInfo("101","贵州大学",689,1);
        li.outputInfo();
        //第48行到第60行：创建学生类的对象，并通过对象调用其相关的成员变量和成员方法。
    }

}