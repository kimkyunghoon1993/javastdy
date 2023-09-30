package ch14;
import java.util.function.Function;
import java.util.function.Supplier;

public class Ex14_0 {
    public static void main(String[] args) {
//        Object f = (a , b) -> a > b ? a : b;  // 람다식. 익명객체
//        MyFunction2 f = new MyFunction2() {
//            public int max(int a, int b) {   // 오버 라이딩 - 접근제어자는 좁게 못바꾼다.
//                return a > b ? a : b;
//            }
//        };

        // 람다식(익명 객체)을 다루기 위한 참조 변수의 타입은 함수형 인터페이스로 한다.
//        MyFunction2 f = (a, b) -> a > b ? a : b;  // 람다식. 익명객체
//
//        int value = f.max(3, 5); // 함수형 인터페이스
//        System.out.println("value=" + value);
//    }
//        Function<String,Integer> f = (String s) -> Integer.parseInt(s);
//        Function<String,Integer> f = 클래스이름::메서드이름;
//        Function<String,Integer> f = Integer::parseInt; // 메서드 참조
//        Function<String,Integer> f = Integer::parseInt; // 메서드 참조
//        Function<String,Integer> f = (String s) -> Integer.parseInt(s); // 메서드 참조
//        System.out.println(f.apply("100")+200);


    }
//@FunctionalInterface    // 함수형 인터페이스는 단 하나의 추상 메서드만 가져야 함.!!
//interface MyFunction2 {
//    int max(int a, int b);
////    public abstract int max(int a, int b);
//}

}