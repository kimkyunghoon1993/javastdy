package ch13;

// 7~13 싱ㅔ글 쓰레드와 멀티 쓰레드, 쓰레드 I/O 블락킹
public class Ex_7_8_9_10_11_12_13 {

    public static void main(String[] args) {
        // 7.main 쓰레드
        // - main 메서드의 코드를 수행하는 쓰레드
        // ex)
        // public class Hello{
        //      public static void main(String[] args){
        //          System.out.println("Hello,world.");
        //      }
        // }

        // - 쓰레드는 2가지 가 있다 '사용자 쓰레드'와 '데몬 쓰레드' 두 종류가 있다.
        // 실행 중인 사용자 쓰레가 하나도 없을 때 프로그램은 종료 된다.

        // 8. 싱글쓰레드와 멀티쓰레드
        // ▶︎ 싱글쓰레드
        // ex)
        // class ThreadTest {
        //      public static void main(String aggs[]) {
        //           for (int i = 0; i < 300; i ++) {
        //                  System.out.println("-");
        //           }
        //           for (int i = 0; i < 300; i++) {
        //              System.out.println("|");
        //           }
        //      }
        // }

        // ▶︎ 멀티쓰레드
        // class ThreadTest {
        //       public static void main(String args[]) {
        //          MyThread1 th1 = new MyThread1();
        //          MyThread2 th2 = new MyThread2();
        //          th1.start();
        //          th2.start();
        //       }
        // }

        // class MyThread1 extends Thread {
        //      public void run() {
        //          for(int i = 0; i < 300; i++) {
        //              System.out.println("-");
        //          }
        //      }
        // }

        // class MyThread2 extends Thread {
        //   public void run() {
        //          for(int i = 0; i < 300; i++){
        //              System.out.println("|");
        //          }
        //   }
        // }

        // 싱글쓰레드 VS 멀티쓰레드 실행 시간
        // 싱글쓰레드가 빨르다 why 멀티쓰레드는 번갈아 가면서 실행 되기 때문에 context switching 라는 것이 발생한다 그로 인해 시간이 살짝더 느리다
        // 그치만 여러가지 작업을 하는것이 장점이다 예) 채팅
        // 작업을 효율 적으로할수 있다

        // 11. 쓰레드의 I/O 블락킹(blocking)
        // I/O 란? input 과 output 을 이야기 한다 입력 과 출력을 말한다
        // 블락킹(막힘)  입출력시 작업 중단
        // ex)
        // 싱글쓰레드
        // class TheradEx6 {
        //      public static void main(String[] args){
        //          String input = JOptionPane.showInoputDialon("아무 값이나 입력하세요.");
        //          System.out.println("입력하신 값은 " + input + "입니다.");    // 입력받기
        //          for(int i = 0; i > 0 ; i--){
        //              System.out.println(i);                          // 카운트 다운
        //              try { Thread.sleep(1000); } catch(Exception e) {}
        //          }
        //      }
        //  }
        // 사용자로부터 입력을 기다리는 구간 아무 일도 하지 않는다

        // 멀티쓰레드로 변경 하면
        // class ThreadEx7 {
        //      public static void main (String[] args) {
        //          ThreadEx7_1 th1 = new ThreadEx_1();
        //          th1.start();
        //
        //          String input = JQptionPane.showInputDialog("아무 값이나 입력하세요.");        // 메인 쓰레드
        //          System.out.println("입력하신 값은 " + input + "입니다.");
        //      }
        // }

        // class ThreadEx7_1 extends Thread {
        //      public void run() {
        //          for(int i = 10; i > 0 ; i --) {
        //              System.out.println(i);                                              // 서브 쓰레드
        //              try { sleep(1000);    } catch (Exception e) {}
        //           }
        //      }
        // }




    }

}
