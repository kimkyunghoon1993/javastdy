package ch10;

import java.text.DecimalFormat;

// ch10-9~12 형식화 클래스
public class Ex9_10_11_12 {
    public static void main(String[] args) {
        // 9 형식화 클래스
        // - java.text 패키지의 DecimalFormat(데시멀포멧)10진수 숫자 , SimpleDateFormat(심플데이터포멧)날짜 형식화
        // - 숫자와 날짜를 원하는 형식으로 쉽게 출력 가능(숫자,날짜 -> 형식 문자열)
        // - 숫자를 형식화 하려면 DecimalFormat 을 사용하면 되고 날짜를 형식화 하려면 SimpleDateFormat 을 사용한면 된다
        // ex)
        // double number = 1234567.89;
        // DecimalFormat df = new DecimalFormat("#.#E0");  //1234567.89 값을 지수형식으로 표현식
        // String result = df.format(number);  // result  = "1.2E6"
        // System.out.println(result);
        // - 형식 문자열에서 숫자와 날짜를 뽑아내는 기능(형식 문자열 -> 숫자, 날짜)
        //     DecimalFormat df = new DecimalFormat("#,###.##");   // 문자열이 어떤 형식인지 알려주면
        //     Number num = df.parse("1,234,567.89");  //   문자열을 숫자로 변경 해주는 역할을 한다
        //     double d = num.doubleValue();

        // 10 DecimalFormat
        // - 숫자를(10진수) 형식화할 때 사용(숫자 -> 형식 문자열) ● 단순히 빈 문자열을 이용하여 문자열로 변경 할수도 있다
        // ex)
        // double number = 1234567.89;
        // DecimalFormat df = new DecimalFormat("#.#E0");
        // String result = df.format(number);
        // System.out.println(result);

        // 기호       의미                          패턴                          결과(1234567.89)
        //  0       10진수(값이 없을 때는 0)           0                            12345678
        //                                         0.0                          1234567.9
        //                                         0000000000.0000              0001234567.8900

        //  #       10진수                          #                             12345678
        //                                         #.#                           12345678.9
        //                                         ##########.####               1234567.89

        // E        지수기호                        #.#E0                           1.2E6
        //                                        0.0E0                           1.2E6
        //                                        0.000000000E0                   1234567890E6
        //                                        #.##########E0                  1.23456789E6
        //                                        ##.#########E0                  1.23456789E6

        //  - 특정 형식의 문자열을 숫자로 변환할 때도 사용(형식 문자열 -> 숫자)
        // DecimalFormat df = new DecimalFormat("#,###.##");   // 패턴만 변경하면 된다
        // Number num = df.parse("1,234,567.89");  // parse 는 Number 타입의 객체로 바뀐다   Number은? 모든 숫자 래퍼클래스의 최고 조상
        // double d = num.doubleValue(); // 1234567.89
        //[참고] Integer.parseInt()는 콤마(,)가 포함된 문자열을 숫자로 변환 못함 Float.parseFloat() 도 마찬 가지 이다


    }
}
