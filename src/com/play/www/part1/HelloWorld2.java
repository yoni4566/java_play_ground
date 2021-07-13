package com.play.www.part1;

class HelloWorld2 {
    static long startTime = 0;
    public static void main(String[] args) {
        Thread_11 th1 = new Thread_11();
        Thread_22 th2 = new Thread_22();
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

class Thread_11 extends Thread {
    @Override
    public void run() {
        for (int i=0; i< 5; i++){
            System.out.println( (i+1) + "번째 HelloWorld~~!!");
        }
    }
}

class Thread_22 extends Thread {
    @Override
    public void run() {
        for (int i=0; i< 5; i++){
            System.out.println( "===== 메롱 =====");
        }
    }
}


