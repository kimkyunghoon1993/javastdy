package ch12;
//   7~8 Iterator<E> HashMap<K,V>
public class Ex_7_8 {
    public static void main(String[] args) {
        // 7. iterator<E>
        // - 클래스를 작성할 때, Object타입 대신 T와 같은 타입 변수를 사용

        // ex)
        //      일반 클래스                                                      지네릭클래스    타입변수<E> 지정
        // public interface Iterator {                           public interfeca Iterator<E>  {
        //      boolean hasNect();                                      boolean hasNect();
        //      Objcet next();                      =>                  E next():
        //      void remove();                                          void remove();
        // }                                                     }

        // Iterator it = list.iterator();                           Iterator<Student> it = list.iterator():
        // while(it.hasNext()) {                    =>              while{(it.hasNext()) {
        //      Stueent s = (Student)it.next();                             Student s = <Student>it.next(); // 형변환이 필요없다
        //      ...                                                 ...

        // 8. HashMap<K,V>
        //  - 여러 개의 타입 변수가 필요한 경우, 콤마(,)를 구분자로 선언
        // ex)
        // HashMap<String, Student> map = new HashMap<String, Student>();   // 생성
        // map.put("자바왕", new Student("자바왕",1,1,100,100,100));  // 데이터 저장

        // public class HashMap<K,V> extends AbstractMap<K,V> { // 일부 생략                public class HashMap extends AbstractMap { // 일부 생략
        //      ...                                                                               ...
        //    public V get(Object key)  { /* 내용 생략 */}                                       public Student get(Object key)  { /* 내용 생략 */}
        //    public V put(K key, V value) { /* 내용 생략 */}                   =>               public Student put(K key, V value) { /* 내용 생략 */}
        //    public V remove(Object key) { /* 내용 생략 */}                                     public Student remove(Object key) { /* 내용 생략 */}
        //      ...                                                                               ...
        // }                                                                               }

        // Student s1 = (Student)map.get("1-1");                            <->             Student s1 = map.get("1-1");    //형변환 불필요






    }
}
