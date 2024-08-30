package Assigment;

public class Mouse {
    private String brand;
    private double weight;
    private int buttonCount;

    public Mouse(String brand, double weight, int buttonCount) {
        this.brand = brand;
        this.weight = weight;
        this.buttonCount = buttonCount;
    }

    public void click() {
        System.out.println("Mouse clicked!");
    }

    public void scroll() {
        System.out.println("Mouse scrolled!");
    }

    public void showInfo() {
        System.out.println("Mouse Brand: " + brand + ", Weight: " + weight + "g, Buttons: " + buttonCount);
    }
}
