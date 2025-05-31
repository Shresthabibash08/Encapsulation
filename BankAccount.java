public class BankAccount {
    private String AccountNumber;
    private String accountHolderName;
    private double balance;
    public double amount;
    public BankAccount(String AccountNumber,String accountHolderName,double balance){
        this.AccountNumber=AccountNumber;
        this.accountHolderName=accountHolderName;
        this.balance=balance;
    }
    public void deposit(String AccountNumber,double amount){
        if(amount>0){
            balance+=amount;
        }
        else{
            System.out.println("Invalid amount!!");
        }
    }
}
class Action{
    public static void main(String[]args){
        BankAccount acc1=new BankAccount("1","Bibash",100000);
        
    }
}
