package Week7.EX2;

public class Rector {
    public void giveCumlaudeCertificate (ICumlaude student) {
    System.out.println("I am a Rector, give a Cumlaude Certificate");
    System.out.println("Congratulations! Please introduce yourself..");

    student.graduate();
    student.getHighGPA();
    
    System.out.println("-----------------------------------------------");
    }
}
