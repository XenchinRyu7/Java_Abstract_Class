public abstract class Manusia {
    String charac;
    public abstract void berdiri();

    public void oksigen(){
        System.out.println("-Butuh Makanan");
        System.out.println("- Butuh Oksigen");
        System.out.println("- Butuh Air");
    }

    public Manusia(String charac){
        this.charac = charac;
    }
}
