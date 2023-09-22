package ch9;

public class AutoBoxingAndUnBoxingTest {
    public static void main(String[] args) {
        // Autoboxing
        // ArrayList<Integer> list = new ArrayList<Integer>(); // ArrayList에는 객체만 저장가능 이였는데
        // list.add(new Integer(100)); // list에는 객체만 추가가능
        // list.add(100); // JDK1.5 이전에는 에러 기본형도 저장 가능 why? 컴파일러가 오토박싱을 해주기 때문이다

        // Unboxing
        // Integer i = list.get(0);    //list 에 저장된 첫번째 객체를 꺼낸다.
        // int i = list.g et(0).intValue();          // intValue()로 Integer를 int로 변환
        // int i = list.get(0);                        // JDK 1.5 이후 부터 사용가능

        int i = 10;

        // 기본형을 참조형으로(형변환 형변환 생략가능)     기본형 -> 참조형 형변환 연산자 사용불가 원칙!!!
        Integer intg = (Integer)i;  // Integer intg = Integer.valueOf(i);
        Object obj = (Object)i;     // Object obj = (Object)Integer.valueOf(i);

        Long        lng = 100L; // Long lng = new Long(100L);

        int i2 = intg + 10; // 참조형과 기본형간의 연산 가능
        long l = intg + lng; // 참조형 간의 덧셈도 가능

        Integer intg2 = new Integer(20);
        int i3 = (int)intg2;    // 참조형을 기본형으로 형변환도 가능(형변환 생략가능)

        // 컴파일 전의 코드
        // Integer intg = (Integer)i;
        // Object  obj = (Object)i;
        // Long    lng = 100L;

        // 컴파일 후의 코드
        // Integer intg = Integer.valueOf(i);
        // Object obj = (Object)Integer.valueOf(i);
        // Long lng = new Long(100L);




    }
}
