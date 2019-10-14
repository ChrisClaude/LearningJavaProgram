package Chapter_23_Concurrency.FirstRunnable;

public class FirstRunnable {

    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("I am running in " + Thread.currentThread().getName());
        };

        Thread t = new Thread(runnable);
        t.setName("My thread"); // setting an explicit name to the thread
        t.start();
//        t.run(); // NO NO NO!!!
    }

}
