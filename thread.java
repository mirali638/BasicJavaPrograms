class ChildThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}

public class thread {
    public static void main(String[] args) {
        ChildThread childThread = new ChildThread();
        childThread.start();
    }
} 

// l. Write a program to create a child 
// thread to print integer numbers 1 to 10.
 
//class ChildRunnable implements Runnable {
//     @Override
//     public void run() {
//         for (int i = 1; i <= 10; i++) {
//             System.out.println(i);
//         }
//     }
// }

// public class ThreadExample {
//     public static void main(String[] args) {
//         ChildRunnable childRunnable = new ChildRunnable();
//         Thread childThread = new Thread(childRunnable);
//         childThread.start();
//     }
// }
