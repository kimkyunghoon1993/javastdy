package ch12;

import java.util.ArrayList;

//class Tv{}
//class Audio{}

public class GenericTest2 {
    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
        ArrayList<Tv> list = new ArrayList<Tv>();   // Tv 타입의 객체만 저장 가능
        list.add(new Tv());
//        list.add(new Audio());

//        Tv t = (Tv)list.get(0); // list의 첫번째 요소를 꺼낸다. 일반 클래스를 사용 하면 형변환을 해줘야 하는데
        Tv t = list.get(0); // 지네릭스 를 사용한 클래스는 형변환이 필요없다

        System.out.println(t);




    }
}
