package Module0.bai6;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class Account {
    private long accountNubmer;
    private String name;
    private double balance;
    private final double rate = 0.035;

    public Account(long accountNubmer, String name, double balance) {
        this.accountNubmer = accountNubmer;
        this.name = name;
        this.balance = balance;
    }

    public Account() {
        accountNubmer = 999999;
        name = "";
        balance = 50000;
    }

    public Account(long accountNubmer, String name) {
        this.accountNubmer = accountNubmer;
        this.name = name;
    }

    public long getAccountNubmer() {
        return accountNubmer;
    }

    public double getBalance() {
        return balance;
    }
    public boolean deposit (double amount) throws Exception {
        if(amount > 0){
            this.balance += amount;
            return true;
        }
        throw new Exception("invalid value!");
    }
    public boolean withdraw (double amount, double fee) throws Exception {
        if(amount > 0 && (amount + fee)<=balance){
            balance = balance - (amount+fee);
        }
        throw new Exception("not enough balance");
    }
    public double addINterest(){
        return balance = balance+balance*rate;
    }
    public boolean transfer (Account dest, double amount) throws Exception {
        if(amount <= this.balance && amount >0){
            this.balance = this.balance - amount;
            dest.balance= dest.balance + amount;
            return true;
        }
        throw new Exception("invalid amount");
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        String bal = df.format(getBalance())+"VND";
        return "Account{" +
                "accountNubmer=" + accountNubmer +
                ", name='" + name + '\'' +
                ", balance=" + bal +
                ", rate=" + rate +
                '}';
    }
}
