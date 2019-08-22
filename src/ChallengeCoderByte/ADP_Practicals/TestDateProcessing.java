package ChallengeCoderByte.ADP_Practicals;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestDateProcessing {

    public static void main(String[] args) {
        System.out.println(determineAge("16-12-1999"));
        System.out.println(calculateAge(LocalDate.of(1999, 10, 16), LocalDate.now()));

    }

    private static int determineAge(String age) {
        int bday, bmonth, byear;
        String[] dob = age.split("\\-");
        bday = Integer.parseInt(dob[0]);
        bmonth = Integer.parseInt(dob[1]);
        byear = Integer.parseInt(dob[2]);

        LocalDate birthday = LocalDate.of(byear, bmonth, bday);
        LocalDate today = LocalDate.now();

        return (int) ChronoUnit.YEARS.between(birthday, today);
    }

    public static int calculateAge(LocalDate birthDate, LocalDate currentDate) {
        if ((birthDate != null) && (currentDate != null)) {
            return Period.between(birthDate, currentDate).getYears();
        } else {
            return 0;
        }
    }


}
