package ch13;
// 30~33 쓰레드의 동기화
public class Ex_30_31_32_33 {
    public static void main(String[] args) {
        // 30. 쓰레드의 동기화(synchronization)
        // - 멀티 쓰레드 프로세스에서는 다른 쓰레드의 작업에 영향을 미칠 수 있다.
        // - 진행중인 작업이 다른 쓰레드에게 간섭받지 않게 하려면 '동기화'가 필요
        // 쓰레드의 동기화 - 한 쓰레드가 진행중인 작업을 다른 쓰레드가 간섭하지 못하게 막는 것
        // - 동기화하려면 간섭받지 않아야 하는 문장들을 '임계 영역' 으로 설정
        // - 임계영역은 락(lock)을 얻은 단 하나의 쓰레드만 출입가능(객체 1개에 락 1개)

        // 31. synchronized 를 이용한 동기화
        // - synchronized 로 임계영역(lock이 걸리는 영역) 을 설정하는 방법 2가지
        //  1. 메서드 전체를 임계 영역으로 지정
        // public synchroized void calcSum(){
        //  //...
        // }
        //  2. 특정한 영역을 임계 영역으로 지정
        // synchroized (객체의 참조변수){
        //  //...
        // }

        // ex)
        // public synchronized void withdraw(int money) {
        //      if (balance >= money) {
        //          try {
        //               Thread.sleep(1000);
        //          } catch (Excpton e) {}
        //
        //          balance -= money;
        //      }
        // }

        // ex)
        //  public void withdraw(int money) {
        //      synchronized(this) {
        //          if(balance >= money) {
        //                  try{
        //                       Thread.sleep(1000);
        //                  } catch(Exception e) {}
        //
        //                  balance -= money;
        //          }
        //      }   // synchronized(this)
        // }

        // 32. synchronized 를 이용한 동기화 - 예제
        // class Account2 {
        //     private int balance = 1000;  // private 으로 해야 동기화 의미가 있다.    (잔고)
        //
        //     public int getBalance() {
        //          return balance;
        //      }
        //
        //     public synchronized void withdraw(int money) { // synchronized 로 메서드를 동기화    (출금)
        //      if(balance >= money) {
        //          try { Thread.sleep(1000);} catch(InterruptedException e) {}
        //          balance -= money;
        //      }
        //     }
        //
        // class RunnableEx22 implements Runnable {
        //      Account2 acc = new Account2();
        //
        //      public void run() {
        //          while(acc.getBalance() > 0) {
        //              //  100,200,300 중의 한 값을 임으로 선택해서 출금(withdraw)
        //              int money = (int)(Math.random() * 3 + 1) * 100;
        //              acc.withdraw(money);
        //              System.out.println("balance: " + acc.getbalance());
        //          }
        //      }
        //  }

        // class ThreadEx22 {
        //  public static void main(String args[]) {
        //      Runnable r = new RunnableEx22();
        //      new Thread(r).start();
        //      new Thread(r).start();
        //  }
        // }




    }
}
