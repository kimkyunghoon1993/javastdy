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


    }
}
