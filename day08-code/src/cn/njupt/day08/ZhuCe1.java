package cn.njupt.day08;

import java.util.Scanner;

public class ZhuCe1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String name = input.next();
        String pass = input.next();
        String tel = input.next();
        if ("zhangsan".equals(name) || "lisi".equals(name)){
            System.out.println("用户名已存在");
            return;
        }
        String regexPass = "^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{8,16}$";
        if (!pass.matches(regexPass)) {
            System.out.println("密码格式错误");
            return;
        }
        String regexTel = "^1\\d{10}$";
        if (!tel.matches(regexTel)) {
            System.out.println("请输入正确的手机号");
            return;
        }
        System.out.println("注册成功");
    }
}