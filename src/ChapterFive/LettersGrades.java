package ChapterFive;

import java.util.Scanner;

// LetterGrades.java
// LetterGrades class uses the switch statement to count letter grades
public class LettersGrades {

    public static void main(String[] args) {
        int total = 0;
        int gradeCounter = 0;
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        int fCount;
        fCount = 0;

        Scanner input = new Scanner(System.in);

        System.out.printf("%s\n%s\n\t%s\n\t%s",
                "Enter the integer grade in the range of 0-100.",
                "(Type the end of file indicator to terminate input:",
                "On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter",
                "On Windows type <Ctrl> z then press Enter): ");

        // loops until the user enters the end of file indicator
        while (input.hasNext()) {
            int grade = input.nextInt();
            total += grade;
            gradeCounter++;

            switch (grade / 10) {
                case 9:
                case 10:
                    aCount++;
                    break;
                case 8:
                    bCount++;
                    break;
                case 7:
                    cCount++;
                    break;
                case 6:
                    dCount++;
                    break;
                default:
                    fCount++;
                    break;
            }
        }

        System.out.printf("\nGrade report:\n");

        // If user entered at least one grade
        if (gradeCounter != 0) {
            double average = (double) total / gradeCounter;

            //output results
            System.out.printf("The total of the %d grades entered is %d\n",
                    gradeCounter, total);

            System.out.printf("Class average is %.2f", average);

            System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
                    "Number of students who received each grade:",
                    "A: ", aCount,
                    "B: ", bCount, // display number of B grades
                    "C: ", cCount,
                    "D: ", dCount,
                    "F: ", fCount-1); // it fCount - 1 for the reason that the end of file input falls in the default case that increments fCount
        } else
            System.out.println("No grades were entered");
    }

}

