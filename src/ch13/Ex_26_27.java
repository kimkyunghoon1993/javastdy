package ch13;
// 26,27 suspend(),resume()
public class Ex_26_27 {
    public static void main(String[] args) {
        // 26. suspend(), resume(), stop()      // 저번 시간에 쓰레드의 실행제어 sleep(),interrupt()를 배웠다
        // - 쓰레드의 실행을 일시정지, 재개, 완전정지 시킨다.

        // 관련 메서드
        // void suspend() - 쓰레드를 일시정지 시킨다.
        // void resume()  - suspend() 에 의해 일시정지된 쓰레드를 실행대기상태로 만든다.
        // void stop()    - 쓰레드를 즉시 종료시킨다.
        // 위 메서드들이 Deprecated 되었다 사용하지 않을 것을 권장한다   why? dead-lock 교착상태

        // - suspend(), resume(), stop()은 교착상태에 빠지기 쉬워서 deprecated 되었다.
        // 그럼 어떻게 해야 되는가? 직접 구현해야 된다
        // class ThreadExx17_1 implements Runnable {
        //      boolean suspended = false;      // 일시정지
        //      bollena stopped = false;        // 정지
        //
        //      public void run() {
        //          while(!stopped) {
        //              if(!suspended) {
        //                  /* 쓰레드가 수행할 코드를 작성 */
        //              }
        //          }
        //      }
        //      public void suspend() { susplended = true; }
        //      public void resume()  { suspended = false; }
        //      public void stop()    { stopped = ture;    }




    }
}
