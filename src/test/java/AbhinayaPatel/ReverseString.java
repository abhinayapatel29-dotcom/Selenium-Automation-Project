package AbhinayaPatel;

public class ReverseString {
    static void reverse(String s) {

        String reverse = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            reverse = reverse + s.charAt(i);
        }
        System.out.println(reverse);
    }
    public static void main(String[] args) {
        ReverseString rs= new ReverseString();
        reverse("Abbuluu");
    }
}

