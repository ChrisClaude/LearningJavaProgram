package Chapter_23_Concurrency.Dead_Locking_Action_How_To_Fix_it;

public class A {

    private Object key1 = new Object();
    private Object key2 = new Object();

    public void a() {
        synchronized (key1) {
            System.out.println("[" + Thread.currentThread().getName() + "] I am in a()");
            b();
        }
    }

    public void b() {
        synchronized (key2) {
            System.out.println("[" + Thread.currentThread().getName() + "] I am in b()");
            c();
        }
    }

    public void c() {
        synchronized (key2) {
            System.out.println("[" + Thread.currentThread().getName() + "] I am in b()");
        }
    }

}
