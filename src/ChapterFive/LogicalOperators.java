package ChapterFive;

/**
 * LogicalOperators.java
 * This program will output the truth table
 * of how logical operators functions
 *
 * @author Claude C DE-TCHAMBILA
 * Date: 1 December 2018
 */
public class LogicalOperators {

    public static void main(String[] args) {
        // create truth table for && (conditional AND) operator
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n",
                "Conditional AND (&&)",
                "false && false", false && false,
                "false && true", false && true,
                "true && false", true && false,
                "true && true", true && true);

        // create truth table for || (conditional OR) operator
        System.out.printf("%n%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n",
                "Conditional OR (||)",
                "false || false", false || false,
                "false || true", false || true,
                "true || false", true || false,
                "true || true", true || true);

        // create truth table for & (boolean logical AND) operator
        System.out.printf("%n%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n",
                "Boolean logical AND (&)",
                "false & false", false & false,
                "false & true", false & true,
                "true & false", true & false,
                "true & true", true & true);

        // create truth table for | (boolean logical inclusive OR) operator
        System.out.printf("%n%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n",
                "Boolean logical inclusive OR (|)",
                "false | false", false | false,
                "false | true", false | true,
                "true | false", true | false,
                "true | true", true | true);

        // create truth table for ^ (boolean logical exclusive OR) operator
        System.out.printf("%n%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n",
                "Boolean logical exclusive OR (^)",
                "false ^ false", false ^ false,
                "false ^ true", false ^ true,
                "true ^ false", true ^ false,
                "true ^ true", true ^ true);

        // create truth table for ! (Logical negation) operator
        System.out.printf("%n%s%n%s: %b%n%s: %b", "Logical NOT(!)",
                "!true", !true,
                "!false", !false);

    }

}
