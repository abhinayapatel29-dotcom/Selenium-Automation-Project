package AbhinayaPatel;

public class Vowelfind {
    int findVowels(String s) {
        int count = 0;
        String newStr = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (newStr.charAt(i) == 'a' || newStr.charAt(i) == 'e' || newStr.charAt(i) == 'i' ||
                    newStr.charAt(i) == 'o' || newStr.charAt(i) == 'u')
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Vowelfind v = new Vowelfind();
        int ans = v.findVowels("abhi patel");
        System.out.println(ans);
    }
}
