abstract class Pulau{
    static final String NEGARA = "Indonesia";
    public abstract String nama();
    public String ambilNegara(){
        return NEGARA;
    }
}

class Jawa extends Pulau{
    String namap;
    public String nama(){
        namap = "Pulau Jawa";
        return namap;
    }
}

class kalimantan extends Pulau{
    String namap;
    public String nama(){
        namap = "Pulau Kalimantan";
        return namap;
    }
}

class JawaBarat extends Jawa{
    void namaProv(){
        System.out.println("Ini Pulau berada di " + ambilNegara());
        System.out.println("Ini " + nama());
        System.out.println("Ini provinsi Jawa Barat");
        System.out.println("Jumlah penduduk : 232342 Jiwa");
    }
}

class kalimantanTimur extends kalimantan{
    void namaProv(){
        System.out.println("Ini Pulau berada di " + ambilNegara());
        System.out.println("Ini " + nama());
        System.out.println("Ini provinsi Sumatera");
        System.out.println("Jumlah penduduk : 27364 Jiwa");
    }
}

class Utama{
    public static void main(String[] args) {
        JawaBarat JB = new JawaBarat();
        kalimantanTimur KT = new kalimantanTimur();
        JB.namaProv();
        System.out.println("............:P");
        System.out.println("");
        KT.namaProv();
    }
}