package com.example.demo1;

import java.util.Scanner;

public class HelloApplication {
    public  static void main(String[] args) {
//        System.out.println("Hello World \nI am a java Devloper");
        int A=50;
        int B=10;

        Scanner sc=new Scanner(System.in);


        int age;
        do {
            System.out.println("Enter Your Age");
            age=sc.nextInt();
            System.out.println(age);
        }while(age>=0);
        System.out.println("Khatam tata baybay gaya ");
    }
}