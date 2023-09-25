package ch12;
// 29~33 멭타 애너테이션
public class Ex_29_30_31_32_33 {
    public static void main(String[] args) {
        // 29. 메타 애너테이션
        // - 메타 애너테이션은 '애너테이션을 위한 애너테이션'
        // - 메타 애너테이션은 java.lang.annotation패키지에 포함

        // @Target - 애너테이션이 적용가능한 대상을 지정한는데 사용한다.
        // @Documented - 애너테이션 정보가 javadoc 으로 작성도니 문서에 포함되게 한다.
        // @Inherited - 애너테이션이 자손 클래스에 상속되도록 한다.
        // @Retention - 애너테이션이 유지되는 벙위를 지정하는데 사용한다.
        // @Repeatable - 애너테이션을 반복해서 적용할 수 있게 한다.(JDK1.8)

        // @Target
        // - 애너테이션을 정의할 때, 적용대상 지정에 사용
        // @Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE})
        // @Retention(RetentionPolicy.SOURCE)
        // public @interface SuppressWarnings {
        // String[] value();
        // }

        // ANNOTATION_TYPE - 애너테이션
        // CONSTRUCTOR - 생성자
        // FLELD - 필드(멤버변수, enum상수)
        // LOCAL_VARIABLE - 지역변수
        // METHOD - 메서드
        // PACKAGE - 패키지
        // PARAMETER - 매개변수
        // TYPE - 타입(클래스,인터페이스,enum)
        // TYPE_PARAMETER - 타입 매개변수(JDK1.8)
        // TYPE_USE - 타입이 사용되는 모든 곳 (JDK1.8)

        // ex)
        // improt static java,lang.annotation.ElementType.*;

        // @Target({FIELD, TYPE, TYPE_USE}) // 적용대상이 FIELD, TYPE, TYPE_USE
        // public @interface MyAnnotation { } // MyAnnotation을 정의
        // @MyAnnotation    // 적용대상이 TYPE 인 경우
        // class MyClass {
        //      @MyAnnotation   // 적용대상이 FIELD인 경우
        //      int i;
        //      @MyAnnotation   /// 적용대상이 TYPE_USE인 경우
        //      MyClass mc;
        // }

        // 31. @Retention
        // - 애너테이션이 유지(retention)되는 기간을 지정하는데 사용
        // SOURCE - 소스 파일에만 존재. 클래스파일에는 존재하지 않음
        // CLASS - 클래스 파일에 존재. 실행시에 사용불가. 기본값
        // RUNTIME - 클래스 파일에 존재. 실행시에 사용가능.

        // - 컴파일러에 의해 사용되는 애너테이션의 유지 정책은 SOURCE이다.
        //  @Target(ElementType.METHOD)
        //  @Retention(RetentionPolicy.SOURCE)
        //  public @interface Override {} @Override - 오버라이딩을 제대로 했는지 체크 컴파일러

        // -실행시에 사용 가능한 애너테이션의 정책은 RUNTIME 이다.
        // @Documented
        // @Retention(RetentionPolicy.RUNTIME)
        // @Target(ElementType.TYPE)
        // public @interface FunctionalInterface {}

        // 32.@Documented, @Inherited
        // javadoc 으로 작성한 문서에 포함시키려면 @Documented를 붙인다.
        //  @Documented
        //  @Retention(RetentionPolicy.RUNTIME)
        //  @Target(ElementType.TYPE)
        //  public @interface FunctionalInterface {}

        // - 애너테이션을 자손 클래스에 상속하고자 할 때, @Inherited를 붙인다.
        // @Inhreited                   // @SuperAnno가 자손까지 영향 미치게
        // @interface SuperAnno {}

        // @SuperAnno
        // class Parent {}

        // class Child ectends Parent{} // Child에 애너테이션이 붙은 것으로 인식

        // class Child ectends Parent {} // Child 에 애너테이션이 붙은 것으로 인식


        // 33.@Repeatable
        // - 반복해서 붙일 수 있는 애너테이션을 정의할 때 사용
        // @Repeatable(ToDos.class) // ToDo 애너테이션을 여러번 반복해서 쓸수 있게 한다.
        // @interface ToDo {
        //  String value();
        // }

        // -@Repeatable이 붙은 애너테이션은 반복해서 붙일수 있다.
        // @ToDo("delete test codes.")
        // @ToDo("override inherited methods")
        // class MyClass {
        //      ...
        //  }

        // @Repeatable 인 @ToDo 를 하나로 묶을 컨테이너 애너테이션도 정의해야 함
        // @interface ToDos { // 여러 개의 ToDo 애너테이션을 담을 컨테이너 애너텡니션 ToDos
        //      ToDo[] value(); // ToDo 애너테이션 배열 타입의 요소를 선언. 이름이 반드시 value이어야 함
        // }






    }
}
