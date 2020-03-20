package com.atguigu.bean;

import java.util.ArrayList;

//这是单行注释
public class Customer {

    public static void main(String[] args) {
//        System.out.println("helloworld!! 你好");


        ArrayList list = new ArrayList();

        list.add(123);
        list.add(145);
        list.add(788);

        //list循环的缩写
        for (Object s : list) {
            System.out.println("结果是："+s);
        }






    }

    public void get() {

    }
}
