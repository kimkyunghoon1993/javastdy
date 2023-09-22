package ch9;

import java.util.Arrays;

//String클래스 생성자와 메서드 (4/5)
public class Ex11 {
    public static void main(String[] args) {
        //String[] split(String regex) 문자열을 지정된 분리자(regex)로 나누어 문자열 배열에 담아 반환한다. regex = 정규식
//        String animals = "dog,cat,bear";
//        String[] arr = animals.split(",");
//
//        for (int i = 0; i < arr.length; i++){
//            System.out.println(arr[i]);
//        }

        //String[] split(String regex, int limit) 문자열을 지정된 분지자(regex)로 나누어 문자열배열에 담아 반환한다. 단, 문자열 전체를 지정된 수 (limit)로 자른다
//        String animals = "dog,cat,bear";
//        String[] arr = animals.split(",", 2);   //문자열을 자르는데 두 부분으로 나눈다 즉 "dog/,cat,bear" 이런 식으로 자르겠다는 의미 이다
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        //boolean starsWith(String perfix) 주어진 문자열 (perfix) 로 시작하는지 검사한다.
        //boolean endsWith 특정 문자열로 끝난는 것!
//        String s = "java.lang.Object";
//        boolean b = s.startsWith("java");
//        boolean b2 = s.startsWith("lang");
//
//        System.out.println(b);      // 실행 결과 true
//        System.out.println(b2);     // 실행 결과 false

        //String substring(int begin)
        //String substring(int begin, int end)  주어진 시작위치(begin) 부터 끝 위치 (end) 범위에 포함된 문자열을 얻는다. 이 때, 시작위치의 문자는 범위에 포함되지만, 끝 위치는 문자는 포함되지 않는다.(begin <= x < end)

//        String s = "java.lang.Object";
//        String c = s.substring(10);
//        String p = s.substring(5,9);
//
//        System.out.println(c);      // 실행 결과 Object     why?    index 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
//        System.out.println(p);      // 실행 결과 lang               문자   j a v a . l a n g . O  b  j  e  c  t

        // String toLowerCase() String인스턴스에 저장되어있는 모든 문자열을 소문자로 변환하여 반환한다
//        String s = "Hello";
//        String s1 = s.toLowerCase();
//
//        System.out.println(s1);

        // String toUpperCase String인스턴스에 저장되어 있는 모든 문자열을 대문자로 변환하여 반환한다.
//        String s = "Hello";
//        String s1 = s.toUpperCase();
//
//        System.out.println(s1);

        //String trim() 문자열의 왼쪽 끝과 오른쪽 끝에 있는 공백을 없앤 결과를 반환한다. 이 때 중간에 있는 공백은 제거되지 않는다.
//        String s = "  Hello World";
//        String s1 = s.trim();
//
//        System.out.println(s1);


        //static String ValueOf(boolean b)
        //static String ValueOf(char c)
        //static String ValueOf(int i)
        //static String ValueOf(long l)
        //static String ValueOf(float f)
        //static String ValueOf(double d)
        //static String ValueOf(Object o)
        //지정된 값을 문자열로 변환하여 반환한다 참조변수의 경우, toString()을 호출한 결과를 반환한다.
        //기본형
        String b = String.valueOf(true);
        String c = String.valueOf('a');
        String i = String.valueOf(100);
        String l = String.valueOf(100L);
        String f = String.valueOf(10f);
        String d = String.valueOf(10.0);
        java.util.Date dd = new java.util.Date();
        String data = String.valueOf(dd);

        System.out.println(b);
        System.out.println(c);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(data);


    }

}
