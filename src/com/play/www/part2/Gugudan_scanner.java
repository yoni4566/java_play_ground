package com.play.www.part2;

import com.sun.codemodel.internal.JCase;

import java.util.Scanner;

public class Gugudan_scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean checkNum = false;
        System.out.println("출력하고 싶은 구구단은 ? ");
        int number = sc.nextInt();
        System.out.println("입력값 ?? " + number);

        if (number > 1 && number < 10) {
            checkNum = true;
        } else {
            while (!checkNum){
                System.out.println("2~9 사이의 값을 입력해주세요.");
                number = sc.nextInt();
                if (number > 1 && number < 10) {
                    checkNum = true;
                    break;
                }
            }
        }

        System.out.println("checkNum ?? " + checkNum);
        if (checkNum) {
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
}
