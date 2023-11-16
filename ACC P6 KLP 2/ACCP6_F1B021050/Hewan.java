package ResponP6;

class Hewan {
    protected String nama;

    Hewan(String nama){
        this.nama=nama;
    }

    void makan(){
        System.out.println("==============================");
        System.out.println(nama +" memakan sesuatu!");
        System.out.println("==============================");
    }
}
