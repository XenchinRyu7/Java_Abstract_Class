abstract class BangunDatar {
    abstract double luas();
    abstract double keliling();
    void tampilLuas(double l){
        System.out.println("Luasnya sebesar " + l);
    }
    static void staticMethod(){
        System.out.println("Static method dapat dipanggil");
    }
}
