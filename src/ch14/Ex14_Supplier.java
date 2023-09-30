package ch14;

import java.util.function.Function;
import java.util.function.Supplier;

public class Ex14_Supplier {
    public static void main(String[] args) {
        // Supplier 는 입력 X, 출력
//        Supplier<MyClass> s = () -> new MyClass();
//        Supplier<MyClass> s = MyClass::new;

//        Function<Integer,MyClass> f = (i) -> new MyClass();
//        Function<Integer,MyClass> f = 글래스이름::메서드이름;

        Function<Integer,MyClass> f = MyClass::new;

        MyClass mc = f.apply(100);
        System.out.println(mc.iv);

        System.out.println(f.apply(200).iv);

//        Function<Integer,int[]> f2 = (i) -> new int[i];
        Function<Integer,int[]> f2 = int[]::new;    // 메서드 참조
        int[] arr = f2.apply(100);
        System.out.println(arr.length);
        System.out.println(f2.apply(100).length);
    }
}

class MyClass{
    int iv;

    MyClass(int iv){
        this.iv = iv;
    }
}

