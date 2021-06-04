import java.util.Scanner;
public class task {

     public static void main(String[] args) {
// task1
         /*

         System.out.println("Testing class Account");
         Account account1=new Account(2000,25);
         SpecialAccount account2=new SpecialAccount(2000,23);
         System.out.println("getBalance: "+account1.getBalance()+ " AccountNumber: "+account1.getAccountNumber());
         System.out.println("getBalance: "+account2.getBalance()+ " `AccountNumber: "+account2.getAccountNumber());
         account1.setBalance(3000);account1.setAccountNumber(26);
         account2.setBalance(5000);account1.setAccountNumber(28);
         System.out.println("After editing ");
         System.out.println("getBalance: "+account1.getBalance()+ " AccountNumber: "+account1.getAccountNumber());
         System.out.println("getBalance: "+account2.getBalance()+ " `AccountNumber: "+account2.getAccountNumber());
         account1.deposit(200);
         account2.deposit(200);
         System.out.println("After Using deposit  ");
         System.out.println("getBalance: "+account1.getBalance()+ " AccountNumber: "+account1.getAccountNumber());
         System.out.println("getBalance: "+account2.getBalance()+ " `AccountNumber: "+account2.getAccountNumber());
         account1.withdraw(3201);
         account2.withdraw(6200);
         System.out.println(account1.toString());
         System.out.println(account2.toString());

          */

         // task2
         /*
         System.out.println();
         System.out.println("testing class Client");
         Account account1=new Account(2000,25);
         Account account3=new Account(2200,26);
         SpecialAccount account2=new SpecialAccount(2000,23);
         SpecialAccount account4=new SpecialAccount(2200,27);
         Client client1=new Client("ali","301025","haram","0106000000",account1);
         CommercialClient client2=new CommercialClient("ali company ","00000000000000","haram","19000",account2);
         System.out.println("name='" + client1.getName() + '\'' +
                 ", commercialID='" +client1.getNationalID() + '\'' +
                 ", address='" + client1.getAddress() + '\'' +
                 ", phone='" + client1.getPhone() + '\'' +
                 ", account=" + client1.getAccount().toString()
         );
         System.out.println(
                 "name='" + client2.getName() + '\'' +
                         ", commercialID='" +client2.getCommercialID() + '\'' +
                         ", address='" + client2.getAddress() + '\'' +
                         ", phone='" + client2.getPhone() + '\'' +
                         ", account=" + client2.getAccount().toString()
         );
         client1.setName("ahmed");
         client1.setNationalID("60451");
         client1.setAddress("Giza");
         client1.setPhone("010255645856");
         client1.setAccount(account3);
         //////////////////////
         client1.setName("ahmed company");
         client2.setCommercialID("00000000000000");
         client1.setAddress("Giza");
         client1.setPhone("19045");
         client1.setAccount(account4);
         System.out.println();
         System.out.println("After editing ");
         System.out.println("name='" + client1.getName() + '\'' +
                 ", commercialID='" +client1.getNationalID() + '\'' +
                 ", address='" + client1.getAddress() + '\'' +
                 ", phone='" + client1.getPhone() + '\'' +
                 ", account=" + client1.getAccount().toString()
         );
         System.out.println(
                 "name='" + client2.getName() + '\'' +
                 ", commercialID='" +client2.getCommercialID() + '\'' +
                 ", address='" + client2.getAddress() + '\'' +
                 ", phone='" + client2.getPhone() + '\'' +
                 ", account=" + client2.getAccount().toString()
                 );
         System.out.println();
         System.out.println(client1.toString());
         System.out.println(client2.toString());

          */


         // main for class bank
         System.out.println("welcome to bank masr");
         Bank bank1=new Bank("bank masr","cairo","16045");
         int numberOfClients=0;
         Scanner intput=new Scanner(System.in);
         int choice=-1;
         while (true)
         {
             System.out.println("================================");
             System.out.println("1- Add user\n2-Display all users\n3- how to contact us \n4- deposit\n5- withdraw \n6-exit");
             int genral_choice=intput.nextInt();
             if (genral_choice==1)
             {

                 System.out.println("How many users you will add");
                 int x= intput.nextInt();
                 for(int i=0;i<x;i++)
                 {
                     System.out.println("1- Client \n2- CommercialClient");
                     int choice_Clint = intput.nextInt();
                     if (choice_Clint==1)
                     {
                         System.out.println("1- Account \n2-  SpecialAccount");
                         int choiceForAccount=intput.nextInt();
                         System.out.println("================user"+(i+1)+"================");
                         int for_balance,for_accountNumber;
                         System.out.println("please enter the account balance and number for user: "+(i+1));
                         for_balance= intput.nextInt();
                         for_accountNumber= intput.nextInt();
                         if (choiceForAccount==1)
                         {
                             Account account1=new Account(for_balance,for_accountNumber);
                             System.out.println("please enter the account name and nationalID and address and phone  for user: "+(i+1));
                             String for_name=intput.next(), for_nationalID=intput.next(), for_address=intput.next(), for_phone=intput.next();
                             Client client1=new Client(for_name,for_nationalID,for_address,for_phone,account1);
                             bank1.add(client1);
                             System.out.println();
                         }
                         else
                         {
                             SpecialAccount account1=new SpecialAccount(for_balance,for_accountNumber);
                             System.out.println("please enter the account name and nationalID and address and phone  for user: "+(i+1));
                             String for_name=intput.next(), for_nationalID=intput.next(), for_address=intput.next(), for_phone=intput.next();
                             Client client1=new Client(for_name,for_nationalID,for_address,for_phone,account1);
                             bank1.add(client1);
                             System.out.println();
                         }


                         numberOfClients++;
                         System.out.println("================================");
                     }
                     else
                     {
                         System.out.println("1- Account \n2-  SpecialAccount");
                         int choiceForAccount=intput.nextInt();
                         System.out.println("================user"+(i+1)+"================");
                         int for_balance,for_accountNumber;
                         System.out.println("please enter the account balance and number for user: "+(i+1));
                         for_balance= intput.nextInt();
                         for_accountNumber= intput.nextInt();
                         if (choiceForAccount==1)
                         {
                             Account account1=new Account(for_balance,for_accountNumber);
                             System.out.println("please enter the account name and commercialID and address and phone  for user: "+(i+1));
                             String for_name=intput.next(), commercialID=intput.next(), for_address=intput.next(), for_phone=intput.next();
                             Client client1=new CommercialClient(for_name,commercialID,for_address,for_phone,account1);
                             bank1.add(client1);
                         }
                         else
                         {
                             SpecialAccount account1=new SpecialAccount(for_balance,for_accountNumber);
                             System.out.println("please enter the account name and commercialID and address and phone  for user: "+(i+1));
                             String for_name=intput.next(), commercialID=intput.next(), for_address=intput.next(), for_phone=intput.next();
                             Client client1=new CommercialClient(for_name,commercialID,for_address,for_phone,account1);
                             bank1.add(client1);
                         }

                         System.out.println();
                         numberOfClients++;
                         System.out.println("================================");
                     }


                 }
             }
             else if (genral_choice==2)
             {
               bank1.display(numberOfClients);
             }
             else if(genral_choice==3)
             {
                 System.out.println("================================");
                 System.out.println(bank1.getName()+" "+bank1.getAddress()+" "+ bank1.getPhone());
                 System.out.println("================================");
             }
             else if(genral_choice==4)
             {
                 System.out.println("enter account number");
                 int accNum=intput.nextInt();
                 System.out.println("enter the money");
                 int money=intput.nextInt();
                 bank1.deposit(money,accNum);
             }
             else if(genral_choice==5)
             {
                 System.out.println("enter account number");
                 int accNum=intput.nextInt();
                 System.out.println("enter the money");
                 int money=intput.nextInt();
                 if (bank1.withdrawBank(money,accNum))
                     System.out.println("done");
                 else
                 {
                     System.out.println("balance not enough \n" +"please try again\n");
                 }
             }
             else
             {
                 break;
             }

         }
    }
}
