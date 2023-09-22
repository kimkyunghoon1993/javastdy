package ch11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ex11_18 {
    public static void main(String[] args) {
        String[] data = {"A","K","A","K","D","K","A","K","K","K","Z","D"};

        HashMap map = new HashMap();

        for (int i = 0; i < data.length; i++){
            if (map.containsKey(data[i])){      //containsKey map 에 data가 있는지 확인하고 없으면 key를 넣고 그다음 1을 주고 있으면 +1 을 해라
                int value = (int)map.get(data[i]);
                map.put(data[i], value +1 );
            }else {
                map.put(data[i],1);
            }
        }

        Iterator it = map.entrySet().iterator();

        while(it.hasNext()){
            Map.Entry entry = (Map.Entry)it.next();
            int value = (int)entry.getValue();
            System.out.println(entry.getKey() + " : " + printBar('*',value) + " " + value);
        }

    }

    public static String printBar(char ch, int value){
        char[] bar = new char[value];

        for (int i = 0; i < bar.length; i++)
            bar[i] = ch;

            return new String(bar); // String(char[] chArr

    }

}
