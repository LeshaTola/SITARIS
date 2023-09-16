package ThisLibrary.Classes;

import ThisLibrary.AClasses.Plant;

public class Oak extends Plant {
    public boolean getAcorn(float chance){
        return chance> 80? true:false;
    }
}
