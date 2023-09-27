package ch13;
// 28,29 join(),yield()
public class Ex_28_29 {
    public static void main(String[] args) {
        // 28. join()
        // - 지정된 시간동안 특정 쓰레드가 작업하는 것을 기다린다.

        // 관련 메서드
        // void join() - 작업이 모두 끝날 때까지
        // void join(long millis) - 천분의 일초 동안
        // void join(long millis, int nanos) - 천분의 일초 + 나노초 동안

        // - 예외처리를 해야 한다.(InterruptedException 이 발생하면 작업 재개)
        // ex)
        // public static void main(String args[]){
        //  ThreadEx19_1 th1 = new ThreadEx19_1();
        //  ThreadEx19_2 th2 = new ThreadEx19_2();
        //  th1.start();
        //  th2.start();
        //  startTime = System.currentTimeMillis();
        //
        // try {
        //      th1.join(); //  main 쓰레드가 th1 의 작업이 끝날 때까지 기다린다.
        //      th2.join(); //  main 쓰레드가 th2 의 작업이 끝날 때까지 기다린다.
        // } catch(InterrruptedException e) {}
        //
        //  System.out.print("소요시간 :" + (System.currentTimeMillis() - ThreadEx19.startTime));
        // }

        // ex)
        // public void run() {
        //      while(true)
        //          try {
        //               Thread.sleep(10*1000); // 10초를 기다린다.
        //          } catch (InterruptedException e) {
        //              System.out.println("Awaken by interrupt().");
        //          }
        //
        //          gc(); // garbage collection (가비지 컬렉터) 을 수행한다. 데몬쓰레드 (보조) : 데몬 쓰레드는 일반 쓰레드가 없으면 자동 종료 된다
        //          System.out.println("Garbage Collected. Free Memory :" + freeMemory());
        //      }
        // }

        // for (int i = 0 ; i < 20; i++) {
        //      requiredMemory = (int)(Math.random() * 10) * 20;
        //      // 필요한 메모리가 사용할 수 있는 양보다 적거나 전체 메모리의 60%이상 사용했을 경우 gc를 깨운다.
        //      if(gc.freeMemory() < requiredMemory() ||
        //         gc.freeMemory() < gc,totalMemory() * 0.4)    // 메모리 가 부족한 경우
        //      {
        //         gc.interrupt(); // 잠자고 있는 쓰레드 gc를 깨운다.
        //      }
        //          try{
        //              gc.join(100);               // 가비지 컬렉터를 깨운 후에 바로 메모리를 사용할 수 없기 때문에 잠시 대기 했다가
        //          } catch (InterruptedException e) {}
        //      }
        //      gc.usedMemory += requiredMemory; // 메모리 사용
        //      System.out.println("userdMemory:"+gc.usedMemory);
        // }

        // 28.yield() (일드) static 메서드
        // - 남은 시간을 다음 쓰레드에게 양보하고,쓰레드 자기 자신(현재 쓰레드)은 실행대기한다.

        // - yield()와 interrupt()를 적절히 사용하면, 응답성과 효율을 높일 수 있다.

        // ex)
        // class MyThreadEx18 implements Runnable {
        //      boolean suspended = false;
        //      boolean stopped = false;

        //      Thread th;
        //      MyThreadEx18(String name)   {
        //          th = new Thread(this.name);
        //      }

        //      public void run() {
        //          while(!stopped) {   // 만약 while문이 true 이고
        //              if(!suspended) {    // if 문이 false 이면 일시정시 상태 에서 while문은 계속 돌고 있다 이상태가 바로 busy-waiting 이라한다 즉 바쁘게 기다린다
        //                                  // 이렇게 기다릴 필요 없이 뒷 사람에게 양보를 하는게 났다 그리하여  try 를 넣어 준다
                             /**
                                *  작업 수행
                             */
        //                      try {
        //                        Thread.sleep(1000);
        //                       } catch(InterrputedException e) {}
        //              } else {
        //                  Thread.yield();
        //          }
        //      }

        // public void start() {
        //      th.start();
        //  }
        // public void resume() {
        //      suspended = false;
        //  }
        // public void suspend() {
        //      suspended = true;
        //      th.interrupt();
        //  }
        // public void stop() {
        //      stopped = true;
        //      th.interrupt();
        //  }







    }
}
