package ChallengeCoderByte.ADP_Practicals.Prac4;

import javax.swing.*;
import java.util.ArrayList;

public class TestElection {

    public static void main(String[] args) {
        // declaring election array
        Election[] election;

        // getting the array size for the use
        String size_array = JOptionPane.showInputDialog("Enter the number of candidates");
        int size = Integer.parseInt(size_array);

        // giving a size to the array
        election = new Election[size];

        // getting input from the user to instantiate election objects in the array
        for (int i = 0; i < size; i++) {
            String candidate = JOptionPane.showInputDialog("Enter the candidate's name");
            int votes = Integer.parseInt(JOptionPane.showInputDialog("Enter number of votes"));

            election[i] = new Election(candidate, votes);
        }

        // determining the total number of votes
        int total = 0;
        for (int i = 0; i < election.length; i++) {
            total += election[i].getNumVotes();
        }

        // percentage of votes received by each candidate
        double[] candidatePercentage = new double[size];

        for (int i = 0; i < size; i++) {
            candidatePercentage[i] = ((double) election[i].getNumVotes() / total) * 100;
        }

        // finding the winner
        int highest = 0;
        int index = 0;
        for (int i = 0; i < size; i++) {
            //highest = Math.max(highest, election[i].getNumVotes());
            if (election[i].getNumVotes() > highest) {
                highest = election[i].getNumVotes();
                index = i;
            }
        }

        // displaying
        System.out.println("Sample output");
        System.out.printf("%s%8s%14s\n", "Candidate", "Votes", "%Total Votes");
        for (int j = 0; j < size; j++) {
            System.out.printf("%9s%8d%14.2f\n",
                    election[j].getCandidate(), election[j].getNumVotes(), candidatePercentage[j]);
        }

        System.out.printf("Total votes: %d\n", total);
        System.out.printf("Winner of election is: %s\n", election[index].getCandidate());

        // creating an arraylist that takes election objects which candidate has votes > 4000
        ArrayList<Election> electionsList = new ArrayList<>();

        // adding specific election objects to the electionsList
        for (int i = 0; i < size; i++) {
            if (election[i].getNumVotes() > 4000)
                electionsList.add(election[i]);
        }

        // displaying names in the electionsList
        String msg = "";
        for (int i = 0; i < electionsList.size(); i++) {
            msg += String.format("%s\n", electionsList.get(i).getCandidate());
        }

        JOptionPane.showMessageDialog(null, msg, "Message", JOptionPane.INFORMATION_MESSAGE);

    }

}
