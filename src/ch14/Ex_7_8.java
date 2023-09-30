package ch14;
// 7,8 java.util.function 패키지 (1/3)
public class Ex_7_8 {
    public static void main(String[] args) {
        // 7 java.util.function 패키지 (1/3)
        // ▶ 자주 사용되는 다양한 함수형 인터페이스를 제공

        // java.lang.Runnable
        // void run()
        // 매개변수도 없고, 반환값도 없음

        // Supplier<T>      공급자
        // T get()
        // 매개변수는 업고, 반환값만 있음

        // Consumer<T,R>    소비자
        // void accept(T t)
        // Supplier 와 반대로 매개변수만 있고, 반환값이 없음

        // Function<T,R> 함수
        // R apply(T t)
        // 일반적인 함수, 하나의 매개변수를 반아서 결과를 반환

        // Predicate<T> 조건식
        // boolean test(T t)
        // 조건식을 표현하는데 사용됨. 매개변수는 하나. 반환 타입은 boolean

        // Predicate ex)
        // Predicate<String> isEmptyStr = s -> s.length() == 0; // 반환타입이 boolean
        // String s = "";

        // if(isEmptyStr.test(s)) // if(s.length() == 0)
        // System.out.println("This is an empty String.");

        // Q. 아래의 빈 칸에 알맞은 함수형 인터페이스(java.util.function패키지)를 적으시오.
        // 1.        f = () (int)(Math.random()*100)+1;     //  Supplier(int)
        // 2.        f = i -> System.out.print(i + ",");    //  Consumer(intger)
        // 3.        f = i -> i%2==0;                       //  Predicate 원래는 Function<T,R> 처럼 Predicate<intger.Boolean>이라고 써야 하지만 반환타입이 항항 Booelan 이기 때문에 Boolean 은 쓰지 않는다
        // 4.        f = i -> i/10*10;                      //  Function<Integer>

        // ▶ 매개변수가 2개인 함수형 인터페이스 (2/3)

        // BiConsumer<T,U>          // 받기만 할때 Consumer
        // void accept(T t,U u)
        // 두개의 매개변수만 있고, 반환값이 없음

        // BiPredicate<T,U>         // 두개를 받아서 true또는 false 를 반환 할때
        // boolean test(T t, U u)
        // 조건식을 표현하는데 사용됨. 매개변수는 둘, 반환값은 boolena

        // BiFunction<T,U,R>        // 두개를 받아서 결과를 R 타입으로 반환 할때
        // R apply(T t, U u)
        // 두 개의 매개변수를 받아서 하나의 결과를 반환

        // ※ Bi : 매개변수 두개를 의미 한다

        // 입력을 3개 를 받는  함수가 필요할때는 직접 구현한면 된다
        // ex)
        // @FunctionalInterface
        //  interface TriFunction<T,U,V,R>  {
        //      R apply(T t, U u, V v);
        //  }

        // ▶ 매개변수의 타입과 반환 타입이 일치하는 함수형 인터페이스 (3/3)

        // UnaryOperator<T> Operator = 단항 연산자
        // T apply(T t)
        // Function 의 자손 Function 과 달리 매개변수와 결과의 타입이 같다

        // BinaryOperator<T>    Binary = 이항 연산자
        // T apply(T t, T t)
        // BiFunction 의 자손, BiFunction 과 달리 매개변수와 결과의 타입이 같다.

        // 보통의 function
        // ex)
        // @FuncationalInterface
        //  public interface UanaryOperator<T> extends Function<T,T> {
        //      static <T> UnaryOperator<T> identity() {    // identity 함등함수 어떤 매개변수를 넣으면 그 값을 그대로 반환 해야 하는 경우
        //          return t -> t;
        //      }
        //  }

        // @FunctionnalInterface
        // public interave function<T,R> {
        //  R apply(T t);
        //  ...
        // }













    }
}
