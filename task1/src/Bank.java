import java.util.ArrayList;
import java.util.Vector;

public class Bank {
    private String name ;
    private String address ;
    private String phone ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

   ArrayList<Account> ListOfAccounts=new ArrayList<Account>();
    ArrayList<Client> ListOfClients=new ArrayList<Client>();
    Bank(String for_name,String for_address,String for_phone)
    {
        Account a1=new Account();
        name=for_name;
        address=for_address;
        phone=for_phone;
    }
    void add(Client x)
    {
       ListOfClients.add(x);
       ListOfAccounts.add(x.getAccount());

    }
    void display(int number)
    {
        if (ListOfAccounts.size()!=0)
    {
        for (int i = 0; i < ListOfAccounts.size(); i++)
        {
            System.out.print(ListOfClients.get(i) + " ");
            System.out.println();
            System.out.print(ListOfAccounts.get(i) + " ");
            System.out.println();
        }
    }

    else
    {
        System.out.println("no users yet ");
    }

    }



   boolean withdrawBank( int m,int accNumber)
    {
         for (int i = 0; i < ListOfAccounts.size(); i++)
        {
            if (ListOfAccounts.get(i).getAccountNumber()==accNumber)
            {
                int x= ListOfAccounts.get(i).getBalance();
                if (m>x)
                    return false;
                else
                {
                    ListOfAccounts.get(i).setBalance(x-m);
                    return true;
                }

            }
        }
        return true;
    }
    boolean deposit( int m,int accNumber)
    {
        for (int i = 0; i < ListOfAccounts.size(); i++)
        {
            if (ListOfAccounts.get(i).getAccountNumber()==accNumber)
            {
                if(ListOfAccounts.get(i).getClass());

                int x= ListOfAccounts.get(i).getBalance();
                ListOfAccounts.get(i).setBalance(x+m);
                return true;
            }
        }
        return false;
    }
}
