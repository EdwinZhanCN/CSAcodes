import java.util.ArrayList;

public class bankAccount {
    private int balance;
    private final String accountHolder;
    private final int accountNumber;
    private ArrayList<String> transactions = new ArrayList<>();

    public bankAccount(int balance, String accountHolder){
        this.balance = balance;
        this.accountHolder = accountHolder;
        this.accountNumber = (int)(Math.random()*5000);
    }

    public bankAccount(String accountHolder){
        this.accountHolder = accountHolder;
        this.balance = 0;
        this.accountNumber = (int)(Math.random()*5000);
    }


    public boolean withdraw(int withdraw){
        if(balance - withdraw >= 0){
            balance  -= withdraw;
            transactions.add("-" + withdraw);
        }else {
            return false;
        }
        return true;
    }

    public int getBalance() {
        return balance;
    }

    public String getInfo(){
        return "Account Name: " + accountHolder +
                "\nBalance: " + balance +
                "\nAccount Number: " + accountNumber;
    }

    public boolean deposit(int deposit){
        balance += deposit;
        transactions.add("+" + deposit);
        return true;
    }

    public ArrayList<String> getTransactions() {
        return transactions;
    }
}

