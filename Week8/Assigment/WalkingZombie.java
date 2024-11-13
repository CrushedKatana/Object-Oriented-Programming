package Week8.Assigment;

public class WalkingZombie extends Zombie {
    public WalkingZombie(int health, int level) {
        super(health, level);
    }

    @Override
    public void heal() {
        switch (level) {
            case 1 -> health += health * 0.20;
            case 2 -> health += health * 0.30;
            case 3 -> health += health * 0.40;
        }
    }

    @Override
    public void destroyed() {
        health -= health * 0.02; // Reduces health by 2% each time
    }

    @Override
    public String getZombieInfo() {
        return "Walking Zombie:\n" + super.getZombieInfo();
    }
}
