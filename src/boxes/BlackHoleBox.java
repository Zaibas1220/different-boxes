package boxes;

import java.util.ArrayList;
import java.util.Collection;

public class BlackHoleBox extends Box{
    private Collection<Thing> things;

    public BlackHoleBox() {
        things = new ArrayList<>();
    }

    @Override
    public void add(Thing thing) {
        things.add(thing);
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return false;
    }
}
