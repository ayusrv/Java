package course;

public class Main {


    /**
     * This is the program entry point
     */
    public static void main(String[] args) {
        Student studentJohn = new Student("John", "Doe", 3.25, 12); // new-up a Student object, named John
        Student studentJane = new Student("Jane", "Doe", 3.58, 9); // new-up a Student object, named Jane
        Teacher coscTeacher = new Teacher("Tom", "Arenivas"); // new-up a Teacher object, named Tom

        // new-up an Assignment object for the Java course
        // Assignment name: Programming Assignment 1
        // Assignment Category: Assignment
        // # of points possible: 100
        // Difficulty rating: 5.0
        Assignment programmingAssignment1 =
                new Assignment("Programming Assignment 1", "Assignment", 100, 5.0);

        // new-up an Assignment object for the Java course
        // Assignment name: Programming Assignment 2
        // Assignment Category: Assignment
        // # of points possible: 100
        // Difficulty rating: 7.5
        Assignment programmingAssignment2 =
                new Assignment("Programming Assignment 2", "Assignment", 100, 7.5);

        // new-up an Assignment object for the Java course
        // Assignment name: Quiz 1
        // Assignment Category: Quiz
        // # of points possible: 200
        // Difficulty rating: 7.5
        Assignment quiz1 = new Assignment("Quiz 1", "Quiz", 200, 7.5);

        // new-up an Assignment object for the Java course
        // Assignment name: Exam 1
        // Assignment Category: Exam
        // # of points possible: 400
        // Difficulty rating: 9.5
        Assignment exam1 = new Assignment("Exam 1", "Exam", 400, 9.5);

        // new-up an Assignment object for the Java course
        // Assignment name: Exam 2
        // Assignment Category: Exam
        // # of points possible: 400
        // Difficulty rating: 10.0
        Assignment exam2 = new Assignment("Exam 2", "Exam", 400, 10.0);

        // new-up an Assignment object for the Java course
        // Assignment name: Final Exam
        // Assignment Category: Final Exam
        // # of points possible: 1,000
        // Difficulty rating: 10.0
        Assignment finalExam = new Assignment("Final Exam", "Final Exam", 1000, 10.0);

        // Create a Student array. We insert John and Jane into this list. They will
        // be students of the Java 1 course.
        Student[] studentList = new Student[] {
                studentJane,
                studentJohn
        };

        // Create an Assignment Array. We insert the programming assignments, quizzes, exams and final exam
        // into this list. These assignments will be a part of the Java 1 course.
        Assignment[] assignmentList = new Assignment[]{
                programmingAssignment1,
                programmingAssignment2,
                quiz1,
                exam1,
                exam2,
                finalExam
        };

        // Create a new CollegeCourse object. This object represents the java 1 course.
        // We pass in, as arguments into the constructor, the:
        //      1. List of students
        //      2. Teacher
        //      3. List of assignments
        //      4. Course Number
        //      5. Number of credits for this course
        //      6. Difficulty rating (this is an arbitrary metric)

        CollegeCourse java1Course = new CollegeCourse(studentList, coscTeacher, assignmentList, 701, 3, 7.5);

        // Print the details of the Java 1 course object that we created
        System.out.println("Java 1 Course - " + java1Course.getCourseNumber());
        System.out.println("------------------------------------------");
        System.out.println("Required for degree: " + CollegeCourse.IS_REQUIRED_FOR_DEGREE);
        System.out.println("Instructor: " + java1Course.getTheTeacher().getFirstName() + " " + java1Course.getTheTeacher().getLastName());

        // Loop through all the students of this course and print their names
        System.out.println("Student List:");
        for(int i = 0; i < java1Course.getTheStudents().length; ++i) {
            Student currentStudent = java1Course.getTheStudents()[i];
            System.out.println("\tStudent #" + (i+1) + ": " + currentStudent.getFirstName() + " " + currentStudent.getLastName());
        }

        // Loop through all of the assignments for this course and print the assignment name, type, and the number of points possible
        System.out.println("Assignment List:");
        for(int i = 0; i < java1Course.getTheAssignments().length; ++i) {
            Assignment currentAssignment = java1Course.getTheAssignments()[i];
            System.out.println("\tAssignment #" + (i+1) + ": " + currentAssignment.getAssignmentName() + " " + currentAssignment.getAssignmentType() + " Points possible: " + currentAssignment.getNumPointsPossible());
        }
    }
}
