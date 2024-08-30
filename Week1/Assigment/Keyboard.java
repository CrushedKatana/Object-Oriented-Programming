package Assigment;

public class Keyboard {
    private String brand;
    private String layout;
    private boolean isMechanical;

    public Keyboard(String brand, String layout, boolean isMechanical) {
        this.brand = brand;
        this.layout = layout;
        this.isMechanical = isMechanical;
    }

    public void type() {
        System.out.println("Typing on the keyboard!");
    }

    public void backlightOn() {
        System.out.println("Keyboard backlight on!");
    }

    public void showInfo() {
        System.out.println("Keyboard Brand: " + brand + ", Layout: " + layout + ", Mechanical: " + isMechanical);
    }
}

