package com.play.www.part2;

import java.util.Scanner;

public class Gugudan_scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("출력하고 싶은 구구단은 ? ");
        int number = sc.nextInt();
        System.out.println(number+"단 입니다.");
        for (int i=1; i < 10; i++){
            System.out.println( number + "*" + i + " = " + (number*i));
        }
    }
}
