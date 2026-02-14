package AbhinayaPatel;

import java.util.ArrayList;

public class ArrayListToArray {
    void convert(){
        ArrayList<Integer> list= new ArrayList<>();
        list.add(20);
        list.add(30);
        list.add(40);
        Integer[] arr=list.toArray(new Integer[0]);
        for(int n:arr){
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        ArrayListToArray AL= new ArrayListToArray();
        AL.convert();

    }
}
