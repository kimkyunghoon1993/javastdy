package ch14;

import java.util.function.Consumer;

// 23~25 스트림 연산
public class Ex_23_24_25 {
    public static void main(String[] args) {
        // 23.스트림의 연산
        // ▶ 스트림이 제공하는 기능 - 중간 연산과 최종연산
        // 1.스트림 만들기
        // 2.중간 연산(0~n번)
        // 3.최종 연산(0~1번)
        // - 중간 연산 : 연산결과가 스트림인 연산. 반복적으로 적용가능
        // - 최종 연산 : 연산결과가 스트림이 아닌 연산. 단 한번만 적용가능(스트림의 요소를 소모)

        // ex) stream.distinct().limit(5).sorted().forEach(System.out::println)
        //              중간 연산   중간 연산 중간 연산         최종연산

        // String[] strArr = {"dd","aaa","CC","cc","b"};
        // Stream<String> stream = Stream.of(strArr); // 문자열 배열이 소스인 스트림
        // Stream<String> filteredStream = stream.filter(); //걸러내기(중간 연산)
        // Stream<String> distinctedStream = stream.distinct(); //중복제거(중간 연산)
        // Stream<String> sortedStream = stream.sort(); //정렬(중간 연산)
        // Stream<String> limitedStream = stream.limit(5) // 스트림 자르기 (중간 연산)
        // int total = stream.count();  // 요소 개수 세기(최종연산)

        // 24. 스트림의 연산 - 중간 연산

        // Stream<T> distinct()
        // 중복제거

        // Stream<T> filter(Predicate<T> predicate
        // 조건에 안 맞는 요소 제외

        // Stream<T> limit(long maxSize)
        // 스트림의 이리부를 잘라낸다.

        // Stream<T> skip(long n)
        // 스트림의 일부를 건너뛴다

        // Stream<T> peek(Consumer<T> action)
        // 스트림의 요소에 작업수행

        // Stream<T> sorted()
        // Stream<T> sorted(Comparator<T> comparator)
        // 스트림의 요소를 정렬한다.

        // Stream<R> map(Function<T,R> mapper)
        // DoubleStream mapTouDouble(ToDoubleFunction<T> mapper)
        // IntStream mapToInt(ToIntFunction<T> mapper)
        // LongStream mapToLong(ToLongFunction<T> mapper)

        // Stream<R> flatMap(Function<T,Stream<R>> mapper)
        // DoubleStream flatMapToDouble(Function<T, DoubleStream> m)
        // IntStream flatMapInt(Function<T,LongStream> m)
        // LongStream flatMapLong(Function<T,LongStream> m)
        // 스트림의 요소를 변환한다.

        // 25.스트림의 연산 - 최종 연산
        // void forEach(Consumer<? super T> action)
        // void forEachOrdered(Consumer<? super T> action)
        // 각 요소에 지정된 작업 수행

        // long count()
        // 스트림의 요소의 개수 반환

        // Optional<T> max(Comparator<? super T> comparator)
        // Optional<T> min(Comparator<? super T> comparator)
        // 스트림의 최대값/최소값을 반환

        // Optional<T> findAny()    // 아무거나 하나
        // Optional<T> findFirst()    // 첫 번째 요소
        // 스트림의 요소 하나를 반환

        // boolean allMatch(Predicate<T> p) // 모두 만족하는지
        // boolean anyMatch(Predicate<T> p) // 하나라도 만족하는지
        // boolean noneMatch(Predicate<T> p) // 모두 만족하지 않는지
        // 주어진 조건을 모두 요소가 만족시키는지,만족시킼지 않는지 확인

        // Object[] toArray()
        // A[]      toAttay(IntFunction<A[]> generator)
        // 스트림의 모든 요소를 배열로 반환

        // Optional<T> reduce(BinaryOperator<T> accumulator)
        // T reduce(T identity, BinaryOperator<T> accumulator)
        // U reduce(U identity, BiFunction<U,T,U> accumulator, BinaryOperator<U> combiner)
        // 스트림의 요소를 하나씩 줄여가면서 (리듀싱) 계산한다.

        // R collect(Collector<T,A,R> collector)
        // R collect(Supplier<R> supplier, BiConsumer<R,T> accumulator, BiConsumer<R,R> combiner)
        // 스트림의 요소를 수집한다. 주로 요소를 그룹화하거나 분할한 결과를 컬렉션에 담아 반환하는데 사용된다.






    }
}
