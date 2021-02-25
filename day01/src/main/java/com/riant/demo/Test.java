package com.riant.demo;

/**
 * @Classname Test
 * @Description TODO
 * @Date 2021/2/25 23:53
 * @Created by 张斌
 */
public class Test {
    public static void main(String[] args) {
        Test test=new Test();
        test.showInt(6);//显示6
        A a=new A(8);
        a.showA();//显示 5
    }
    public void showInt(final int a){
        //a=20;对于基本类型，基本类型的值在方法内部是不能够改变的，编译不通过,final修饰的变量a无法被修改
        System.out.println(a);
    }
    public void showA(final A a){
        //a=new A(5);引用类型，无法对a进行重新赋值，引用无法改变
        a.setA(5);//a的属性可以修改，引用类型执行的地址不能修改
        a.showA();
    }
}
class A{
    private int a;
    public A() {
    }
    public A(int a) {
        this.a = a;
    }
    public void showA(){
        System.out.println(a);
    }
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
}
