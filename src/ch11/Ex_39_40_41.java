package ch11;
// 39~41 TreeSet(1)
public class Ex_39_40_41 {
    public static void main(String[] args) {
        // 39 - TreeSet 범위 탐색, 정렬
        // - 이진 탐색 트리(binary search tree)로 구현, 범위 탐색 과 정렬에 유리. from ~ to
        // - 이진 트리는 모든 노드가 최대 2개의 하위 노드를 갖음 (0개~2개 자식 노드를 가질수 있다) 각 요소(node,노드)가 나무(tree)형태로 연결(LinkedList 의 변형)

        // [이진 트리 구조]

        //                          루트(root)
        //          부모  A                       부모    D

        //    A의 자식  B     C A의 자식       D의 자식  E       F   D의 자식

        // B,C 의 부모는 A 입니다

        // ex)

        // class TreeNode {
        // TreeNode left;       // 왼쪽 자식노드
        // Object   element;    // 저장할 객체
        // TreeNode right;      // 오른쪽 자식노드


        // ex) TreeNode 는 LinkedList와 비슷하다

        // class Node {
        // Node next;   // 다음 요소의 주소를 저장
        // Objcet obj;  // 데이터를 저장
        //}

        // ※TreeNode 는 자식과 부모가 연결 되는데 2개를 가르킬수도 있고 1개를 가르킬수도 있으며 LinkedList는 기차 처럼 1개 씩만 연결 된다

        // 40 이진 탐색 트리(binary serarch tree)
        // - 부모보다 작은 값은 왼쪽, 큰 값은 오른쪽에 저장
        // - 데이터가 많아질 수록 추가, 삭제에 시간이 더 걸림(비교 횟수 증가) (단점)
        // ex)
        //          5
        //작은값  1      7 큰값
        //

        // class TreeNode {
        //      TreeNode left;       // 왼쪽 자식노드
        //      Object   element;    // 저장할 객체
        //      TreeNode right;      // 오른쪽 자식노드
        // }

        // 41 TreeSet - 테이터 저장과정 boolean add(Object o) 저장할 객체   1.equals() 2.hashCode() // HashSet은 equals(),hashCode()로 비교 TreeSet은 comparae()를 호출해서 비교
        // ※ TrssSet에 7,4,9,1,5 의 순서로 데이터를 저장하면 , 아래의 과정을 거친다(루트부터 트리를 다라 내려가며 값을 비교. 작으면 왼쪽, 크면 오른쪽에 저장)

        //            7 저장
        //      4           9
        //  1       5









    }
}
