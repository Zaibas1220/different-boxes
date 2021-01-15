package boxes;

import java.util.ArrayList;
import java.util.Collection;

public class OneThingBox extends Box{
    private Collection<Thing> things;

    public OneThingBox() {
        things = new ArrayList<>();
    }

    @Override
    public void add(Thing thing) {
        if (things.isEmpty()) {
            things.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return things.contains(thing);
    }
}
