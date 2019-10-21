package cn.blooming.other;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入邮箱地址：");
        String email = scanner.nextLine();
        Pattern p = Pattern.compile("^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$");
        Matcher matcher = p.matcher(email);
        if(matcher.matches()){
            System.out.println("right!");
        }else{
            System.out.println("error!");
        }
    }
}
