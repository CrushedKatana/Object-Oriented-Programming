package Week3.Assigment;

import java.util.Scanner; 

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Member donny = new Member("111333444", "Donny", 5000000);

        System.out.println("Member name: " + donny.getName());
        System.out.println("Loan Limit: " + donny.getLoanLimit());

        System.out.println("\nEnter the loan amount you want to borrow: ");
        int loanAmount = scanner.nextInt();
        donny.borrow(loanAmount);
        System.out.println("Current loan amount: " + donny.getLoanAmount());

        System.out.println("\nEnter the installment amount you want to pay: ");
        int installmentAmount = scanner.nextInt();
        donny.installments(installmentAmount);
        System.out.println("Current loan amount: " + donny.getLoanAmount());

        scanner.close();
    }
}
