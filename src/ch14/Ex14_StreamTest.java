package ch14;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex14_StreamTest {
    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(1,2,3,4,5);
//        Stream<Integer> integerStream = list.stream();  // list를 Stream으로 변환
//        integerStream.forEach(System.out::print);
//
//        // stream은 1회용. stream 에 대해 최종연산을 수행하면 stream이 닫힌다
//        integerStream =list.stream();   // list로 부터 stream을 생성
//        integerStream.forEach(System.out::print);

//        String[] strArr = new String [] {"a","b","c","d"};
//        Stream<String> strStream = Stream.of(strArr);
//        Stream<String> strStream = Stream.of("a","b","c");
//        Stream<String> strStream = Stream.of(new String [] {"a","b","c","d"});
//        Stream<String> strStream = Arrays.stream(strArr);
//        strStream.forEach(System.out::println);

//        int [] intArr = {1,2,3,4,5};
//        IntStream intStream = Arrays.stream(intArr);
//        intStream.forEach(System.out::println);
//        System.out.println("count="+intStream.count());
//        System.out.println("sum="+intStream.sum());
//        System.out.println("avg="+intStream.average());


//        Integer[] intArr = {1,2,3,4,5};
//        Stream<Integer> intStream = Arrays.stream(intArr);    // 더 정확히는 Stream<T>는 숫자외에도 여러 타입의 스트림이 가능해야하므로 숫자 스트림에만 사용할 수 있는 sum(),average()를 넣지 않는 것입니다.
//        intStream.forEach(System.out::println);
//        System.out.println("count="+intStream.count());

//        IntStream intStream = new Random().ints();  // 무한 스트림
//        IntStream intStream = new Random().ints(5);  // 유한 스트림
//        IntStream intStream = new Random().ints(5,10);  //  범위 지정 스트림 은 limit 이 필요하다
//        intStream
//                .limit(10) // limit 이 없으면 계[속 난수를 만들어 나온다
//                .forEach(System.out::println);

        // iterate(T seed, UnaryOperator f)  단항 연산자
        Stream<Integer> intStream = Stream.iterate(0, n -> n + 2);
        intStream.limit(10).forEach(System.out::println);

        // generate(Supplier s) : 주기만 하는것. 입력 x , 출력 o
        Stream<Integer> onSteram = Stream.generate(() -> 1);
        onSteram.limit(10).forEach(System.out::println);

    }
}
