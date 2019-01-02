package ChapterSeven.GradeBookProgram_2;

public class GradeBook {

    private String courseName; // name of course this grade book represents
    private int[][] grades; // two-dimensional array of student grades

    public GradeBook(String courseName, int[][] grades) {
        this.courseName = courseName;
        this.grades = grades;
    }

    // method to set the course name
    public String getCourseName() {
        return courseName;
    }

    // method to retrieve the course name
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    // perform various operation on data
    public void processGrades() {
        // output grades array
        outputGrades();

        // call methods getMinimum and getMaximum
        System.out.printf("%n%s %d%n%s %d%n%n",
                "Lowest grade is", getMinimum(), "Highest grade is", getMaximum());

        // output grade distribution chart of all grades on all tests
        outputBarChart();
    }

    // find minimum grade
    public int getMinimum() {
        int lowestGrade = grades[0][0];

        // looping through the grades using simple for loop
        for (int row = 0; row < grades.length; row++) {
            for (int column = 0; column < grades[row].length; column++) {
                if (grades[row][column] < lowestGrade)
                    lowestGrade = grades[row][column];
            }
        }

        return lowestGrade;
    }

    // find maximum grade
    public int getMaximum() {
        int highestGrade = grades[0][0];

        // looping through grades using for each loop
        for (int[] row : grades) {

            for (int grade : row) {
                if (grade > highestGrade)
                    highestGrade = grade;
            }
        }

        return highestGrade;
    }

    // determine average for particular set of grades
    public double getAverage(int[] setOfGrades) {
        int total = 0;

        for (int grade : setOfGrades)
            total += grade;

        return (double) total / setOfGrades.length;
    }

    public void outputBarChart() {
        System.out.println("Overall grade distribution:");

        // stores frequency of grades in each range of 10 grades
        int[] frequency = new int[11];

        for (int[] studentsGrades : grades) {
            for (int grade : studentsGrades)
                ++frequency[grade / 10];
        }

        for (int count = 0; count < frequency.length; count++) {
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

    // output grades array
    public void outputGrades() {
        System.out.printf("The grades are:%n%n");
        System.out.print("            "); // align column ahead

        // create a column heading for each of the test
        for (int test = 0; test < grades[0].length; test++)
            System.out.printf("Test %d  ", test + 1);

        System.out.println("Average");

        // create rows/ columns of text representing array grades
        for (int student = 0; student < grades.length; student++) {
            System.out.printf("Student %2d", student + 1);

            for (int test : grades[student])
                System.out.printf("%8d", test);

            // call method getAverage to calculate student's average grade;
            // pass row of grades as the argument to getAverage
            double average = getAverage(grades[student]);

            System.out.printf("%9.2f%n", average);
        }


    }

}
