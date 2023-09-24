package ch11;

import java.util.*;
import static java.util.Collections.*;  // static 를 사용 해서 Collections.* 임포트 를 했기때문에 Collection를 생햑가능하게 해준다.

class Ex11_19 {
    public static void main(String[] args) {
        List list = new ArrayList();
        System.out.println(list);

        addAll(list, 1,2,3,4,5);
        System.out.println(list);

//        Collections.addAll(list, 1,2,3,4,5,6,7,8,9,10); // 원래는 이렇게 사용해야 되는데 위 import 에 static Collection.* 했기 때문에
//        System.out.println(list);                       // Collections. 은 생략가능 하다

        rotate(list, 2);  // 오른쪽으로 두 칸씩 이동,2번회전해라
        System.out.println(list);

        swap(list, 0, 2); // 첫 번째와 세 번째를 교환(swap)   , index 0 과 2 의 자리 를 바꿔라
        System.out.println(list);

        shuffle(list);    // 저장된 요소의 위치를 임의로 변경 // 순서를 섞어라
        System.out.println(list);

        sort(list, reverseOrder()); // 역순 정렬 reverse(list);와 동일
        System.out.println(list);

        sort(list);       // 기본 정렬(오름차순)
        System.out.println(list);

        int idx = binarySearch(list, 3);  // list 3이 저장된 위치(index)를 반환 binarySearch 를 하기전에 반드시 정렬을 먼저 해야 된다
        System.out.println("index of 3 = " + idx);

        System.out.println("max="+max(list));       // 최대값
        System.out.println("min="+min(list));       // 최소값
        System.out.println("min="+max(list, reverseOrder()));   // 최소값

        fill(list, 9); // list 전체 를 9로 채운다.
        System.out.println("list="+list);

        // list와 같은 크기의 새로운 list를 생성하고 2로 채운다. 단, 결과는 변경불가
        List newList = nCopies(list.size(), 2);
        System.out.println("newList="+newList);

        System.out.println(disjoint(list, newList)); // list 와 newList 공통요소가 없으면 true

        copy(list, newList);
        System.out.println("newList="+newList);
        System.out.println("list="+list);

        replaceAll(list, 2, 1);
        System.out.println("list="+list);

        Enumeration e = enumeration(list);  // iterator 와 같은것이다
        ArrayList list2 = list(e);

        System.out.println("list2="+list2);
    }
}
