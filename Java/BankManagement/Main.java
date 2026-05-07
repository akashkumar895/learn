package Java.BankManagement;

public class Main {
    public static void main(String[] args) {
        AccountCreation newAccount = new AccountCreation("Jack", 50, 10_00_000, true);
        newAccount.getDetails();
        if (EligibleTaxes.checkEligiblity(newAccount.getAmount())) {
            System.out.println("Congratulations");
        } else {
            System.out.println("You are ineligible");
        }
    }
}