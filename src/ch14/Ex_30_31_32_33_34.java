package ch14;

import java.io.File;

// 30~34 스트림의 중간 연산(2)
public class Ex_30_31_32_33_34 {
    public static void main(String[] args) {
        //30. 스트림의 중간 연산 (5/7)
        // 지난 강좌 배운 내용 복습  skip()건너뛰기,limit()자르기,distinct()중복제거,filter()조건식 걸러내기,sorted()정렬
        // 이번 시간에 배울 것! map()변환,peek()forEach와 비슷,flatmap()변환 스트림의 스트림 -> 스트림

        // ▶ 스트림의 요소 변환하기 - map
        // ex) Stream<R> map(Function<? super T,? extendss R> mapper) // Stream<T> -> Stream<R>
        // T타입 을  입력하면 R타입 을 반환하는

        // ex)
        // Stream<Flie> fileSteram = Stream.of(new Flie("Ex1.java"),new File("Ex1")
        //            new File("EX1.bak"), new File("Ex2.java") new File("Ex1.txt");
        //
        // Stream<String> filenameStream = fileStream.map(File::getName);
        // filenameStream.forEach(System.out::println);     // 스트림의 모든 파일의 이름을 출력
        // File -> String

        // ex) 파일 스트림(Stream<File>) 에서 파일 확장자(대문자)를 중복없이 뽑아내기
        // fileStrea.map(File::getName)             // Stream<File> -> Steram<String>
        // .filter(s->s.indexOf(',')!=-1)           // 확장자가 없는 것은 제외
        // .map(s->s.substring(s.indexOf('.')+1))   // Stream<String> 파일이름 전제 -> Stream<String> 확장자만
        // .map(String::toUpperCase)                // Stream<String> 소문자  -> Stream<String> 대문자
        // .distinct()                              // 중복제거
        // .forEach(System.out::print);             // JAVABOAKETXT

        // ▶ 스트림의 요소를 소비하지 않고 엿보기 - peek()
        // ex)
        //  Stream<T> peek(Consumer<? super T> action)  // 중간 연산(스트림 요소을 소비 X)
        //  void forEach(Consumer<> supper T> action)   // 최종 연산(스트림 요소을 소비 O)

        // ex)
        //    fileStream.map(File::getName)   //Stream<File> -> Stream<String>
        //         .filter(s -> s.indexOf('.') != 1) // 확장자가 없는 것은 제외
        //         .peek(s -> System.out.printf("filename=%s%n",s)) // 파일명을 출력한다
        //         .map(s-> s.substring(s.indexOf('.')+1))      // 확장자만 출력한다
        //         .peek(s->System.out.printf("extension=%s%n",s))  // 확장자를 출력한다
        //          .forEach(System.out::print);    // 최종연산 스트림의 요소를 소비
        // ※ 작업 중간에 디버깅 용도로 많아 사용한다

        // ▶ 스트림의 스트림을 스트림으로 변환 - flatMap()
        // ex) Stream<String[]> strArrStrm = Stream.of(new String[] {"abc","def","ghi" },new String[] {"ABC","GHI","JKLMN"};
        // Stream<Stream<String>> strStrStrm = strArrStrm.mep(Array::stream);
        // Stream<String> strStrStrm = strArrStrm.flatMap(Arryas::stream);  // Arrays.stream(T[])



    }
}
