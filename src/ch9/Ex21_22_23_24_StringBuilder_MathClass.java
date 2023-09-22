package ch9;
// 21~24 StringBuilder, Math클래스
public class Ex21_22_23_24_StringBuilder_MathClass {
    public static void main(String[] args) {
        // 21 StringBuilder
        // - StringBuilder 는 동기화되어 있다. 멀티 쓰레드에 안전(thread-safe) StringBuilder 와 StringBuffer 는 같다 딱하나의 차이는 StringBulider는 동기화가 되어 있지않다
        // 동기화란? = 데이터를 보호
        // 멀티 쓰레드에 안전하게 하는 것이 동기화이다
        // 쓰레드의 종류
        // 싱글 쓰레드, 멀티 쓰레드 2개 가 있다
        // 싱글 쓰레드: 한번에 1개의 작업
        // 멀티 쓰레드: 한번에 여러개 작업을 하는 것을 말한다
        // - 멀티 쓰레드 프로그램이 아닌 경우, 동기화는 불필요한 성능 저하
        // 싱글 쓰레드 일 경우 동기화가 불필요하다 이럴 땐 StringBuffer 대신 StringBuilder(싱글 쓰레드 일 경우)를 사용하면 성능 향상

        // ex)
        //멀티 쓰레드 일경우(StringBuffer)                      싱글 쓰레드 일경우(StringBuilder)
        // /*StringBuffer sb;*/                                StringBuilder sb;
        // /*sb = new StringBuffer();*/        /*->*/          sb = new StringBuilder();
        // /*sb.append("abc");*/                               sb.append("abc");
        // /*System.out.println(sb);*/                         System.out.println(sb);
        // ※ 동시에 여러작업 할 경우                              ※ 한개만 작업 할 경우

        // 22 Math클래스
        // - 수학관련 static메서드의 집합

        // ex)
        // public static final double E = 2.71828182845904523454; // 자연로그의 밑
        // public static final double PI = 3.1415926535897932346; // 원주율

        // - round()로 원하는 소수점 아래 세 번째 자리에서 반올림하기, Math.random 난수
        // round 복습

        // 1. 원래 값에 100을 곱한다
        //     90.7552 * 100 -> 9075.52

        // 2. 위의 결과에 Math.round()를 사용한다.
        //      Math.round(9075.52) -> 9076

        // 3. 위의 결과를 다시 100.0으로 나눈다
        //         9076 / 100.0 -> 90.76
        //         9076 / 100   -> 90


        // 23 Math클래스의 메서드
        // static double abs(double a)
        // static float abs(float f)
        // static int abs(int f)
        // static long abs(long f)
        // - 주어진 값의 절댁값을 반환한다.
        // 절대값
        // 양수 -> 양수
        // 음수 -> 음수


        // ex)
        // int i = Math.abs(-10);
        // double d = Math.abs(-10.0);
        //
        // System.out.println(i);
        // System.out.println(d);

        // static double ceil(double a)
        // - 주어진 값을 올림하여 반환한다.

        // ex)

        // double d = Math.ceil(10.1); //10.1 반올림이 아니라 그냥 올림 이기 때문에 소수점에 값이 있기만 하면 올린다
        // double d2 = Math.ceil(-10.1);  //음수 일때는 조심해야 된다 왜냐 -11은 더 작은 숫자가 되기 때문이다
        // double d3 = Math.ceil(10.000015);
        // System.out.println(d);
        // System.out.println(d2);
        // System.out.println(d3);

        // static double floor(double a)
        // - 주어진 값을 버림하여 반환한다.
        // ex)

        // double d = Math.floor(10.8);
        // double d2 = Math.floor(-10.8);  //floo은 더 잦은 숫자를 만들 위함이므로 ceil과 다르게 -11이 된다
        // System.out.println(d);
        // System.out.println(d2);

        // static double max(double a, double b)
        // - 주어진 두 값을 비교하여 큰 쪽을 반환한다.
        // ex)

        // double d = Math.max(9.5,9.500001);
        // int i = Math.max(0,-1);
        //
        // System.out.println(d);
        // System.out.println(i);

        // static double min(double a, double b)
        // static float min(float a, float b)
        // static int min(int a, int b)
        // static long min(long a, long b)
        // - 주어진 두 값을 비교하여 작은 쪽을 반환한다.

        // double d = Math.min(9.5,9.500001);
        // int i = Math.min(0,-1);
        // System.out.println(d);
        // System.out.println(i);

        // static double random()
        // - 0.0~ 1.0 범위의 임의의 double 값을 반환한다.(1.0 은 범위에 포함되지 않는다.)

        // double d = Math.random();
        // int i = (int)(Math.random()*10)+1;
        //
        // System.out.println(d);
        // System.out.println(i);

        // static double rint(double a)     rint 짝수반올림
        // - 주어진 double값과 가장 가까운 정수값을 double 형으로 반환한다. 단, 두 정수의 정가운데 있는 값(1.5,2.5,3.5 등)은 짝수를 반환.

        // double d = Math.rint(1.2);
        // double d2 = Math.rint(2.6);
        // double d4 = Math.rint(3.5);
        // double d5 = Math.rint(4.5);
        // System.out.println(d);
        // System.out.println(d2);
        // System.out.println(d4);
        // System.out.println(d5);

        // static long round(double a)  round그냥 반올림
        // static long round(float a)
        // - 소수점 첫째자리에서 반올림한 정수값(long)을 반환한다. 두 정수의 정가운데있는 값은 항상 큰 정수를 반환.(rint()의 결과와 비교)

        long l = Math.round(1.2);
        long l2 = Math.round(2.6);
        long l3 = Math.round(3.5);
        long l4 = Math.round(4.5);

        System.out.println(l);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);



    }
}
