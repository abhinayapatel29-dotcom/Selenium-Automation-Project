package AbhinayaPatel;

public class genderbased {
    public static void main(String[] args){
        int age=20;
        char gender='f';
        if ((gender=='m')&&(age>=21))
        {
        System.out.println("Male Eligible for vote");
        }
        if((gender=='f')&&(age>=18)){
            System.out.println("Female Eligible for vote");
        }
        else
        {
            System.out.println("Not Eligible for vote");
        }
    }

}
