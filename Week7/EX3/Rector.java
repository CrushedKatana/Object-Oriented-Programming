package Week7.EX3;

public class Rector {

    public void giveCumlaudeCertificate(Student student) {
        System.out.println("I am a Rector, give a Cumlaude Certificate");
        System.out.println("Congratulations! Please introduce yourself..");

        student.studyInCampus();

        if (student instanceof ICumlaude) {
            ICumlaude cumlaudeStudent = (ICumlaude) student;
            cumlaudeStudent.graduate();
            cumlaudeStudent.getHighGPA();
        } else {
            System.out.println("My GPA is 3,1");
        }

        System.out.println("-----------------------------------------------");
    }

    // Fixed method name and corrected spelling in the method
    public void giveCertificateOfTopStudent(IAchievers student) {
        System.out.println("I am a Rector, give a Certificate of Top Student.");
        System.out.println("Congratulations! How you can get achievement?");
        
        
        student.winTheCompetition();
        student.publishTheJournal(); // Corrected method name
        
        System.out.println("-----------------------------------------------");
    }
}

