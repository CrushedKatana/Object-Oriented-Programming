package Week8.Assigment;

public class JumpingZombie extends Zombie {
    public JumpingZombie(int health, int level) {
        super(health, level);
    }

    @Override
    public void heal() {
        switch (level) {
            case 1 -> health += health * 0.30;
            case 2 -> health += health * 0.40;
            case 3 -> health += health * 0.50;
        }
    }

    @Override
    public void destroyed() {
        health -= health * 0.01; // Reduces health by 1% each time
    }

    @Override
    public String getZombieInfo() {
        return "Jumping Zombie:\n" + super.getZombieInfo();
    }
}

