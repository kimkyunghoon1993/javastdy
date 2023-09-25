package ch12;
// 25~28 표준 애너테이션
public class Ex_25_26_27_28 {
    public static void main(String[] args) {
        // 25. @Override
        // - 오버라이딩을 올바르게 했는지 컴파일러가 체크하게 한다.
        // - 오버라이딩할 때 메서드 이름을 잘못적는 실수를 하는 경우가 많다
        // ex)
        // class Parent {
        //      void parentMethod() { }
        // }
        // class Child extends Parent {
        //      void parentmethod() { } // 오버라이딩하려 했으나 실수로 이름을 잘못적음  parentMethod -> parentmethod M이 대문자가 되어야 하는데 소문자이다
        // }

        // - 오버라이딩할 때는 메서드 선언부 앞에 @Override를 붙이자.
        // ex)
        //  class Child extends Parent {                        class Child extends Parent {
        //      void parentmethod() {}              =>              @Override
        //  }                                                       void parentmethod() {}
        //                                                      }
        // ※ @Override 를 사용하면 컴파일시 대소문자 틀리경우 컴파일 에러가 발생한다 이런 경우를 대비하기 위해서 @Overrride 를 사용한다.

        // 26. @Deprecated (디플리케이티드)
        // - 앞으로 사용하지 않을 것을 권장하는 필드나 메서드에 붙인다.
        // -@Deprecated 의 사용 예, Data클래스의 getDate()
        // ex)
        // @Deprecated
        // public int getDate() {
        //      return normalize() .getDayOfMonth();
        // }
        // jvav는 하위 호환성을 중요하게 생각 하기 때문에
        // - @Deprecated 가 붙은 대상이 상용된 코드를 컴파일 하면 나타나는 메시지
        // Note: AnnotationEx2.java uses or overrides a deprecated API. 다시컴파일 하면 자세한 정보가 나온다
        // Note: Recompile with -Xlint:deprecation for details. 자세한 정보

        // 27. @Functionallnterface
        // - 함수형 인터페이스에 붙이면, 컴파일러가 올바르게 작성했는지 체크
        // 함수형 인터페이스에는 하나의 추상메서드만 가져야 한다는 제약이 있음

        // ex)
        // @FunctionalInterface     //@FunctionalInterface 를 안붙여도 된다 하지만 컴파일러가 더 정확하게 확인할수 있게 해주면 좋다
        // public interfacew Runnable {
        //      public abstract void run(); // 추상 메서드
        // }

        // 28. @SuppressWarnings
        // - 컴파일러의 경고메시지가 나타나지 않게 억제한다.
        // - 괄호()안에 억제하고자하는 경고의 종류를 문자열로 지정

        // ex)
        // @SuppressWarnings("unchecked")       // 지네릭스와 관련된 경고를 억제
        // ArrayList list = new ArrayList();    // 지네릭 타입을 지정하지 않았음.  unchecked 경고 발생
        // list.add(obj);                       // 여기서 경고가 발생

        // - 둘 이상의 경고를 동시에 억제하려면 다음과 같이 한다.
        // @SuppressWarnings ({"deprecation", "unchecked", "varargs"})

        // '-Xlint' 옵션을오 컴파일하면, 경고메시지를 확인할 수 있다.
        // 괄호[]안이 경고의 종류.아래의 경우 rawtypes





    }
}
