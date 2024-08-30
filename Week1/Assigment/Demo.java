package Assigment;

public class Demo {    
    public static void main(String[] args) {
        Mouse mouse = new Mouse("Logitech", 110.5, 3);  // Updated to use weight
        Keyboard keyboard = new Keyboard("Corsair", "75%", true);
        GamingMouse gamingMouse = new GamingMouse("Razer", 55.0, 8, true); // Updated to use weight

        mouse.click();
        mouse.scroll();
        mouse.showInfo();

        keyboard.type();
        keyboard.backlightOn();
        keyboard.showInfo();

        gamingMouse.click();
        gamingMouse.toggleRGB();
        gamingMouse.showInfo();
    }
}
