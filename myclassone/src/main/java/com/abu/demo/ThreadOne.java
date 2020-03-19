package com.abu.demo;

public class ThreadOne {
    public static void main(String[] args) {
        new Thread(()->{
            System.out.println("启动了01");
        },"threadOne").start();

        new Thread(()->{
            System.out.println("启动了02");
        },"threadOne").start();

    }
}
