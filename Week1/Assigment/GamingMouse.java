package Assigment;

public class GamingMouse extends Mouse {
    private boolean rgbLighting;

    public GamingMouse(String brand, double weight, int buttonCount, boolean rgbLighting) {
        super(brand, weight, buttonCount);
        this.rgbLighting = rgbLighting;
    }

    public void toggleRGB() {
        System.out.println("RGB Lighting toggled!");
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("RGB Lighting: " + rgbLighting);
    }
}
