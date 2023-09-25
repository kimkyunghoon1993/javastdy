package ch12;
//  21~22 열거형 멤버 추가하기
public class Ex_21_22 {
    public static void main(String[] args) {
        // 21. 열거형에 멤버 추가하기
        // - 불연속적이 열거형 상수의 경우, 원하는 값을 괄호()안에 적는다.
        // ex)
        // enum Direction { EAST(1), SOUTH(5), WEST(-1), NORTH(10) }    // 값을 지정 하지 않았을 경우 0 , 1 ,2 ,3 으로 들어가지만 이렇게 값을 지정할수도 있다
        //                      0       1          2        3

        // - 괄호()를 사용하려면 , 인스턴스 변수와 생성자를 새로 추가해 줘야 한다.
        // enum Direction {
        //  EAST(1), SOUTH(5), WEST(-1), NORTH(10); // 끝에 ';'를 추가해야 한다.
        //
        //  private final int value;    // 정수를 저장할 필드(인스턴스 변수)를 추가 , 생성자는 항상 private 이다
        //  Direction(int value) { this.value = value; } // 생성자를 추가
        //  public int getValue() { return value; }
        // }

        // - 열거형의 생성자는 묵시적으로 private 이므로, 외부에서 객체생성 불가
        // Direction d = new Direction(1); // 에러. 열거형의 생성자는 외부에서 호출불가


    }
}
