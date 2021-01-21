package Task22;

public class Person {
    protected String name;
    protected int birthYear;

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public Person(String name) {
        this.name = name;
        this.birthYear = 1990;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public boolean isFemale() {
        return (name.charAt(name.length() - 1) == 'a');
    }

    public static Person getOlder(Person p1, Person p2) {
        if (p1.getBirthYear() < p2.getBirthYear()) {
            return p1;
        }
        return p2;
    }

    public boolean isYounger(Person p2) {
        return (this.birthYear > p2.getBirthYear());
    }

    public static Person getOldest(Person[] arr) {
        Person ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (ans.getBirthYear() > arr[i].getBirthYear()) {
                ans = arr[i];
            }
        }
        return ans;
    }

    public static Person getYoungestFemale(Person[] arr){
        Person ans=null;
        for(Person x : arr){
            if(x.isFemale() && (ans==null||x.getBirthYear()> ans.birthYear)){
                ans=x;
            }
        }
        return ans;
    }

    @Override
    public String toString(){
        return name+" "+birthYear;
    }










}
