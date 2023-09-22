package ch11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex11_1 {
    public static void main(String[] args) {
        // 기본 길이(용량 , capacity)가 10인 ArrayList를 생성
        ArrayList list1 = new ArrayList(10);
        // ArrayList에는 객체만 저장가능
        // list1.add(5); // autoboxing에 의해 기본형이 참조형으로 자동 변환 가능하다
        list1.add(new Integer(5));
        list1.add(new Integer(4));
        list1.add(new Integer(2));
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        list1.add(new Integer(3));

        // ArrayList(Collection c)
        // List sub = list1.subList(1,4);  // sub는 읽기만 가능 하다
        ArrayList list2 = new ArrayList(list1.subList(1,4));  // sub와 같은 내용의 ArrayList생성
        print(list1, list2);

        // Collection 은 인터페이스 , Collcetions는 유틸 클래스 (Math클래스처럼)
        Collections.sort(list1);        // 오름 차순 정렬
        Collections.sort(list2);
        print(list1, list2);
        //
        System.out.println("list1.containsAll(list2):" + list1.containsAll(list2)); //containsAll list1이 list2에 모든 요소를 포함하고 있는가? true
        //
        list2.add("B");
        list2.add("C");
        list2.add(3,"A");   // 3,"A" 추가 할 위치를 지정해 주었기 때문에  0, 2, 4, A, B, C 변경된다
        print(list1, list2);

        list2.set(3,"AA");  //set 은 변경 index 3 에 있는 것을 AA로 변경
        print(list1,list2);

        list1.add(0,"1");
        print(list1,list2);
        // indexOf()는 지정된 객체의 위치(인데스)를 알려준다
//        System.out.println("index=" + list1.indexOf("1"));  // 문자열 1의 위치
//        System.out.println("index=" + list1.indexOf(1));    // 참조변수 Integer 의 1값의 위치 오토 박싱으로 현재 줄에 있는 것처럼 사용할수 있지만 원래는 아래 줄 처럼 사용해야 된다
//        System.out.println("index=" + list1.indexOf(new Integer(1)));
        System.out.println("========================================");
//        list1.remove(0);        //remove 삭제   index 0 번째 배열 삭제
        list1.set(1,new Integer(1));
        print(list1,list2);
//        list1.remove(new Integer(1));   // index 에서 1을 삭제
        list1.remove(5);   // index 에 5번 에 있는 객체 삭제
        // boolean remove(Object obj) 를 호출? Object remove(int index)를 호출!!!

        print(list1,list2);

         // list1에서 list2 와 겹치는 부분만 남기고 나머지는 삭제한다.
         System.out.println("list1.retainAll(list2)" + list1.retainAll(list2));
         print(list1,list2);

         // list2 에서 list1에 포함된 객체들을 삭제한다.
         for(int i = list2.size()-1; i >= 0; i--){
             if(list1.contains(list2.get(i)))
                 list2.remove(i);
         }
         print(list1,list2);

    }

    static void print(ArrayList list1, ArrayList list2){
        System.out.println("list1:"+list1);
        System.out.println("list2:"+list2);
        System.out.println();
    }
}
