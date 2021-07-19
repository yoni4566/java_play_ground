package com.play.www.part2;

import java.util.Scanner;

public class Gugudan_scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("출력하고 싶은 구구단은 ? ");
        int number = sc.nextInt();
        System.out.println("======= for문을 이용한 "+number+"단 구구단 출력 =======");
        for (int i=1; i < 10; i++){
            System.out.println( number + " * " + i + " = " + (number*i));
        }
        System.out.println("======= while문을 이용한 "+number+"단 구구단 출력 =======");
        int j = 1;
        while(j < 10) {
            System.out.println(number + " * " + j + " = " + (number*j));
            j++;
        }
    }
}
