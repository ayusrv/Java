package course;

public class Assignment { // a class named Assignment - an assignment within a course
    private String assignmentName;
    private String assignmentType;
    private int numPointsPossible;
    private double difficultyRating;

    public Assignment(String assignmentName, String assignmentType, int numPointsPossible, double difficultyRating) {
        this.setAssignmentName(assignmentName);
        this.setAssignmentType(assignmentType);
        this.setNumPointsPossible(numPointsPossible);
        this.setDifficultyRating(difficultyRating);
    }

    public String getAssignmentName() {
        return assignmentName;
    }

    public void setAssignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
    }

    public String getAssignmentType() {
        return assignmentType;
    }

    public void setAssignmentType(String assignmentType) {
        this.assignmentType = assignmentType;
    }

    public int getNumPointsPossible() {
        return numPointsPossible;
    }

    public void setNumPointsPossible(int numPointsPossible) {
        this.numPointsPossible = numPointsPossible;
    }

    public double getDifficultyRating() {
        return difficultyRating;
    }

    public void setDifficultyRating(double difficultyRating) {
        this.difficultyRating = difficultyRating;
    }
}

