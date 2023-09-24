package ch12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Ex12_2 {
    public static void main(String[] args) {
    //==================================================================================================================
//        ArrayList<Student> list = new ArrayList<Student>();
//        list.add(new Student("자바왕", 1, 1));
//        list.add(new Student("자바짱", 1, 2));
//        list.add(new Student("홍길동", 2, 1));
//
//        Iterator<Student> it = list.iterator();
//        while (it.hasNext()) {
////            Student s = (Student)it.next(); // 지네릭스를 사용하지 않으면 형변환 해야 된다
////            Student s = it.next(); // 지네릭스를 사용하면 형변환을 하지 않아도 된다!!
////            System.out.println(s.name);
////            System.out.println(((Student)it.next()).name); // 위 두줄을 한줄로 줄일수 있다. 형변환을 해야 되는 경우
//            System.out.println(it.next().name); // 위 두줄을 한줄로 줄일수 있다. 제네릭스을 사용한경우

     //==================================================================================================================
        HashMap<String,Student> map = new HashMap<>();  // JDK1.7 부터 생성자에 타입지정 생략 가능
        map.put("자바왕",new Student("자바왕",1,1,100,100,100));

        Student s = map.get("자바왕");

        System.out.println(map.get("자바왕").name);

    }
}

class Student {
    String name = "";
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

}
