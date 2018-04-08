package praktek03;

public class Sendal {
    private String merek;
    private String warna;
    private double harga;
    
    void cetakInfo(){
        System.out.println("Merek \t: "+merek+"\n"+
                "Warna \t: "+warna+"\n"+
                "Harga \t:"+harga);
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    
}
