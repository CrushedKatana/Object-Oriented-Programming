package Week7.EX2;

public class Program {
    public static void main(String[] args) {
        Rector MrRector =  new Rector();

        Student ordinaryStudent = new Student("Charlie");
        Undergraduated undergraduatedCumlaude = new Undergraduated ("Joe");
        Postgraduated postgraduatedCumlaude = new Postgraduated ("Ben");
        
        MrRector.giveCumlaudeCertificate (ordinaryStudent);
        MrRector.giveCumlaudeCertificate (undergraduatedCumlaude);
        MrRector.giveCumlaudeCertificate (postgraduatedCumlaude);
    } 
}