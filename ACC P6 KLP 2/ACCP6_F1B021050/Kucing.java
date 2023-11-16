package ResponP6;

class Kucing extends Hewan {
    Kucing(String nama){
        super(nama);
    }

    @Override
    void makan() {
        System.out.println(nama +" makan tulang!");
        System.out.println(nama +" juga makan daging!");
    }
    
}
