package Java.BankManagement;

class EligibleTaxes {
    private static int Amount = 1_00_000;

    public static boolean checkEligiblity(int Amount) {
        if (EligibleTaxes.Amount < Amount)
            return false;
        else
            return true;
    }
}