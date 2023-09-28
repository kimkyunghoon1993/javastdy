package ch14;
// 1~4 람다식이란? 람다식 작성하기
public class Ex_1_2_3_4 {
    public static void main(String[] args) {
        // 1. 람다식(Lambda Expression)
        // 함수형 언어
        // java oop(객체치향) ooo + fp(함수형)

        //  ▶ 함수(메서드)를 간단한 '식(expression)'으로 표현하는 방법
        // ex)
        // int max(int a, int b) {
        //  return a > b ? a : b;       ->  (a, b) -> a > b ? a : b
        //  }

        //  ▶ 익명 함수(이름이 없는 함수, anonymous function
        //  ex)
        //  int max(int a, int b) {                 int max(int a, int b)   -> { // 반환 타입과 이름을 지운다 그리고 화살표를 사용한다
        //      return a > b ? a : b;       ->          return a > b ? a : b;
        // }                                        }

        //  ▶ 함수와 메서드의 차이
        //  - 근복적으로 동일. 함수는 일반적 용어, 메서드는 객체지향개념 용어
        //  - 함수는 클래스에 독립적, 메서드는 클래스에 종속적

        // 2. 람다식 작성하기
        //  - 메서드의 이름과 반환타입을 제거하고 '->' 를 블록 {} 앞에 추가한다.
        // ex)
        // int max(int a, int b) {                  int max를 제거하고 (int a, int b) -> {
        //      return a > b ? a : b ;      ->              return a > b ? a : b;
        // }                                        }

        // - 반환값이 있는 경우, 식이나 값만 적고 return 문 생략 가능 (끝에 ';'안 붙임)
        // ex)
        // (int a , int b) -> {
        //      return a > b ? a : b ;      ->  (int a , int b) -> a > b ? a : b
        //  }

        // - 매개변수의 타입이 추론 가능하면 생략가능(대부분의 경우 생략가능)
        //  ex)
        //  (int a , int b) -> a > b ? a : b => (a,b) -> a > b ? a : b

        // 2. 람다식 작성하기 - 주의 사항
        // - 매개변수가 하나인 경우, 괄호() 생략 가능(타입이 없을 때만)
        //  ex)
        //  (a) -> a * a            =>      a -> a * a // OK
        //  (int a) -> a * a            int a -> a * a // 에러

        // - 블록 안의 문장이 하나뿐 일 때, 괄호{} 생략 가능 (끝에 ';' 안 붙임)
        //  ex)
        //  (int i) -> {
        //    System.out.println(i);    => (int i) -> System.out.println(i)
        // }

        // 단, 하나뿐인 문장이 return 문이면 괄호{} 생략 불가
        // (int a, int b) ->  { return a > b ? a : b; } // OK
        // (int a, int b) ->  return a > b ? a : b; // 에러

        // 3. 람다식의 예

        // int max(int a, int b) {
        //  return a > b ?  a : b;                      =>        (a,b) -> a > b ? a : b
        // }

        // int printVar(String name, int i) {
        //  System.out.println(name + "=" + i);         =>         (name,i) -> System.out.println(i);
        // }

        // int square(int x)
        //  return x * x;                               =>          x - > x * x
        // }

        // int roll() {
        //      return (int) (Math.random() * 6 );      =>          () -> (int)(Math.random() * 6)
        // }

        //  4.람다식은 익명 함수? 익명 객체!
        // ▶ 람다식은 익명 함수가 아니라 익명 객체이다.
        // ex)
        // (a ,b) -> a > b ? a : b  < = > new Object() {
        //                                  int max(int a, int b) {
        //                                      return a > b ? a : b;
        //                                  }
        //                                 }

        // ▶ 람다식(익명 객체)을 다루기 위한 참조변수가 필요. 참조변수의 타입은?
        //  ex)
        //  Object obj = new Object() {
        //      int max(int a, int b) {
        //          return a > b ? a : b;
        //      }
        //  };

        // 타입 obj = (a, b) -> a > b ? a : b ; // 어떤 타입?
        // int value = obj.max(3,5); // 에러. Object 클래스에 max()가 없음


    }
}
