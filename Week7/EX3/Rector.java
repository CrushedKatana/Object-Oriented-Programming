package Week7.EX3;

public class Rector {

    public void giveCumlaudeCertificate(ICumlaude student) {
        System.out.println("I am a Rector, give a Cumlaude Certificate");
        System.out.println("Congratulations! Please introduce yourself..");

        // Check if the student is an instance of Student to call studyInCampus()
        if (student instanceof Student) {
            ((Student) student).studyInCampus();
        }

        student.graduate();
        student.getHighGPA();
        System.out.println("-----------------------------------------------");
    }
}

