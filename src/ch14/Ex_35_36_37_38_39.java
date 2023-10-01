package ch14;
// 35~39 Optional
public class Ex_35_36_37_38_39 {
    public static void main(String[] args) {
        // 35. Optional<T>
        // ▶ T 타입 객체의 래퍼클래스 - Optional<T>
        // 래퍼클래스 ex)
        //  public final class Optional<T> {
        //      private final T value;      //  T타입의 참조변수   모든 종류에 객체를 저장 할수 있다
        //      ...                         // null 직접 다루는 것은 위험 하다 그러므로 객체 담아서 간접적으로 null 다루기 위함 null 체크
        //  }

        // Object result = getResult

        // 36.Optional<T> 객체 생성하기
        // ▶ Optional<T> 객체를 생성하는 다양한 방법
        // ex)
        // String str = "abc";
        // Optional<String> optVal = Optional.of(str);
        // Optional<String> optVal = Optional.of("abc");
        // Optional<String> optVal = Optional.of(null);         // NullPointerException 발생
        // Optional<String> optVal = Optional.ofNullable(null)  // Ok

        // ex)
        // public final class Optional<T> {
        //      priavet final T value
        //      ...
        //  }

        // ▶ null 대신 빈 Optional<T> 객체를 사용하자
        // Optional<String> optVal = null; //  널로 초기화, 바람지하지 않음
        // Optional<String> optVal = Optional.<String>empty(); // 빈 객체로 초기화

        // 37.Optional<T> 객체의 값 가져오기
        // ▶ Optional 객체의 값 가져오기 - get(),orElse(),orElseGet(),orElseThrow()
        // ex)
        // Optional<String> optVal = Optional.of("abc");
        // String str1 = optVal.get();                                  // optVal 에 저장된 값을 반환. null이면 예외발생
        // String str2 = optVal.orElse("");                             // optVal 에 저장된 값을 null일 때는, ""를 반환
        // String str3 = optVal.orElseGet(String::new)                  // 람다식 사용가능 () -> new String()
        // String str4 = optVal.orElseThrow(NullPointerException::new); //  널이면 예외 발생

        // T orElseGet(Supplier<? extends T> other)
        // T orElseThrow(supplier<? extends X> exceptionSupplier)

        // ▶ isPresetn() - Optional 객체의 값이 null 이면 false, 아니면 true를 반환
        // if(Optional.ofNullable(str).isPresent()) {   // if(str!=null)    {
        // System.out.println(str);
        // }

        // ifPresnt(Consumer) - 널이 아닐때만 작업 수행, 널이면 아무 일도 안 함
        // Optional.ofNullable(str).ifPresent(System.out::println);

        // 38.OptionalInt, OptionalLong, OptionalDouble
        // ▶ 기본형 값을 감싸는 래퍼클래스
        // ex)
        //  public final class OptionalInt() {
        //      ....
        //      private final boolean isPresent; // 값이 저장되어 있으면 true
        //      private final int value;    // int 타입의 변수
        //  }

        // ▶ OptionalInt 의 값 가져오기 - int getAsInt()
        //  Optional<T>
        //  T get()

        // OptionalInt
        // int getAsInt()

        // OptionLong
        // long getAsLong()

        // OptionDouble
        // double getAsDouble()

        // ▶ 빈 Optional 객체와의 비교
        // OptionInt opt = OptionalInt.of(0);   // OptionalInt에 0을 저장
        // OptionInt opt2 = OptionInt.empty();  // OptionalInt에 0을 저장

        // System.out.println(opt.isPresent()); // true
        // System.out.println(opt2.isPresent()); // false
        // System.out.println(opt.equals(opt2)); // false








    }
}
