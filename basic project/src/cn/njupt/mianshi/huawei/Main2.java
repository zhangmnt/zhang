package cn.njupt.mianshi.huawei;

import java.util.*;

public class Main2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){

            String str=sc.next();
            if(str.length()==0){
                System.out.println("error.0001");
            }
            String[] a=str.split(",");
            Arrays.sort(a);
            HashMap<String,Integer>map=new HashMap<>();
            for(int i=0;i<a.length;i++){
                if(!map.containsKey(a[i])){
                    map.put(a[i],1);
                }else{
                    map.put(a[i],map.get(a[i])+1);
                }
            }
            int n=0;
            List<String>list=new ArrayList<>();
            for(String b:a){
                if(n<map.get(b)){
                    n=map.get(b);
                    list.add(b);
                }
            }
            int m=list.size()-1;
            System.out.println(list.get(m));
        }

    }
}