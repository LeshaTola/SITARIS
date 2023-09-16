package ThisLibrary.AClasses;

import ThisLibrary.Interfaces.ISeeable;
import ThisLibrary.Interfaces.IHearable;

public class AI implements ISeeable, IHearable {

    public boolean TellTruth(String s){
        if(s.equals("Am i a gay")){
        return true;
        }
        else{
            return false;
        }
    }

    @Override
    public void live() {
        System.out.println("bip bip bip");
    }

    @Override
    public void hear(String message) {
        System.out.println("My microphone hear "+ message);
    }

    @Override
    public void see(String object) {
        System.out.println("My cameras sees: "+ object);
    }
}
