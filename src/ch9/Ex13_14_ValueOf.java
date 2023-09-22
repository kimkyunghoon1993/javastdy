package ch9;

import static java.lang.Integer.*;

// 문자열과 기본형 간의 변환
public class Ex13_14_ValueOf {

    public static void main(String[] args) {
        // - 숫자를 문자열로 바꾸는 방법 (valueOf)
        // int i = 100;
        // String str1 = i + "";
        // String str2 = String.valueOf(i);
        //                                 //  str1 과 str2의 차이?
        // System.out.println(str1);       //  100을 "100" 으로 변환하는 방법1  // 편리하게 작성 할수 있다
        // System.out.println(str2);       //  100을 "100" 으로 변환하는 방법2  // 빠르다

        // - 문자열을 숫자로 바꾸는 방법
        // int i = parseInt("100");        // "100"을 100으로 변환하는 방법1
        // int i2 = Integer.valueOf("100");        // "100"을 100으로 변환하는 방법2
        // Integer i2 = Integer.valueOf("100");    // 원래는 반환 타입이 Integer

        // 기본형 -> 문자열
        // String String.valueOf(boolean b);
        // String String.valueOf(char c);
        // String String.valueOf(int i);
        // String String.valueOf(long l);
        // String String.valueOf(float f);
        // String String.valueOf(double d);

        // 문자열 -> 기본형
        // boolean Boolean.parseBoolean(String s);
        // byte Byte.parseByte(String s);
        // short Short.parseShort(String s);
        // int Integer.parseInt(String s);                  =>  parse가 각 래퍼 클래스에 맞게 작성 되어 있어 불편 할수 있다 그러므로 valueOf 로 통일 시켰다
        // long Long.parseLong(String s);
        // float Float.parseLong(String s);
        // double Double.parseDouble(String s);

        // valueOf = Integer 이다 그렇지만 int(기본형으로 사용해도 괜찮다 why? 오토박싱 Integer 에서 기본형(int)로 자동 형변환을 해주기 때문이다

        //Ex)
        // int iVal = 100;
        // // String strVal = String.valueOf(iVal);   // int를 String 으로 변환 한다      (속도가 빠르다)
        // String strVal = iVal + "";   // int를 String 으로 변환 한다    (가독성이 좋다)
        //
        // double dVal = 200.0;
        // String strVal2 = dVal + "";     //int 를 String 으로 변환하는 또 다른 방법
        //
        // double sum = Integer.parseInt("+" + strVal)+Double.parseDouble(strVal2);    // 문자열을 숫자로 바꾸는 방법1
        // double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);               // 문자열을 숫자로 바꾸는 방법1
        //
        // System.out.println(String.join("",strVal, "+" , strVal2,"=")+sum);  // String.join를 사용하여 출력문 사이를 구분지을수 있다
        // System.out.println(strVal + "+" + strVal2 + "=" + sum2);

        // 문자열을 결합 할때 객체가 계속 만들어 지기 때문에 바로 위 처럼 1~2 개 적은량은 상관 없지만 많은 양의 문자열을 결합 할때는 String.join을 사용하여 내부적으로 string buffer를 사용하여 속도를 향상 시킬수 있다



    }
}
