package Week8;

public class InternshipEmployee extends Employee {
    private int lenght;

    public InternshipEmployee (String name, int lenght){
        this.lenght = lenght;
        this.name = name;
    }
        public int getLenght() {
        return this.lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    @Override
    public String getEmployeeInfo(){
        String info = super.getEmployeeInfo()+"\n";
        info += "Reqistered  as intership employee for "+lenght + "month /s\n";
        return info;
    }
}

