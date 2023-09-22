package ch11;

import java.util.HashSet;
import java.util.Objects;

public class Ex11_11 {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("abc");
        set.add("abc");     // 중복 이라 저장 안됨.
        set.add(new Person("David", 10));
        set.add(new Person("David", 10));

        System.out.println(set);
    }
}

// equals() 와 hashCode()를 오버라이딩해야 HashSet이 바르게 동작.
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + ":" + age;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person)) return false;

        Person p = (Person) obj;
        // 나 자신(this)의 이름과 나이를 p와 비교
        return this.name.equals(p.name) && this.age == p.age;   // p대신 obj를 넣을수 없는 이유는? obj에는 name,age가 없기 때문에 Person 에 있는걸 가져와서 비교 해야 된다

    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
