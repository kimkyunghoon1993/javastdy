package ch11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// 22~24 iterator,Enumeration Map 과 iterator
public class Ex_22_23_24  {
    public static void main(String[] args) {
        // 22 iterator, Listlterator, Enumeration (이터레이터)
        // - 컬렉션에 저장된 데이터를 접근하는데 사용되는 (인터페이스)
        // - Enumeration은 iterator의 구번전
        // - Listiterator 는 iterator 의 접근성을 향상시킨 것 (단방향 -> 양방향) next() 다음요소, Previous()이전 요소

        // booelan hasNext()        (확인)
        // - 읽어 올 요소가 남아있는지 확인한다. 있으면 true, 없으면 false를 반환한다.

        // Object next()            (읽기)
        // - 다음 요소를 읽어 온다. next()를 호출하기 전에 hasNext()를 호출해서 읽어 올 요소가 있는지 확인하는 것이 안전한다.

        // void remove()
        // - next()로 읽어 온 요소를 삭제한다. next()를 호출한 다음 remove()를 호출해야 한다. (선택적 기능)

        // void forEachRemaining(Consumer<? super E> action)
        // - 컬렉션에 남아있는 요소들에 대해 지정된 작업(action)을 수행한다. 람다식을 사용하는 디폴트 메서드.(JDK1.8 부터 추가)

        // boolean hasMoreElements()
        // - 읽어 올 요소가 남아있는지 확인한다. 있으면 true, 없으면 false 를 반환한다. iterator 의 hasNext()와 같다.

        // Object nextElement()
        // - 다음 요소를 읽어 온다. nextElement()를 호출하기 전에 hasMoreElements()를 호출해서 읽어올 요소가 남아 있는지 확인하는 것이 안전하다. iterator의 next()와 같다

        // 22 iteraotor, Listiterator(양방향), Enumeration(구번전)
        // - 컬렉션에 저장된 요소들을 읽어오는 방법을 표준화한 것
        // 컬렉션의 종류 List(ArrayList, LinkedList),Set(TrrerSet),Map(HasMap) 마다 다른데 필요한 메서드도 다 다르다 그래서 공통적으로 필요한 부분을 표준화 한것이 itertor 이다
        // 그래서 boolean hasNext()와 Object next()
        // - 컬렉션에 iterator()를 호출해서 iterator를 구현한 객체를 언덩서 사용.

        // ex)

            // List list = new ArrayList();    // 다른 컬렉션으로 변경할 때는 이부분만 고치면 된다
            // Iterator it = list.iterator();
            //
            // while(it.hasNext()){       //   boolean hasNex() 읽어올 요소가 있는지 확인
            //     System.out.println(it.next());      //  Object next() 다음 요소를 읽어옴
            // }

            // public interface Collection {
            // ...
            //  public Iterator iterator();
            //  ...
            //  }

        // 24 Map 과 iterator
        // - Map 에는 iterator()가 없다. keySet(), entrySet(), values() 를 호출해야 한다
        // ex)
        //
        // public interfac Collection{
        //  ...
        // public Iterator iterator();
        // ...
        // }
        // 올바른 사용 방법
        // ex)
        // Map map = new HashMap();
        // ...
        // Iterator it = map.entrySet().iterator();     =>  Set eSet = map.entrySet();
        //                                                  Iterator it = eSet.iterator();

        // Iteratro it = map.entrySet().iterator();
    }
}
