package ch12;
//  17~20 열거형 (enum) 열거형의 조상
public class Ex_17_18_19_20 {
    public static void main(String[] args) {
        // 17. 열거형(enum)
        // - 관련된 상수들을 같이 묶어 놓은 것. java는 타입에 안전한 열거형을 제공 (값 과 타입을 둘다 체크 한다)

        // ex)
        // class Cead {
        // 카드 무늬
        //  static final int CLOVER = 0;
        //  static final int HEART = 1;
        //  static final int DIAMOND = 2;
        //  static final int SPADE = 3;
                                                        // if(Card.CLOVER == Card.TWO)     // true 지만 false 이어야 의미상 맞음
        // 카드 숫자
        //  static final TWO = 0;
        //  static final THREE = 1;
        //  static final FOUR = 2;

        // final int kind;
        // final int num;

        //  ==========================================================================================================
        // 위 class 처럼 상수 정의 할때 반복 되는 부분을 줄일수 있는 것이 열거형이다

        // class Card { //  0,      1,      2,      3
        //      enum Kind   { CLOVER, HEART, DIAMOND, SPADE } // 열거형 kind를 정의
        //      enum Value  { TWO, THREE, FOUR }              // 열거형 Value를 정의

        // final Kind kind;    // 타입이 int 가 아닌 Kind 임에 유의 하자
        // final Value value;

        //  if(Card.Kind.CLOVER == Card.Value.TWO)  // 컴파일 에러. 타입이 달라서 비교 불가 (타입 불일치) java의 열거형은 값과 타입을 모두 체크한다

        // 18.열거형의 정의와 사용
        // - 열거형을 정의하는 방법
        // ex)
        //  enum 열거형이름 { 상수명1, 상수명2, ....}
        //  enum Direction { EAST, SOUTH, WEST, NORTH }

        // - 열거형 타입의 변수를 선언하고 사용하는 방법
        // ex)
        //      class Unit {
        //          int x, y;   // 유닛의 위치
        //          Direction dir;  // 열거형 인스턴스 변수를 선언
        //
        //          void init(){
        //              dir = Direction.EAST;   // 유닛의 방향을 EAST로 초기화
        //          }
        //      }

        // - 열거형 상수의 비교에 == 와 compearTo() 사용가능      //compearTo 같은면 0 왼쪽이 크면 양수 오르쪽이 크면 음수
        //  ex)
        //  if (dir == Direction.EAST) {
        //          x++;
        //  } else if (dir > DirectionWEST) {   // 에러.
        //  ...
        //  } else if (dir.compearTo(Direction.WEST) > 0) { // compareTo()는 가능
        //  ...

        // 19. 열거형의 조상 - java.lang.Enum 클래스
        // - 모든 열거형은 Enum의 자손이며, 아래의 메서드를 상속받는다.

        //  Class<E> getDeclaringClass()
        //  - 열거형의 Class 객체를 반환

        // String name()
        // - 열거형의 상수의 이름을 문자열로 반환

        // int ordinal()
        // - 열거형 상수가 정의된 순서를 반환(0부터 시작)

        // T valueOf(Class<T> enumType, String name)₩
        // - 지정도니 열거형에서 name과 일치하는 열거형 상수를 반환

        // - values(), valueOf()는 컴파일러가 자동으로 추가
        // static E[] values()
        // static E valueOf(String name)    => Direction d = Direction.valueOf("WEST"); // 열거형 상수 이름

        // Direction[] dArr = Direction.values();

        // for(Direction d :  dArr) // for (Direction d : Direction.values())
        // System.out.printf("%s=%d%n",d.name(), d.ordinal()); // 이름 , 순서



    }
}
