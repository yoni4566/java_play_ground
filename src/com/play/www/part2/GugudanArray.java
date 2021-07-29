package com.play.www.part2;

public class GugudanArray {
    public static void main(String[] args) {
        int[] result = new int[9];
       for (int k=2; k<10; k++){
           for (int i=0; i<result.length; i++){
               result[i] = k*(i+1);
           }
           for (int j=0; j<result.length; j++){
               System.out.println(k +" * "+(j+1) +" = " + result[j]);
           }
       }
    }
}
