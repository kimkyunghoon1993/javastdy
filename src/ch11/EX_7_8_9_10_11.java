package ch11;

import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;

// 7~11 ArrayList Java API 소스 보기
public class EX_7_8_9_10_11 {
    public static void main(String[] args) {
        // 7 - ArrayList
        // - List 인터페이스 구조 순서 O , 중복 O
        //                     List
        //   Vector    ==    ArrayList           LinkedList
        //   Stack

        // - ArrayList는 기존의 Vector를 개선한 것으로 구현원리와 기능적으로 동일 ArrayList 와 달리 Vector는 자체적으로 동기화처리가 되어 있다.

        // Vector 동기화 처리가 되어 있고
        // ArrayList 동기화 처리가 되어 있지 않다

        // - List인터페이스를 구현하므로, 저장순서가 유지되고 중복을 허용한다.
        // - 데이터의 저장공간으로 배열을 사용한다.(배열기반)

        // ex)
        // public class Vector extends AbstractList implements List, RandomAccess, Cloneable, java.io.Serializable{
        //     ...
        //     protected Object[] elementData; // 객체를 담기 위한 배열      // 다형성에서 배웠듯이 Object[] 에는 모든 종류의 객체를 저장할수 있다
        //     ...
        // }

        // 8 - ArrayList의 메서드
        // Arraylist()  기본생성자
        // ArrayList(Collection c)  매개변수로 어떤 Collection 을 주면 그 컬렉션에 저장되어 있는 것을 ArrayList로 만들수 있다 컬렉션 끼리 변환 할때 주로 사용한다
        // ArrayList(int initialCapacity)   배열의 길이를 지정 해줄때 사용

        // 추가
        // boolean add(Object o)   // 매개변수에 객체 넣어준다 성공하면 true, 실패하면 false
        // void add(int index, Collection c)    // 매개변수 int index 에는 어디에 저장할 것 위치를 지정
        // boolean addAll(Collection c)
        // boolean addAll(int index, Collection c)

        // 삭제
        // boolean remove(Object o)     // 저장한 것을 삭제 할때
        // Object remove(int index)     // 특정 위치에 있는것을 삭제 할때
        // boolean removeAll(Collection c)  // Collection 을 지정해주면 컬렉션 안에 있는 객체를 삭제 한다
        // void claer() // ArrayList 에 있는 모든 객체를 삭제

        // 검색
        // int indexOf(Object o)                        // int -> 인텍스가 있는지 확인하여 없으면 -1 을 반환
        // int lastindexOf(Object o)                    // indexOf 는 왼쪽에서 오른 쪽으로 검색 하지만 lastIndexOf 는 말 그대로 끝에서 부터 검색 하는 것을 말하고 동일하게 없으면 -1 을 반환한다
        // boolean contains(Object o)                   // 특정된 객체가 있는지 존재하는지 있으면 true, 없으면 false
        // Object get(int index)                        // 객체 읽기
        // Object set(int index, Object element)        // 변경
        // List subList(int fromindex, int toindex)     // List 가 있으면 거기서 formindex 로 뽑아올 시작점 에서 부터 toindex 까지 를 뽑아와서 list를 다시 만드는 것이다
        // Object[] toArray()                           // ArrayList의 객체배열을 반환
        // Object[] to Array(Object[] a)
        // boolean isEmpty()                            // ArrayList가 비었는지 확인
        // void trimToSize()                            // 빈공간 제거
        // int size()                                   // ArrayList에 저장되어 있는 객체의 개수 반환

        // 10 - ArrayList에 저장된 객체의 삭제과정
        // - ArrayList에 저장된 세 번째 데이터(date[2])를 삭제하는 과정.list.remove(2); 를 호출
        //  index    0 1 2 3 4  5    6
        //  값       0 1 2 3 4 null  null
        // remove 가 실행되면
        // 1.삭제할 데이터 아래의 데이터를 한 칸씩 위로 복사해서 삭제할 데이터를 덮어쓴다.
        //  index    0 1 2 3 4  5    6
        //  값       0 1 3 4 4  null null
        // 2.데이터가 모두 한 칸씩 이동했으으로 마직막 데이터는 null로 변경
        // data[size-1] = null;     배열의 길이를 줄인다
        //  index    0 1 2 3   4    5
        //  값       0 1 3 4   null null
        // 3.데이터가 삭제되어 데이터의 개수가 줄었으므로 size의 값을 감소시킨다.
        // 삽입은 반대로 하면 된다

        // ArrayList 에 저장된 객체의 삭제과정
        // 1.ArrayList에 저장된 첫번째 객체부터 삭제하는 경우(배영 복사 발생)
        //  ex)
        //            for (int i = 0; i<list.size(); i++){
        //                list.remove(i);
        //            }
        //   이렇게 하면 제대로 삭제 되지 않는다

        // 2.ArrayList에 저장된 마지막 객체부터 삭제하는 경우(배열 복사 발생안함)
        //            for (int i = list.size()-1; i>=0; i--){
        //                list.remove(i);
        //            }
        // 뒤에서 부터 삭제를 진행 했기 때문에 index 에 객체는 남아 있을수 없다

    }
}
