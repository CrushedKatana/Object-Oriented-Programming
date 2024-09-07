package Week2.Asssigment;

public class TestRentGame {
    public static void main(String[] args) {
        RentGame rent1 = new RentGame();
        rent1.id = 1;
        rent1.memberName = "Agus Kopling";
        rent1.gameName = "FIFA 24";
        rent1.pricePerDay = 5.00;
        rent1.rentDuration = 3;

        rent1.displayData();
    }
}
