public class BankAccount {
    /*
    Add a field to the BankAccount class named transactionFee for a real number representing an amount of money
    to deduct every time the user withdraws money. The default value is $0.00, but the client can change the value.
    Deduct the transaction fee money during every withdraw call (but not from deposits). Make sure that the balance
    cannot go negative during a withdrawal. If the withdrawal (amount plus transaction fee) would cause it to become
    negative, don’t modify the balance at all.
    */


    String name;
    double balance;
    private double transactonFee = 0.00;

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {

        if (balance - (amount + transactonFee) < 0.00) {
            System.out.println("Amount must not be greater than: $" + balance + " + fee: $" + transactonFee);
        }
        else {
            balance = balance - (amount + transactonFee);
            System.out.println("$" + amount + " Has been withdrawn from your account. The transaction fee was: $" +
                                transactonFee);
        }
    }

    public void setTransactonFee(double transactonFee) {
        this.transactonFee = transactonFee;
    }
}
