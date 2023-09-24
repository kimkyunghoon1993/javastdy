package ch12;
// 12-1 지네릭스(Generice)란?
public class Ex_1 {
    public static void main(String[] args) {
        // 1. 지네릭스(Generics) 란?
        // - 컴파일시 타입을 체킄해 주는 기능(comoplie-time type check) - JDK1.5
        // - 객체의 타입 안정성을 높이고 형변환의 번거로움을 줄여줌 (타입체크를 좀더 정확하게 할수 있다)

        // ex)
        //  Tv객체만 저장할 수 있는 ArrayList를 생성
        //  ArrayList<Tv> tvList = new ArrayList<Tv>();   // ArrayList에 Object[] objArr 모든 종류의 객체가 저장 가능 한데
        //                                                // 만약에 Tv 만 저장 하고 싶을때 Tv만 저장 하게 할수 있는게 지네릭스 이다
        //  tvList.add(new Tv()); // Ok
        //  tvList.add(new Audio()); // 컴파일 에러. Tv 외에 다른 타입은 저장 불가

        // ArrayList tvList = new ArrayList();                    ArrayList<Tv> tvList = new ArrayList<Tv>
        // tvlist.add(new Tv()),                        =>        tvList.add(new Tv());
        // Tv t = (Tv)tvlist.get(0);                              Tv t = tvList.get(0); // 형변환 불필요

        // 지네릭스의 장점
        // 1.타입 안정성을 제공한다.      // Class CastExcption 형변환 runtime 에러 발생을 컴파일에서 잡을수 있다
        // 2.타입체크와 형변환을 생략할 수 있으므로 코드가 간결해 진다.  // 형변환을 줄일수 있다






    }
}
