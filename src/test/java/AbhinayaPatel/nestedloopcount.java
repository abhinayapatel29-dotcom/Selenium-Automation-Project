package AbhinayaPatel;

public class nestedloopcount {
    public static void main(String[] args){
        int count=0;
        for(int i=1; i<=3; i++) {
            for (int j =1; j <= 5; j++){
                count++;}
        }
        System.out.println("Total iterations:"+count);
    }
}
