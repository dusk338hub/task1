public class CommercialClient extends Client{
    private String commercialID;
    CommercialClient(String for_name,String for_commercialID,String for_address,String for_phone,Account for_account)
    {
        numberOfClients++;
        setName(for_name);
        setAddress(for_address);
        setPhone(for_phone);
        setCommercialID(for_commercialID);
        setAccount(for_account);
    }

    public String getCommercialID() {
        return commercialID;
    }

    public void setCommercialID(String commercialID) {
        this.commercialID = commercialID;
    }

    @Override
    public String toString() {
        return "CommercialClient{" +
                "name='" + getName() + '\'' +
                ", commercialID='" + commercialID + '\'' +
                ", address='" + getAddress() + '\'' +
                ", phone='" + getPhone() + '\'' +
                ", account=" + getAccount().toString() +
                '}';
    }

}
