package Week8;

public class Tester3 {
    public static void main(String[] args) {
        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);
        InternshipEmployee iEmp = new InternshipEmployee("Sunarto", 5);
        ElectricityBill eBill = new ElectricityBill(5, "A-1");
        Employee[] e1 = {pEmp, iEmp};
        Payable[] p1 = {pEmp, eBill};
        Employee[] e2 = {pEmp, iEmp, eBill}; // eBill is not an Employee
    }
}
