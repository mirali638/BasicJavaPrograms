//multithreading using thread class
class MyThread extends Thread 
{
    private  String name;
    public MyThread(String name) {
        this.name=name;
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
public class multithreading {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread 1");
        MyThread thread2 = new MyThread("Thread 2");

        thread1.start();
        thread2.start();
    }
}
