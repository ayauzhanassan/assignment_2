public class Student extends Person {
    private double gpa;

    public Student(String name, String surname, double gpa){
        super(name, surname);
        this.gpa = gpa;
    }

    @Override
    public double getPaymentAmount() {
        if (gpa > 2.67){
            return 36600.0;
        }
        else{
            return 0.0;
        }
    }

    @Override
    public String toString() {
        return "Student: " + super.getId() + ". " +
                 super.getName() + " " +
                 super.getSurname() +
                " earns " + getPaymentAmount() + " tenge";
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

}

