package ch11;
// 52~56 Collection 컬렉션 클래스 요약
public class Ex_52_53_54_55_56 {
    public static void main(String[] args) {
        // 52~54 Collection(1/2) - 컬렉션을 위한 메서드(static)를 제공 // Object(객체), Arrays(배열), Collections(컬렉션) 을 다룰때 유용한 메서드 제공

        // 1.컬렉션 채우기,복사,정렬,검색 - fill() 컬렉션 채우기 ,copy() 복사,sort() 정렬 ,binarySerch() 검색 등
        // 2.컬렉션 동기화 - synchronizedXXX() 싱크로나이즈
        //  static colection synchronizedCollection(Collection c)
        //  static List      synchronizedList(List list)
        //  static Set       synchronizedSet(Set s)
        //  static Map       synchronizedMap(Map m)
        //  static SortedSet synchronizedSortedSet(SortedSet s)
        //  static StoredMap synchronizedSortedMap(SortedMap m)

        //  배열기반
        //  Vector 동기화 되어 있고
        //  ArrayList 동기화가 되어 있지 않다

        // List syncList = Collections.synchronizedList(new ArrayList(...));
        // syncList 는 동기화가 된 상태이고 new ArrayList 는 동기화 되지 않은 상태인데 syncList 로 넣어서 동기화가 되는 것이다 Vector 과 똑같은 상태가 된 것이다

        // 3.변경 불가(readOnly) 컬렉[션 만들기 = unmondifiableXXX()  언마디파이어블 수정불가 읽기 전용
        //  static Collection   unmodifiableCollection(Collection c)
        //  static List         unmodifiableList(List list)
        //  static Set          unmodifiableSet(Set s)
        //  static Map          unmodifiableMap(Map m)
        //  static NavigableSet unmodifiableNabigableSet(NavigableSet s)
        //  static SortedSet    unmodifiableSortedSet(SortedSet s)
        //  static NavigableMap unmodifiableNavigableMapt(NavigableMape m)
        //  static SortedMap    unmodifiableSortedMap(SortedMap m)

        // 4. 싱글톤 컬렉션 만들기 - singletonXXX()  객체 1개만 저장하는 컬렉션
        //  static List singletonList(Object o)
        //  static Set  singletonSet(Object o)      // singletonSet이 아님에 주의
        //  static Map  singletonMap(Object key, Object value)

        // 5.한 종류의 객체만 저장하는 컬렉션 만들기 - checkedXXX()
        //  static Collection    checkedCollection(Collection c, Class type)
        //  static List          checkedList(List list, Class type)
        //  static Set           checkedSet(Set s, Class type)
        //  static Map           checkedMap(Map m, Class keyType, Class valueType)
        //  static Queue         checkedQueue(Queeu queue, Class type)
        //  static NavigableSet  checkedNavigableSet(NavigableSet s, Calss type)
        //  static SortedSet     checkedSortedSet(SortedSet s, Class type)
        //  static NavigableMap  checkedNavigableMap(NavigableMap m, Class keyType, Class valueType)
        //  static SortedMap     checkedSortedMap(SortedMap m. Class keyType, Class valueType)

        // ex)
        // List list = new ArrayList();
        // List checkedList = checkedList(listm String.class); // String만 저장가능
        // checkedList.add("abc");      // OK.
        // checkedList.add(new Integer(3)); // 에러. ClassCastException발생





    }
}
