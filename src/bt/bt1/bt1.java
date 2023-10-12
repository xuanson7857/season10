package bt.bt1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class bt1 {
    public static void main(String[] args) {
        List<Integer> listInt = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listInt.add((int) (Math.round(Math.random() * 89) +10));
        }
        for (Integer inter:listInt) {
            System.out.print(inter + " ");
        }
        System.out.println();
        System.out.println(Collections.max(listInt));
    }
}