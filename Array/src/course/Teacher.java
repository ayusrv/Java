package course;

public class Teacher { // This is a class named Teacher

    private String firstName; // This is an instance variable of type String
    private String lastName; // This is an instance variable of type String

    public Teacher(String firstName, String lastName) { // This is the constructor, it has 2 parameters
        this.firstName = firstName; // assign instance variables from local variables
        this.lastName = lastName; // assign instance variables from local variables
    }

    // a method to get the first name of this object
    public String getFirstName() { // an accessor method (sometimes called a getter)
        return firstName;
    }

    // a method to get the last name of this object
    public void setFirstName(String firstName) { // a setter method (sometimes called a setter)
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}