package boxes;

import java.util.ArrayList;
import java.util.Collection;

public class MaxWeightBox extends Box {
    private int maxWeight;
    private int actualWeight;
    private Collection box;

    public MaxWeightBox(int maxWeight) {
        if (maxWeight < 0) {
            throw new IllegalArgumentException("It can't be negative");
        } else {
            this.maxWeight = maxWeight;
        }
        this.actualWeight = 0;
        this.box = new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing) {
        if (thing.getWeight() > maxWeight - actualWeight) {
            return;
        } else {
            actualWeight += thing.getWeight();
            box.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return box.contains(thing);
    }
}
