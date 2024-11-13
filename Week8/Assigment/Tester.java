package Week8.Assigment;

public class Tester {
    public static void main(String[] args) {
        WalkingZombie wz = new WalkingZombie(100, 1);
        JumpingZombie jz = new JumpingZombie(100, 2);
        Barrier barrier = new Barrier(100);

        Plant plant = new Plant();

        System.out.println(wz.getZombieInfo());
        System.out.println(jz.getZombieInfo());
        System.out.println(barrier.getBarrierInfo());
        System.out.println("------");

        plant.doDestroy(wz);
        plant.doDestroy(jz);
        plant.doDestroy(barrier);

        System.out.println("After destruction:");
        System.out.println(wz.getZombieInfo());
        System.out.println(jz.getZombieInfo());
        System.out.println(barrier.getBarrierInfo());

        System.out.println("------");
        wz.heal();
        jz.heal();

        System.out.println("After healing:");
        System.out.println(wz.getZombieInfo());
        System.out.println(jz.getZombieInfo());
    }
}
