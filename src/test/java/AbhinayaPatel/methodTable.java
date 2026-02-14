package AbhinayaPatel;

public class methodTable {
    void Table(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num+"*"+ i +"="+(num*i));
        }
    }
    public static void main(String[] args) {
         methodTable mt = new methodTable();
         mt.Table(2);

    }
}