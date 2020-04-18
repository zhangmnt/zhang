package cn.njupt.day08.njupt.day05;

public class Demo02Array {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
//        int[] arrayB;
//        int len = arrayA.length;

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
//            System.out.println("======");
        }


//        int[] arrayB=arrayA;
//        int max = array[0];
        for (int min = 0, max = array.length-1; min<max;min++,max--) {
            int temp=array[min];
            array[min]=array[max];
            array[max]=temp;

        }
//        System.out.println("数组中最大元素为:" + max);
        System.out.println();
        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i]);
//            System.out.println("======");
        }
        System.out.println();
    }

}
