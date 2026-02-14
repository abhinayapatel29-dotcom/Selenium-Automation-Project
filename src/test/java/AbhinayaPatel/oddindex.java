package AbhinayaPatel;

public class oddindex {
    void oddnumbers(int[]num){
      for (int i=1;i<num.length;i++){
          if(i%2!=0){
            System.out.println(num[i]);
          }
      }
    }
    public static void main(String[] args){
        int[]a={2,29,42,59,77,62,28};
        oddindex od =new oddindex();
        od.oddnumbers(a);
    }
}
