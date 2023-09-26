package ch13;

public class Ex13_3 {
    static long startTime = 0;

    public static void main(String[] args) {

    }
}


class ThreadEx3_1 extends Thread {
    public void run(){
        for (int i = 0; i < 300 ; i ++){
            System.out.printf("%s",new String("|"));
        }

        System.out.print("소요 시간2:" + (System.currentTimeMillis()));
    }
}