package ch9;

public class RoundTest {

    public static void main(String[] args) {
        double sum = 0;
        double sum1 = 0;
        double sum2 = 0;

        for (double d = 1.5; d <= 10.5; d++) {
            double d1 = Math.round(d);
            double d2 = Math.rint(d);

            System.out.printf("%4.1f %4.1f %4.1f%n", d, d1, d2);

            sum += d;
            sum += d1;
            sum += d2;
        }

        System.out.println("---------------------------");

        System.out.printf("%4.1f %4.1f %4.1f%n", sum, sum1, sum2);

        // round 는 무조건 반올림 소수점 첫째자리가 5일때 보다 큰수로 반올림 한다

        // rint 는 짝수때는 버림 홀수 일때만 반올림 을 한다 ex) 2.5 일 경우 2로 버림 3.5일 때는 4로 반올림을 한다




    }
}
