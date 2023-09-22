package ch9;

public class WrapperEx {
    public static void main(String[] args) {
        Integer i = new Integer(100);
        Integer i2 = new Integer(100);
        int i3 = 100;

        System.out.println(i==i3);
        System.out.println(i.equals(i3));


        // System.out.println("i==i2 ? " +(i==i2));
        // System.out.println("i.equals(i2)? "+i.equals(i2));
        // System.out.println("i.compareTo(i2)="+i.compareTo(i2)); // compareTo(컴페어투) 비교했을때 같으면 0 을 반환 오른쪽 값이 작으면 양수 오른쪽 값이 크면 음수 를 반환 합니다 주로 정렬할때 사용한다
        // System.out.println("i.toString()="+i.toString());
        //
        // System.out.println("MAX_VALUE="+Integer.MAX_VALUE);
        // System.out.println("MIN_VALUE="+Integer.MIN_VALUE);
        // System.out.println("SIZE="+Integer.SIZE+"bits");
        // System.out.println("BYTES="+Integer.BYTES+"bytes");
        // System.out.println("TYPE="+Integer.TYPE);




    }
}
