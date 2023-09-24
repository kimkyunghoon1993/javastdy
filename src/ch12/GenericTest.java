package ch12;

import java.util.ArrayList;
public class GenericTest {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList();  // 여러 종류의 타입을 넣고 싶다면 ArrayList<Object> 을 사용해야 되고  형변환을 해줘야 한다
        list.add(10);
        list.add(20);
        list.add("30");     // 숫자만 넣고 싶은데 String 도 같이 추가 되었을때 // 타입 체크 강화

//        Integer i = (Integer) list.get(2);  // 컴파일 Ok why? Object 이기때문에 형변환 하면 컴파일에서는 에러 X , RuntimeException 에러 발생
//        Integer i = list.get(2);  // 지네릭을 사용하면 형변환을 할 필요가 없다 이미 저장될 객체가 타입이 불일치면 컴파일 에러가 발생하기 때문이다
        String i = (String)list.get(2);
        System.out.println(list);

        // 지네릭의 개발 사유: 실행시 에러를 -> 컴파일 에러로 볼수 있게 하기 위해
    }
}
