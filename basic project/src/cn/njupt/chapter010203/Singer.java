package cn.njupt.chapter010203;

public class Singer {
    public static void main(String[] args) {
        System.out.println("sssss");

    }

    private String name;

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public void m1(){
        m2();
        this.m2();//这两种方式都可以调用到m2方法
    }

    public void m2(){
        System.out.println("唱歌");
    }
}
