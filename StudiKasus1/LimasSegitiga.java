package StudiKasus1;

public class LimasSegitiga extends BangunRuang {

    public LimasSegitiga(double alas, double tinggiLimas) {
        this.alas = alas;
        this.tinggi = tinggiLimas;
    }

    public double hitungVolume() {
        return 0.333 * (0.5 * alas * tinggi);
    }
}

