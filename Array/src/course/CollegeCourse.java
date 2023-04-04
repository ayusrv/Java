package course;

public class CollegeCourse { // a class named CollegeCourse - for example a Java 1 Course
    private Student[] theStudents; // a Student array, used to keep track of the students for this course
    private Teacher theTeacher;     // a Teacher object, used to keep track of the teacher for this course
    private Assignment[] theAssignments;    // an Assignment array, used to keep track of the
    //assignments for this course
    private int courseNumber;
    private int numCredits;
    private double difficultyRating;
    public static final boolean IS_REQUIRED_FOR_DEGREE = true; // a static final variable

    public CollegeCourse(Student[] theStudents, Teacher theTeacher, Assignment[] theAssignments, int courseNumber, int numCredits, double difficultyRating) {
        this.theStudents = theStudents;
        this.theTeacher = theTeacher;
        this.theAssignments = theAssignments;
        this.courseNumber = courseNumber;
        this.numCredits = numCredits;
        this.difficultyRating = difficultyRating;
    }

    public Student[] getTheStudents() {
        return theStudents;
    }

    public void setTheStudents(Student[] theStudents) {
        this.theStudents = theStudents;
    }

    public Teacher getTheTeacher() {
        return theTeacher;
    }

    public void setTheTeacher(Teacher theTeacher) {
        this.theTeacher = theTeacher;
    }

    public Assignment[] getTheAssignments() {
        return theAssignments;
    }

    public void setTheAssignments(Assignment[] theAssignments) {
        this.theAssignments = theAssignments;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public int getNumCredits() {
        return numCredits;
    }

    public void setNumCredits(int numCredits) {
        this.numCredits = numCredits;
    }

    public double getDifficultyRating() {
        return difficultyRating;
    }

    public void setDifficultyRating(double difficultyRating) {
        this.difficultyRating = difficultyRating;
    }
}

