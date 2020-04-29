package cn.njupt.day09.Demo04;

public class NewPhone extends Phone {
    @Override
    public void show(){
//        System.out.println("显示号码");
        super.show();//把父类show方法拿过来重复利用
        System.out.println("显示姓名");
        System.out.println("显示头像");
    }


}
