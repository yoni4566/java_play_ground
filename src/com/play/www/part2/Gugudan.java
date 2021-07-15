package com.play.www.part2;

public class Gugudan {
    public static void main(String[] args) {
        // 2단
        System.out.println("=============== 2 단 ===============");
        for (int  i=0; i < 9; i++){
            System.out.println( "2 * " + (i+1) + " = " + (2 * (i+1)));
        }


        //1단 ~ 9단 출력
        for (int i=2; i<10; i++){
            System.out.println("===============" +  i + "단 ===============");
            for (int j=0; j<9; j++){
                System.out.println( i + "*" + (j+1) + " = " +  (i * (j+1)));

            }
        }
        System.out.println("=============== 가로로 출력 ===============");
        for (int i=0; i<9; i++){
            for (int j=2; j<10; j++){
                System.out.print( j + "*" + (i+1) + " = " +  (j * (i+1)) +"\t\t");
            }
            System.out.println();
        }
    }
}
