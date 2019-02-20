package ChallengeCoderByte.ADP_Practicals.Prac4;

public class Election {

    private String candidate;
    private int numVotes;

    // no-argument constructor
    public Election() {
    }

    // argument constructor
    public Election(String candidate, int numVotes) {
        this.candidate = candidate;
        this.numVotes = numVotes;
    }

    // setter for candidate
    public void setCandidate(String candidate) {
        this.candidate = candidate;
    }

    // setter for numVotes
    public void setNumVotes(int numVotes) {
        this.numVotes = numVotes;
    }

    // getter for candidate
    public String getCandidate() {
        return candidate;
    }

    // getter for numVotes
    public int getNumVotes() {
        return numVotes;
    }

    @Override
    public String toString() {
        return "Election{" +
                "candidate='" + candidate + '\'' +
                ", numVotes=" + numVotes +
                '}';
    }

}
