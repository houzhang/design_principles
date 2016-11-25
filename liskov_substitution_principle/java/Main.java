public class Main {

    public static void main(String[] args) {

        School school1 = new School();
        Person p1 = new Person("Mike");
        school1.start(p1);

        Teacher t1 = new Teacher("Kate");
        School school2 = new School();
        school1.start(t1);
    }
}