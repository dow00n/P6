class Mobil {
    String nama;

    Mobil(String nama) {
        this.nama = nama;
    }

    void info() {
        System.out.println("Nama= " + nama);
    }
}

class Mobil1 extends Mobil {
    String warna;

    Mobil1(String nama, String warna) {
        super(nama);
        this.warna = warna;
    }

    @Override
    void info() {
        super.info();
        System.out.println("Warna= " + warna);
    }
}

class Mobil2 extends Mobil {
    int kapasitas;

    Mobil2(String nama, int kapasitas) {
        super(nama);
        this.kapasitas = kapasitas;
    }

    @Override
    void info() {
        super.info();
        System.out.println("Kapasitas= " + kapasitas);
    }
}

public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("ayla");
        mobil1.info();

        Mobil1 mobil3 = new Mobil1("pajero", "putih");
        mobil3.info();

        Mobil2 mobil4 = new Mobil2("bmw", 4);
        mobil4.info();
}
}