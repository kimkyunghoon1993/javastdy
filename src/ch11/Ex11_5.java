package ch11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Ex11_5 {
    public static void main(String[] args) {
        // ArrayList list = new ArrayList();   // ArrayList 에 문자열 1,2,3,4,5 add (저장) 하여
        // HashSet list = new HashSet();
        Collection c = new HashSet();    // HashSet 는 Collection 의 자손 이기 때문에 이렇게 참조 변수에 Colection 이 들어 와도 문제가 없다
        c.add("1");
        c.add("2");
        c.add("3");
        c.add("4");
        c.add("5");

        Iterator it = c.iterator();  // list에 iterator를 호출 하여 iterator의 객체를 얻는다
        // 위 처럼 ArrayList 를 HashSet 로 변경해도 iterator 에는 문제가 없다 대신 아래 for문에는 HashSet 에는 get이 없기때문에 에러가 발생한다

        while (it.hasNext()) {        //   while 반복문을 이용하여 it의 객체를 읽어 온다
            Object obj = it.next();
            System.out.println(obj);
        }

        // iterator은 일회용 이기 때문에 while 한번 돌리기 위해서는 한번더 선언 해줘야 한다
        // it = list.iterator();   // 새로운 iterator객체를 얻는다.

        // for (int i = 0; i < list.size(); i++) {        //   while 반복문을 이용하여 it의 객체를 읽어 온다
        //     Object obj = list.get(i);
        //     System.out.println(obj);
        // }
    }
}
