package ch9;
//12 join()과 StringJoiner
public class Ex12_StringJoiner {

    // -join()은 여러 문자열 사이에 구분자를 넣어서 결합한다.       join static 메서드 배열 또는 컬렉션이 담겨 있는 여러 문자사이에 구분자를 넣어서 결합한다
    public static void main(String[] args) {
        String animals = "dog,cat,bear";
        String[] arr = animals.split(",");
        String str = String.join("-",arr);
        System.out.println(str);
    }

}
