package ThisLibrary.Classes;

import ThisLibrary.Interfaces.IBreathable;

public class Lungs implements IBreathable {

    public String cough(boolean flag){
        return flag == true?"kgh-kgh":"...";
    }

    @Override
    public void live() {
        System.out.println("It is not coronaTime");
    }

    @Override
    public void breath(int time) {
        var useableTime =(float)(time/2);
        System.out.println("breath in: "+ useableTime + " breath out: "+ useableTime );
    }
}
