package ch10;

// 날짜와 시간
public class Ex1_1_2_3 {
    public static void main(String[] args) {
        /**
         *  java.util.Date
         */
        // - 날짜와 시간을 다룰 목적으로 만들어진 클래스(JDK1.0)
        // - Date의 메서드는 거의 deprecated(앞으로 사용하지 말라!) 되었지만, 여전히 쓰이고 있다.

        /**
         *  java.util.Calendar (캘린더)
         */
        // - Data클래스를 개선한 새로운 클래스(JDK1.1). 여전히 단점이 존재
        /**
         *  java.time 패키지 JDk 1.8 또는 JDK8 버전 이라고도 한다
         */
        // - Data 와 Calendar 의 단점을 개선한 새로운 클래스들을 제공(JDK1.8)
        // 날짜 + 시간을 같이 다룬다는 단점 이 있다 이걸 보완한것이 time 패키지 이다
        // LocalData / LocatTime / LocalDateTime

        /**
         * 2 Calendar 클래스
         */
        // - 추상 클래스이므로 getlnstance()를 통해 구현된 객체를 얻어야 한다.
        // Calendar cal = new Calendar(); // 에러!! 추상클래스는 인스턴스를 생성할 수 없다.

        // OK, getInstance() 메서드는 Calendar클래스를 구현한 클래스의 인스턴스를 반환한다.
        // Calendar cal = Calendar.getInstance();

        // ex)
        // class MyApplication{
        //     public static void main(String[] args){
        //         Calendar cal = new GregorianCalendar(); // 경우에 따리 이 부분을 변경해야한다.
        //    }
        // }

        /**
         * 3 Calendar 클래스 - 예제1
         */

        // - get()으로 날짜와 시간 필드 가져오기 - int get(int field)
        // ex)
        // Calendar cal = Calendar.getInstance();                      // 현재 날짜와 시간으로 셋팅됨
        // int thisYear = cal.get(Calendar.YEAR);                      // 올해가 몃년인지 알아낸다.
        // int lastDayOfMonth = cal.getActualMaximum(Calendar.DATE);   // 이 달의 마지막날
        //
        // System.out.println(cal);
        // System.out.println(thisYear);
        // System.out.println(lastDayOfMonth);

        /**
         * Calendar 에 정의된 필드
          */
        // YEAR                    = 년
        // MONTH                   = 월(0부터 시작)
        // DATE                    = 일
        // WEEK_OF_YEAR            = 그 해 1월 1일 ~ 지금
        // WEEK_OF_MONTH           = 그 달의 몃 번째 주
        // DAY_OF_MONTH            = 그 달의 몃 번째일
        // DAY_OF_YEAR             = 그 해의 몃 번째일 1월 1일 ~ 몃 일이 지났는지
        // DAY_OF_WEEK             = 요일
        // DAY_OF_WEEK_IN_MONTH    = 그 달의 몃 번째 요일
        // HOUR                       = 시간(0~11)
        // HOUR_OF_DAY                = 시간(0~23)
        // MINUTE                     = 분
        // SECOND                     = 초
        // MILLISECOND                = 천분의 일초
        // ZONE_OFFSET                = GMT기준 시차(천분의 일초 단위)
        // AM_PM                      = 오전/오후


    }
}
