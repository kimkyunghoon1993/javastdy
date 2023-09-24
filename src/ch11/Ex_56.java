package ch11;

public class Ex_56 {
    // 컬랙션 클래스 정리 &  요약
    // 1. ArrayList , Vector, (Object[]) 배열기반의 컬렉션 클래스 (List 순서 O, 중복 O)
    // Statck: LIFO 구조 로 되어 있고 마지막에 들어 온게 가장 먼자 나간다! 배열이 순차적으로 추가/삭제가 유리하다
    // 배열의 단점: 중간에 추가/삭제 불리하다 이 단점을 보안하기 위해 LinkedList
    // LinkedList 는 연결 기반 기차를 생각 하면 된다 LinkedList는 Queue 방식이다
    // Queue: FIFO 구조 로 되어 있고 처음 들어 간 것이 먼저 나온다 즉 빨리 출근 하면 빨리 퇴근 한다
    // 검색 기능을 향상 시킨것이 HashMap
    // HashMap: 배열과 LinkedList 를 합친것이 HashMap 이다 Hashtble 이라고도 한다 (Map 순서 x, 중복(키(key) x, 값(Value) O)
    // HashMap 은 키(key) 와 값(Value) 이 하나의 쌍으로 구성 되어 있다
    // TreeMap 은 연결 기반으로 0~2 개 까지를 연결할수 있는 구조 이다
    // TreeMap 의 장점: 검색,범위검색, 정렬기능 향상 (왼쪽이 작은값 오른쪽에 큰값)
    // TreeMap 에서 이진트리탐색 에서 중위순회 로 정렬하면 1 3 사이에 2 가 있는 것이므로 오름 차순 정렬이 된다
    // HashSet 과 TreeSet (Set 순서x, 중복X)
    // Properites(String key ,String value) 파일 읽기와 쓰기가 용이 하다
    // HashSet 에서 순서 가 필요할땐 LinkedHashSet을 사용하면된다



}
