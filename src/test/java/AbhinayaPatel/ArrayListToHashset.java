package AbhinayaPatel;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListToHashset {
    void convert(){
        ArrayList<Integer> list= new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(5);
        list.add(20);
        HashSet<Integer> set=new HashSet<>();
        for(int x: list){
            set.add(x);
        }
        System.out.println(set);
    }
    public static void main(String[] args) {
        ArrayListToHashset AH=new ArrayListToHashset();
        AH.convert();
    }
}
