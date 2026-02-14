package AbhinayaPatel;

public class DivisibleBy5And25 {
    public static void main(String[] args){
        int count=0;
        for(int i=1;i<=1000;i++){
            if(i%5==0 && i%25==0)
                count++;
        }
        System.out.println(" Numbers Divisible by 5 & 25 :" +count);
    }
}
