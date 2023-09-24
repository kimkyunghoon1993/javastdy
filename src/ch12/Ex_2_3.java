package ch12;
// 2~3 타입 변수
public class Ex_2_3 {
    public static void main(String[] args) {
        // 2. 타입 변수

        // - 지네릭스 클래스를 작성할 때, Object타입 대신 타입 변수(E)를 선언해서 사용.
        // - 일반 클래스의 타입 변수를 지네릭스 클래스로 변경하는 것이다

        // ex)  일반클래스
        // public class ArrayList extends AbstractList { // 일부 생략
        //      private transient Object[] elementData;
        //      public boolean add(Object o) { /* 내용생략 */ }
        //      public Object get(int index) { /* 내용생략 */ }
        // }

        // 일반 클래스를 지네릭스 클래스로 변경
        // public class ArrayList<E> extends AbstractList<E> {  // 일부 생략        // 타입변수 <E>
        //      private transient E[] elementData;
        //      public boolean add(E o) { /* 내용생략 */}
        //      public E get(int index) { /* 내용생략 */}
        //      ...
        // }

        // 3. 타입 변수에 대입하기
        // - 객체를 생성시, 타입 변수(E) 대신 실제 타입(Tv)을 지정(대입)

        // ex)
        // 타입변수 E 대신 실제 타입 Tv를 대입
        // ArrayList<Tv> tvList = new ArrayList<Tv>();  // 참조변수, 생성자에 타입을 넣어주면 된다

        // public class ArrayList<E> extends AbstractList<E>   { // 일부 생략
        //      priavet transient E[] elementData;
        //      public boolean add(E o) { /* 내용생략 */ }
        //      public E get(int index) { /* 내용생략 */ }
        //      ...
        // }

        // 위 코드를 변경 하면 아래와 같이 변경 된다

        // public class ArrayList extends AbstractList { // 일부 생략
        //      private transient Tv[] elementData;
        //      public boolean add(Tv o) { /* 내용생략 */ }
        //      public Tv get(int index) { /* 내용생략 */ } // Object 가 아닌 Tv를 반환
        //   ....
        // }

        // - 타입 변수 대신 실제 타입이 지정된면, 형변환 생략가능
        // ex)
        // ArrayList tvList = new ArrayList();                      ArrayList<Tv> tvList = new ArrayList<Tv>();
        // tvList.add(new Tv());                        =>          tvList.add(new Tv());
        // Tv t = (Tv)tvList.get(0);                                Tv t = tvList.get(0);   // 형변환 불필요









    }
}
