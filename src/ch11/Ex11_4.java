package ch11;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;


public class Ex11_4 {
    static Queue q = new LinkedList();
    static final int MAX_SIZE = 5;  //Queue 에 최대 5개 까지만 저장되도록 한다.

    public static void main(String[] args) {
        System.out.println("hplp를 입력하면 도움말을 볼 수 있습니다.");

        while (true) {
            System.out.print(">>");
            try {
                //화면으로 부터 라인단위로 입력 받는다.
                Scanner s = new Scanner(System.in);
                String input = s.nextLine().trim();     // trim 앞뒤 문자열의 공백 제거

                if ("".equals(input)) continue;

                if (input.equalsIgnoreCase("q")) {
                    System.exit(0); // q입력하면 프로그램 종료
                } else if (input.equalsIgnoreCase("help")) {    //equalsIgnoreCase 대소문자 구분 안함
                    System.out.println(" help - 도움말을 보여줍니다");
                    System.out.println(" q 또는 Q - 프로그램을 종료합니다");
                    System.out.println(" history - 최근에 입력한 명령어를" + MAX_SIZE + "개 보여줍니다");
                } else if (input.equalsIgnoreCase("history")) {
                    save(input);        // 입력받은 명령어를 저장 하고,

                    // LinkedList 의 내요을 보여준다.
                    LinkedList list = (LinkedList) q;
                    // ListIterator it = list.listIterator();  책에 예제
                    final int SIZE = list.size();
                    for (int i = 0; i < SIZE; i++) {
                        System.out.println((i + 1) + "." + list.get(i));
                    }
                } else {
                    save(input);
                    System.out.println(input);
                }

            } catch (Exception e) {
                System.out.println("입력오류입니다");
            }
        }

    }

    public static void save(String input){
        // queue에 저장한다.
        if (!"".equals(input))      // if(input!= null && !input.equals(""))
            q.offer(input);     // 큐의 명령어를 저장 꺼내는건 poll()

        // queue의 최대크기를 넘으면 제일 처음 입력된 것을 삭제한다
        if (q.size() > MAX_SIZE)    // size() 는 Collection 인터페이스에 정의
            q.remove();
    }
}
