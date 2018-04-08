package praktek03;

public class SendalAksi {
    public static void main(String[] args) {
        Sendal s = new Sendal();

        s.setMerek("Crocodile");
        s.setWarna("Hitam");
        s.setHarga(165000);
        
        s.cetakInfo();
    }
}
