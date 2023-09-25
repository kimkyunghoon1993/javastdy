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


    }
}
