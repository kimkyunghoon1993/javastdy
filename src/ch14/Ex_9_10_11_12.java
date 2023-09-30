package ch14;

//  9~12 Predicate의 결합 CF와 함수형 인터페이스
public class Ex_9_10_11_12 {
    public static void main(String[] args) {
        // 9.Predicate 의 결합 // Predicate 조건식 매개변수의 입력을 받아 boolean으로 반환
        // ▶ and(),or(),negate() 로 두 Predicate 를 하나로 결합(default 메서드),static 메서드, 추상메서드
        // 논리연산자 &&,||,not

        // ex)
        // Predicate<Integer> p = i -> i < 100;
        // Predicate<Integer> q = i -> i < 200;
        // Predicate<Integer> r = i -> i&2 == 0;

        // Predicate<Integer> notP = p.negate();        // i >= 100 i가 100보다 크거나 같다면
        // Predicate<Integer> all = notP.and(q).or(r);  // 100 <= i && i < 200 || i & 2 == 0
        // Predicate<Integer> all2 = notP.and(q.or(r)); // 100 <= i && (i < 200 || i%2 == 0)

        // System.out.println(all.test(2));     // true
        // System.out.println(all2.test(2));     // false

        // ▶ 등가비교를 위한 Predicate 의 작성에는 isEqual()를 사용(static 메서드)
        // ex)
        // Predicate<String> p = Predicate.isEqual(str1); // isEquals() 은 static 메서드
        // Boolean result = p.test(str2);   // str1 과 str2가 같은지 비교한 결과를 반환

        // boolean result = Predicate.isEqual(str1).test(str2);

        // 11. 컬렉션 프레임윅과 함수형 인터페이스
        // ▶ 함수형 인터페이스를 사용하는 컬렉션 프레임윅의 메서드(와일드 카드 생략)

        // Collection
        // boolean removelf(Predicate<E> filter)
        // 조건에 맞는 요소를 삭제

        // List
        // void replaceAll(UnaryOperaotr<E> opedrator)
        // 모든 요소를 변환하여 대체

        // Iterable
        // void forEach(Consumer<T> action)
        // 모든 요소에 작업 action을 수행

        // Map
        // V compute(K key, BiFunction<,V,V>f)
        // 지정된 키의 값에 작업 f를 수행
        // V computelfAbsent(K key, Function<K,V> f)
        // 키가 없으면, 작업 f 수행후 추가
        // V computeltPresent(K key, BiFunction<K,V,V>f)
        // 지정된 키다 있을때 , 작업 f 수행
        // V mrege(K key, V value, BiFunction<V,V,V> f)
        // 모든 요소에 병합작업 action을 수행
        // void forEach(BiConsumer(K,V) action)
        // 모든 요소에 작업 action을 수행
        // void replaceAll(BiFunction<K,V,V> f)
        // 모든 요소에 치환작업 f를 수행

        // ex)
        // list.forEach(i -> System.out.print(i+ ",")); // list의 모든 요소를 출력
        // list.removeIf(x -> x%2==0 || x%3==0);    // 2 또는 3의 배수를 제거
        // list.replaceAll(i -> i * 10);    // 모든 요소에 10을 곱한다.
        // map의 모든 요소를 {k,v}의 형식으로 출력
        // map.forEach((k,v) -> System.out.print("{"+k+","+v+"},"));




    }
}
