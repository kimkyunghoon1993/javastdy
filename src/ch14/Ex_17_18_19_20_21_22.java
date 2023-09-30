package ch14;
// 17~21 스트림 만들기
public class Ex_17_18_19_20_21_22 {
    public static void main(String[] args) {
        // 17.스트림 만들기 - 컬렉션
        // 1.스트림 만들기
        // 2.중간연산(0~n번)
        // 3.최종연산(0~1번)
        // ▶ Collection 인터페이스의 stream()으로 컬렉션을 스트림으로 변환
        //  ● Steram<E> stream() // Collection인터페이스의 메서드
        // ex)
        // List<Integer> list = Arrays.asList(1,2,3,4,5);
        // Stream<Integer> intStream = list.stream(); // list를 스트림으로 변환

        // 스트림의 모든 요소를 출력
        // intStream.forEach(System.out::print); // 12345
        // intStream.forEach(System.out::print); // 에러. 스트림이 이미 닫혔다.

        // 18. 스트림 만들기 - 배열
        // ▶ 객체 배열로 부터 스트림 생성하기
        // Stream<T> Stream.of(T...values) // 가변 인자
        // Stream<T> Stream.of(T[])
        // Stream<T> Array.stream(T[])
        // Stream<T> Array.stream(T[] array, int startInclusive, int endExclusive)  // from ~ to

        // 사용예
        // Stream<String> stream = Stream.of("a","b","c"); // 가변 인자
        // Stream<String> stream = Stream.of(new String[] {"a","b","c",});
        // Stream<String> stream = Arrays.Stream(new String[] {"a","b","c",});
        // Stream<String> stream = Arrays.Stream(new String[] {"a","b","c",},0,3);  // 0 , 1 , 2

        // ▶ 기본형 배열로부터 스트림 생성하기
        // IntStream IntStream.of(int... values)    // Stream 이 아니라 IntStream
        // IntStream IntStream.of(int[])
        // IntStream Arrays.stream(int[])
        // IntStream Arrays.stream(int[] array, int startInclusive, int endExclusive)

        // 19. 스트림 만들기 - 임의의 수
        // ▶ 난수를 요소로 갖는 스트림 생성하기
        // ex)
        // IntSteamintSream = new Random().ints();    //  무한 스트림
        // intStream.limit(5).forEach(System.out::println); // 5개의 요소만 출력한다.

        // IntStream intStream = new Random().ints(5);  // 크기가ㅏ 5인 난수 스트림을 반환

        // Integer.MIN_VALUR <= ints()  <= Integer.MAX_VALUE
        //    Long.MIN_VALUE <= long() <= Long.MAX_VALUE
        //               0.0 <= doubles() 1.0

        // - 지정된 범위의 난수를 요소로 갖는 스트림을 생성하는 메서드(Random클래스)
        // ex)
        // IntStream ints(int begin. int end)      // 무한 스트림
        // LongStream longs(long begin, long end)
        // DoubleStream doubles(double begin, double end)

        // IntStream ints(long streamSize, int begin, int end)  // 유한 스트림
        // LongStream ints(long streamSize, long begin, int end)
        // DoubleStream doubles(long streamSize, double begin, double end)

        // 20 스트림 만들기 - 특정 범위의 정수
        // ▶ 특정 범위의 정수를 요소로 갖는  스트림 생성하기(IntStream, LongStream)
        // - IntStream IntStream.range(int begin, int end)
        // - IntStream IntStream.rangeClosed(int begin, int end)

        // IntStream intStream = IntStream.range(1,5);  // 1,2,3,4,5        // 범위 지정
        // IntStream intStream = IntStream.rangeColsed(1,5); // 1,2,3,4,5   // 끝을 포함 하는 범위 지정

        // 21 스트림 만들기 - 람다식 iterate(), generate()
        // ▶ 람다식을  소스로 하는 스트림 생성하기
        // ex)
        // static <T> Stream<T> iterate(T seed, UnaryOperator<T> f) // 이전 요소에 종속적   // 둘다 무한 스트림
        // static <T> Stream<T> generate(Supplier<T> s)             // 이전 요소에 독립적

        // ▶ iterate()는 이전 요소를 seed로 해서 다음 요소를 계산한다.
        // ex)
        // Stream<Integer> evenStream = Stream.iterate(0, n -> n+2) // 0,2,4,6 ....

        // ▶ generate()는 seed를 사용하지 않는다
        // ex)
        // Stream<Double> randomStream = Stream.generate(Math::random);
        // Stream<Integer> oneStream = Stream.generate(()->1);

        // 22 스트림 만들기 - 파일과 빈 스트림
        // ▶ 파일을 소스로 하는 스트림 생성하기
        // Stream<Path>     Files.list(Path dir) // Path는 파일 또는 디렉토리

        // Stream<String> Files.lines(Path path)    // 파일내용 라인 단위로 읽어서 String으로 만든다
        // Stream<String> Files.lines(Path path, Charset cs)
        // Stream<String> lines() // BufferedReader클래스 메서드

        // ▶ 비어있는 스트림 생성하기
        // ex)
        // Stream emptyStream = Stream.empty(); // empty()는 빈 스트림을 생성해서 반환한다.
        // long count = emptyStream.count;     // count 의 값은 0+

    }
}
