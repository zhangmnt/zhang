package cn.njupt.chapter010203;

public class PersonTest {
    public static void main(String[] args) {
        Person p =new Person();
//        p.age=10;//不符合常理
        p.setAge(10);
        p.setName("haoren");
        System.out.println(p.getName());
        System.out.println(p.getAge());
    }
}
