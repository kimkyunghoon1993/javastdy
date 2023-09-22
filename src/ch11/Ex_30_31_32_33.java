package ch11;

// 30~33 Comparator 와 Comparable
public class Ex_30_31_32_33 {
    public static void main(String[] args) {
        // 30 Comparator 와 Comparable
        // - 객체 정렬에 필요한 메서드 (정렬기준 제공)를 정의한 인터페이스
        // Comparable(컴페어어블) : 기본 정렬기준을 구하는데 사용.
        // Comparator(컴페레이터) : 기본 정렬기준 외에 다른 기준으로 정렬하고자할 때 사용
        // ex)
        //     public interface Comparator {
        //          int compare(Object o1, Objtct o2);      // o1,o2 두 객체를 비교
        //          boolean equals(Object obj);         // equals를 오버라이딩하라는 뜻
        //     }
        //     public interface Comparable {
        //      int compareTo(Object o);    // 주어진 객체 (o)를 자신과 비교
        //      }

        // - compare()와 compareTo()는 두 객체의 비교결과를 반호나하도록 작성 같으면 0, 오른쪽이 크면 음수(-), 작으면 양수(+)
        // ex)
        //  public final class Integer extends Number implements Comparable {
        //  ...
        //      public int t compareTo(Integer anotherInteger) {
        //          int v1 = this.value;
        //          int v2 = aontherInteger.value;
        //          //같으면 0. 오른쪽 같이 크면 -1, 작으면 1을 반환
        //          return (v1 < v2 ? -1 : (v1== v2? 0 : 1));
        //       }
        //  ...
        //  }

        // 32 Integer 와 Comparable
        // public final class Integer extends Number implements Comparable {    // Comparable 역할 기본 정렬 기준 제공 default 정렬 기준이 없을때 사용
        // ...
        // public int compareTo(Object o) {
        // return compareTo((Integer)o)

        // public int compareTo(Integer anotherInteger) { //anotherInteger(언아더인티져)
        // int thisVal = this.value;
        // int anotherVal = anotherInteger.value;

        //  // 비교하는 값이 크면 -1, 같은면 0, 작으면 1을 반환한다.
        //  return (thisVal < anotherVal ? -1 : (thisVal == anotherVal ? 0 : 1));   // 왜 3항 연산자를 사용하는가 성능이 더 빠르기 때문이다
        //
        // ...
        // }

        // Arrays.sort() 와 같은 메서드가 정렬을 수행하는 과정에서, compareTo()를 호출한다.
        // public int compareTo(Integer anotherInteger){
        //     int thisVal = this.value;
        //     int anotherVal = anotherInteger.value;
        //
        //     // 왼쪽 값이 크면 음수를, 두 값이 같으면 0, 왼쪽 값이 크면 양수를 반환한다.
        //     return thisVal - anotherVal; // 내림 차순의 경우 반래로 뺄셈하면 되낟
        // }


        // 버블 정렬
        // static void sort(int[] intArr){
        // for (int i = 0; i < intArr.length -1 ; i ++){
        //          int tmp = 0;
        //
        //          if(intArr[i] > intArr[i+1]) {       // 1. 두개 비교
        //              tmp = intArr[i];                // 2. 자리 바꿈
        //              intArr[i] = intArr[j+1];
        //              intArr[j + 1] = tmp;
        //          }
        // }

        // static void sort(Object[] objArr, Comparator c){     // objArr 정렬대상 , Comparator 정렬기준
        //   for ( int i = 0; i < objArr.length -1; i ++) {
        //      fot (int j = 0; j <objArr.length -1 -i; j++) {
        //          Object tmp = null;
        //
        //          if(c.compare(objArr[j], objArr[j + 1] ) > 0) { // Comparator를 대상을 기준으로 정렬을 한다
        //              tmp = objArr[j];            // 자리 바꿈
        //              objArr[j];
        //              objArr[j + 1] = tmp;
        //          }
        //
        //      }
        //  }
        //}

        // ※ 정렬 방법(로직) 수정 할 필요가 없다 잘 만들어 져 있기 때문에 개발자는 거기에 맞게 정렬 대상과 정렬 기준을 선택해서 사용하기만 하면 된다

    }
}
