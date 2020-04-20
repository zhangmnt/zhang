package cn.njupt.day08.njupt.day07.Demo04;
/*
题目：
定义一个数组，用来存储3个Person对象

数组有一个缺点：一旦创建，程序运行期间长度不可以发生改变
 */
public class Demo01Array {

    public static void main(String[] args) {
        //首先创建一个长度为3的数组，里面用来存放Person类型的对象
        Person[] array =new Person[3];
        System.out.println(array[0]);//数组默认初始值为null

        Person one =new Person("迪丽热巴",18);
        Person two =new Person("古力娜扎",28);
        Person three =new Person("玛尔扎哈",38);

        //将one中的地址值复制到数组的0号元素位置
        array[0]=one;
        array[1]=two;
        array[2]=three;

        System.out.println(array[0]);//Person@73035e27
        System.out.println(array[1]);//Person@64c64813
        System.out.println(array[2]);//Person@3ecf72fd

        Person person=array[1];
        System.out.println(person.getName());//古力娜扎
        System.out.println(array[1].getName());//古力娜扎

    }
}
