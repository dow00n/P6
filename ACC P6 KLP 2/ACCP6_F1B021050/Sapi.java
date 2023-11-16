package ResponP6;

class Sapi extends Hewan{
    Sapi(String nama){
        super(nama);
    }

    @Override
    void makan() {
        System.out.println(nama +" makan rumput!");
        System.out.println(nama +" juga makan jerami!");
    }
}
