package ch13;
// 18~21 데몬쓰레드, 쓰레드의 상태
public class Ex_18_19_20_21 {
    public static void main(String[] args) {
        // 18. 데몬 쓰레드(daemon therad)
        // - 일반 쓰레드(non-daemon therad)의 작업을 돕는 보조적인 역할을 수행.
        // - 일반 쓰레드가 모두 종료되면 자동적으로 종료된다.
        // - 가비지 컬렉터, 자동저장, 화면 자동갱신 등에 사용된다.
        // - 무한루프와 조건문을 이용해서 실행 후 대기하다가 특정조건이 만족되면 작업을 수행하고 다시 대기하도록 작성한다.
        // ex)
        // public void run() {
        //      while(true) {
        //          try {
        //              Thread.sleep(3 * 1000); // 3초마다
        //          } catch(InterruptedException e) {}
        //          // autoSave의 값이 true이면 autoSave()를 호출한다.
        //          if(autoSave) {
        //               autoSave();
        //          }
        //      }
        //  }

        // boolean isDaemon() - 쓰레드가 데몬 쓰레드인지 확인한다. 데몬 쓰레드이면 true를 반환
        // void setDaemon(boolean on) - 쓰레드를 데몬 쓰레드로 또는 사용자 쓰레드로 변경 매개변수 on 을 true로 지정하면 데몬 쓰레드가 된다.

        // * setDaemon(boolean on)은 반드시 start()를 호출하기 전에 실행되어야 한다. 그렇지 않으면 lllegalThreadStateException이 발생한다.

        // 20. 쓰레드의 상태

        // NEW
        // - 쓰레드가 생성되고 아직 start()가 호출되지 않은 상태

        // RUNNABLE
        // - 실행 중 또는 실행 가능한 상태

        // BLOCKED
        // - 동기화 블럭에 의해서 일시정지된 상태(lock이 풀릴 때까지 기다리는 상태)

        // WAITING.TIMED_WAITING
        // - 쓰레드의 작업이 종료되지 않았지만 실행 가능하지 않은(unrunnable) 일시정지상태, TIME_AWITING은 일시정지시간이 지정된 경우를 의미

        // TERMINATED
        // - 쓰레드의 작업이 종료된 상태

        // 21. 쓰레드의 실행제어
        // - 쓰레드의 실행을 제어할 수 있는 메서드가 제공된다. 이 들을 활요해서 보다 효율적인 프로그램의 작성할 수 있다.

        // static void sleep(long millis)
        // static void sleep(long millis, int nanos)
        // - 지정된 시간(천분의 일초 단위) 동안 쓰레드를 일시정지시킨다. 지정한 시간이 지나고 나면, 자동적으로 다시 실행대기상태가 된다.

        // void join()
        // void join(long millis)
        // void join(long millis, int nanos)
        // - 지정된 시간동안 쓰레드가 실행되도록한다. 지정된 시간이 지나거나 작업 종료되면 join()을 호출한 쓰레드로 다시 돌아와 실행을 계속한다.

        // void interrupt()
        // - sleep()이나 join()에 의해 일시정지상태인 쓰레드를 개워서 실행 대기상태로 만든다. 해당 쓰레드에서는 interrupted Exception이 발생함으로써
        // 일시정지 상태를 벗어나게 된다

        // void stop()
        // - 쓰레드를 즉시 종료시킨다

        // void suspend()
        // - 쓰레드를 일시정지시킨다, resume()을 호출하면 다시 실행대기상태가 된다.

        // void resume()
        // - suspend()에 의해 일시정지상태에 있는 쓰레드를 실행대기상태로 만든다.

        // static void yield()
        // - 실행 중에 자신에게 주어진 실행시간을 다른 쓰레드에게 양보(yield) 하고 자신은 실행대기 상태가 된다.


    }
}
