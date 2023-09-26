package ch13;
// 22~25 sleep(),interrupt()
public class Ex_22_23_24_25 {
    public static void main(String[] args) {
        // 22. sleep()  // static 메서드 이다 쓰레드의 static 종류는 sleep()(재우기), yield() (양보) 이 있다 자기 자신에게서만 동작한다
        // - 현재 쓰레드를 지정된 시간동안 멈추게 한다.
        // ex)
        //   static void sleep(long millis)             // 천분의 일초 단위        // 잠잘시간 지정
        //   static void sleep(long millis, int nanos)  // 천분의 일초 + 나노초

        // - 예외처리를 해야 한다.(InterruptedException 발생하면 깨어남)
        // ex)
        // try {
        //      Thread.sleep(1, 500000);    // 쓰레드를 0.0015초 동안 멈추게 한다.      // time up (시간 종료)
        // } catch (InterruptedException e) {}      // Interrupt 누군가 깨워야 한다

        // void delay(long millis) {
        //      try {
        //              Thread.sleep(millis);
        //          } catch (InterruptedException e) {}
        // }

        // - 특정 쓰레드를 지정해서 멈추게 하는 것은 불가능 하다.
        // ex)
        // try {                                                    try {
        //      th1.sleep(2000);                            =>            Thread.sleep(2000);
        // } catch(InterruptedException e) {}                       } catch(InterruptedException e) {}
        //  ▶︎th1 이 잠자는것 처럼 보이지만 실제로 본인는 자는것이다              ▶︎ 이렇게 명확하게 표기 해야 누가 자는지 정확하게 알수 있다

        // 24. interrupt()
        // - 대기상태(WAITING)인 쓰레드를 실행대기 상태(RUNNABLE)로 만든다. 작업중단 상태를 실행가능하게 만든다
        // 관련 메서드

        // void interrupt() - 쓰레드의 interrupted상태를 false에서 true로 변경.
        // boolean isInterrupted - 쓰레드의 interrupted상태를 반환.
        // static boolean interrupted() - 현재 쓰레드의 interrupted상태를 알려주고, false로 초기화

        // ex)
        // public static void main(String[] args) {
        //      ThreadEx13_2 th1 = new ThreadEx13_2();
        //      th1.start();
        //      ...
        //      th1.interrupt();    // interrrupt() 를 호출하면, interrupted상태가 true가 된다.
        //      ...
        //      System.out.println("isInterrupted(): " + th1.isInterrupted());  //true









    }
}
