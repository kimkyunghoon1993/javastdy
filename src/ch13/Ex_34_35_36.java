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

        // 34. wait()과 notify() - 예제1
        // - 요리사는 Table에 음식을 추가.손님은 Table의 음식을 소비
        // - 요리사와 손님이 같은 객체(Table)을 공유하므로 동기화가 필요

        // ex)
        // private ArrayList dishes = new ArrayList();      // ArrayList 동기화 되지 않음
        // public void add(String dish) {       // Table 에 dish(음식) 을 추가하는 메서드
        //  // 테이블이 가득 찼으면. 음식을 추가 안함.
        //  if(dishes.size() >= MAX_FOOD)
        //   return;
        // dishes.add(dist);
        // System.out.println("Dishes: " + dishes.toString());

        // public boolean remove(String dishName) { // Table 에 dish(음식)을 추가하는 메서드에서 제거 할수도 있다
        // // 지정된 요리와 일치하는 요리를 테이블에서 제거한다.
        // for(int i = 0; i < dishes.size(); i++) {
        //      if(dishName.equals(dishes.get(i))) {
        //          dishes.remove(i);
        //      }
        //      dishes.remove(i);
        //      return ture;
        // }
        //  return false;
        // }

        // public void run() {  // 요리사는 table 에 음식 (dish)을 추가하는 일을 한다.
        //  while(true) {
        //  // 임의의 요리를 하나 선택해서 table에 추가 한다.
        //  int idx = (int)(Math.random()*table.dishNum());
        //  table.add(table.dishNames[idx]);
        //      try {
        //          Thread.sleep(i);
        //      } catch (InterruptedExcption e) {}
        //  }// while
        // }

        // public void run() {  // 손님은 table 의 음식 (dish)을 먹는 일을 한다
        //  while(true) {
        //   try {
        //      Thread.sleep(10);
        //   } catch (InterruptedException e) {}
        //  String name = Thread.currentThread().getName();
        // if(eatFood())
        // System.out.println(name + " ate a " + food);
        // else
        // System.out.println(name + " failed to eat. : (");
        //  }
        // }
        //
        // boolean eatFood() {
        //  reutnr talbe.remove(food);
        // }

        // Table table = new Table(); // 여러 쓰레드가 공유하는 객체

        // new Thread(new Cook(talbe), "COOK1").start();
        // new Thread(new Customre(table,"donut"), "CUST1").start();
        // new Thread(new Custmore(table,"burger"), "CUST2").start();

        // 34. wait()과 notify() - 예제1 실행결과(동기화X)
        // 예외1. 요리사가 Table에 요리를 추가하는 과정에 손님이 요리를 먹음
        // 예외2. 하나 남은 요리를 손님2가 먹으려하는데. 손님1이 먹음.

        // 34. wait() 과 notify() - 예제1
        // [문제점] Table을 여러 쓰레드가 공유하기 때문에 작업 중에 끼어들기 발생
        // [해결책] Table의 add()와 remove()를 synchronized로 동기화

        // private ArrayList dishes = new ArrayList();
        // public void add (String dish) {
        // // 테이블이 가득찼으면, 음식을 추가안함
        // if (dishes.size() >= MAX_FOOD) {
        //  return;
        // dishes.add(dish);
        // System.out.println("Dishes: " + dishes.toString());
        // }
        //
        // public boolean remove(String dishName) {
        // // 지정된 요리와 일치하는 요리를 테이블에서 제거한다.
        // for (int i = 0; i < dishes.size(); i++) {
        //  if (dishName.equals(dishes..get(i))) {
        //      dishes.remove(i);
        //      return ture;
        //  }
        //  return false;
        // }

        // 동기화된 Table
        // public synchronized void add(String dish) {
        //      if (dishes.size() >= MAX_FOOD)
        //          return;
        //      dishes.add(dish);
        // System.out.println("Dishes:" + dishes.toString());
        // }
        //
        //  public boolean remove(String dishName) {
        //  synchronized(this) {
        //          while(dishes.size() == 0) {
        //              String name = Thread.currentThread().getName();
        //              System.out.println(name + " is waiting.");
        //          try {
        //              Thread.sleep(500);
        //          } catch(InterruptedException e) {}
        //          for(int i=0; i < dishes.sizze(); i++) {
        //                  if(dishName.equalse(dishes.get(i))) {
        //                      dishes.remove(i);
        //                      return true;
        //                  }
        //          } // synchroized
        //          return false;
        //  }

        // [문제] 예외는 발생하지 않지만, 손님(CUST2)이 Table에 lock건 상태를 지속 요리사가 Table 의 lock을 얻을 수 없어서 음식을 추가하지 못함
        // 비효율 적이다

        // [문제점] 음식이 없을때 , 손님이 Table  의 lock 을 쥐고 안놓는다. 요리사가 lock 을 얻지 못해서 Table에 음식을 추가할 수 없다.
        // [해결책] 음식이 없을 때, wait()으로 손님이 lock을 풀고 기다리게 하자. 요리가사 음식을 추가하면, notify()로 손님에게 알리자.(손님이 lock을 재획득)

        // ex)
        // public synchronized void add(String dish) {
        //  while(dishes.size() >= MAX.FOOD) {
        //      String name = Thread.currentThread().getName();
        //      System.out.println(name + " is waiting.");
        //      try {
        //           wait();    // COOK 쓰레드를 기다리게 한다.
        //           Thread.sleep(500);
        //      } catch(InterruptedException e) {}
        //      dishes.add(dish);
        //      notify();       // 기다리고 있는 CUST를 깨우기 위함.
        //      System.out.println("Dishes:" + dishes.toString());
        //  }

        // public void remove(String dishName) {
        //  synchronized(this)
        //      String name = Thread.currentThread().getName();
        //      while(dishes.size() == 0) {
        //      System.out.println(name + " is waiting." );
        //      try {
        //          wait(); // CUST 쓰레드를 기다리게 한다.
        //          Thread.sleep(500);
        //      } catch(InterruptedException e) {}
        //  }
        //
        // while(true) {
        //    for(int i = 0 ; i < dishes.size(); i++) {
        //          if(dishName.equals(dishes.get(i))) {
        //              if(dishName.equal(dishes.get(i))) {
        //              dishes.remove(i);
        //              notify();   // 잠잔고 있는 COOK 을 깨우기 위함
        //              return;
        //           }
        //    }
        //
        //     try {
        //         System.out.println(name + " is waiting. ");
        //          wait(); // 원하는 음식이 없는 CUST쓰레드를 기다리게 한다.
        //          Thread.sleep(500);
        //     } catch(InterruptedException e) {}
        //    }
        // } // while(true)
        //}

        // 요리사는 테이블 가득 차면 대기(wait())하고, 음식을 추가하고 나면 손님에게 통보(notify())한다.
        // 손님은 음식이 없으면 대기 (wait())하고, 음식을 먹고나면 요리사에게 통보(notify())한다.
        // wait() 과 notify() 를 사용하여 실행하면
        // - 전과 달리 한 쓰레드가 lock 을 오래 쥐는 일이 없어짐. 효율적이 됨!!





    }
}
