package cn.njupt.jichubiancheng;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class zifuchuan {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = br.readLine().split(";|,");
        System.out.println("The each subject score of  No. "+strings[0]+" is "+String.format("%.2f",Double.parseDouble(strings[1]))+", "+String.format("%.2f",Double.parseDouble(strings[2]))+", "+String.format("%.2f",Double.parseDouble(strings[3]))+".");
    }
}

