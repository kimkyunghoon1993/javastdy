package ch14;
// 15,16 스트림 스트림의 특징
public class Ex15_16 {
    public static void main(String[] args) {
        // 15.스트림(Stream)
        // ▶ 다양한 데이터 소스를 표준화된 방법으로 다루기 위한 것
        // ex)
        // List<Integer> list = Array.asList(1,2,3,4,5);
        // Stream<Integer> intStream = list.stream();   // 컬렉션.
        // Stream<String> strStream = Stream.of(new String[] {"a","b","c"}); //배열
        // Stream<Integer> evenStream = Stream.generate(Math::random); // 람다식
        // Stream<Double> randomStream = Strema.generate(Math::random); // 람다식
        // IntStream intStream = new Random().ints(5); // 난수 스트림(크기가 5)

        // 스트림이란?
        // 데이터 소스가 있을때 Stream 을 생성하면 Stream 을 통해서 중간작업 -> 최종작업 을 할수 있다
        // 데이터의 연속적인 흐름

        // ▶ 스트림이 제공하는 기능 - 중간 연산과 최종연산
        //  ● 중간 연산 - 연산결과가 스트림인 연산. 반복적으로 적용가능
        //  ● 최종 연산 - 연산결과가 스트림이 아닌 연산. 단 한번만 적용가능(스트림의 요소를 소모)

        // 1.스트림 만들기
        // 2.중간연산(0~n번)
        // 3.최종연산(0~1번)

        //          중복제거   5개자르기   정렬               출력
        // stream.distinct().limit(5).sorted().forEach(System.out::println)
        //          중간연산    중간연산  중간연산      최종연산

        // ex)
        // String[] strArr = {"dd","aaa","CC","cc","b"};
        // Stream<String> stream = Stream.of(strArr);   // 문자열 배열이 소스인 스트림
        // Stream<String> filteredStream = stream.filter();     // 걸러내기(중간연산)
        // Stream<String> distinctedStream = stream.distince(); // 중복제거(중간연산)
        // Stream<String> sortedStream = stream.sort(); // 정렬(중간연산)
        // Stream<String> limitedStream = stream.limit(5) // 스트림 자르기(중간연산)
        // int total = stream.count();  // 요소 개수 세기(최종연산)

        // 16.스트림(Stream)의 특징(1/3)
        // ▶ 스트림은 데이터 소스로부터 데이터를 읽기만할 뿐 변경하지 않는다.
        // ex)
        // List<Integer> list = Arrays.asList(3,1,5,4,2);
        // List<Integer> sortedList = list.stream().sorted()    //  list를 정렬해서
        // System.out.println(list);    // [3,1,5,4,2]
        // System.out.println(sortedList);    // [1,2,3,4,5]

        // ▶ 스트림은 Iterator처럼 일회용이다.(필요하면 다시 스트림을 생성해야 함)
        // ex)
        // strStream.forEach(System.out::println); // 모든 요소를 화면에 출력(최종연산)
        // int numOfStr = strStreasm.count();   // 에러. 스트림이 이미 닫혔음

        // ▶ 최종 연산 전까지 중간연산이 수행되지 않는다. - 지연된 연산
        // ex)
        // IntStream intStream = new Random(). ints(1,46);  // 1~45 범위의 무한 스트림
        // intStream.distinct().limit(6).sorted()       // 중간연산
        // .forEach(i -> System.out.print(i+","));      // 최종연산 로또번호

        // 16.스트림(Stream)의 특징(2/3)
        // ▶ 스트림은 작업을 내부 반복으로 처리한다.
        //ex)
        // for (String str : strList)               =>      stream.forEach(System.out::println); 최종연산
        //  System.out.println(str)

        // void forEach(Consumer<? super T> action) {
        //          Objects.requireNonNull(action); // 매개변수의 널 체크
        //      for(T t: src)   // 내부 반복(for문을 메서드 안으로 넣음)
        //          action.accept(T);
        // }

        // 16.스트림(Stream)의 특징(3/3)
        // ▶ 스트림의 작업을 병렬로 처리 - 병렬스트림
        // ex)
        // Stream<String> strStream = Stream.of("dd","aaa","CC","cc","b");
        // int sum = strStream.parallel()   // 병렬 스트림으로 전환(속성만 변경)
        //              .mapToInt(s -> s.length()).sum);    //모든 문자열의 길이의 합
        //

        // ▶ 기본형 스트림 - IntStream,LongStream,DoubleSteam
        //  - 오톱박싱&언박싱 비효율이 제거됨(Stream<Integer>대신 IntStream 사용)
        //  - 숫자와 관련된 유용한 메서드를 Stream<T> 보다 더 많이 제공


    }
}
