package Week3;

public class Motor {
    private public int speed = 0 ;
    private public boolean motorOn=false;

    public void startEngine(){
        motorOn=true;
    }

    public void turnOffEngine(){
        motorOn=F
    }

    public void statusPrint(){
        if (motorOn==true){
            System.out.println("Motor cycle On");
        }else{
            System.out.println("Motorcycle Off");
        }
        System.out.println("Speed: "+ speed+ "\n");
    }

}
