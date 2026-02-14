package AbhinayaPatel;

import java.util.HashSet;

public class HashsetToArray {
    void convert() {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(20);
        set.add(30);

        Integer[] arr = new Integer[set.size()];
        int i = 0;
        for (Integer x : set) {
            arr[i] = x;
            i++;
        }
        for (Integer x : arr) {
            System.out.println(x + "");
        }
    }
    public static void main(String[] args) {
        HashsetToArray HA=new HashsetToArray();
        HA.convert();
    }
}
