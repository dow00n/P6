package fana;
class Kendaraan {
    String jenis;
    String merk;
    int kecepatan;

    Kendaraan(String jenis, String merk, int kecepatan) {
        this.jenis = jenis;
        this.merk = merk;
        this.kecepatan = kecepatan;
    }

    void info() {
        System.out.println("Jenis kendaraan: " + jenis + ", Merk kendaraan: " + merk + ", Kecepatan kendaraan: " + kecepatan);
    }
}

class Mobil extends Kendaraan {
    int pintu;
    String bbm;

    Mobil(String jenis, String merk, int kecepatan, int pintu, String bbm) {
        super(jenis, merk, kecepatan);
        this.pintu = pintu;
        this.bbm = bbm;
    }

    @Override
    void info() {
        // Menghapus variabel lokal dengan nama yang sama seperti variabel kelas
        System.out.println("Jenis mobil: " + jenis + ", Merk mobil: " + merk + ", Kecepatan mobil: " + kecepatan +
                ", Jumlah pintu: " + pintu + ", Bahan bakar: " + bbm);
    }

    void infoKhusus() {
        System.out.println("Piiiiip");
    }
}
class SepedaMotor extends Kendaraan {
    String mesin1;
    String bbm1;

    SepedaMotor(String jenis1, String merk1, int kecepatan1, String mesin1, String bbm1) {
        super(jenis1, merk1, kecepatan1);
        this.mesin1 = mesin1;
        this.bbm1 = bbm1;
    }

    @Override
    void info() {
        System.out.println("Jenis sepeda motor: " + jenis + ", Merk sepeda motor: " + merk + ", Kecepatan sepeda motor: " +
                kecepatan + ", Kapasitas mesin sepeda motor: " + mesin1 + ", Bahan bakar: " + bbm1);
    }

    void khusus() {
        System.out.println("Tiiiiit");
    }
}

public class Fana {
    public static void main(String[] args) {
        Mobil sport = new Mobil("Sport", "Porsche", 200, 2, "Premium");
        SepedaMotor racing = new SepedaMotor("Sport", "Honda", 150, "150cc", "Pertamax");

        sport.info();
        sport.infoKhusus();

        racing.info();
        racing.khusus();
    }
}
