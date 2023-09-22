package ch11;
// 46,47 HashMap(1)
public class Ex_46_47 {
    public static void main(String[] args) {
        // 46 HashMap과 Hashtable - 순서X, 중복(키X,값O)
        // [Map 의 구조]
        //                      Map
        //  Hashtable         HashMap           SortedMap      ※ Hashtable 과 HashMap 은 비슷하다 단!! 둘의 차이는 동기화가 되어 있는가 되어 있지 않은가 의 차이가 있다
        //                 LinkedHashMap        TreeMap

        // Map 의 핵심은 HashMap 과 TreeMap 이 중요하다
        // - Map 인터페이스를 구현, 데이터를 키와 값의 쌍으로 저장

        // ▶︎ HashMap
        // - Map인터페이스를 구현한 태표적인 컬렉션 클래스
        // - 순서를 유지하려면, LinkedHashMap 클래스를 사용하면 된다.

        // ▶︎ TreeMap
        // - 범위 검색 정렬에 유리한 컬렉션 클래스
        // - HashMap보다 데이터 추가,삭제에 시간이 더 걸림 (비교저장)

        // 47 HashMap의 키(key) 와 값(value)
        // - 해싱(hashing)기법으로 데이터를 저장. 데이터가 많아도 검색이 빠르다.
        // - Map인터페이스를 구현. 데이터를 키와 값의 쌍으로 저장
        // 키 (key) 컬렉션 내의 키(key) 중에서 유일해야 한다.   // 중복 X
        // 값 (value) 키(key) 와 달리 데이터의 중복을 허용한다. // 중복 O

        // ex)
        //  HashMap map = new HashMap();
        // map.put("myId","1234");
        // map.put("asdf","1111");
        // map.put("asdf","1234");  // ※ 주의!! asdf 처음 에 값이 1111 이였는데 한번 더 put을 했을경우 1234로 변경 된다

        // Map 은 저장 할때 put을 사용한다 List나 Set은 add를 사용한다

        //ex)
        // public class HashMap extends AbstractMap implements Map, Cloneable, Serializble {
        //      transient Entry[] table;
        //      ...
        //      static class entry implements Map.Entry {
        //          final Object key;
        //          Object value;
        //          ...
        //      }
        //  }

        // 비객체지향적인 코드
        //  Object[] Key;
        //  Object[] value;

        // 객체지향적인 코드
        // Entry[] table;
        // class  Entry {
        //  Object key;
        //  Object value;
        //  }

        // 해싱(hashing) - (1/3) 환자정보 관리
        // 해시함수(hash function)
        // 해쉬코드: 배열의 index
        // 즉 해싱이란? 해쉬함수를 이용하여 데이터를 저장하고 & 읽어오는 것을 해싱이라고 한다
        // - 해시함수(hash function)로 해시테이블(hash table)에 데이터를 저장,검색
        // 키(key)를 index 번호를 저장 하고 그 값을 읽어서 어떤 위치를 알려준다
        // - 해시테이블은 배열과 링크드 리스트가 조합된 형태 2차원 배열의 (LinkedList 여려개 를 묶어 놓은것과 같다) 변경하기 쉽게 배열의 접근성, 링크드리스트의 변경에 유리함을 같이 사용하는것이 해시테이블이다
        // 해시함수 에는 Object.hash() 를 이용하면 빠르게 검색 할수 있고 해싱에는 Hashtable, HashMap, HashSet 이 있다 모두 hashCode를 사용한다

        // 해싱(hashing) - (3/3)
        // ▶︎ 해시테이블에 저장된 데이터를 가져오는 과정
        //   1.키로 해시함수를 호출해서 해시코드를 얻는다.
        //   2.해시코드(해시함수의 반환값)에 대응하는 링크드리스트를 배열에서 찾는다.
        //   3.링크드리스트에서 키와 일하는 데이터를 찾는다
        //   ※ 해시함수는 같은 키에 대해 항상 같은 해시코드를 반환해야 한다. 서로 다른 키일지라도 같은 값의 해시코드를 반환할 수도 있다.









    }
}
