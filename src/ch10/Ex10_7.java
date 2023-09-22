package ch10;

import java.text.DecimalFormat;
import java.text.ParseException;

public class Ex10_7 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,###.##");
        DecimalFormat df2 = new DecimalFormat("#,###E0");

        try {
            System.out.println(Double.parseDouble("1234567.89"));   //-> System.out.println(Double.parseDouble("1,234,567.89")); 이경우 에러 발생 Double 타입과 불일치 하기 때문에 그러므로 DecimalFormat을 사용한다
            Number num = df.parse("1,234,567.89");  // 문자열을 -> 숫자로 변경
            System.out.print("1,234,567.89");

            double d = num.doubleValue();   // double 타입의 문자열로 변경       d = 1234567.89
            System.out.print(d + " -> ");

            System.out.println(df2.format(num)); // -> 지수 형식의 문자열로 변경
        } catch (ParseException e) {
            e.printStackTrace();    //NumberFormatException 발생 -> System.out.println(Double.parseDouble("1,234,567.89"));
        }
    }
}
