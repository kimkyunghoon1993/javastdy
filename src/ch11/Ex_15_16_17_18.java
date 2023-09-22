package ch11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// 15~18 stack 과 Queue
public class Ex_15_16_17_18 {
    public static void main(String[] args) {
        // 15 - 스택과 큐(Stack & Queue)

        // ▶︎ 스택(Stack): LIFO 구조, 마직막에 저장된 것을 제일 먼저 꺼내게 된다.
        // 쉽게 생각 하면 밑이 막힌 상자을 생각하면 된다 즉 박스
        // 먼저넣들어간 것이 맨 밑에 들어 있기때문에 꺼내기 위해서는 마지막에 들어온 것부터 꺼내야 원하는 것을 사용할수있다  ※ 저장(pust), 추출(pop)
        // LIFO(Last In First Out) 마직막이 IN 처음으로 out (마지막에 와서 일찍간다)
        // ※ 적합한 구현 방법은 : 배열을 이용하는 것이 적합하다

        // ▶︎큐(Queue): FIFO 구조, 제일 먼저 저장한 것을 제일 먼저 꺼내게 된다.
        // 쉽게 생각 하면 줄서기 와 갔다 양끝이 뚫린 상자 ※ 저장(offer 제공), 추출(poll)
        // FIFO(First In First Out) 먼저들어온게 먼저 나간다(일찍 와서 일찍 간다)
        // ※ 적합한 구현 방법은 : LinkedList 을 이용하는 것이 적합하다

        // 16 스택과 큐(Stack & Queue) 의 메서드

        // ▶︎ 스택(Stack) 메서드
        // boolean empty()
        // Stack이 비어있는지 알려준다

        // Object peek()
        // Stack의 맨 위에 저장된 객체를 반환, pop()과 달리 Stack 에서 객체를 꺼내지는 않음.(비었을 때는 EmptyStackException 발생)

        // Object pop()
        // Stack의 맨 위엥 저장된 객체를 꺼낸다, (비었을때 는 EmptyStackExceptoin 발생)

        // Object push(Object item)
        // Stack에 객체(item)를 저장한다.

        // int search(Object o)
        // Stack에서 주어진 객체(o)를 찾아서 그 위치를 반환, 못찾으면 -1 을 반환,(배열과 달리 위치는 0이 아닌 1부터 시작)

        // Stack st = new Stack(); 객체 생성 가능하다 Stack class 가 있기 때문에


        // ▶︎ 큐(Queue) 메서드
        // boolean add(Object o)
        // 지정된 객체를 Queue에 추가한다. 성공하면 true를 반환, 저장공간이 부족하면 lllegalStateException발생         (추가) 예외발생

        // Object remove()
        // Queue에서 객체를 꺼내 반환. 비어 있으면 NoSuchElementException 발생                                  (삭제) remove는 예외가 발생하고

        // Object element()
        // 삭제없이 요소를 읽어온다. peek와 달리 Queue 가 비었을 때 NoSuchElementException 발생

        // boolean offer(Object o)
        // Queue에 객체를 저장. 성공하면 true. 실패하면 false를 반환                                         (추가) add와 동일하게 추가 하는 역할을 하지만 예외를 발생시키지 않는다

        // boolean poll()
        // Queue 에서 객체를 꺼내서 반환, 비어있으면 null을 반환                                              (삭제) remove 와 동일하게 삭제 하는 역할을 하지만 예외를 발생하지 않고 null을 반환한다

        // Object peek()
        // 삭제없이 요소를 읽어 온다 Queue 가 비어있으면 null 반환

        // Queue qu = new Queue(); 생성이 불가능 하다 인터페이스 이기 때문에

        // 18 인터페이스를 구현한 클래스 찾기
        // 1. Queue를 Stack처럼 사용하고 싶다면 직접 구현 하면 된다
        // 2. Queue를 구현한 클래스를 사용한다
        //  - 즉 LinkedList를 이용하면 된다
        // ex) 아래와 같은 방식으로 Queue 큐를 사용할수 있다

        //          Queue q = new LinkedList();
        //          q.offer("0");






    }
}
