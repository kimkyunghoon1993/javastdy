package ch14;
// 45~49 collect()와 Collectors에 대해
public class Ex_45_46_47_48_49 {
    public static void main(String[] args) {
        // 45.collect()와 Collectors
        // ▶ collect()는 Collector 를 매개변수로 하는 스트림의 최종연산
        // Object collect(Collector collector) // Collector 를 구현한 클래스의 객체를 매개변수로
        // Object collect(Supplier supplier, BiConsumer accumulator, BiConsumer combiner) // 잘 안씀

        // 최종 연산 에는 2가지가 있다
        // 1.reduce()(리듀싱) 은 전체
        // 2.collect() 는 그룹별

        // ▶ Collector 는 수집(collect)에 필요한 메서드를 정의해 놓은 인터페이스
        // ex)
        // public interface Collector<T,A,R> { // T(요소)를  A 에 누적한 다음, 결과를 R로 변환해서 반환
        //      Supplier<A>         supplier();             // StringBuilder::new       누적할 곳
        //      BiConsumer<A,T>     accumulator();          // (sb, s) -> sb.append(s)  누적방법
        //      BinaryOperator<A>   combiner();             // (sb1, sb2) -> sb1.append(sb2)   결합방법(병렬)
        //      Function<A,B>       finisher();             //  sb -> sb.toString()             최종 변환
        //      Set<Characteristics> characteristics();    //  컬렉터의 특성이 담긴 Set 을 반환

        // ▶ Collectors 클래스는 다양한 기능의 컬렉터(Collector를 구현한 클래스)를 제공
        // . 변환 - mapping(), toList(), toSet(), toMap(), toCollection(),.....
        // . 통계 - counting(), summingInt(), averagingInt(), maxBy(), minBy(), summarizingInt(),.....
        // . 문자열 결합 - joining()
        // . 리듀싱 - reducing()
        // . 그룹화 와 분할 - groupingBy(), partitioningBy(), collectionAndThan()

        // ※ collect(): 최종연산, Collector: 인터페이스 , Collectors: 클래스

        // 46. 스트림을 컬렉션, 배열로 변환
        // ▶ 스트림을 컬렉션으로 변환 - toList(),toSet(),toMap(),toCollection()
        // ex)
        // List<String> names = stuStream.map(Student::getName) // Stream<Student> ->   Stream<String>
        //          .collect(Collectors.toList());              // Stream<String>   ->  List<String>
        // ArrayList<String> list = names.stream()
        //  .collect(Collectors.toCollection(ArrayList::new));  // Stream<String> -> ArrayList<String>
        // Map<String,Person> map = personStream
        //  .collect(Collectors.toMap(p -> p.getRegId(), p -> p )); // Stream<Person> -> Map<String.Person>

        // ▶ 스트림 을 배열로 변환 - toArray()
        //  Student[] stuNames = studentStream.toArray(Student[]::new); // Ok
        //  Student[] stuNames = studentStream.toArray(); // 에러. Student[] stuNames = (Student[])studentStream.toArray(); // Ok. 자동 형변환이 안된다는 뜻
        //  Object[] stuNames = studentStream.toArray(); // OK.

        // 47. 스트림의 통계 - counting(), summingInt()
        // ▶ 스트림의 통계정보 제공 - counting(), summingInt(), maxBy(), minBy(),.........
        // long count = stuStream.count();
        // long count = stuStream.collect(counting());  // Collectors.counting()     collect 그룹별로 나눌수 있다

        // long totalScore = stuStream.mapToInt(Student::getTotalScore).sum();      // IntStream의 sum()
        // long totalScore = strStream.collect(summingInt(Student::getTotalScore));

        // OptionalInt topScore = studentStream.mapToInt(Student::getTotalScore).max();
        // Optional<Student> topStudent = stuStream
        //          .max(Comparator.comparingInt(Student::getTotalScore));
        // Optional<Student> topStudent = stuStream
        //          .collect(maxBy(Comparator.comparingInt(Student::getTotalScore));

        // ▶ 스트림을 리듀싱 - reducing()
        // ex)
        // Collector reducing(BinaryOperator<T> op)
        // Collector reducing(T identity, BinaryOperator<T> op)
        // Collector reducing(T identity, Function<T,U> mappe, BinaryOperator<U> op)    // map+reduce

        // IntStream intStream = new Random().ints(1,46).distinct().limit(6);
        // OptionalInt       max = intStream.reduce(Integer::max);
        // Optional<Integer> max = intStream.boxed().collect(reducing(Integer::max));

        // long sum = intStream.reduce(0, (a,b) -> a + b);
        // long sum = intStream.boxed().collect(reducing(0,(a,b)-> a + b));

        // int grandTotal = stuStream.map(Student::getTotalScore).reduce(0, Integer::sum);
        // int grandTotal = stuStream.collect(reducing(0, Student::getTotalScore, Integer::sum));

        // ▶ 문자열 스트림의 요소를 모두 연결 - joining()
        // String studentNames = stuStream.map(Student::getName).collect(joining());
        // String studentNames = stuStream.map(Student::getName).collect(joining(",")); // 구분자
        // String studentNames = stuStream.map(Student::getName).collect(joining(",",'[","]"));
        // String studentInfo = stuStream.collect(joining(",")); // Student 의 toString()으로 결합




    }
}
