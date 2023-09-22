package ch11;

import java.util.LinkedList;
import java.util.Vector;

// 3~6 Collection, List, Set , Map
public class Ex3_4_5_6 {
    public static void main(String[] args) {
        // 3 Collection 인터페이스 메서드
        // - List: 순서 O (데이터가 들어오는 순서대로) , 중복 O (허용) 예) 대기자 리스트
        // - Set:  순서 X (데이터 들어오는 순선상관없음) , 중복 X(허용되지 않음) 예) 집합 4개 다리가 달린 동물의 집합
        // - Map:  순서 X (데이터 들어오는 순선상관없음), 중복 Map의 형태는 키(key),와 값(Value) 으로 이루어 져 있는데 그중에 키(key)는 중복 될수 없고 값(Value)는 중복 될수 있다

        // List 와 Set 의 공통 부분을 Collection 이라고 한다

        // Collection 인터페이스의 메서드 들의 구성
        // 추가 add
        // 삭제 remove
        // 검색 contains

        // 4 List 인터페이스 - 순서 O , 중복 O
        // List 인터페이스 구조

        //                     List
        //   Vector          ArrayList           LinkedList
        //   Stack

        // List 인터페이스 구조 에서 가장 핵심은 ArrayList 와 LinkedList 이다

        // List 인터페이스의 메서드

        // void add (int index, Objece element)
        // boolean addAll(int index, Collection c)
        // 지정된 위치(index)에 객체(element) 또는 컬렉션에 포함된 (객체들을 추가한다)

        // Object get(int index)
        // 지정된 위치(index)에 있는 객체를 반환한다. ※객체를 읽어 오는것 !!!

        // int indexOf(Objec o)
        // 지정된 객체의 위치(index)를 반환한다.(List의 마지막 요소부터 역방향으로 찾는다.)  ※검색 왼쪽에서 오른쪽 찾는다

        // int lastIndexOf(Object o)
        // 지정도니 객체의 위치(index)를 반환한다. (List 의 마지막 요소부터 역방향으로 찾는다.) ※검색   오른쪽에서 왼쪽 찾는다

        // Listlterator listlterator()
        // Listlterator listlterator(int index)
        // List의 객체에 접근할 수 있는 Listlterator를 반환한다.

        // Object remove(int index)
        // 지정된 위치(index)에 있는 (객체를 삭제하고) 삭제된 객체를 반환한다.

        // Object set(int index, Object elemnt)
        // 지정된 위치(index) 에 객체(element)를 저장한다    ※객체를 변경하는 것!!

        // void sort(Comparator c)
        // 지정된 비교자(comparator)로 List를 (정렬한다.)

        // List subList(int fromIndex, int toIndex)
        // 지정도니 범위(fromIndex부터 toindex)에 있는 객체를 반환한다. ※일부만 뽑아내는것!!!


        // 5 Set 인터페이스 - 순서X , 중복 X
        // Set 의 구조
        //                  Set
        // HashSet          SortedSet
        //                  TreeSet
        // HashSet과 TreeSet이 핵심 이다

        // Set 인터페이스의 메서드 는 List 인터페이스의 메서드와 동일하다
        // boolean add(Object o)
        // 지정된 객체(o)를 Collection에 추가한다.

        // void clear()
        // Collection의 모든 객체를 삭제한다.

        // boolean contains(Object o)
        // 지정된 객체(o)가 Collection에 포함되어 있는지 확인한다.

        // boolean equals(Object o)
        // 동일한 Collection인지 비교한다.

        // int hashcode()
        // Collection의 code를 반환한다.

        // lterator iterator()
        // Collection 의 lterator를 얻어서 반환한다

        // boolean remove(Object o)
        // 지정된 객체를 삭제한다

        // int size()
        // Collection에 지정된 객체의 개수를 반환한다.

        // Object[] toArray()
        // Collection에 지정된 객체를 객체배열(Object[])로 반환한다.

        // Object[] toArray(Object[] a)
        // 지정된 배역에 Collection의 객체를 저장해서 반환한다.

        // Set = 집합
        // * 집합과 관련된 메서드(Collection에 변환가 있으면 true, 아니면 false를 반환.
        // boolean addAll(Collection c) : 지정된 Collection(c)의 객체들을 Collection에 추가한다.(합집합)
        // boolean containsAll(Collection c) : 지정된 Collection의 객체들이 Collection에 포함되어 있는지 확인한다. (부분집합)
        // boolean retainAll(Collection c) : 지정도니 Collection의 포호마된 개체들을 남기고 나머지는 Collection 에서 삭제한다.(교집합)

        // 6 Map 인터페이스 - 순서 X , 중복 ( 키 X , 값 O)
        // Map 인터페이스 의 구조

        //                  Map
        // Hashtalbe      HashMapp      SortedMap
        //             LinkedHashMap    TreeMap

        // Map 인터페이스 에서 핵심은 HashMap 과 TreeMap 가 핵심이다
        // LinkedHashMap : 순서가 발생한다!!

        // Map 인터페이스 메서드

        // void claer()
        // Map의 모든 객체를 삭제한다.

        // boolean containsKey(Object key)
        // 지정된 key객체와 일치하는 Map의 key객체가 있는지 확인한다.
        // boolean containsValue(Object value)                      ※ contains는 검색 get 도 마찬가지로 검색
        // 지정된 value 객체와 일치하는 Map 의 Value객체가 있는지 확인한다

        // Set entrySet() (key-value 를 같이 묶어서 표현하는 것이 entry(엔트리)), Set은  순서 x , 중복x       ※ 읽기
        // Map에 저장되어 있는 key-value쌍을 Map.Entry타입의 객체로 저장한 Set으로 반환한다.

        // boolean equals(Object o)
        // 동일한 Map인지 비교한다

        // Object get(Object key)
        // 지정한 key객체에 대응하는 value객체를 찾아서 반환한다.  ※검색

        // int hashCode()
        // 해시코드를 반환한다

        // boolean isEmpty()
        // Map이 비어있는지 확인한다

        // Set keySet()
        // Map에 저장된 모든 key객체를 반환한다.     ※ 읽기

        // Object put(Object key, Object value)
        // Map에 value객체를 key객체에 연결(mapping) 하여 저장한다.
        // ※ 객체를 추가할때는 put을 사용한다 key-value를 같이 저장 하게 되어 있다!!!!
        // void putAll(Map t)
        // 지정도니 Map의 모든 key-value싸을 추가한다.

        // Object remove(Object key)
        // 지정한 key객체와 일치하는 key-value객체를 (삭제한다.)

        // int size()
        // Map에 저장된 key-value쌍의 개수를 반환한다.

        // Collection values()      ※ 읽기     Collection 이 있다는 것은 순서가 있어도 되고 없어도 된다, 중복이 있어도 되고 없어도 된다 모두 된다
        // Map에 저장된 모든 value객체를 반환한다.











    }
}
