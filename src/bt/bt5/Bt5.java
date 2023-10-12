package bt.bt5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bt5 {
    public static void main(String[] args) {
        String str = "    Xin    chào mọi người";
        List<String> newList = new ArrayList<>(Arrays.asList(str.trim().split(" ")));
        String stringMinLength = newList.get(0);
        for (String s : newList) {
            if (!s.isEmpty()){
                if (s.length() < stringMinLength.length()){
                    stringMinLength = s;
                }
            }
        }
        System.out.println("Chữ có độ dài nhỏ nhất trong chuỗi là: " + stringMinLength);
    }
}
