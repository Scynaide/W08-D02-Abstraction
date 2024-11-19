package bank;

// an abstract class is a class that cannot be instantiated
public abstract class Account {

    private long balance;
    private String owner;

    public Account(long balance, String owner){
        this.balance = balance;
        this.owner = owner;
    }

    public void setBalance(long balance){
        this.balance = balance;
    }

    public void setOwner(String owner){
        this.owner = owner;
    }

    public String getOwner(){
        return owner;
    }

    public long getBalance(){
        return balance;
    }

    abstract void deposit(long amount);
//    abstract method: method in abstract class that NEEDS to be implemented in all child classes
//    abstract method is like a contract

    abstract void withdraw(long amount);

}
