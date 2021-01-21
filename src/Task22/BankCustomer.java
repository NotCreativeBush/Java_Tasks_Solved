package Task22;

public class BankCustomer {
    protected Person person;
    protected Account account;

    public BankCustomer(Person p) {
        person = p;
        account = new Account();
    }

    public Account getAccount() {
        return account;
    }

    @Override
    public String toString() {
        return "Customer: " + person.toString() + ", balance: " + account.toString();
    }
}
