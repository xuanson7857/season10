package bt.bt4;

import java.util.ArrayList;
import java.util.List;

public class Bt4 {
    public static void main(String[] args) {
        List<String> listInt = new ArrayList<>();
        listInt.add("Hello world");
        listInt.add("Heo");
        listInt.add("He");
        listInt.add("Anizx9171");
        System.out.println("Các chuối lớn hơn 3 kí tự là:");
        for (String str:listInt) {
            if (str.length() >3){
                System.out.print("\""+ str + "\"" + " ");
            }
        }
    }
}
