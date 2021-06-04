public class Account {
   private int  balance;
   private int  accountNumber;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    Account ()
    {

    }
     public Account (int for_balance, int for_accountNumber)
    {
        balance=for_balance;
        accountNumber=for_accountNumber;
    }
    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", accountNumber=" + accountNumber +
                '}';
    }
    void deposit(int money)
    {
        balance+=money;
    }
    void withdraw(int money)
    {
        if (money<=balance)
        {
            balance-=money;
            System.out.println("done");
        }
        else
        {
            System.out.println("there is no enough money in the account ");
        }
    }
}
