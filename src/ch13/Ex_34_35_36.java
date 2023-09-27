package ch13;
// 34~36 wait()과 notify()
public class Ex_34_35_36 {
    public static void main(String[] args) {
        // 34.wait() 과 notify()
        // - 동기화의 효율을 높이기 위해 wait()[기다리기], notify()[통보,알려주기]를 사용.
        // - Object 클래스에 정의 되어 있으며, 동기화 블록 내에서만 사용할수 있다.
        // • wait() - 객체의 lock 을 풀고 쓰레드를 해당 객체의 waiting pool에 넣는다.
        // • notify() - waiting pllo 에서 대기중인 쓰레드 중의 하나를 깨운다.
        // • notifyAll() - waiting pool 애서 대기중인 모든 쓰레드를 깨운다.

        // ex)
        // class Account {
        //  int balance = 1000;
        //
        //          public synchronized void withdraw(int money) {
        //              while(balance < money) {
        //                  try {
        //                      wait(); //    대기 - 락을 풀고 기다린다. 통지를 받으면 락을 재획득(ReEnterance)
        //              } catch(InterruptedException e) {}
        //          }
        //
        //              balance -= money;
        //          }
        //
        //          public synchronized void deposit(int money) {
        //              balance += money;
        //              notify();   // 통지 - 대기중인 쓰레드 중 하나에게 알림.
        //          }
        // }



    }
}
