package ch14;

import java.util.Optional;

public class Ex14_Optioonal {
    public static void main(String[] args) {
//        int [] arr = null;    // null 초기화 하면 에러 발생
        int[] arr = {};
        System.out.println("arr.length=" + arr.length);

//        Optional<String> opt = null;    // Ok.하지만 바람직X
//        Optional<String> opt = Optional.empty();
        Optional<String> opt = Optional.of("abc");

        System.out.println("opt=" + opt);
//        System.out.println("opt=" + opt.get());

        String str = "";

//        try {
//            str = opt.get();
//        } catch (Exception e) {
//            str = "";   // 예외가 발생하면 빈문자열로("")로 초기화
//        }

//        str = opt.orElse("EMPTY");   // Optional에 저장된 값이 null 이면 ""반환
//        str = opt.orElseGet(()->new String);   // Optional에 저장된 값이 null 이면 ""반환
        str = opt.orElseGet(String::new);   // Optional에 저장된 값이 null 이면 ""반환
        System.out.println("str=" + str);

    }
}
