package AbhinayaPatel;

public class CommonArray {
    public static void main(String[] args){
        int[] a={1,2,3,4,5};
        int[] b={6,7,10,5,8};
        int count=0;
        for(int i=0; i<a.length; i++) {
            for (int j=0;j<b.length; j++) {
                if (a[i]==b[j]) {
                    System.out.println("Common elements:");
                    System.out.println(a[i]);
                    count++;
                }
            }
        }
        if (count==0){
            System.out.println("No common elements");}
    }
}
