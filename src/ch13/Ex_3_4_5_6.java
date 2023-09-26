package ch13;
// 3~6 쓰레드의 구현과 실행
public class Ex_3_4_5_6 {
    public static void main(String[] args) {
        // 3. 쓰레드의 구현과 실행

        // public interface Runnable {
        //      public abstarct void run();
        //  }
        // 1. Thread클래스를 상속
        // class MyThread extends Thread {
        //       public void run() { // Thread클래스의 run()을 오버라이딩
        //          /* 작업내용 */
        //       }
        // }

        // MyThread t1 = new MyThread();    // 쓰레드의 생성
        // t1.start(); //   쓰레드의 실행

        // 2. Runnalble 인터페이스를 구현
        // class MyThread2 implements Runnable {
        //       public void run() { // Runnable 인터페이스의 추상메서드 run() 을 수현
        //          /* 작업내용 */
        //       }
        // }

        //방법1.    // Runnable r = new MyThread2();
                   // Thread t2 = new Thread(r);   // Thread(Runnable r)
        // 방법2.   //  Thread t2 = new Thread(new MyThread2());    // 위 두줄 Runnable r 과 Thread t2 를 한번에 작성 할수도 있다
        // t2.start();


        //5.쓰레드의 실행 - start()
        // - 쓰레드를 생성한 후에 start()를 호출해야 쓰레드가 작업을 시작한다.
        //  ex)
        //  ThreadEx1_1 t1 = new ThreadEx_1(); // 쓰레드 t1을 생성한다.
        //  ThreadEx1_1 t2 = new ThreadEx_1(); // 쓰레드 t2을 생성한다.

        // t1.start();  // 쓰레드 t1을 실행시킨다.
        // t2.start();  // 쓰레드 t2을 실행시킨다.

        // 6. start()와 run()
        //  class ThreadTest {
        //      public static void main(String args [] ) {
        //          MyThread t1 = new MyThread();   // 1.쓰레드 생성
        //          t1.start();     // 2.쓰레드 실행
        //      }
        //  }

        // class Mythread extends Thread {
        //      public void run() {
        //      //  ...
        //      }
        //  }









    }
}
