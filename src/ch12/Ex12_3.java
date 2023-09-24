package ch12;

import java.util.ArrayList;

class Fruit implements Eatable{
    public String toString() {
        return "Fruit";
    }
}

class Apple extends Fruit { public String toString() { return  "Apple";}}
class Grape extends Fruit { public String toString() { return  "Grape";}}
class Toy                  {public String toString() {return "Toy";}}

interface Eatable{}

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
    }

}

class FruitBox<T extends Fruit & Eatable> extends Box<T>{}

class Box<T> {
    ArrayList<T> list = new ArrayList<T>();     // itme을 저장할 list
    void add(T item) {      // 박스에 item을 추가
        list.add(item);
    }
    T get(int i){       // 박스에서 item 을 꺼낼때
        return list.get(i);
    }
    int size() {
        return list.size();
    }
    public String toString(){
        return list.toString();
    }
}