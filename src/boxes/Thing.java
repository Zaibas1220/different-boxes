package boxes;

import java.util.Objects;

public class Thing{
    private String name;
    private int weight;

    public Thing(String name, int weight) {
        this.name = name;
        if (weight < 0) {
            throw new IllegalArgumentException("It can't be negative");
        } else {
            this.weight = weight;
        }
    }

    public Thing(String name) {
        this.name = name;
        this.weight = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\nWeight: " + this.weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Thing)) return false;
        Thing thing = (Thing) o;
        return Objects.equals(name, thing.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
