package ch14;
// 40~44 스트림 최종연산
public class Ex_40_41_42_43_44 {
    public static void main(String[] args) {
        // 40.스트림의 최종연산 - forEach()
        // 중간연산(0~n번) Stream 을 반환
        // limit(),skip(),filter(),distinct(),map(),flatMap(),peek()
        // 최종연산(0~1번) 스트림의 요소 소모 스트림이 닫힘    int, boolean,Optional을 반환
        // forEach(),allMatch(),anyMatch(),noneMatch(),reduce(),collect(),findAny(),findFirst()

        // ▶ 스트림의 모든 요소에 지정된 작업을 수행 - forEach(),forEachOrdered()
        // ex)
        // void forEach(Consumer<? super T> action)             // 병렬스트림인 경우 순서가 보장된지 않음
        // void forEachOrdered(Consumer<? super T> action)      // 병렬스트림인 경우에도 순서가 보장됨

        // 직렬 스트림
        // IntStream.range(1,10).sequential().forEach(System.out::print);           // 123456789
        // IntStream.range(1,10).sequential().forEachOrdered(System.out::print);    // 123456789

        // 병렬 스트림
        // IntStream.range(1,10).parallel().forEach(System.out::print);         // 683295714    순서가 보장되지 않음
        // IntStream.range(1,10).parallel().forEachOrdered(System.out::print);  // 123456789    순서가 보장됨

        // ▶ 조건 검사 - allMatch(),anyMatch(),noneMatch()
        // ex)
        // boolean allMatch (Predicate<? super T> predicate) // 모든 요소가 조건을 만족시키면 true
        // boolean anyMatch (Predicate<? super T> predicate) // 한 요소라도 조건을 만족시키면 treu
        // boolean noneMatch (Predicate<? super T> predicate) // 모든 요소가 조건을 만족시키지 않으면 true

        // boolean hasFailedStu = stuStream.anyMatch(s-> s.getTotalScore()<=100);   // 낙제자가 있는지?

        // ▶ 조건에 일치하는 요소 찾기 - findFirst(), findAny()
        // Optional<T> findFirst()      // 첫 번째 요소를 반환. 순차 스트림에 사용
        // Optional<T> findAny()        // 아무거나 하나를 반환. 병렬 스트림에 사용

        // Optional<Student> result = stuStream.filter(s -> s.getTotalScore() <= 100).findFirst();
        // Optional<Student> result = parallelStream.filter(s -> s.getTotalScore() <= 100).findAny();

        // 42,43 스트림의 최종연산 - reduce()
        // ▶ 스트림의 요소를 하나씩 줄여가며 누적연산 수행 - reduce()
        // ex)
        // Optional<T> reduce (BinaryOperator<T> accumulator)
        // T           reduce (T identity, BinaryOperator<T> accumulator)
        // U           reduce (U identity, BiFunction<U,T,U> accumulator, BinaryOperator<U> combiner)

        // .identity - 초기값
        // .accumulator - 이전 연산결과와 스트림의 요소에 수행할 연산
        // .combiner - 병렬처리된 결과를  합치는데 사용할 연산(병렬 스트림)

        // int reduce (int identity, IntBinaryOperator op)
        // int count = intStream.reduce(0,(a,b) -> a + 1);      // count()
        // int sum = intStream.reduce(0,(a,b) -> a + b);        // sum()
        // int max = intStream.reduce(Integer.MIN_VALUE,(a,b)-> a > b ? a : b); // max()
        // int min = intSteram.reduce(Integer.MAX_VALUE,(a,b)-> a < b ? a : b); // min()

        // int a = identity;
        // for(int b : stream)
        // a = a + b; // sum()







    }
}
