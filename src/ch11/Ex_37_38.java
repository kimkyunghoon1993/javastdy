package ch11;

// 37,38 HashSet(2)
public class Ex_37_38 {
    public static void main(String[] args) {
        // HashSet - 예제3
        // - HashSet은 객체를 저장하기 전에 기존에 같은 객체가 있는지 확인 같은 객체가 없으면 저장하고, 있으면 저장하지 않는다
        // - boolean add(Object o)는 저장할 객체의 equals() 와 hashCode()를 호출

        // ex)
        // class Person {   //Object 가 선언 되어 있는 것과 동일 하다 그러므로 equals(), hashCode() 별도로 호출하지 않았다
        //            Stirng name;  // 이름
        //            int age;      // 나이
        //
        //            Person(String name, int age){ // equals(), hashCode() 호출
        //                this.name = name;
        //                this.age = age;
        //            }
        //
        //            public String toStirng(){
        //                return name+":"+age;
        //            }
        // }

        // 오버라이딩
        // public boolean equals(Object obj) {
        //  if(!(obj instanceof Person)) return false;
        //
        //  Person tmp = (Person)obj;   // 형변환을 해야 비교 할수 있기 때문에 형변환 을 해준것이고
        //
        //  return name.equals(tmp.name) && age == tmp.age; // 객체 자신 하고 매개변수로 지정된 obj 와 비교 이름 이 같은지 나이가 같은지 비교
        // }

        // public int hashCode() {
        //      reutnr (name+age).hashCode();   // 과거에 이렇게 사용 했고
        //      return Object.hash(name,age)    // 요즘엔 이렇게 사용한다
        // }


    }
}
