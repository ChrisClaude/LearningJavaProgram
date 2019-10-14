package Chapter_23_Concurrency.Race_Condition_How_To_Fix_it;

public class RaceCondition {

    public static void main(String[] args) throws InterruptedException {
        LongWrapper longWrapper = new LongWrapper(0L);

        Runnable r = () -> {
            for (int i = 0; i < 1_000; i++) {
                longWrapper.incrementValue();
            }
        };

        Thread[] threads = new Thread[1_000];
        int length = threads.length;

        for (int i = 0; i < length; i++) {
            threads[i] = new Thread(r);
            threads[i].start();
        }

        for (int i = 0; i < length; i++) {
            threads[i].join();
        }

        System.out.println("Value = " + longWrapper.getValue());

    }

}
