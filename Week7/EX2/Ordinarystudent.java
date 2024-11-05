package Week7.EX2;

public class Ordinarystudent extends Student implements ICumlaude{

    public Ordinarystudent (String name){
        super(name);
    }

    @Override
    public void graduate(){
        System.out.println("I have finised the thesis for Postgraduated");
    }

    @Override
    public void getHighGPA(){
        System.out.println("My GPA is more than 3,1");
    }
}