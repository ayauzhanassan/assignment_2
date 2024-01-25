import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student("s1", "s11", 1.0);
        Student s2 = new Student("s2", "s22", 2.0);
        Student s3 = new Student("s3", "s33", 3.0);

        Employee e1 = new Employee("e1", "e11", "teacher", 100.0);
        Employee e2 = new Employee("e2", "e22", "teacher", 200.0);
        Employee e3 = new Employee("e3", "e33", "teacher", 300.0);

        ArrayList<Person> people = new ArrayList<>();
        people.add(s1);
        people.add(s2);
        people.add(s3);
        people.add(e1);
        people.add(e2);
        people.add(e3);

        printData(people);


    }

    public static void printData(Iterable<Person> people) {
        for(Person element : people){
            System.out.println(element.toString());
        }
    }
}
