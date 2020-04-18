package cn.njupt.chapter010203;

public class Person {

    private String name;

    private int age;

    //对外提供公共的访问方式，需要编写get和set方法
    public void setAge(int _age){
        if(_age>0&&_age<128){
            age=_age;
        }else{
            System.out.println("年龄不符合常理，请重新设置");
        }

    }

    public int getAge(){
        return age;
    }

    public void setName(String _name){
        name =_name;
    }

    public String getName(){
        return name;
    }
}
