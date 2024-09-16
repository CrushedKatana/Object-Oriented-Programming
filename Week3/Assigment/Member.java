package Week3.Assigment;

public class Member {
    private String ktpNumber;
    private String name;
    private int loanLimit;
    private int loanAmount;

    public Member(String ktpNumber, String name, int loanLimit) {
        this.ktpNumber = ktpNumber;
        this.name = name;
        this.loanLimit = loanLimit;
        this.loanAmount = 0; 
    }

    public String getKtpNumber() {
        return ktpNumber;
    }

    public String getName() {
        return name;
    }

    public int getLoanLimit() {
        return loanLimit;
    }

    public int getLoanAmount() {
        return loanAmount;
    }

    public void borrow(int amount) {
        if ((loanAmount + amount) <= loanLimit) {
            loanAmount += amount;
            System.out.println("Loan approved. New loan amount: " + loanAmount);
        } else {
            System.out.println("Sorry, the loan amount exceeds your limit.");
        }
    }

    public void installments(int amount) {
        int minimumInstallment = (int) (0.1 * loanAmount); 

        if (amount < minimumInstallment) {
            System.out.println("Sorry, installments must be at least 10% of the loan amount.");
        } else if (loanAmount - amount >= 0) {
            loanAmount -= amount;
            System.out.println("Installment successful. New loan amount: " + loanAmount);
        } else {
            System.out.println("Sorry, the installment amount is more than your loan.");
        }
    }
}
