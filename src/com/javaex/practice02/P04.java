package com.javaex.practice02;

import java.util.Scanner;

public class P04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d[] = {50000,10000,5000,1000,500,100,50,10,5,1};
        int count;
        int money;
        System.out.print("금액 : ");
        money = scanner.nextInt();

        for (int i = 0; i<d.length; i++) {
            count = money/d[i];
            money -= (d[i] * count);
            System.out.println(d[i] + "원 : " + count + "개");
        }
    }
}
