package ch9;

import java.util.ArrayList;

// 28~31 문자열과 숫자 변환 오토박싱 & 언박싱
public class Ex28_31 {
    public static void main(String[] args) {
        // - 문자열을 숫자로 변환하는 다양한 방법.
        // 래퍼클래스를 기본형으로 변환 하는 방법
        // int i = new Integer("100").intValue();  // floatValue(), longValue(),...

        // parseInt 문자열을 -> int 로 변환
        // int i2 = Integer.parseInt("100");

        // ValueOf를 이용하면 래퍼클래스로 변환 할수 있다
        // Integer i3 = Integer.valueOf("100");

        // 문자열 -> 기본형 parse 또는 Integer.valueOf를 사용하면 된다
        // byte b = Byte.parseByte("100");
        // short s = Short.parseShort("100");
        // int i = Integer.parseInt("100");
        // long l = Long.parseLong("100");
        // float f = Float.parseFloat("3.14");
        // double d = Double.parseDouble("3.14");

        // 문자열 -> 래퍼클래스 valueOf 또는 new Byte("100) 생성자 에서 바로 사용하는 방법도 있다
        // Byte b = Byte.valueOf("100");
        // Short s = Short.valueOf("100");
        // Integer i = Integer.valueOf("100");
        // Long l = Long.valueOf("100");
        // Float f = Float.valueOf("3.14");
        // Double d = Double.valueOf("3.14");

        // 래퍼클래스 -> 문자열로 변환하려면 toString 을 사용하면 된다
        // String str = b.toString(); // 이렇게 하면 str의 값이 "100" 이 저장된다
        //
        // // - n 진법의 문자열을 숫자로 변환하는 방법         // n진수 지정 할수 있지만 기본적으로 10진수 가 지정 되어 있다
        // int i4 = Integer.parseInt("100",2);     /* 2진수 100(2) -> 4*/
        // int i5 = Integer.parseInt("100",8);     /* 8진수 100(8) -> 64 */
        // int i6 = Integer.parseInt("100",16);    /* 16진수 100(16) -> 256*/
        // int i7 = Integer.parseInt("FF",16);     /*FF(16) -> 255*/
        // int i8 = Integer.parseInt("FF");        // NumberFormateException 발생

        // 30 오토박싱 & 언박싱
        // int -> Integer 자동으로 변경 해주는 것을 오토박싱(AutoBoxing) 이라고 한다
        // Integer -> int 로 변경 해주는 것을 언박싱(UnBoxing) 이라고 한다
        // 오토박싱 언박싱 둘다 자동으로 해준다

        // JDK1.5 이전에는 기본형과 참조형간의 연산이 불가능
        // ex)
        // int i = 5;                                    /*기본형*/
        // Integer iObj = new Integer(7);          /*참조형*/
        //
        // int sum = i + iObj; //에러. 기본형과 참조형 간의 덧셈 불가(JDK1.5 이전)
        //
        // System.out.println(sum);

        // 컴파일 전의 코드
        // int i = 5;
        // Integer iObj = new Integer(7);

        // int sum = i + iObj;

        // 컴파일 후의 코드
        // int i = 5;
        // Integer iObj = new Integer(7);

        // int sum = i + iObj.intValue();

        // System.out.println(sum);

        // - 기본형의 값을 객체로 컴파일러가 자동변환하는 것을 오토박싱, 그 반대는 언박싱
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);       // 컴파일러가 오토박싱. 10 -> new Integer(10)

        int value = list.get(0);    // 언박싱. new Integer(10) -> 10

        System.out.println(value);


    }
}
