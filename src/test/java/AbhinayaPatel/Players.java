package AbhinayaPatel;

public class Players {
    void countplayers() {
        String s = "Dani Carvajal, David Alaba, Trent Alexander-Arnold, Raul Asencio, Alvaro Carreras, Fran Garcia, ‍Antonio Rudiger, Ferland Mendy, Dean Huijsen, David Jimenez.";

        String[] arr= s.split(",");

        System.out.println("players count:"+arr.length);
    }
    public static void main(String[] args) {
        Players p = new Players();
        p.countplayers();
    }
}
