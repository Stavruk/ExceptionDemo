public class Main {
    public static void main(String[] args) {
        Person myPerson = new Person("First", "Last", 12);
        try {
            myPerson.setAge(33);
            myPerson.setAge(12);
            myPerson.setAge(10);
            myPerson.setAge(1001);
        } catch (InvalidAgeException e) {
            e.print();
        }
    }
}
