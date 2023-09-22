package ch11;

import java.util.*;

public class Ex11_10 {
    public static void main(String[] args) {
        Set set = new HashSet();

        // set의 크기가 6보다 작은 동안 1~45사이의 난수를 저장
        for (int i = 0; set.size() < 6; i++) {
            int num = (int) (Math.random() * 45) + 1;
//            set.add(new Integer(num));
            set.add(num);// 오토박싱
        }

//        System.out.println(set);    // 정렬 되지 않은 상태로 출력 된다   Set은 정렬불가 Set -> List 로 움겨서 정렬

        List list = new LinkedList(set);    // LinkedList(Collection c)   Set의 모든 요소를 List에 저장
        Collections.sort(list);             // Collections.sort(List lit)     List를 정렬
        System.out.println(list);           //  List를 출력
    }
}
