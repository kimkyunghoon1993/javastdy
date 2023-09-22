package ch11;

import java.util.Arrays;

// 25~29 Arrays
public class Ex11_25_26_27_28_29 {
    public static void main(String[] args) {
        // 25 Arrays(1/4) - 배열을 다루기 편리한 메서드(static) 제공 util mathod
        // 1. 배열의 출력 - toString() - 문자열 반환
        // staitc String toString(boolean[] a)
        // staitc String toString(byte[] a)
        // staitc String toString(char[] a)
        // staitc String toString(int[] a)
        // staitc String toString(long[] a)
        // staitc String toString(folat[] a)
        // staitc String toString(duble[] a)
        // staitc String toString(Object[] a)

        // 2. 배열의 복사 - copyOf(), copyOfRange() 새로운 배열을 생성해서 반환 한다
        // int[] arr = {0,1,2,3,4};                         // arr 이라는 배열을 생성해서
        // int[] arr2 = Arrays.copyOf(arr, arr2.length);    //  arr2=[0,1,2,3,4]    arr의 length만큼 복사
        // int[] arr3 = Arrays.copyOf(arr,3);               //  arr3=[0,1,2]        arr의 배열에서 3개만 복사
        // int[] arr4 = Arrays.copyOf(arr,7);               //  arr4=[0,1,2,3,4,0,0]    arr의 배열에서 7개를 복사하는데 arr는 0~4까지 이다 그래서 뒤에는 0으로 채운다
        // int[] arr5 = Arrays.copyOfRange(arr,2,4);             //  arr5=[2,3]   <- 4는 불포함     from~to 2~4 까지 복사인데 4는 들어 가지 않으니까 2,3만 복사
        // int[] arr6 = Arrays.copyOfRange(arr,0,7);             //  arr6=[0,1,2,3,4,0,0]         from~to 0~7 까지 6까지 0으로 복사

        // 3. 배열 채우기    - fill(),setAll()
        // int[] arr = new int[5];
        // Arrays.fill(arr,9);          // arr=[9,9,9,9,9]      arr을 9로 채워라 fill()
        // Arrays.setAll(arr, (i) -> (int)(Math.reandom()*5)+1);    // arr=[1,5,2,1,1] 램덤 값으로 채워라
        // fill - 지정한 값으로 배열을 채워라
        // setAll - 람다식 이용해서 채워라

        // 4. 배열의  정렬과 검색 - sort(),binarySearch()※ 이진탐색 => 정렬된 상태에서 가능합니다 정렬되지 않은 상태 에서 검색 하면 아래와 같이 잘못된 결과가 나온다1
        // int[] arr = {3,2,0,1,4};
        // int idx = Arrays.binarySearch(arr,2);    // idx=-5 <- 잘못된 결과     2가 어디에 위치 하는지 찾는다

        // Arrays.sort(arr);    // 배열 arr을 정렬한다.
        // System.out.println(Arrays.toString(arr));    //  [0,1,2,3,4]
        // int idx = Arrays.binarySearch(arr,2);        //idx=2 <-올바른 결과

        // 알아두면 좋아요! - 순차 검색과 이진 검색 (탐색)
        // 7 1 6 9 5 3 8 4 10 2

        // 27 Array(3/4) - 배열을 다루기 편리한 메서드(static) 제공
        // 5. 다차원 배열의 출력 - deepToString()
        // int[] arr = {0,1,2,3,4};     // 1차원 배열
        // int[][] arr2D = {{11,12},{21,22}};   // 2차원 이상 다차원 배열

        // System.out.println(Arrays.toString(arr));        // [0,1,2,3,4]
        // System.out.println(Arrays.deepToString(arr2D));  // [[11,12], [21,22]]

        // 6.다차원 배열의 비교 - deepEquals()
        // String[][] str2D = new String [] [] {{"aaa","bbb"},{"AAA","BBB"}};
        // String[][] str2D2 = new String [] [] {{"aaa","bbb"},{"AAA","BBB"}};

        // System.out.println(Arrays.equals(str2D,str2D2)); // false
        // System.out.println(Arrays.deepEquals(str2D,str2D2)); // true

        // Arrays(4/4) - 배열을 다루기 편리한 메서드(static) 제공
        // 7. 배열을 List로 변환 - asList(Object...a)

        // List list = Arrays.asList(new Integer[]{1,2,3,4,5});     // list = [1,2,3,4,5]
        // List list = Arrays.asList(1,2,3,4,5);                    // list = [1,2,3,4,5]
        // list.add(6) // UnsupportedOperationException 예외 발생 (읽기 전용이여서 add를 할수 없다 추가하려면 아래와 같이 다시 만들어서 추가 해야 된다

        // List list = new ArrayList(Arrays.asList(1,2,3,4,5));

        // 8.람다와 스트림(14장)관련 - pararlleIXXX(),spliterator(),stream()

    }
}
