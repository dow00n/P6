package StudiKasus3;

public class Burung extends Hewan {
    public Burung(String nama, String makanan) {
        super(nama, "Burung");
        this.makanan = makanan;
    }

    public void makanan() {
        System.out.println("Makanan : " + makanan);
    }

    public void terbang() {
        System.out.println("Burung ini dapat terbang.");
    }
}

