package AbhinayaPatel;

public class evencount {
    public static void main(String[] args){
        int count=0;
        for(int i=1;i<=10;i++){
            if(i%2==0){
                System.out.println(i+"is even");
                count++;
            }
        }
        System.out.println("=========");
        System.out.println(count);
    }
}
