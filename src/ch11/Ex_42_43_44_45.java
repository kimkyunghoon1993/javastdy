package ch11;
// 42~45    TreeSet(2)
public class Ex_42_43_44_45 {
    public static void main(String[] args) {
        // 42 Treeset - 주요 생성자 와 메서드
        // add(), remove(), isEmpty(), size(),iterator() 제외 Collection이 가지고 있기 때문에

        // TreeSet()    // 비교할 기준이 없으면 comparable을 선언 (기본 비교기준)
        // - 기본 생성자

        // TreeSet(Collection c)
        // - 주어진 컬렉션을 저장하는 TreeSet을 생성

        // TreeSet(Comparator compe)    // Comparator 역할: 비교 기준 제공
        // - 주어진 정렬기준으로 정렬하는 TreeSet을 생성

        // Object first()   // 제일 작은것
        // - 정렬된 순서에서 첫 번째 객체를 반환한다.

        // Object last()    // 제일 큰것
        // - 정렬된 순서에서 마직막 객체를 반환한다.

        // Object ceiling(Objcect o)    // 반올림
        // - 지정된 객체와 같은 객체를 반환. 없으면 큰 값을 가진 객체 중 제일 가까운 값의 객체를 반환. 없으면 null

        // Object floor(Object o)   // 내림,버림
        // - 지정된 객체와 같은 객체를 반환, 없으면 작은 값을 가진 객체 중 제일 가까운 값의 객체를 반환. 없으면 null

        // Object higher(Object o)  // 지정된 객체보다 큰거
        // - 지정된 객체보다 큰 값을 가진 객체 중 제일 가까운 값의 객체를 반환. 없으면 null

        // Object lower(Object o)   // 지정된 객체보다 작은것
        // - 지정된 객체보다 작은 값을 가진 객체 중 제일 가까운 값의 객체를 반환. 없으면 null

        // SortedSet subSet(Object fromElement,Objcet toElement)    //from ~ to 어디 부터 어디 까지
        // - 범위 검색(fromElement와 toElement사이)의 결과를 반환한다.(끝 번위인 toElement는 범위에 포함되지 않음)

        // Sortedset hasdSet(Object toelement)      // 어떤 값 보다 작은것
        // - 지정된 객체보다 작은 값의 객체들을 반환한다.

        // SrotedSet tailSet(Object fromElement)        // 어떤 값 보다 큰것
        // - 지정된 객체보다 큰 값의 객체들을 반환한다.

        // TreeSet 예제 3 범위 검색 subSet(), headSet(), tailSet()

        // SortedSet subSet(Object fromElement, Object toElement)
        // - 범위 검색(fromElement와 toElement사이)의 결과를 반환한다.(끝 범위인 toElement는 범위에 포함되지 않음)

        // SortedSet headSet(Object toElement)
        // - 지정된 객체보다 작은 값의 객체들을 반환한다.

        // SortedSet tailSet(Object fromElement)
        // - 지정된 객체보다 큰 값의 객체들을 반환한다.


        // [알아두면 좋아요] 트리 순회(tree traversal)
        // - 이진 트리의 모든 노드를 한번씩 읽는 것을 트리 순회라고 한다.
        // - 전위,중위,후위 순회법이 있으면, 중위 순회하면 오름차순으로 정렬된다.

        // 전위 순회
        // 후위 순회
        // 중위 순회
        // 레벨 순회





    }
}
