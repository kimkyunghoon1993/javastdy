package ch14;
// 13,14 메서드 참조(method reference), 생성자의 메서드 참조
public class Ex_13_14 {
    public static void main(String[] args) {
        // 13. 메서드 참조(method reference)
        // ▶ 하나의 메서드만 호출하는 람다식은 '메서드 참조' 로 간단히 할 수 있다.
        // static 메서드 참조
        // ClassName.method(x)
        // ClassName::method    // 클래스 이름 + 메서드 이름
        // 인스턴스메서드 참조
        // (obj,x) -> obj.method(x)
        // ClassName::method
        // 특정 객체 인스턴스메서드 참조
        // (x) -> obj.method(x)
        // obj::method

        // ▶ static 메서드 참조
        // ex)
        // Integer method(String s) {   // 그저 Integer.parseInt(String s) 만 호출
        //     return Integer.parseInt(s);
        // }

        // int result = obj.method("123");
        // int result = Integer.parseInt("123");

        // Fucntion<String, Integer> f = (String s) -> Integer.parseInt(s);
        // Function<String, Integer> f = Integer::parseInt; // 메서드 참조

        // 14. 생성자의 메서드 참조
        // ▶ 생성자와 메서드 참조
        // ex)
        // Supplier<MyClass> s = () -> new MyClass();   // Supplier 공급 입력이 없이 출력만
        // Supplier<MyClass> s = MyClass::new;
        // Function<Integer,MyCalss> s = (i) -> nwe MyClass(i);
        // Function<Integer.Myclass> s = MyClass::new;

        // ▶ 배열과 메서드 참조
        // ex)
        // Function<Integer, int[]>  f = x -> new int[x]; // 람다식    배열생성시 꼭 필요한것 초기화 즉 배열 길이 생성!!
        // Function<integer, int[]> f2 = int[]::new // 메서드 참조




    }

}
