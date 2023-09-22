package ch11;
// 12~14 LinkedList ArrayList 와 비교
public class Ex_12_13_14 {
    public static void main(String[] args) {
        // 12 - LinkedList 배열의 장단점
        // ▶︎ 장점: 배열은 구조가 간단하고 데이터를 읽는 데 걸리는 시간(접근시간, access time) 이 짧다.
        // ▶︎ 단점 1: 크기를 변경할 수 없다.
        //  - 크기를 변경해야 하는 경우 새로운 더 큰 배열을 생성후 기존에 데이터를 복사 후 참조 변수 를 변경 해야함.
        //  - 크기 변경을 피하기 위해 충분히 큰 배열을 생성하면, 메모리가 낭비됨.
        // ▶︎ 단점 2: 비순차적인 배열의 중간에  데이터의 추가, 삭제에 시간이 많이 걸린다.
        //  - 데이터를 추가하거나 삭제하기 위해, 다른 데이터를 옮겨야 함.
        //  - 그러나 순차적인 데이터 추가(끝에 추가)와 삭제(끝부터 삭제)는 빠르다.

        // 배열의 단점
        // 1. 크기 변경 불가
        // 2. 중간에 추가,삭제 를 하면 시간이 많이 걸린다

        // LinkedList 특징
        // - 불연속 적이다 어떤 데이터가 있으면 그옆에 바로 ArrayList 처럼 바로 옆에 있는게 아니다 어디에 위치 했는지 알수없다
        // - 요소 하나 하나를 연결해 놓은것 이므로 변경에 유리하다

        // 12 - LinkedList 배열의 단점을 보완
        // - 배열과 달리 링크드 리스트는 불연속적으로 존재하는 데이터를 연결(link)
        // ▶︎ 데이터의 삭제: 단 한 번의 참조 변경만으로 가능
        // ▶︎ 데이터의 추가: 한번의 Node객체생성과 두 번의 참조변경만으로 가능


        // 3.2 - LinkedList 이중 연결 리스트
        // ▶︎ 링크드 리스트(linked list) - 연결리스트, 데이터 접근성이 나쁨
        //   ex)
        //         class Node{
        //             Node next;
        //             Object obj;
        //         }

        // ▶︎ 더블리 링크드 리스트(double linked list) - 이중 연결리스트, 접근성 향상
        //   ex)
        //         class Node{
        //             Node next;       // 다음요소
        //             Node previous;   // 이전요소
        //             Object obj;
        //         }

        // ▶︎ 더블리 써큘러 링크드 리스트(doubly circular linked list) - 이중 원형 연결리스트

        // 3.3 ArrayList vs LinkdeList - 성능 비교
        // 1.순차적으로 데이터를 추가/삭제 하는경우 ArrayList가 빠름
        // 2.비순차적으로 데이터를 추가/삭제 하는경우 LinkedList가 빠름
        // 3.접근시간(access time) 은 ArrayList 가 빠름
        //  - 인텍스가 n 인 데이터의 주소 = 배열의 주소 + n* 데이터 타입의 크기

        // 정리
        // ArrayList : 읽기(접근시간 access time)빠르고 추가/삭제(변경)는 느리며 순차적인 추가삭제는 더 빠름 비효율적인 메모리사용(배열을 생성할때 크게 만들어서)     ※ 자료구조: 배열 기반(연속적)
        // LinkedList: 읽기(접근시간 access time)느리다 추가/삭제(변경)는 빠르고 데이터가 많을수록 접근성이 떨어짐(필요할때마다 만들어서 사용하기 때문에            ※ 자료구조: 연결 기반(불연속적)

        // ※ 자료구조란?
        // 어떤식으로 저장 해야 되는지 어떤 구조로 저장해야 되는지를 정리 해 놓은 것이 바로 자료구조 이다

    }
}
