package Chapter_23_Concurrency.Race_Condition_How_To_Fix_it;

public class LongWrapper {

    private long l;
    private Object key = new Object();

    public LongWrapper(long l) {
        this.l = l;
    }

    public long getValue() {
        return l;
    }

    public void incrementValue() {
        synchronized (key) {
            l = l + 1;
        }
    }

}
