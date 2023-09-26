package ch13;
// 14~17 쓰레드의 우선순위, 쓰레드 그룹
public class Ex_14_15_16_17 {
    public static void main(String[] args) {
        // 14. 쓰레드의 우선순위(proiority of therad)
        // - 작업의 중요도에 따라 쓰레드의 우선순위를 다르게 하여 특정 쓰레드가 더 많은 작업시간을 갖게 할 수 있다.

        // void setPriority(int new Proiority)
        // - 쓰레드의 우선순위를 지정한 값으로 변경한다.

        // int getPrority()
        // - 쓰레드의 우선순위를 반환한다.

        // public static final int MAX_PRIORITY = 10 // 최대우선순위
        // public static final int MIN_PRIORITY = 1  // 최소우선순위
        // public static final int NORM_PRIORITY = 5 // 보통우선순위

        // ▶︎ 우선순위가 같은 경우 동일하게 시간을 부여 한다 어느 한쪽이 우선수위가 높은 경우는 높은 순위로 시간을 부여한다

        // 16. 쓰레드 그룹
        // - 서로 관련된 쓰레드를 그룹으로 묶어서 다루기 위한 것
        // - 모든 쓰레드는 반드시 하나의 쓰레드 그룹에 포함되어 있어야 한다.
        // - 쓰레드 그룹을 지정하지 않고 생성한 쓰레드는 'mian' 쓰레드 그룹' 에 속한다
        // - 자신을 생성한 쓰레드(부모 쓰레드)의 그룹과 우선순위를 상속받는다.

        // Thread 의 생성자
        // Thread(ThreadGroup, String name)
        // Thread(ThreadGroup. Runnable target)
        // Thread(ThreadGroup, Runnable target, String name)
        // Thread(ThreadGroup, Runnable target, String name ,long stackSize)

        // 관련된 메서드
        // ThreadGroup getTrheadGroup() - 쓰레드 자신이 속한 쓰레드 그룹을 반환한다.
        // void uncaughtException(Thread t, Throwable e) - 처리되지 않은 예외에 의해 쓰레드 그룹의 쓰레드가 실행이 종료되었을때, JVM에 의해 이 메서드가 자동적으로 호출된다.

        // 17.쓰레드 그룹의 메서드

        // ================= 생성자 =================
        // ThreadGroup(Stirng name)
        // - 지정된 이름의 새로운 쓰레드 그룹을 생성

        // ThreadGroup(ThreadGroup parent, String name)
        // - 지정된 쓰레드 그룹에 포함되는 새로운 쓰레드 그룹을 생성

        // int activeConunt()
        // - 쓰레드 그룹에 포함된 활성상태에 있는 쓰레드 의 수를 반환
        // =========================================

        // int activeGroupConunt()
        // - 쓰레드 그룹에 포함된 활성상태에 있는 쓰레드 그룹의 수를 반환

        // void checkAccess()  권한체크
        // - 현재 실행중인 쓰레드가 쓰레드 그룹을 변경할 권한이 있는지 체크

        // void destroy() 일관적용 삭제
        // - 쓰레드 그룹과 하위 쓰레드 그룹까지 모두 삭제한다, 단 비어있어야 삭제 가능

        // int enumerate(Thread[] list)
        // int enumerate(Thread[] list, boolean recurse)
        // int enumerate(ThreadGroup[] list)
        // int enumerate(ThreadGroup[] list, boolean recurse)
        // - 쓰레드 그룹에 속한 쓰레드 또는 하위 쓰레드 그룹의 목록을 지정된 배열에 담고 그 개수를 반환. 두 번째 매개변수인 recurese의 값을
        // true 로 하면 쓰레드 그룹에 속한 하위 쓰레드 그룹에 쓰레드 또는 쓰레드 그룹까지 배열에 담는다.

        // int getMaxPriority()
        // - 쓰레드 그룹의 최대우선순위를 반환

        // String getName()
        // - 쓰레드 그룹의 이름을 반환

        // ThreadGroup getParent()
        // - 쓰레드 그룹의 이름을 반환

        // void interrupt()
        // - 쓰레드 굽에 속한 모든 쓰레드를 interrupt

        // boolean isDaemon()
        // - 쓰레드 그룹이 데몬 쓰레드 그룹인지 확인

        // boolean isSestroyed()
        /// - 쓰레드 그룹이 삭제되었는지 확인

        // void list()
        // - 쓰레드 그룹에 속한 쓰레드와 하위 쓰레드 그룹에 대한 정보를 출력

        // boolean parentOf(ThreadGroup g)
        // - 지정된 쓰레드 그룹의 상위 쓰레드 그룹인지 확인

        // void setDaemon(boolean daemon)
        // - 쓰레드 그룹을 데몬 스레드 그룹으로 설정/해제

        // void setMaxPriority(int pri)
        // - 쓰레드 그룹의 최대 우선순위를 설정


        // ※ 쓰레드들의 기본적으로 쓰레드 그룹으로 묶어서 다뤄진다 , 쓰레드를 관리할때 그룹으로 묵어서 다룰수 있다


    }
}
