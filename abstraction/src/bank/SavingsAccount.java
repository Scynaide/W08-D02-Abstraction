package bank;

public class SavingsAccount extends Account {

    private int interestRate;

    public SavingsAccount(long balance, String owner, int interestRate){
        super(balance,owner);
        this.interestRate = interestRate;
    }


    public void deposit(long amount) {
        setBalance(getBalance()+amount);
    }

//    concrete methods
    public void withdraw(long amount) {
        if(getBalance() - amount <0){
            System.out.println("Cannot go below zero on savings account current balance is $" + getBalance());
        }
        else{
            setBalance(getBalance()-amount);
        }
    }

}
