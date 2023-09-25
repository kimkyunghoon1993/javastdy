package ch12;

import java.util.ArrayList;

class Fruit implements Eatable {
    public String toString() {
        return "Fruit";
    }
}

class Apple extends Fruit {
    public String toString() {
        return "Apple";
    }
}

class Grape extends Fruit {
    public String toString() {
        return "Grape";
    }
}

class Toy {
    public String toString() {
        return "Toy";
    }
}

interface Eatable {
}

public class Ex12_3 {
    public static void main(String[] args) {
                FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
                FruitBox<Apple> appleBox = new FruitBox<Apple>();
                FruitBox<Grape> grapeBox = new FruitBox<Grape>();
                // FruitBox<Grape> grapeBox = new  FruitBox<Apple>();   // 에러. 타입 불일치   참조 변수는 Grape 생성자는 apple 이기 때문에
        //         FruitBox<Toy> toyBox2 = new  FruitBox<Toy>();   // 에러.

                fruitBox.add(new Fruit());
                fruitBox.add(new Apple());
                fruitBox.add(new Grape());
                appleBox.add(new Apple());
        //        appleBox.add(new Grape());        // 에러. Grape 는 Apple의 자손이 아님
                grapeBox.add(new Grape());

                System.out.println("fruitBox-" + fruitBox);
                System.out.println("appleBox-" + appleBox);
                System.out.println("grapeBox-" + grapeBox);

        // Box<String> b = new Box<String>();
        // // Box b = new Box<String>(); // 원시 타입으로 String 제네릭 타입을 가르키는 것이 가능 하다
        // // b.add(new Integer(100));    // 이렇게 되면 String 타입인데 Integer타입에 컴파일 에러가 발생하지 않는다 그러므로 원시타입과 제네릭을 같이 사용하면 안된다
        //
        // Box<String> bStr = null;
        //
        // b = (Box)bStr;                  // Box<String> -> Box 가능  but 경고
        // bStr = (Box<String>)b;          // Box -> Box<String> 가능  but 경고

        // FruitBox<? extends Fruit> fbox = (FruitBox<? extends  Fruit>) new FruitBox<Fruit>();
        // // FruitBox<Apple> -> FruitBox<? extends Fruit>
        // FruitBox<? extends Fruit> abox = new FruitBox<Apple>();     // 위 처럼 형변환을 하여 좌변과 우변의 타입을 일치 시켜줘야 하는데 좌변과 우변이 타입이 불일치 하는데 어떻게 가능한가?
        //
        // // FruitBox<? extends Fruit> -> FruitBox<? extends Apple> 가능? 가능!!
        // FruitBox<Apple> appleBox = (FruitBox<Apple>)abox;   // OK. 경고 발생


    }

}

class FruitBox<T extends Fruit & Eatable> extends Box<T> {
}

class Box<T> {
    ArrayList<T> list = new ArrayList<T>();     // itme을 저장할 list

    void add(T item) {      // 박스에 item을 추가
        list.add(item);
    }

    T get(int i) {       // 박스에서 item 을 꺼낼때
        return list.get(i);
    }

    int size() {
        return list.size();
    }

    public String toString() {
        return list.toString();
    }
}