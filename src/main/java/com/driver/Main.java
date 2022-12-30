package com.driver;

public class Main {

    public static void main(String[] args){
        RWOnly obj = new RWOnly();
//        obj.name = "khuch";
//        System.out.print(obj.name);
        //name' has private access in 'com.driver.RWOnly'
        obj.setName("kuch");
        System.out.print(obj.getName());
    }
}