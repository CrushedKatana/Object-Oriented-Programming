package Week8.Assigment;

public class Barrier implements Destroyable {
    private int strength;

    public Barrier(int strength) {
        this.strength = strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public void destroyed() {
        strength -= 10; // Decrease strength by 10 on each destruction attempt
    }

    public String getBarrierInfo() {
        return "Barrier Strength: " + strength;
    }
}

