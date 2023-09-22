package ch9;

//StringBuffer 클래스의 메서드
public class Ex19_20_StringBufferClassMethod {
    public static void main(String[] args) {
        // StringBuffer()
        // - 16문자를 담을 수 있는 버퍼를 가진 StringBuffer 인스턴스를 생성한다
        // ex)
        // StringBuffer sb = new StringBuffer();
        // System.out.println("sb = " + sb);

        // StringBuffer(int length)
        // - 지정된 개수의 문자를 담을 수 있는 버퍼를 가진 StringBuffer인스턴스를 생성한다
        // ex)
        // StringBuffer sb = new StringBuffer(10);
        // System.out.println("sb= " + sb);

        // StringBuffer(String str)
        // - 지정된 문자열 값(str)을 갖는 StringBuffer 인스턴스를 생성한다.
        // ex)
        // StringBuffer sb = new StringBuffer("Hi");
        // System.out.println(sb);

        // StringBuffer append(boolean b)
        // StringBuffer append(char[] str)
        // StringBuffer append(double d)
        // StringBuffer append(float f)
        // StringBuffer append(int i)
        // StringBuffer append(long l)
        // StringBuffer append(Object obj)
        // StringBuffer append(String str)
        // - 매개변수로 입력된 값을 문자열로 변환하여 StringBuffer 인스턴스가 저장하고 있는 문자열의 뒤에 덧붙인다.
        // ex)
        // StringBuffer sb = new StringBuffer("abc");
        // StringBuffer sb2 = sb.append(true);
        // sb.append('d').append(10.0f);
        //
        // StringBuffer sb3 = sb.append("ABC").append(123);
        //
        // System.out.println(sb);
        // System.out.println(sb2);
        // System.out.println(sb3);

        // int capacity()
        // -StringBuffer 인스턴스의 버퍼크기를 알려준다. length()는 버퍼에 담긴 문자열의 길이를 알려준다

        // ================================================================================================================ 영상봐야 할 부분 4:38초 부터 이어서 보면 됨

        // StringBuffer sb = new StringBuffer(100);
        // sb.append("abcd");
        // int bufferSize = sb.capacity();
        // int stringSize = sb.length();
        //
        // System.out.println(bufferSize);
        // System.out.println(stringSize);

        // Char cahrAt(int index)
        // - 지정된 위치(index)에 있는 문자를 반환한다.
        // StringBuffer sb = new StringBuffer("abc");
        // char c = sb.charAt(2);
        //
        // System.out.println(c);

        // StringBuffer delete(int start, int end)
        // - 시작위치(start) 부터 끝 위치(end) 사이에 있는 문자를 제거한다. 단, 끝 위치의 문자는 제외
        // StringBuffer sb = new StringBuffer("0123456");
        // StringBuffer ssb2 = sb.delete(3,6);
        // System.out.println(ssb2);

        // StringBuffer deleteCharAt(int index)
        // - 지정된 위치(index)의 문자를 제거한다
        // StringBuffer sb = new StringBuffer("123456");
        // System.out.println(sb);
        // sb.deleteCharAt(3);
        // System.out.println(sb);

        // StringBuffer insert ( int pos, boolean b)
        // StringBuffer insert ( int pos, char c)
        // StringBuffer insert ( int pos, char[] str)
        // StringBuffer insert ( int pos, double d)
        // StringBuffer insert ( int pos, float f)
        // StringBuffer insert ( int pos, int i)
        // StringBuffer insert ( int pos, long l)
        // StringBuffer insert ( int pos, Object obj)
        // StringBuffer insert ( int pos, String str)
        // - 두 번째 매개변수로 받은 값을 문자열로 변환하여 지정된 위치(pos)에 추가한다. pos는 0 부터 시작

        // StringBuffer sb = new StringBuffer("0123456");
        // sb.insert(4,'.');
        //
        // System.out.println(sb);

        // int lengtrh
        // - StringBuffer 인스턴스에 저장된어 있는 문자열의 길이를 반환한다

        // StringBuffer sb = new StringBuffer("123456");
        // int length = sb.length();
        //
        // System.out.println(length);


        // StringBuffer replace(int start, int end)
        // - 지정된 범위(start~end)의 문자들을 주어진 문자열로 바꾼다. end 위치의 문자는 범위에 포함 되지 않음.(start <= X < end)

        // StringBuffer sb = new StringBuffer("0123456");
        // sb.replace(3,6,"AB");
        // System.out.println(sb);

        // StringBuffer reverse()
        // - StringButter 인스턴스에 저장되어 있는 문자열의 순서를 거꾸로 나열한다

        // StringBuffer sb = new StringBuffer("0123456");
        // sb.reverse();
        // System.out.println(sb);

        // void setCharAt(int index, char ch)
        // - 지정된 위치의 문자를 주어진 문자(ch)로 바꾼다.

        // StringBuffer sb = new StringBuffer("0123456");
        // sb.setCharAt(5, 'o');
        //
        // System.out.println(sb);

        // void setLength(int newLength)
        // - 지정된 길이로 문자열의 길이를 변경한다. 길이를 늘리는 경우에 나머지 빈 공간을 null 문자 '\u0000' 로 채운다

        // StringBuffer sb = new StringBuffer("0123456");
        // sb.setLength(5);
        //
        // StringBuffer sb2 = new StringBuffer("0123456");
        // sb2.setLength(10);
        // String str = sb2.toString().trim();      // trim() 양끝의 빈공백 제거
        //
        // System.out.println(sb);
        // System.out.println(sb2);
        // System.out.println(str);

        // String toString()
        // - StringBuffer 인스턴스의 문자열을 String으로 반환

        // StringBuffer sb = new StringBuffer("0123456");
        // System.out.println(sb);
        // String str = sb.toString();
        //
        //
        // System.out.println(str);

        // String substring(int start)
        // String substring(int start, int end)
        // - 지정된 범위 내의 문자열을 String 으로 뽑아서 반환한다. 시작위치(start) 지정하면 시작위치부터 문자열 끝까지 잡아서 반환한다

        // StringBuffer sb = new StringBuffer("0123456");
        // String str = sb.substring(3);
        // String str2 = sb.substring(3, 5);
        //
        // System.out.println(str);
        // System.out.println(str2);

        // StringBuffer sb = new StringBuffer("01");
        // StringBuffer sb2 = sb.append(23);
        // sb.append('4').append(56);      // 메서드를 계속 연결할수 있는 것을 메서드 체이닝 이라고 칭한다
        //
        // StringBuffer sb3 = sb.append(78);
        // sb3.append(9.0);
        //
        // System.out.println("sb = " + sb);
        // System.out.println("sb2 = " + sb2);         // index 0 1 2 3 4 5 6 7 8 9 10 11
        // System.out.println("sb3 = " + sb3);         // 문자열  0 1 2 3 4 5 6 7 8 9  . 0
        //
        // System.out.println("sb = " +sb.deleteCharAt(10));  // index 10 번째 자리에 있는 char를 제거 하라
        // System.out.println("sb = " +sb.delete(3,6));     //index 3~5 까지 제거 해라! 지정은 3~6 으로 했는데 왜 5까지 인가 6 전까지만 제거하라는 뜻이다
        // System.out.println("sb = " +sb.insert(3,"abc"));
        // System.out.println("sb = " +sb.replace(6,sb.length(),"END")); //replace 란? 치환 대체 변경
        //
        // System.out.println("capcity = " + sb.capacity());   // capacity (캐파시티) index 의 총 수량은 몃개 인지를 알려주는 메서드
        // System.out.println("length = "+ sb.length());       // sb의 length 길이가 몃개냐 총 9개 다 왜 0 1 2 a b c E N D
                                                                                        //index 0 1 2 3 4 5 6 7 8
    }
}
