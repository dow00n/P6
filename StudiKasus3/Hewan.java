package StudiKasus3;

public class Hewan {
    protected String nama;
    protected String jenis;
    protected String makanan;

    public Hewan(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }

    public void info() {
        System.out.println("Nama: " + nama);
        System.out.println("Jenis: " + jenis);
    }

    public void makanan() {
        System.out.println("Makanan : null");
    }
}

