package ch12;
// 34~37 애너테이션 타입 정의하기 애너테이션의 요소
public class Ex_34_35_36_37 {
    public static void main(String[] args) {
        // 34. 애너테이션 타입 정의하기
        // - 애너데이션을 직접 만들어 쓸 수 있다.
        // @interfaec 애너테이션이름 {
        //      타입 요소이름(); // 애너테이션 요소를 선언한다.
        //  ...
        // }

        // ex)
        // @interface DateTime {
        //    String yymmddd();
        //    String hhmmss();
        // }

        // - 애너테이션의 메서드는 추상 메서드이며, 애너테이션을 적용할 때 지정(순서X)
        // @interface TestInfo {
        //      int     count();
        //      String  testeBy();
        //      String[] testTools();
        //      TestType testType();    // enum TestType { FIRST, FINAL }
        //      DateTime testDate();    // 자신이 아닌 다른 애너테이션(@DateTime)을 포함할 수 있다.

        // @TestInfo(
        //   count=3, testedBy="Kim",
        //   testToole={"JUnit","AutoTester"},
        //   testType=TestTpe.FIRST,
        //   testDate=@DateTime(yymmdd="160101", hhmmss="235959")
        // )
        // public class NewClass {...}

        // 35.애너테이션의 요소
        // - 적용시 값을 지정할지 않으면, 사용될 수 있는 기본값 지정 가능(null제외)
        //  @interfect TestInfo{
        //      int count() default 1;  // 기본값을 1로 지정
        // }

        // @TestInfo    // @TestInfo(count=1)과 동일 위에 defualt 값이 있는 경우에는 값을 넣어 주지 않아도 된다
        // public class NewClass {...}

        // - 요소가 하나이고 이름이 value 일 때는 요소의 이름 생략가능 (value 요소의 이름이 벨류(value)일 때는 생략 가능하다고 생각하면 된다
        // @interface TestInfo {
        //      String value();
        // }
        // @TestInfo("passed")  // @TestInfo(value="passed")와 동일
        // class NewClass {...}

        // - 요소의 타입이 배열인 경우, 괄호{}를 사용해야 한다.
        // @interface Testinfo{
        //   String[] testTools();
        // }

        // @Test(testToools={"JUnit","AutoTester})  //  값이 여러개일 경우
        // @Test(testTools="JUnit") // 값이 1개일 경우
        // @Test(testTools={})  // 값이 없을때는 괄호{}가 받드시 필요

        // 36. 모든 애너테이션의 조상 - java.lang.annotation.Annotation
        // - Annotation 은 모든 애너테이션의 조상이지만 상속은 불가
        // @interface TestInfo extends Annottation { // 에러. 허용되지  않은 표현
        //      int     count();
        //      String  testedBy();
        //      ...
        //  }

        // - 사실 Annotation 은 인터페이스 이다.
        // package java.lang.annotation;
        // public interface Annotation {        // Anntation 자신은 인터페이스이다.
        //      boolean equals(Objcet obj);
        //      int hashCode;
        //      String toString();

        //      Class<? extends Annotation> annotationType(); // 애너테이션의 타입을 반환
        // }

        // 37. 마커 애너테이션 - Marker Annotation
        //  - 요소가 하나도 저으이되지 않은 애너테이션
        //  ex)
        //  @Target(ElementType.METHOD)
        //  @Retention(RetentionPolicy.SOURCE)
        //  public @interface Overriade {} // 마커 애너테이션. 정의된 요소가 하나도 없다.

        // @Target(ElementType.METHOD)
        // @Retention(RetentionPolicy.SOURCE)
        // public @interface Test {}    // 마커 애너테이션. 정의도니 요소가 하나도 없다.

        // @Test // 이 메서드가 테스트 대상임을 테스트 프로그램에게 알린다.
        // public void method(){
        //  ...
        // }

        // @Deprecated
        //  publci int getDate(){
        //  return normailze().getDayOfMonth();
        // }

        // 38. 애너테이션 요소의 규칙
        // - 애너테이션의 요소를 선언할 때 아래의 규칙을 반드시 지켜야 한다.
        //  • 요소의 타입은 기본형, String ,enum, 애너테이션, Class(설계도 객체) 만 허용됨
        //  • 괄호()안에 매개변수를 선언할 수 없다.
        //  • 예외를 선언할 수 없다.
        //  • 요소를 타입 매개변수로 저으이할 수 없다.


        // - 아래의 코드에서 잘못된 부분은 무었인지 생각해보자
        //  @interface AnnoTest{
        //      int id = 100;   // 상수 static final int id = 100; 과 같이 표기 한것과 동일하다 OK
        //      String major(int i , int j); // 에러. 매개변수를 가질수 없다
        //      String minor() throws Excption; // 에러. 예외 선언 X
        //      ArrayList<T> list();    // 에러 <T>를 사용할수없다
        // }

        //

    }
}
