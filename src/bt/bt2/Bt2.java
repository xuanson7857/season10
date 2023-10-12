package bt.bt2;

import java.util.ArrayList;
import java.util.List;

public class Bt2 {
    public static void main(String[] args) {
        List<Integer> listInt = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listInt.add((int) (Math.round(Math.random() * 89) +10));
        }
        System.out.println("Mảng hiện tại là:");
        for (Integer in:listInt){
            System.out.print(in + " ");
        }
        System.out.println();
        System.out.println("Mảng đảo lại là:");
        for (int i = listInt.size() -1; i >= 0; i--) {
            System.out.print(listInt.get(i) + " ");
        }
    }
}
