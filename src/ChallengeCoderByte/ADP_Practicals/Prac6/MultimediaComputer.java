package ChallengeCoderByte.ADP_Practicals.Prac6;

public class MultimediaComputer extends Computer {

    private int CdRomSpeed;

    public MultimediaComputer(int processorType, int processorSpeed, int cdRomSpeed) {
        super(processorType, processorSpeed);
        this.CdRomSpeed = cdRomSpeed;
    }

    public int getCdRomSpeed() {
        return CdRomSpeed;
    }

    public void setCdRomSpeed(int cdRomSpeed) {
        CdRomSpeed = cdRomSpeed;
    }

    @Override
    public String toString() {
        return "MultimediaComputer {" +
                "processorType = " + getProcessorType() +
                ", processorSpeed = " + getProcessorSpeed() +
                "CdRomSpeed=" + CdRomSpeed +
                '}';
    }
}
