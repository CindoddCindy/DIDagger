package cindodcindy.sirihpinang.usingdagger;

import javax.inject.Inject;

public class LightKnight {

    private Senjata senjata;

    public LightKnight (Senjata senjata){
        this.senjata=senjata;

    }

    //use dagger

    @Inject

    public LightKnight(){

    }

    public  String setEquiment(){
        return "Light Knight berperang menggunakan senjata " + senjata.tombak();
    }
}
