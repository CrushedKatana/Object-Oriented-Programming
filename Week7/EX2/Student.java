package Week7.EX2;

public class Student {
    protected String name;
    public Student(String name){
        this.name = name;
    }

    public void studyInCampus(){
        System.out.println("I am a student, my name is " + this.name);
        System.out.println("I student in campus");
    }
}
