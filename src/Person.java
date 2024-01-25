
public class Person implements Payable{
    private int id;
    private String name;
    private String surname;

    private static int nextId = 1;

    public Person(String name, String surname){
        this.name = name;
        this.surname = surname;
        this.id = nextId;

        nextId++;
    }

    @Override
    public double getPaymentAmount() {
        return 0.0;
    }

    public int getId() {
        return id;
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public void setName(String name, int id, String surname) {
        this.name = name;
        this.id = id;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}

