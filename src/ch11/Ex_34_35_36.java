package ch11;
// 34~36 HashSet(1)
public class Ex_34_35_36 {
    public static void main(String[] args) {
        // 34. HashSet - 순서X, 중복X
        // List 특징 순서O,중복O
        // Set  특질 순서x,중복x
        // Set 구조       Set에 핵심 HashSet, TreeSet
        //              Set
        // HashSet    SortedSet
        //              TreeSet

        // ▶ HashSet    //Set을 사용해야 될때 HashSet을 사용하면 된다 가장 일반적이다
        // - Set인터페이스를 구현한 대표적인 컼ㄹ렉션 클래스
        // - 순서를 유지하려면, LinkedHashSet클래스를 사용하면 된다.

        // ▶ TreeSet
        // - 범위 검색과 정렬에 유리한 컬렉션 클래스
        // - HashSet보다 데이터 추가, 삭제에 시간이 더 걸림


        // ▶ HashSet 주요 메서드
        // - HashSet()  // 생성자
        // - HashSet(Collection c)
        // - HashSet(int initialCaacity)    // 초기용량
        // - HashSet(int initialCapacity, float loadFactor) // 언제 2배로 늘리것인가?
        // - boolean add(Object o)              (추가)
        // - boolean addAll(Coolection c)       (추가)    // 합집합
        // - boolean remove(Objcet o)           (삭제)
        // - boolean removeAll(Collection c)    (삭제)    // 교집합
        // - boolean retainAll(Collection c)    (조건부)   // 차집합
        // - void clear() // 모두 삭제
        // - boolean contains(Object o)         // 객체가 포함 되어 있는지?
        // - boolean containsAll(Collection c)  // 여러 객체가 모두 포함되어 있는지
        // - iterator iterator()            // 컬렉션 요소를 읽어 올수 있는 이터레이터
        // - boolean isEmpty()      // null 체크
        // - int size()             // 저장된 객체 갯수
        // - Object[] toArray()     // Set에 저장되어 있는 객체를 객체 배열로 반환
        // - Object[] toArray(Object[] a)



    }
}
