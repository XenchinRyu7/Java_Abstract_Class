public class Hewan extends MakhlukHidup {
    private String duaKaki;
    private String empatKaki;
    public Hewan(String empatKaki, String duaKaki){
        this.empatKaki = empatKaki;
        this.duaKaki = duaKaki;
    }
    public void berdiri() {
        System.out.println("Hewan berdiri dengan : " + empatKaki);
        System.out.println("Hewan berdiri dengan : " + duaKaki);
    }
}
