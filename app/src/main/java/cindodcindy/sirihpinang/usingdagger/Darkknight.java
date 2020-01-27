package cindodcindy.sirihpinang.usingdagger;

import javax.inject.Inject;

public class Darkknight {


    // use dagger

    @Inject
    public Darkknight(){

    }

    private Senjata senjata;

    public Darkknight(Senjata senjata){
        this.senjata=senjata;

    }

    public String setEquimpent(){
        return "'Dark Knight menggunakan senjata " + senjata.pedang();
    }
}
