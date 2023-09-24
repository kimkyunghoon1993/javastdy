package ch12;
// 9~11 제한된 지네릭 클래스 지네릭스의 제약
public class Ex_9_10_11 {
    public static void main(String[] args) {
        //   9. 제한된 지네릭스 클래스
        //   - extends 로 대입할 수 있는 타입을 제한
        //  ex)

        //  class FruitBox<T extends Fruit> {   // Fruit 의 자손만 타입으로 지정가능
        //      ArrayList<T> list = new ArrayList<T>();
        //      ...
        //  }

        //  FruitBox<Apple> appleBox = new FruitBox<Apple>();   // Ok.
        //  FruitBoxx<Toy>  toyBox = new FruitBox<Toy>();  // 에러. Toy는 Fruit 의 자손이 아님

        // Fruit 의 자손 Apple 이여서 가능 하지만 Toy는 Fruit 의 자손이 아니여서 에러 발생

        // - 인터페이스인 경우에도 extends 를 사용
        // interface Eatable {}
        // class FruitBox<T extends Eatable> {...}

        // 11. 지네릭스의 제약
        // - 타입 변수에 대입은 인스턴스 별로 다르게 가능
        // Box<Apple> appleBox = new Box<Apple>(); // OK. Apple 객체만 저장 가능
        // Box<Grape> grapeBox = new Box<Grape>(); // OK. Grape 객체만 저장 가능

        // - static 멤버에 타입 변수 사용불가      모든 인스턴에 공통
        // ex)
        // class Box<T>
        //   static T item; // 에러
        //   static int compear(T t1,T t2) {...}    // 에러
        //      ....

        // - 배열 생성할때 타입 변수 사용불가. 타입 변수로 배열 선언은 가능
        // class Box<T> {
        //  T[] itemArr;    // OK. Tㅌ타입의 배열을 위한 참조변수
        //      ...
        //  T[] toArray() {
        //      T[] tmpArr = new T[itemArr.length]; // 에러. 지네릭 배열 생성불가
        //      ...



    }
}
