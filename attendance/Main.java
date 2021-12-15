public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[5];
        people[0] = new Person("Oston", 11, 2.0);
        people[1] = new Person("Rong", 11, 2.0);
        people[2] = new Person("Anson", 10, 1.0);
        people[3] = new Person("Hui", 11, 1.0);
        people[4] = new Person("Max", 11, 2.0);
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].name + ": " + people[i].likelyToAttend());
        }
    }
}
