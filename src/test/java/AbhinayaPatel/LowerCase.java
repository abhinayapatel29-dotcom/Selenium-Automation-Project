package AbhinayaPatel;

public class LowerCase {
    public void Convertname(){
        String s1 = "JAIPUBG";
        String Lower = "";
        for (int i=0;i<s1.length();i++) {
            char ch=s1.charAt(i);
            if (ch>=65 && ch<=90) {
                Lower=Lower+(char)(ch+32);
            } else {
                Lower=Lower+ch;
            }
        }
        System.out.println("LowerCase:"+ Lower);
    }
    public static void main(String[] args) {
        LowerCase L = new LowerCase();
        L.Convertname();
    }
}
