package ch10;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

// 13~16 SimpleDateFormat
public class Ex13_14_15_16 {
    public static void main(String[] args) {
        // 13 SimpleDateFormate (1/2)
        // - 날짜와 시간을 다양한 형식으로 출력할 수 있게 해준다.
        // 숫자를 문자로 변경하는 DecimalFormat
        // 문자열을 숫자로 변경 할때 parse()를 사용한다

        // ex)
        // Date today = new Date();
        // SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");


        // 오늘 날짜를 yyyy-MM-dd 형태로 변환하여 반환한다.
        // String result = df.format(today);
        // System.out.println(result); //2023-09-18 이런식으로 출력 된다

        // - SimpleDateFormat(2/2)
        // - 특정 형식으로 되어 있는 문자열에서 날짜와 시간을 뽑아낼 수도 있다.
        // ex)
        // DateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일");
        // DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
        // Date d = df.parse("2015년 11월 23일");
        // String result = df2.format(d);



    }
}
