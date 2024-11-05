package Week7.EX3;

public class Postgraduated extends Student implements ICumlaude, IAchievers { 
    public Postgraduated(String name) {
        super(name);
    }

    @Override
    public void winTheCompetition() {
        System.out.println("I have won an INTERNATIONAL competition");
    }

    @Override
    public void publishTheJournal() {
        System.out.println("I publish articles in INTERNATIONAL journals");
    }
}
