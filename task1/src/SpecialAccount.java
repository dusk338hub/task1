public class SpecialAccount extends Account {
    SpecialAccount (int for_balance, int for_accountNumber)
    {
        setBalance(for_balance);
        setAccountNumber(for_accountNumber);
    }
    @Override
    void withdraw(int money) {
        if (getBalance()-money>=-1000)
        {
            setBalance(getBalance()-money);
            System.out.println("done");
        }
        else
        {
            System.out.println("there is no enough money in the account ");
        }
    }
}
