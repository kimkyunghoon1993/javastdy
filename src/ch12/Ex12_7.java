package ch12;

class Parent {
    void parentMethod() {}
}

class Cild extends Parent{
    @Override
    void parentMethod() { } // 조상 메서드의 이름을 잘못 적었음.

}
