package bank;

public class CheckingAccount extends Account implements OnlineFunctionality, Transactionable{

    private int debitCard;

    public CheckingAccount(long balance,String owner ,int debitCard){
        super(balance,owner);
        this.debitCard = debitCard;
    }

    public void setDebitCard(int debitCard){
        this.debitCard = debitCard;
    }

    public int getDebitCard(){
        return debitCard;
    }

    public void withdraw(long amount){
        setBalance(getBalance()-amount);
    }

    public void deposit(long amount){
        setBalance(getBalance()+amount);
    }

    @Override
    public void withdraw() {

    }

    @Override
    public void deposit() {

    }

    @Override
    public String login() {
        return "";
    }

    @Override
    public String logout() {
        return "";
    }


//    public void deposit(long amount){
//        super.deposit(amount);
//    }
}
