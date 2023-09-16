package ThisLibrary.AClasses;

import ThisLibrary.Interfaces.ISeeable;
import ThisLibrary.Interfaces.IHearable;

public class AI implements ISeeable, IHearable {

    public boolean TellTruth(String s){
        if(s.equals("Yes")){
        return true;
        }
        else{
            return false;
        }
    }

    @Override
    public int live(int a, int b) {
        return a*2+b/2;
    }

    @Override
    public void see(String s1) {

    }

    @Override
    public int hear(int a, int b) {
        return 1000 + a+b;
    }
}
