package Week3;

public class Member1 {
    private String name;
    private String address;
    private float deposit;

    Member1 (String name, String address){
        this.name=name;
        this.address=address;
        this.deposit=0;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public float getDeposit(){
        return deposit;
    }
    public void deposit (float money){
        deposit += money;
    }
    public void loan (float money){
        deposit -= money;
    }
}
