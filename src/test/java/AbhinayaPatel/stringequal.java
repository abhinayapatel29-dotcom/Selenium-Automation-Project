package AbhinayaPatel;

public class stringequal{
    void checkEqual(String s1, String s2) {

        if (s1.length() != s2.length()) {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    System.out.println("Strings are NOT equal");
                    return;
                }
            }
        }
        System.out.println("Strings are equal");
    }
    public static void main(String[] args) {
        stringequal se= new stringequal();
        se.checkEqual("jai","pubg" );
    }
}

