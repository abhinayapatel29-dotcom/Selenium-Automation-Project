package AbhinayaPatel;

public class UpperCase {
    public void ConvertName(){
        String s = "abhipatel";
        String Upper = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 97 && ch <= 122) {
                Upper = Upper + (char) (ch - 32);
            } else {
                Upper = Upper + ch;
            }
        }
        System.out.println("Uppercase:" + Upper);
    }
    public static void main(String[] args) {
        UpperCase U = new UpperCase();
        U.ConvertName();
    }
}
