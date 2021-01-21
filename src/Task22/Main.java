package Task22;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Maria", 2000);
        Person p2 = new Person("Bogdan");
        Person johnP = new Person("John", 1989), maryP = new Person("Mary", 2001);
        System.out.println(p1.getName());
        System.out.println(p1.getBirthYear());
        System.out.println(p1.isFemale() + " " + p2.isFemale());
        System.out.println(Person.getOlder(p1, p2));
        System.out.println(p1.isYounger(p2));
        System.out.println(Person.getOldest(new Person[]{p1, p2, johnP, maryP}));
        System.out.println(Person.getYoungestFemale(new Person[]{p1, p2, maryP, johnP}));
        System.out.println(p1.toString() + " " + p2.toString());

        System.out.println();


        BankCustomer john = new BankCustomer(johnP);
        BankCustomer mary = new BankCustomer(maryP);
        john.getAccount().deposit(1000);
        mary.getAccount().deposit(2000);
        john.getAccount().transfer(mary.getAccount(), 500);
        mary.getAccount().withdraw(1000);
        System.out.println(john);
        System.out.println(mary);
        Account.setInterestRate(4.5);
        john.getAccount().addInterest();
        mary.getAccount().addInterest();
        System.out.println(john);
        System.out.println(mary);
    }
}
