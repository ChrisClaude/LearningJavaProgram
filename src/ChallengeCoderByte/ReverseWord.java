package ChallengeCoderByte;

import java.util.Scanner;

public class ReverseWord {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(reverse(str));
    }

    public static String reverse(String str) {
        StringBuffer sb = new StringBuffer(str);
        String newStr = sb.reverse().toString();
        return newStr;
    }

}
