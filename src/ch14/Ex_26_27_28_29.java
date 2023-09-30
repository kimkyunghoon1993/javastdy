package ch14;
// 26~29 스트림의 중간연산(1)
public class Ex_26_27_28_29 {
    public static void main(String[] args) {
        // 26. 스트림의 중간연산(1/7)
        // ▶ 스트림 자르기 - skip(), limit()
        // ex)
        // Stream<T> skip(long n)           // 앞에서부터 n 개 건너뛰기
        // Stream<R> limit(long maxSize)    // maxSize 이후의 요소는 잘라냄

        // IntStream intStream = IntStream.rangeClosed(1,10)    // 12345678910
        // IntStream.skip(3).limit(5).forEach(System.out::print); // 45678

        // ▶ 스트림의 요소 걸러내기 - filter(), distinct()
        // Stream<T> filter(Predicate<? super T> predicate) // 조건에 맞지 않는 요소 제거
        // Stream<T> distinct()                             // 중복제거

        // IntStream intStream = IntStream.of(1,2,2,3,3,3,4,5,5,6);
        // intStream.distinct().forEach(System.out::print);        // 123456

        // IntStream intStream = IntStream.rangeClosed(1,10);       // 12345678910
        // intStream.filter(i ->i%2==0).forEach(System.out::print); // 246810   2의 배수

        // intStream.filter(i->i%2!=0 && i%3!=0).forEach(System.out::print);
        // intStream.filter(i->i%2!=0.filter(i->i%3!=0).forEach(System.out::print);

        // ▶ 스트림 정렬하기 - sorted()
        // Stream<T> sorted()       // 스트림 요소의 기본 정렬(Comparable)로 정렬
        // Stream<T> sorted(Comparator<? super T> comparator // 지정된 Comparator로 정렬

        // strStream.sorted()   // 기본정렬
        // strStream.sorted(Comparator.naturalOrder())  // 기본정렬
        // strStream.sorted((s1,s2) -> s1.compareTo(s2));   //람다식도 가능
        // strStream.sorted(String::compareTo);             //위의문장과 동일

        // strStream.sorted(Comparator.reverseOrder()) // 기본 정렬의 역순
        // strStream.sorted(Comparator.<String>naturalOreder().reversed())

        // strStream.sorted(String.CASE_INSENSITIVE_ORDER) // 대소문자 구분안함
        // static Comparator<String> CASE_INSENSITIVE_ORDER = new CaseInsensitiveComparator();

        // strStream.sorted(String.CASE_INSENSITIVE_ORDER.reversed())

        // strStream.sorted(Comparator.comparing(String::length)) // 길이 순 정렬
        // strStream.sorted(Comparator.comparingint(String::length)) // no 오토박싱

        // strStream.sorted(Comparator.comparing(String::lenth).reversed())

        // ▶ Comparator 의 comparing()으로 정렬기준을 제공
        // ex)
        // comparing(Function<T,U> keyExtractor)
        // comparing(Function<T,U> keyExtractor, Comparator<U> keyComparator)
        // studentStream.sorted(Comparator.comparing(Student::getBan))  // 반별로 정렬
        //              .forEach(System.out::println);

        // ▶ 추가 정렬 기준을 제공할 때는 thenComparing()을 사용
        //      thenComparing(Comparator<T> other)
        //      thenComparing(Function<T,U> keyExtractor)
        //      thenComparing(Function<T,U> keyExtractor, Comparator<U> keyComp)

        // studentStrea.sorted(Comparator.comparing(Student::getBan) // 반별로 정렬
        //             .thenComparing(Student::getTotalScore)        // 총점별로 정렬
        //             .thenComparing(Student::getName)              // 이름별로 정렬
        //             .forEach(System.out::println);








    }
}
