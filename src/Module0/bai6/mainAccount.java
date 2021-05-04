package Module0.bai6;

public class mainAccount {
    public static void main(String[] args) throws Exception {
        Account acc1 = new Account(72354,"Ted Murphy",102.56);
        Account acc2 = new Account(69713,"Jane Smith",40.00);
        Account acc3 = new Account(93757,"Edward Demsey",759.32);
        acc1.deposit(25.85);
        acc2.deposit(500);
        acc2.withdraw(430.75,1.5);
        acc3.addINterest();
    }
}
