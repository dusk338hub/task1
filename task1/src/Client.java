public class Client {
    private String name ;
    private String nationalID;
    private String address ;
    private String phone ;
    public static int numberOfClients;

    Client()
    {
        numberOfClients++;
    }
//    Client( Client x)
//    {
//     name=x.name;
//     nationalID=x.nationalID;
//     address=x.address;
//     phone=x.phone;
//
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationalID() {
        return nationalID;
    }

    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
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

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    private Account account;
    Client(String for_name,String for_nationalID,String for_address,String for_phone,Account for_account)
    {
        numberOfClients++;
        name=for_name;
        nationalID=for_nationalID;
        address=for_address;
        phone=for_phone;
        account=for_account;
    }
    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", nationalID='" + nationalID + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", account=" + account.toString() +
                '}';
    }
}
