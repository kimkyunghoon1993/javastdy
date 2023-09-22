package ch11;

import java.util.Arrays;
import java.util.Comparator;

public class Ex11_7 {
    public static void main(String[] args) {
        String[] strArr = {"cat", "Dog", "lion", "tiger"};

        Arrays.sort(strArr);    // String의 Comparable 구현에 의한 결정
        // Arrays.sort(strArr, 정렬기준);    // 위 내용에선 정렬 기준이 없다 그이유는? String[] 가 기존적으로 Comparable 을 가지고 있기 때문이다
        System.out.println("strArr = " + Arrays.toString(strArr));

        Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); //  만약 compareTo가 가지고 있는 기준정렬이 싫다면 내가 직접 만들어서 사용할수도 있다 대소문자 구분 안함 CASE_INSENSITIVE_ORDER 정렬기준
        System.out.println("strArr = " + Arrays.toString(strArr));

        Arrays.sort(strArr, new Descending());  // 역순 정렬 내림차순
        System.out.println("strArr = " + Arrays.toString(strArr));      // 정렬 할때 필요한건 ( 정렬 대상 ,정렬 기준)

        // static void sort(Object[] a) // 객체 배열에 저장된 객체가 구현한 comparable에 의한 정렬
        // static void sort(Object[] a, Compartor c) // 지정한 Comparator에 의한 정렬

        // class String implements Comparable 을 있다고 가정했을땐 기본 정렬기준을 가지고 있는 것 이다
    }
}

class Descending implements Comparator {
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Comparable && o2 instanceof Comparable) {
            Comparable c1 = (Comparable)o1;
            Comparable c2 = (Comparable)o2;
            return c2.compareTo(c1);
            // return c1.compareTo(c2) * -1;   // -1을 곱해서 기본 정렬발식의 역으로 변경한다.
                                            // 또는 c2.compareTo(c1)와 같은 순서를 바꿔도 된다.
        }
        return -1;
    }
}
