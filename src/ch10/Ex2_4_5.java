package ch10;

import java.util.Calendar;
import java.util.Date;

// 4~5장 Calendar클래스
public class Ex2_4_5 {
    public static void main(String[] args) {
        // - set() 으로 날짜와 시간지정하기

        // void set(int field, int value);
        // void set(int year,int month, int data)   // 년 월 일
        // void set(int year,int month, int date, int hourOfDay, int minute)
        // void set(int year,int month, int, data,int hourOfDay, int minute, int second)    // 시 분 초

        // - 날짜 지정하는 방법. 월(MONTH)이 0 부터 시작한다는 점에 주의
        // 왜 0부터 시작하는가? 배열을 이용하기 때문이다
//        Calendar date1 = Calendar.getInstance();
//        date1.set(2017, 7, 15);   // 2017년 8월 15일(7월 아님!)
        // field를 이용하여 아래 와 같이 사용할수도 있다 1개씩 넣을수도 있다
        // date1.set(Calendar.YEAR, 2017);
        // date1.set(Calendar.MONTH, 7);
        // date1.set(Calendar.DATE, 15);

        // - 시간 지정하는 방법
//        Calendar time1 = Calendar.getInstance();
//        time1.set(Calendar.HOUR_OF_DAY, 10);    // time1 을 10시 20분 30초로 설정
//        time1.set(Calendar.MINUTE, 20);
//        time1.set(Calendar.SECOND, 30);


        // - clear()는 Calendar 객체의 모든 필들르 초기화
//        Calendar dt = Calendar.getInstance();   // 현재시간 으로 셋팅

        // Tue Aug 29 07:13:03 KST 2017
//        System.out.println(new Date(dt.getTimeInMillis()));

//        dt.clear(); // 모든 필드를 초기화
        // Thu Jan 01 00:00:00 KST 1970 컴퓨터가 나온 시점을 기준으로 한다
//        System.out.println(new Date(dt.getTimeInMillis()));

        // - clear(int filed)는 Calendar객체의 특정 필드를 초기화
        Calendar dt = Calendar.getInstance();

        // Tue Aug 29 07:13:03 KST 2017
        System.out.println(new Date(dt.getTimeInMillis()));

        dt.clear(Calendar.SECOND);      // 초를 초기화
        dt.clear(Calendar.MINUTE);      // 분을 초기화
        dt.clear(Calendar.HOUR_OF_DAY); // 시간을 최기화
        dt.clear(Calendar.HOUR);        // 시간을 초기화

        // Tue Aug 29 07:13:03 KST 2017
        System.out.println(new Date(dt.getTimeInMillis()));


    }
}
