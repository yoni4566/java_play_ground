package com.play.www.part2;

public class GugudanArray {
    public static void main(String[] args) {
        int[] result = new int[9];
       for (int k=2; k<10; k++){
           for (int i=0; i<result.length; i++){
               result[i] = k*(i+1);
           }
           System.out.println("배열에 담은 구구단 " + k +"단 결과값을 출력해보자!!");
           for (int j=0; j<result.length; j++){
               System.out.println(k +" * "+(j+1) +" = " + result[j]);
           }
       }
    }
}
