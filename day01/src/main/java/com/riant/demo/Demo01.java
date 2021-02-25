package com.riant.demo;

/**
 * @Classname Demo01
 * @Description TODO
 * @Date 2021/2/25 23:35
 * @Created by 张斌
 */
public class Demo01 {
    int a=10;//实例变量，成员变量，属于实例
    static int b=20;//类变量，属于类
    final int d=30;//常量，属于实例的常量
    final static int c=200;//常量，属于类的常量
    public static void main(String[] args) {
        Demo01 demo01=new Demo01();
        demo01.show();
    }
    public void show(){
        int a=100;//局部变量
        System.out.println(a);
    }
}
