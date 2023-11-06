package StudiKasus2;

public class Lingkaran extends BangunDatar {
    public Lingkaran(double jariJari) {
        this.alas = jariJari * jariJari * 3.14;
        
    }

    
    public double hitungLuas() {
        return alas;
    }
}

