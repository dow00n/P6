package StudiKasus1;

public class Hasil {
    public static void main(String[] args) {
        BangunRuang limas = new LimasSegitiga(6.0, 8.0);
        BangunRuang prisma = new PrismaSegiEmpat(5.0, 4.0, 7.0);
        BangunRuang tabung = new Tabung(3.0, 10.0);

        double volumeLimas = limas.hitungVolume();
        double volumePrisma = prisma.hitungVolume();
        double volumeTabung = tabung.hitungVolume();

        System.out.println("Volume Limas Segitiga: " + volumeLimas);
        System.out.println("Volume Prisma Segi Empat: " + volumePrisma);
        System.out.println("Volume Tabung: " + volumeTabung);
    }
}

