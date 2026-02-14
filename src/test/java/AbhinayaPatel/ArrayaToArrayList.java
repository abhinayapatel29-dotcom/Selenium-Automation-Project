package AbhinayaPatel;

import java.util.ArrayList;

public class ArrayaToArrayList {
    void convert(){
        int[] arr={10,20,30,40,50};
        ArrayList<Integer> List =new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            List.add(arr[i]);
        }
        System.out.println(List);
    }
    public static void main(String[] args) {
        ArrayaToArrayList AA=new ArrayaToArrayList();
        AA.convert();
    }
}
