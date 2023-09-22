package ch9;

// StringBuffer 클래스 -> 문자열을 저장 하고 다루기 위한 클래스
public class EX15_16_17_18_StringBuffer {
    public static void main(String[] args) {
        // - String처럼 문자형 배열(char[])을 내부적으로 가지고 있다
        // ex)
        //         public final class StringFuffer implements java.io.Serializable{
        //             private char[] value;
        //         }

        // - 그러나, String과 달리 내용을 변경할 수 있다.(mutable)     String (변경불가) mutable(변경가능)
        //     StringBuffer sb = new StringBuffer("abc");
        //     sb.append("123");   // sb.append 를 이용하여 기존에 abc 뒤에 123을 붙일수 있다
        //                         // 문자열을 다룰때 기본적으로 String 클래스 를 사용하지만 문자열을 가지고 조작을 많이 해야 될 경우 예를 들어 추가 및 변경을 해야 될 경우 StringBuffer 을 가지고 수정 하는것이 올바르다
        // System.out.println(sb);

        // ====================================================================================================================================================================================================================

        // 16 StringBeffer(스트링 버퍼) 의 생성자
        //  - 배열은 길이 변경불가. 공간이 부족하면 새로운 배열 생성해야
        //  -StringBuffer는 저장할 문자열의 길이를 고려해서 적절한 킉로 생성해야
        // ex)
        // public StringBuffer(int length){ //length 에 적절한 크기를 넣어줘야 한다 너무 적지도 많지도 않은
        //     value = new char[length];
        //     shared = false;
        // }
        //
        // public StringBuffer(){
        //     this(16);        //버퍼의 크기를 지정하지 않으면 버퍼의 크기는 16이 된다
        // }
        //
        // public StringBuffer(String str){
        //     this(str.lenth() + 16);      //지정한 문자열의 길이보다 16이 더 크게 버퍼를 생성한다
        //     append(str);
        // }

        // ====================================================================================================================================================================================================================

        // 17 StringBuffer 의 변경
        // - StringBuffer 는 String과 달리 내용 변경이 가능하다
        // StringBuffer sb = new StringBuffer("abc");                       // append(): 끝에 문자열 추가
        // sb.append("123");   // sb의 내용 뒤에 "123"을 추가한다                 // delete(): 삭제
        // // insert(): 삽입
        // // append,delete,insert 의 반환 타입이 StringBuffer 이다
        // // - append()는 지정된 내용을 StringBuffer에 추가 후, StringBuffer의 참조를 반환
        // // ex)
        // StringBuffer sb2 = sb.append("ZZ");
        // // System.out.println(sb);
        // System.out.println("sb " + sb);
        // System.out.println("sb2 " + sb2);

        // 위 내용을 아래와 같이 사용할수도 있다

        // StringBuffer sb = new StringBuffer("abc");
        // sb.append("123").append("ZZ");
        // System.out.println(sb);

        // ====================================================================================================================================================================================================================

        // 18 StringBuffer의 비교
        // - StringBuffer는 equals()가 오버라이딩되어있지 않다.(주소비교)   //※주의 Sting 과 달리 StringBuffer 은 오버라이딩이 되어 있지 않아서 따로 equals()를 사용해도 false 가 나온다

        // StringBuffer sb = new StringBuffer("abc");
        // StringBuffer sb2 = new StringBuffer("abc");

        // System.out.println(sb==sb2);
        // System.out.println(sb.equals(sb2));

        // 그럼 어떻게 비교를 해야 되는가?
        // - StringBuffer 을 String 으로 변환 후에 equals()로 비교해야 한다

        // String s = sb.toString();       // sb를 String으로 변환
        // String s2 = sb2.toString();
        //
        // System.out.println(s==s2);
        // System.out.println(s.equals(s2));


    }

}
