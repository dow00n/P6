package ResponP6;

public class Main {
    public static void main(String[] args) {
        Kucing kcg = new Kucing("Si Meow");
        Sapi sp = new Sapi("Si Moo");
        Hewan hwn = new Hewan("Seekor hewan");

        hwn.makan();
        kcg.makan();
        System.out.println("==============================");
        sp.makan();
        System.out.println("==============================");
    }
}
