package Week2.Asssigment;

public class RentGame {
    int id;
    String memberName;
    String gameName;
    double pricePerDay;
    int rentDuration;

    public double calculateAmount() {
        return pricePerDay * rentDuration;
    }

    public void displayData() {
        System.out.println("ID: " + id);
        System.out.println("Member Name: " + memberName);
        System.out.println("Game Name: " + gameName);
        System.out.println("Price per Day: " + pricePerDay);
        System.out.println("Rent Duration: " + rentDuration + " days");
        System.out.println("Total Amount to Pay: " + calculateAmount());
    }
}
