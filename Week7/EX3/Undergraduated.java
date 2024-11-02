package Week7.EX3;

public class Undergraduated extends Student implements ICumlaude{

    public Undergraduated (String name){
        super(name);
    }

    @Override
    public void graduate(){
        System.out.println("I have finised the thesis for Undergraduated");
    }

    @Override
    public void getHighGPA(){
        System.out.println("My GPA is more than 3,51");
    }
}
