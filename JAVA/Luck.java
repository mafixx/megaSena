package JAVA;

import java.util.ArrayList;
import java.util.Collections;

public class Luck {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i < 61; i++) {
            list.add(Integer.valueOf(i));
        }
        Collections.shuffle(list);
        ArrayList<Integer> megasena = new ArrayList<Integer>(list.subList(0, 6));
        Collections.sort(megasena);
        System.out.println(megasena);
    }
}
