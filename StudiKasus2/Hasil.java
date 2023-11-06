package StudiKasus2;

public class Hasil {
    public static void main(String[] args) {
        BangunDatar lingkaran = new Lingkaran(6.0);
        BangunDatar trapesium = new Trapesium(5.0, 4.0, 7.0);
        BangunDatar jajarGenjang = new JajarGenjang(3.0, 10.0);

        double luasLingkaran = lingkaran.hitungLuas();
        double luasTrapesium = trapesium.hitungLuas();
        double luasJajarGenjang = jajarGenjang.hitungLuas();

        System.out.println("Luas Lingkaran: " + luasLingkaran);
        System.out.println("Luas Trapesium: " + luasTrapesium);
        System.out.println("Luas Jajar Genjang: " + luasJajarGenjang);
    }
}

