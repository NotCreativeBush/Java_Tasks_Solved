package Task22;

public class Account {
    protected double balance;
    protected static double interest;
    public void deposit(double d){
        balance+=d;
    }
    public void withdraw(double d){
        balance-=d;
    }
    public void transfer(Account account, double d){
        balance-=d;
        account.deposit(d);
    }
    public void addInterest(){
        balance+=(balance*interest/100);
    }
    public static void setInterestRate(double d){
        interest=d;
    }
    public Account(){
        balance=0;
    }
    @Override
    public String toString(){
        return balance+"";
    }
}
