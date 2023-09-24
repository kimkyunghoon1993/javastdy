package ch12;

import java.util.ArrayList;
import java.util.List;

class Product {
}

class Tv extends Product {
}

class Audio extends Product {
}

public class Ex12_1 {
    public static void main(String[] args) {
        ArrayList<Product> productList = new ArrayList<Product>();
        ArrayList<Tv> tvList = new ArrayList<Tv>();
//        ArrayList<Product>  tvList = new ArrayList<Tv>(); // 대입 된 제네릭 타입이 다르기 때문에 컴파일 에러발생
//        List<Tv> tvList = new ArrayList<Tv>();        // Ok. 다형성

        productList.add(new Tv());  // public boolean add(Product e) {} Product 와 자손 Ok
        productList.add(new Audio());

        tvList.add(new Tv());       // public boolean add(Tv e) {} Tv 가 선언 되었으므로 Tv만 들어 올수 있다
        tvList.add(new Tv());
//        tvList.add(new Audio());  // 다른 건 들어 올수 없음 컴파일 에러 발생

        printAll(productList);  // printAll 에서 ArrayList<Product> 지네릭에 대입 된 Product 이므로 tvList 는 에러가 발생한다
        // printAll(tvList);    // 컴파일 에러가 발생한다.
                                // 에러가 발생하게 하지 않으려 printAll 메서드에 매개변수에 지네릭을 ArrayList<Product> -> ArrayList<Tv> 변경
    }

    public static void printAll(ArrayList<Product> list) {
        for (Product p : list)
            System.out.println(p);
    }
}
