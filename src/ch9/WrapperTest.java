package ch9;

public class WrapperTest {
    public static void main(String[] args) {
        // int i = Integer.parseInt("100");
        System.out.println("i= " + Integer.parseInt("100"));
        System.out.println("i= " + Integer.parseInt("100",10)); // 위와 동일
        System.out.println("i= " + Integer.parseInt("100",2));  // 2진수 출력
        // System.out.println("i= " + Integer.parseInt("FF"));  // NumberFormateException
        System.out.println("i= " + Integer.parseInt("FF",16));  // 16진수 출력

    }

}
