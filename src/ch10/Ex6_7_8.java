package ch10;

import java.util.Calendar;

// 6,7,8 Calendar클래스 - 예제 4,5
public class Ex6_7_8 {
    public static void main(String[] args) {
        // - add()는 특정 필드의 값을 증가 또는 감소(다른 필드에 영향o)
        // - 필드 읽기 - get()
        // - 필드 변경 - set()
        // - 필드 초기화 - clear()

        // ex)
        // Calendar date = Calendar.getInstance();
        // date.clear();   // 모든 필드를 초기화
        // date.set(2020, 7, 31);    // 2020년 8월 31일로 설정

        // date.add(Calendar.DATE, 1);     // 날짜(DATE) 에 1을 더한다
        // date.add(Calendar.MONTH, -8);   // 월(MONTH) 에서 8을 뺀다

        // -roll()은 특정필드의 값을 증가 또는 감소(다름 필드에 영향X)

        // ex)
        Calendar date = Calendar.getInstance();
        date.set(2020, 7, 31);    // 2020년 8월 31일로 설정

        // add()와 달리 roll()은 다른 필드에 영향을 미치지 않는다.
        date.roll(Calendar.DATE, 1);    // 날짜(DATE)에 1을 더한다
        date.roll(Calendar.MONTH,-8);   // 월(MONTH)에서 8을 뺀다.

        // 예제

        // 8 Data와 Calendar간의 변환
        // - Date의 메서드는 대부분 deprecated(사용하지 않을것을 권장) 되었지만 여전히 사용

        // 1. Calendar를 Date로 변환
        //  Calendar cal = Calendar.getInstance();
        //  ...
        //  Date d = new Date(cal.getTimeInMillis());   // Date(long date)

        // 2. Date를 Calendar 로 변환
        //      Date d = new Date();
        //  ...
        //      Calendar cal = Callendar.getInstance();
        //      cal.setTime(d)
    }
}
