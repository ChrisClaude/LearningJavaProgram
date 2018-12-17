package ChallengeCoderByte.CompareTripllets;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 HackerRank Challenge
 */
public class CompareTripplets {


    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int aliceScore = 0;
        int bobScore = 0;
        List<Integer> result = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // Alice ratings
        System.out.print("Enter 3 values for Alice's ratings: ");
        String input = sc.nextLine();
        input = input.trim();
        String[] arr = input.split(" ");

        for (String str: arr) {
            a.add(Integer.parseInt(str));
        }

        // bob ratings
        System.out.print("Enter 3 values for Bob's ratings: ");
        input = sc.nextLine();
        input = input.trim();
        arr = input.split(" ");

        for (String str: arr) {
            b.add(Integer.parseInt(str));
        }

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i))
                aliceScore++;
            else if (a.get(i) < b.get(i))
                bobScore++;
        }

        result.add(aliceScore);
        result.add(bobScore);

        sc.close();

        return result;

    }

    public static void main(String[] args) {
        List<Integer> alice = new ArrayList<>();
        List<Integer> bob = new ArrayList<>();

        System.out.println(compareTriplets(alice, bob));

    }

}