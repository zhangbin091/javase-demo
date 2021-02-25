package com.riant.demo2;

/**
 * @Classname Demo
 * @Description TODO
 * @Date 2021/2/26 0:08
 * @Created by 张斌
 */
public class Demo {
    public static void main(String[] args) {
        Son son=new Son();
        son.show();
    }
}
class Father{
     final void show(){
        System.out.println("father show");
    }
}
class Son extends Father{
//    public final void show() {
// final修饰的方法不能被重写，但此方法仍然被继承
//    }
}