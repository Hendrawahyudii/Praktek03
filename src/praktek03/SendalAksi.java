package praktek03;

public class SendalAksi {
    public static void main(String[] args) {
        Sendal s = new Sendal();

        s.setMerek("Crocodile");
        s.setWarna("Hitam");
        s.setHarga(165000);
        
        s.cetakInfo();
        
        System.out.print("Mereknya \t: ");
        System.out.println(s.getMerek());
        System.out.print("Warnanya \t: ");
        System.out.println(s.getWarna());
        System.out.print("Harganya \t: ");
        System.out.println(s.getHarga());
    }
}
