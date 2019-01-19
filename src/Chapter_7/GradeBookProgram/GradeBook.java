package ChapterSeven.GradeBookProgram;

/**
 * GradeBook.java
 * GradeBook class using an array to store test grades
 */
public class GradeBook {

    private String course; // name of course this grade book represent
    private int[] grades; // array of student grades

    // constructor
    public GradeBook(String course, int[] grades) {
        this.course = course;
        this.grades = grades;
    }

    // method to set the course name
    public String getCourse() {
        return course;
    }

    // method to retrieve the course name
    public void setCourse(String course) {
        this.course = course;
    }

    // perform various operation on the data
    public void processGrades() {
        // output grades array
        outputGrades();

        // Calling method getAverage to display average grade
        System.out.printf("%nClass average is %.2f%n", getAverage());

        // call method getMinimum and getMaximum
        System.out.printf("Lowest grade is %d%nHighest grade is %d%n%n", getMinimum(), getMaximum());

        // call outputBarChart to print grade distribution chart
        outputBarChart();
    }

    // find minimum grade
    public int getMinimum() {
        int lowGrade = grades[0];

        for (int grade : grades) {
            if (grade < lowGrade) {
                lowGrade = grade;
            }
        }

        return lowGrade;
    }

    // find maximum grade
    public int getMaximum() {
        int highGrade = grades[0];

        for (int grade : grades) {
            if (grade > highGrade)
                highGrade = grade;
        }

        return highGrade;
    }

    // determine average for test
    public double getAverage() {
        int total = 0;

        for (int grade : grades)
            total += grade;

        return (double) total / grades.length;

    }

    // output bar chart displaying grade distribution
    public void outputBarChart() {
        System.out.println("Grade distribution:");

        // stores frequency of grades in each range of 10 grades
        int[] frequency = new int[11];

        for (int grade : grades)
            ++frequency[grade / 10];

        // for each grade frequency, print the bar in chart
        for (int count = 0; count < frequency.length; count++) {
            // output bar label ("00-09: ", ..., "90-99: ", "100: ")
            if (count == 10)
                System.out.printf("%5d:", 100);
            else
                System.out.printf("%02d-%02d:",
                        count * 10, count * 10 + 9);
            for (int stars = 0; stars < frequency[count]; stars++)
                System.out.printf("*");

            System.out.println();
        }
    }

    public void outputGrades() {
        System.out.printf("The grades are:%n%n");

        // output each student's grade
        for (int student = 0; student < grades.length; student++) {
            System.out.printf("Student %2d: %3d%n",
                    student + 1, grades[student]);
        }
    }

}
