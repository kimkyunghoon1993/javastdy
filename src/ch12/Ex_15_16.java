package ch12;
// 15,16 지네릭 타입의 형변환, 지네릭 타입의 제거
public class Ex_15_16 {
    public static void main(String[] args) {
        // 15 지네릭 타입의 형변환
        // - 지네릭 타입과 원시 타입 간의 형변환 은 바람직 하지 않다. (경고 발생)

        // ex)
        // Box<Objcect> objBox = null;  // 지네릭 타입
        // Box box = (Box)objBox;   // Ok. 지네릭 타입 -> 원시 타입. 경고 발생
        // ojbBox =  (Box<Object>box;   // Ok. 원시 타입 -> 지네릭 타입, 경고 발생

        // Box<Object> objBox = null;
        // Box<String> strBox = null;

        // objBox = (Box<Object>)strBox; // 에러. Box<String> -> Box<Object>  // 서로 다른 제네릭 타입 끼리는 형변환이 되지 않느다
        // strBox = (Box<String>)objBox; // 에러. Box<Object> -> Box<String>

        // - 와일드 카드가 사용된 지네릭 타입으로는 형변환 가능
        // Box<Objcet>  objBox = (Box<Object>)new Box<String>(); // 에러. 형변환 불가능
        // Box<? extends Objcet> wBox = (Box<? extends Objcet)new Box<String>();    // Ok
        // Box<? ectends Objcet> wBox = new Box<String>();  // 위 문장과 동일

        // 매개변수로 FruitBox<Fruit>, FruitBox<Apple>, FruitBox<Grape> 등이 가능
        // static Juice makeJuice(FruitBox<? extends Fruit> box) {...}

        // FruitBox<? extends Fruit> box = new FruitBox<Fruit>();   // Ok
        // FruitBox<? extends Fruit> box = new FruitBox<Apple>();   // Ok

        // 16. 지네릭 타입의 제거
        // - 컴파일러는 지네릭 타입을 제거하고, 필요한 곳에 형변환을 넣는다.
        //  1. 지네릭 타입의 경계(bound)를 제거
        // ex)
        // class Box<T ectends Fruit> {                  class Box {
        //    void add(T t) {                               void add(Fruit t) {
        //         ...                              =>          ...
        //    }                                             }
        // }                                             }
        // Object -> <T> 로 변경하고 컴파일 실행되면 -> Objcet 로 다시 변경된다 이유는 하위 호환성 때문이다 이전 버전과 호환 할수 있게 하는 것이다.

        // 2.지네릭 타입 제거 후에 타입이 불일치 하면, 형변환을 추가
        // ex)
        //      T get(int i) {                                         Fruit get(int i) {
        //        return list.get(i);                   =>                 return (Fruit)list.get(i);
        //      }                                                       }

        // 3.와일드 카드가 포함된 경우, 적절한 타입으로 형변환 추가
        // ex)
        // static Juice makeJuice(FruitBox<? extends Fruit> box) {
        //      String tmp = "";
        //      for(Fruit f: box.getList())
        //          tmp += f + " ";
        //      return new Juice(tmp);
        // }

        // static Juice makeJuice(FruitBox box) {
        //  String tmp = "";
        //  Iterator it = box.getList().iterator();
        //  while(it.hasNext()) {
        //      tmp != (Fruit)it.next : " ";
        //  }
        //  return new Juice(tmp);
        //}




    }
}
