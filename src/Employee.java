public class Employee extends Person {
    private String position;
    private double salary;



    public Employee(String name, String surname, String position, double salary){
        super(name, surname);
        this.position = position;
        this.salary = salary;

    }

    public double getPaymentAmount(){
        return salary;
    }


    @Override
    public String toString() {
        return "Employee: " +
                super.getId() + ". " +
                super.getName() + " " +
                super.getSurname() +
                " earns " + getPaymentAmount() + " tenge";
    }
}

