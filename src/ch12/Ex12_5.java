package ch12;

enum Direction {EAST, SOUTH, WEST, NORTH}   // 열거형 타입 선언  0 , 1 ,2 ,3 순서로 들어 간다

public class Ex12_5 {
    public static void main(String[] args) {
        Direction d1 = Direction.EAST;  // d1 EAST 를 저장 열거형 타입.상수이름 으로 저장 해도 되고
        Direction d2 = Direction.valueOf("WEST");  // d2 WEST 문자열로 저장 해도 된다
        Direction d3 = Enum.valueOf(Direction.class, "EAST");   //  Enum 클래스 의 valueOf 를 이용해서 저장 할수도 있다

        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3);

        System.out.println("d1==d2 ? " + (d1==d2)); // false
        System.out.println("d1==d3 ? " + (d1==d3)); // true
        System.out.println("d1.equals(d3) ? " + d1.equals(d3)); // true 열거형 상수는 사실 객체이다
        // System.out.println("d2 > d3 ? " + (d1 > d3));    // 에러
        System.out.println("d1.compareTo(d3) ? " + (d1.compareTo(d3))); // 0
        System.out.println("d1.compareTo(d2) ? " + (d1.compareTo(d2))); // -2 오른쪽이 크다

        switch (d1){
            case EAST:  // Direction.EAST 라고 쓸 수 없다.
                System.out.println("The direction is EAST."); break;
            case SOUTH:
                System.out.println("The direction is SOUTH."); break;
            case WEST:
                System.out.println("The direction is WEST."); break;
            case NORTH:
                System.out.println("The direction is NORTH."); break;
            default:
        }

        Direction[] dArr = Direction.values(); // 열거형의 모든 상수를 배열로 반환

        for (Direction d : dArr){
            System.out.printf("%s=%d%n", d.name(),d.ordinal());
        }
    }
}
