package cn.njupt.day08.njupt.day05;

public class Demo01Array {
    public static void main(String[] args) {
        int[] arrayA = new int[300];
        double[] arrayB = new double[10];
        String[] arrayC = new String[5];
        int[] arrayD = new int[]{5, 15, 25};//静态定义数组
        int[] arrayE = {15, 25, 35};//静态定义省略版，省略版不能拆分

        int[] arrayF;
        arrayF = new int[]{1, 1, 1};//拆分模式
        System.out.println(arrayA);//直接打印数组得到的是数组对应的是内存地址哈希值，[I@f5f2bb7，I代表int类型，后面是16进制
        System.out.println(arrayD[0]);
        System.out.println(arrayC[0]);//

        System.out.println(arrayA[301]);//超出范围
    }

}
