package cn.njupt.day08;

import java.util.HashSet;
import java.util.Scanner;

public class ZhuCe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.next();
        String password = scanner.next();
        String number = scanner.next();

        HashSet<String> hashNames = new HashSet<String>();
        hashNames.add("zhangsan");
        hashNames.add("lisi");
        if (!hashNames.contains(username)) {
            hashNames.add(username);
            if ((password.length() <= 16) && (password.length() >= 8)) {
                if (password == "^[A-Za-z0-9]+$") {
                    if ((number.length() == 11) && (number.indexOf(0) == 1)) {
                        System.out.println("注册成功");
                    } else {
                        System.out.println("请输入正确的手机号码");
                    }
                }
            } else {
                System.out.println("密码格式错误");
            }
        } else {
            System.out.println("该用户已存在");
        }
    }
}