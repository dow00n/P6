package StudiKasus3;

public class Mamalia extends Hewan {
    public Mamalia(String nama, String makanan) {
        super(nama, "Mamalia");
        this.makanan = makanan;
    }

    
    public void makanan() {
        System.out.println("Makanan :" + makanan);
    }

    public void menyusui() {
        System.out.println("Mamalia ini menyusui anaknya.");
    }
}

