package AbhinayaPatel;

public class Primesum {
    public static void main(String[] args){
        int sum =0;
        for (int i=2;i<=100; i++){
            int count =0;
        for (int j=1; j<=i; j++)
            if(i%j==0)
                count++;
        if (count==2)
            sum+=i;
        }
        System.out.println("Sum of prime numbers="+sum);
    }
}
