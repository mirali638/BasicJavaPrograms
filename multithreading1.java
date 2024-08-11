class MyRunnable implements Runnable 
 {
    private String name;
    public MyRunnable(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println( name + " is running.");
        for (int i = 1; i <= 5; i++) {
            System.out.println( name + ": " + i);
            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread " + name + " interrupted.");
            }
        }
        System.out.println("Thread " + name + " finished.");
    }
}
public class multithreading1 {
    public static void main(String[] args) {
        MyRunnable myRunnable1 = new MyRunnable("Thread 1");
        MyRunnable myRunnable2 = new MyRunnable("Thread 2");

        Thread thread1 = new Thread(myRunnable1);
        Thread thread2 = new Thread(myRunnable2);

        thread1.start();
        thread2.start();
    }
}
