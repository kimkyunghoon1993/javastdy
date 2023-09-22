package ch9;

import java.math.BigInteger;

// ch09-25-26-27 패러클래스. number클래스
public class Ex25_26_27 {
    public static void main(String[] args) {
        //25 래퍼(wrapper) 클래스? 기본형값을 감싸는 클래스 것을 말한다
        // - 8개의 기본형을 객체로 다뤄야할 때 사용하는 클래스.
        // ex)
        // public final class Integer extends Number implements Comparable{         기본형인 Integer 값을 감싸고 있다
        //     ...
        //     private int value;
        //     ...
        // }

        /* 기본형 8개*/

        /* boolean */
        // boolean Boolean Boolean(boolean value);
        // boolean Boolean Boolean(String s);
        // Boolean b = new Boolean(true);
        // Boolean b2 = new Boolean("true");

        /* char */
        // char Character(char value)
        // Character c = new Character('a');

        /* byte */
        // Byte Byte(byte value)
        // Byte(String s)

        // Byte b = new byte(10);
        // Byte b2 = new byte("10");

        /* short */
        // Short(short value)
        // Short(String s)
        // Short s = new Short(10);
        // Short s2 = new Short("10");

        /* int */
        // Integer(int value)
        // Integer(String s)
        // Integer i = new Integer(100);
        // Integer i2 = new Integer("100");

        /* long */
        // Long(long value)
        // Long(String s)
        // Long l = new Long(100);
        // Long l2 = new Long("100");

        /* float */
        // Float(double value)
        // Float(float value)
        // Float(String s)
        // Float f = new Float(1.0);
        // Float f2 = new Float(1.0f);
        // Float f3 = new Float("1.0f");

        /* double */
        // Double(double value)
        // Double(String s)
        // Double d = new Double(1.0);
        // Double d2 = new Double("1.0");


        //27 Number클래스
        // - 모든 숫자 래퍼 클래스의 조상.

        // Object 최고 조상

        // Object 하위
        // Boolean
        // Character
        // Number

        // Number 하위
        // Byte
        // Short
        // Intger
        // Long: 10의 19제곱
        // Float
        // Double: 10의 308제곱
        // BigInteger: 아주큰 정수
        // BigDecimal: 아주큰 실수

        // 래퍼 객체 -> 기본형으로 변환 해주는 기능을 가지고 있다
        // public abstract class Number implements java.io.Serializable{
        //     public abstract int intValue();
        //     public abstract long longValue();
        //     public abstract float floatValue();
        //     public abstract double doubleValue();
        //
        //     public byte byteValue(){
        //         return (byte)intValue();
        //     }
        //
        //     public short shortValue(){
        //         return (short)intValue();
        //     }
        // }

        // ex)
        // Integer(100) 을 int = 100; 으로 변환 하고 싶을 경우 intValue를 사용하여 변환 하면 된다
        // new Integer(100) -> int = 100;


    }
}
