package com.play.www.part1;

 class HelloWorld {
    static long startTime = 0;
    public static void main(String[] args) {
        Thread_1 th1 = new Thread_1();
        Thread_2 th2 = new Thread_2();
        startTime =  System.currentTimeMillis();
        th1.start();
        th2.start();
        try {
            th1.join(); //main쓰레드가 th1의 작업이 끝날 때까지 기다린다.
            th2.join(); //main쓰레드가 th2의 작업이 끝날 때까지 기다린다.
        } catch (InterruptedException e) {}
        System.out.println("소요시간 : " + (System.currentTimeMillis() - startTime));
    }
 }

    class Thread_1 extends Thread {
        @Override
        public void run() {
            for (int i=0; i< 5; i++){
                System.out.println( (i+1) + "번째 HelloWorld~~!!");
            }
        }
    }

     class Thread_2 extends Thread {
        @Override
        public void run() {
            for (int i=0; i< 5; i++){
                System.out.println( "===== 메롱 =====");
            }
        }
    }


