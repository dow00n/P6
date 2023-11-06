package StudiKasus3;


public class Klasifikasi {
    public static void main(String[] args) {
        Mamalia singa = new Mamalia("Singa", "Daging");
        Burung elang = new Burung("Merpati", "Kacang");

        System.out.println("Klasifikasi Mamalia:");
        singa.info();
        singa.makanan();
        singa.menyusui();

        System.out.println();

        System.out.println("Klasifikasi Burung:");
        elang.info();
        elang.makanan();
        elang.terbang();
    }
}

