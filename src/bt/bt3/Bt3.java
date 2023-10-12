package bt.bt3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bt3 {
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
        System.out.println("Mảng sau khi sắp xếp lại là:");
        Collections.sort(listInt);
        for (Integer in:listInt){
            System.out.print(in + " ");
        }
    }
}
