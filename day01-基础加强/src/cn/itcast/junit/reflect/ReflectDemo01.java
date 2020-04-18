package cn.itcast.junit.reflect;

import java.lang.reflect.Field;

public class ReflectDemo01 {
    public static void main(String[] args) {
        //1.获取Person的Class对象
        Class personClass=Person.class;


        //2.Field[] getFields();
        Field[] fields=personClass.getFields();
        for(Field field:fields){
            System.out.println(field);
        }

    }
}
