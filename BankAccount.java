public class BankAccount {
    private String AccountNumber;
    private String accountHolderName;
    private double balance;
    public double amount;
    public BankAccount(String AccountNumber,String accountHolderName,double balance){
        this.AccountNumber=AccountNumber;
        this.accountHolderName=accountHolderName;
        this.balance=0;
    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Amount deposited successfully");
        }
        else{
            System.out.println("Invalid amount!!");
        }
    }
    public void withdraw(double amount){
        if(amount>balance){
            System.out.println("Insufficient amount");
        }
        else{
            balance-=amount;
            System.out.println("Your amount is withdraw.");
        }
    }
    public void accountDetails(){
        System.out.println("Account Number= "+AccountNumber+" Your name is "+accountHolderName+" Your balance is "+balance);
    }
}
class Action{
    public static void main(String[]args){
        BankAccount acc1=new BankAccount("1","Bibash",100000);
        acc1.deposit(1000);
        acc1.withdraw(100);
        acc1.accountDetails();

    }
}
