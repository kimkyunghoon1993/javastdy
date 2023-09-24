package ch12;
// 12~14 와일드카드, 지네릭 메서드
public class Ex_12_13_14 {
    public static void main(String[] args) {
        //  12. 와일드 카드<?>
        //  - 하나의 탐조 변수로 대입된 타입이 다른 객체를 참조 가능
        //  ArrayList<? extends Product> list = new ArryaLIst<Tv>();    // Ok
        //  ArrayList<? extends Product> list = new ArrayList<Audio>(); // OK
        // ArrayList<Product> list = new ArrayList<Tv>();   // 에러. 대입된 타입 불일치

        // ex)
        //  <? extends T> 와일드 카드의 상한 제한. T와 그 자손들만 가능
        //  <? super T>   와일드 카드의 하한 제한. T와 그 조상들만 가능
        //  <?>           제한 없음. 모든 타입이 가능. <? extends Object> 와 동일

        // - 메서드의 매개변수에 와일드 카드를 사용
        // ex)
        // static Juice makeJuice(FruitBox<? extends Fruit> box) {
        //      String tmp = "";
        //      for(Fruit f : box. getList()) tmp += f + " ";
        //      return new Juice(tmp);
        //  }

        // System.out.println(Juicer.mapkeJuice(new FruitBox<Fruit>()));
        // System.out.println(Juicer.mapkeJuice(new FruitBox<Apple>()));

        // 서로 대입된 제네릭 타입이 다른 객체들을 하나의 참조변수로 매개변수로 받을수 있게 해준다

        // 14. 지네릭 메서드
        // - 지네릭 타입이 선언도니 메서드(다팁 변수는 메서드 내에서만 유효)
        // static <T> void sort(List<T> list, Compartor<? super T> c)

        // - 클래스의 타입 매개변수 <T> 와 메서드의 타입 매개변수 <T> 는 별개
        // ex)
        // class FruitBox<T> {  // 제네릭클래스 <T>
        //  ...
        //      static <T> void sort(List<T> list, comparator<? super T> c) {   // 제네릭스 메서드 <T>     // 클래스타입과 메서드 타입은 다르다
        //          ...
        //      }
        //  }

        // - 메서드를 호출할 때마다 타입을 대입해야(대부분 생략 가능)
        // FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
        // FruitBox<Apple> appleBox = new FruitBox<Apple>();
        //      ...
        // System.out.println(Juicer.<Fruit>makeJuice(fruitBox));   // 메서드 호출
        // System.out.println(Juicer.<Apple>makeJuice(appleBox));   // 메서드 호출

        // 지네릭 메서드 : 지네릭 메서드는 메서드를 호출할 대마다 다른 지네릭 타입을 대입할 수 있게 한 것
        // static <T extends Fruit> Juice makeJuice(fruitBox<T> box){   // 제한 된
        //   String tmp = "";
        //   for(Fruit f : box.getList*()) tmp += f + " ";
        //   return new Juice(tmp);
        // }

        // - 메서드를 호출할 때 타입을 생략하지 않을 때는 클래스 이름 생략 불가
        // System.out.println(<Fruit>makeJuice(fruitBox));  // 에러. 클래스 이름 생략 불가
        // System.out.println(this.<Fruit>makeJuice(fruitBox)); // Ok
        // System.out.println(Juicer.<Fruit>makeJuice(fruitBox)); // Ok

        // 와일드 카드 메서드 : 와일드 카드는 하나의 참조변수로 서로 다른 타입이 대입된 여러 지네릭 객체를 다루기 위한 것
        // static Juice makeJuice(FruitBox<? extends Fruit> box) {
        //      String tmp = "";
        //      for(Fruit f : box.getList()) tmp += f + " ";
        //      return new Juice(tmp);
        // }

        // ※ 와일드 카드를 사용하지 못할때 제네릭 메서드를 사용 한다
    }
}
