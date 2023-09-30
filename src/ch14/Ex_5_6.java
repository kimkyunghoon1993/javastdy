package ch14;
// 5,6
public class Ex_5_6 {
    public static void main(String[] args) {
        // 5.함수형 인터페이스
        // ▶ 함수형 인터페이스 - 단 하나의 추상 메서드만 선언된 인터페이스
        // ex)
        // @FunctionalInterface // (펀션널인터페이스 어노테이션을 붙이면 올바르게 작성했는지 확인 해준다
        // interface MyFunction {
        //      public abstract int max(int a,int b);
        //  }
        //
        // MyFunction f = new MyFounction() {   //익명 클래스 클래스의 선언 및 객체 생성을 동시에 new 조상이름 1,클래스 일수도 있고 2.인터페이스 일수도 있다 { 멤버 }
        //  public int max(int a, int b) {
        //     return a > b ? a : b;
        //  };
        // int value = f.max(3,5); // OK MyFunction 에 max()가 있음

        // 람다식도 함수형 인터페이스로 참변 변수를 다룰수 있다
        // ▶ 함수형 인터페이스 타입의 참조변수로 람다식을 참조할 수 있음.
        // (단, 함수형 인터페이스의 메서드와 람다식의 매개변수 개수와 반환타입이 일치해야 함.
        // ex)
        // MyFunctino f = (a, b) - > a > b ? a : b;
        // int value = f.max(3,5); // 실제로 람다식(익명 함수)이 호출됨

        // 5. 함수형 인터페이스 - example
        // ▶ 익명 객체를 람다식으로 대체
        // ex)
        // List<String> list = ArrayList.asList("abc","aaa","bbb","ddd","aaa");
        //
        //  Collection.sort(list. new Comparator<String>() {
        //      public int compare(String s1, String s2) {
        //          return s2.compareTo(s1);
        //      }
        //  }
        // });

        // @FunctionalInterface
        // interface Comparator<T> {
        //      int compare(T o1, To2);
        // }

        // Comparator c = (s1.s2) -> s2.compareTo(s1));
        // List<String> list = ArrayList.asList("abc","aaa","bbb","ddd","aaa");
        // Collections.sort(list,(s1.s2) -> s2.compareTo(s1));

        // ▶ 함수형 인터페이스 타입의 매개변수
        //  void aMethod(MyFunction f) {
        //     f.myMethod(); // MyFunction 에 정의된 메서드 호출
        //  }

        // @FunctionalInterface
        // interface MyFunction {
        //  void myMethod();
        // }

        // MyFunction f = () -> System.out.println("myMethod()");
        // aMethod(f);

        // aMethod(()-> System.out.println("myMethod()"));

        // ▶ 함수형 인터페이스 타입의 반환타입
        // MyFunction myMethod() {              MyFunction myMethod() {
        //  MyFunction f = () -> {};        =>      return ()-> {};
        //  return f;                           }
        // }





    }
}
