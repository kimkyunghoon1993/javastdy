package ch11;

import java.util.TreeSet;

public class Ex11_14 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();    // 범위 검색에 유리.(from ~ to)

        String from = "b";
        String to = "d";

        set.add("abc");     set.add("alien");       set.add("bat");
        set.add("car");     set.add("Car");         set.add("disc");
        set.add("dance");   set.add("dZZZZ");       set.add("dzzzz");
        set.add("elephant");set.add("elevator");    set.add("fan");

        System.out.println(set);
        System.out.println("range serch : from " + from + " to " + to);
        System.out.println("result1 : " + set.subSet(from,to));
        System.out.println("result2 : " + set.subSet(from,to + "zzz"));


    }
}
