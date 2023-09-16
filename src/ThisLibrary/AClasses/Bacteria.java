package ThisLibrary.AClasses;

import ThisLibrary.Interfaces.IFeadable;

public class Bacteria implements IFeadable {

    @Override
    public void live() {
        System.out.println("blop blip blap");
    }

    @Override
    public String eat(String food) {
        return "Tasty "+ food;
    }
}
