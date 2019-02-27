package ChallengeCoderByte.ADP_Practicals.Prac6;

public class Computer {

    private int processorType;
    private int processorSpeed;

    public Computer(int processorType, int processorSpeed) {
        this.processorType = processorType;
        this.processorSpeed = processorSpeed;
    }

    public int getProcessorType() {
        return processorType;
    }

    public void setProcessorType(int processorType) {
        this.processorType = processorType;
    }

    public int getProcessorSpeed() {
        return processorSpeed;
    }

    public void setProcessorSpeed(int processorSpeed) {
        this.processorSpeed = processorSpeed;
    }

    @Override
    public String toString() {
        return "Computer {" +
                "processorType = " + processorType +
                ", processorSpeed = " + processorSpeed +
                '}';
    }
}
