package cindodcindy.sirihpinang.usingdagger;

public class Senjata {

    String namaPedang;
    String namaTombak;

    public Senjata(String namaPedang, String namaTombak){
        this.namaPedang=namaPedang;
        this.namaTombak=namaTombak;
    }

    String pedang(){
        return namaPedang;
    }

    String tombak(){
        return  namaTombak;
    }
}
