package ch9;

// String 클래스의 생성자와 메서드
public class Ex11_StringClassMethod {

    public static void main(String[] args) {
        //int indexOf(int ch, int pos) : pos 검색 시작 위치
        // String s = "Hello";
        // int idx1 = s.indexOf('e',0);         //주어진 문자(ch)가 문자열에 존재하는지 지정된 위치에 (POS)부터 확인하여 위치(index)를 알려준다 못찾으면 -1을 반환한다.(index는 0부터 시작)
        // int idx2 = s.indexOf('e',2);
        //                                      // index 0 1 2 3 4
        //                                      // 문자   H E l l o
        // System.out.println(idx1);            // 실행 결과 1     why? Hello 에서 e 를 찾는데 index 1부터 검색하라고 했을때 e 의 index 위치는 1번 찾았으므로 결과는 1
        // System.out.println(idx2);            // 실행 결과 -1    why? Hello 에서 e 를 찾는데 index 2부터 검색하라고 했을때 e 의 index 위는는 1번 이고 검색을 시작하는 부부은 index 2번부터 이므로 결과는 -1 이다

        //int indexOf(String str)               // 주어진 문자열이 존재하는 확인하여 그 위치(index)를 알려준다. 없으면 -1을 반환한다.(index는 0 부터 시작)
        // String s = "ABCDEFG";                // index 0 1 2 3 4 5 6
        // int idx = s.indexOf("CD");           // 문자   A B C D E F G
        //
        // System.out.println(idx);             // 실행 결과 2

        //int lastIndexOf(int ch)               //lastIndexOf 는 indexOf 같은데 뒤에서 부터 찾는다
        // String s = "java.lang.Object";
        // int idx1 = s.lastIndexOf('.');       // index 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
        // int idx2 = s.indexOf('.');           // 문자   j a v a . l a n g . O   b  j  e  c  t
        //
        // System.out.println(idx1);             // 실행 결과 9
        // System.out.println(idx2);             // 실행 결과 4

        //int lastIndexOf(String str)           // 지정된 문자열을 인스턴스의 문자열 끝에서 부터 찾아서 위치(index)를 알려준다.못 찾으면 -1을 반환 한다
        // String s = "java.lang.java";         // index 0 1 2 3 4 5 6 7 8 9 10 11 12 13
        // int idx1 = s.lastIndexOf("java");    // 문자   j a v a . l a n g . j  a  v  a
        // int idx2 = s.indexOf("java");
        //
        // System.out.println(idx1);                // 실행 결과 10
        // System.out.println(idx2);                // 실행 결과 0

        // int length() 문자열의 길이를 알려준다
        // String s = "Hello";             // index 0 1 2 3 4      총5 개
        // int length = s.length();        // 문자   H e l l o
        //
        // System.out.println(length);     // 실행 결과 5


        // String[] split(String regex)         //문자열을 지정된 분리자(regex)로 나누어 문자열 배열에 담아 반환한다
        String animals = "dog,cat,bear";
        String[] arr = animals.split(",");

        for (int i = 0; i < arr.length; i++){
            System.out.println("arr[i]" +arr[i]);
        }
    }
}
