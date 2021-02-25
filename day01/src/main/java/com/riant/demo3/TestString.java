package com.riant.demo3;

/**
 * @Classname TestString
 * @Description TODO
 * @Date 2021/2/26 0:28
 * @Created by 张斌
 */
public class TestString {
    public static void main(String[] args) {
        String s1 = "china";
        String s2 = "china";
        String s3 = "china";
        String ss1 = new String("china");
        String ss2 = new String("china");
        String ss3 = new String("china");
        System.out.println(s1==s2);//true
        System.out.println(s1==s3);//true
        System.out.println(ss1==s2);//false
        System.out.println(ss1==s3);//false
    }
}
