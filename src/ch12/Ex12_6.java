package ch12;

enum Direction2 {
    EAST(1, ">"), SOUTH(2, "V"), WEST(3, "<"), NORTH(4, "^");   // 상수들으 값은 2개 씩 가지고 있다

    private static final Direction2[] DIR_ARR = Direction2.values();        // 열거형 에 있는 값을 배열에 담아 두었다가
    private final int value;    // 상수의 첫번째 값
    private final String symbol;    // 상수의 두번째 값

    Direction2(int value, String symbol) {  // 접근 제어자 private 이 생략됨
        this.value = value;
        this.symbol = symbol;
    }

    public int getValue() {     // 인스턴스 변수 getter를 추가
        return value;
    }

    public String getSymbol() {
        return symbol;
    }

    public static Direction2 of(int dir) {  // of 라는 메서드를 이용해서 상수들중 하나를 얻어올수 있게 한다
        if (dir < 1 || dir > 4)     // 0~3 을 벗어나면 예외 발생
            throw new IllegalArgumentException("Invlid value :" + dir);

        return DIR_ARR[dir - 1];    // on 메서드에 있는 dir 의 값중 하나가 반환 된다
    }

    // 방향을 회전시키는 메서드. num의 값만큼 90도씩 시계방향으로 회전한다.
    public Direction2 rotate(int num) {
        num = num % 4;

        if (num < 0)
            num += 4; // num이 음수일 때는 시계반대 방향으로 회전

        return DIR_ARR[(value - 1 + num) % 4];
    }

    public String toString(){
        return name()+getSymbol();
    }

}

public class Ex12_6 {
    public static void main(String[] args) {
        for (Direction2 d : Direction2.values())    // values 열거형의 가지고 있는 모든 상수를 반환
        System.out.printf("%s=%d%n", d.name(), d.getValue());   // d.getValue() 대신 d.ordinal() 을 선언하면 0부터 시작한다

        Direction2 d1 = Direction2.EAST;
        Direction2 d2 = Direction2.of(1);

        System.out.printf("d1=%s, %d%n", d1.name(),d1.getValue());
        System.out.printf("d2=%s, %d%n", d2.name(),d2.getValue());
        System.out.println(Direction2.EAST.rotate(1));
        System.out.println(Direction2.EAST.rotate(2));
        System.out.println(Direction2.EAST.rotate(-1));
        System.out.println(Direction2.EAST.rotate(-2));
    }

}
