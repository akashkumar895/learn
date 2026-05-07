package Java.BankManagement;

public class AccountCreation {
    private String Name ;
    private int Age;
    private int AnnualIncome;
    private boolean SavingAccount;

    AccountCreation(String Name,int Age,int AnnualIncome,boolean SavingAccount)
    {
        this.Name=Name;
        this.Age=Age;
        this.AnnualIncome=AnnualIncome;
        this.SavingAccount=SavingAccount;
    }
    public void getDetails()
    {
        System.out.println("Details of User:"+this.Name+"\n"+"Age "+Age+" "+AnnualIncome+" "+" "+SavingAccount);
    }
    public int getAmount()
    {
        return AnnualIncome;
    }
}