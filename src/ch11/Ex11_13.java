package ch11;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex11_13 {
    public static void main(String[] args) {
        // Set set = new TreeSet();        // TreeSet는 정렬이 필요 없다
        // Set set = new HashSet();    // HashSet 은 정렬이 되지 않는다
        // Set set = new TreeSet(new TestComp());   //Comparator 를 사용할경우
        Set set = new TreeSet();    //Comparable 을 사용할 경우

        for (int i = 0; set.size() < 6; i++) {
            int num = (int)(Math.random() * 45) + 1;
            // set.add(set);
            // set.add(new Test());    // 비교기준이 없어서 Exception 발생
            set.add(new Integer(num));  // Integer 는 Comparable 을 가지 고 있다
        }

        // set.add(new Test());
        // set.add(new Test());
        // set.add(new Test());
        // set.add(new Test());
        // set.add(new Test());


        System.out.println(set);
    }
}

// class Test implements Comparable{
//     @Override
//     public int compareTo(Object o) {
//         return -1;
//     }
// }// 비교 기준이 없음
// class TestComp implements Comparator{
//     @Override
//     public int compare(Object o1, Object o2) {
//         return 1;
//     }
// }
