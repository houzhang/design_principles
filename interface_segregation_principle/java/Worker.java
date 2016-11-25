public class Worker implements Workable, Feedable {

    public Worker() {}

    public void eat() {
        System.out.println("Worker is eating...");
    }

    public void work() {
        System.out.println("Working is working...");
    }
}