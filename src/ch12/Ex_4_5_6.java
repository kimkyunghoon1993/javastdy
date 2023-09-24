package ch12;
// 4~6 지넥릭스 용어 지네릭 타입과 다형성
public class Ex_4_5_6 {
    public static void main(String[] args) {
        // 4. 지네릭스 용어
        // Box<T> - 지네릭 클래스. 'T의 Box' 또는 'T Box' 라고 읽는다.    // 타입변수 'T' 선언
        // T      - 타입 변수 또는 매개변수.(T는 타입 문자)
        // Box    - 원시 타입(raw type) // 일반클래스 타입(원시타입) -> 제네릭클래스

        // class Box<T>(Box 원시타입),<T>(지네릭 클래스, 타입변수) {}(지네릭 클래스 선언)

        // 대입된 타입 (매개변수화된 타입, parameterized type)
        // Box<String> b = new Box<String>(); // 지넥릭 타입 호출 참조변수,생성자 String 대입 타입이 일치 해야 한다

        // 5. 지네릭 타입과 다형성
        // - 참조 변수와 생성자의 대입된 타입은 일치해야 한다.
        // ArrayList<Tv>        list = new ArrayList<Tv>(); // Ok. 일치
        // ArrayList<Product>   list = new ArrayList<Tv>(); // 에러. 불일치 ArrayList<Product>

        // class Product []
        // class Tv extends Product { }
        // class Audio extends Product { }
        // 지네릭스는 일반 다형성 조상 자손 일때처럼 관계 대입 할수 없다 무조건 참조변수 와 생성자의 타입이 일치 해야 된다

        // - 지네릭 클래스간의 다형성은 성립 (여전히 대입된 타입은 일치 해야된다)
        // ex)
        // List<Tv> list = new ArrayList<Tv>(); // Ok. 다형성. ArrayList 가 List를 구현
        // List<Tv> list = new LinkedList<Tv>(); // Ok. 다형성. LinkedList 가 List를 구현

        // - 매개변수의 다형성도 성립.
        // ex)
        // ArrrayList<Product> list = new ArrayList<Product>();
        // list.add(new Product());
        // list.add(new Tv());      // Ok.  Product 자손도 Ok
        // list.add(new Audio());   // Ok.

        // boolean add(E e) {...} => boolean add(Product e) {...} // Product 그 자손 객체 가능
        // E get(int index) -> Product get(int index)
        // Product p = list.get(0);
        // Tv t = (Tv)list.get(1);





    }
}
