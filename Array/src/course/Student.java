package course;

public class Student { // a class named Student
    private String firstName; // See Teacher class for reference
    private String lastName; // See Teacher class for reference
    private double gpa; // an instance variable of type double to keep track of student GPA
    private int numCreditsGained;   // an instance variable of type int to keep
    // track of the number of credits gained by this student

    // Student constructor
    public Student(String firstName, String lastName, double gpa, int numCreditsGained) {
        this.setFirstName(firstName);   // Example of using a setter method to set the instance variables
        this.setLastName(lastName);     // See Teacher constructor for an alternate way of
        // assignment instance variables
        this.setGpa(gpa);
        this.setNumCreditsGained(numCreditsGained);
    }

    public String getFirstName() { // Getter method
        return firstName;
    }

    public void setFirstName(String firstName) { // Setter method
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getNumCreditsGained() {
        return numCreditsGained;
    }

    public void setNumCreditsGained(int numCreditsGained) {
        this.numCreditsGained = numCreditsGained;
    }
}

