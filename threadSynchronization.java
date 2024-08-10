// thread synchronization

public class threadSynchronization implements Runnable {
    private static int tickets = 10;
    private String name;
    private int wantedTickets;

    public threadSynchronization(String name, int wantedTickets){
        this.name= name;
        this.wantedTickets=wantedTickets;
    }

    // Synchronized method to ensure thread safety
    public synchronized void bookTicket(String name, int wantedTickets) {
        if (wantedTickets <= tickets ) {
            System.out.println(wantedTickets + " tickets booked to " + name);
            tickets -= wantedTickets;
        } else {
            System.out.println("No tickets to book for " + name);
        }
    }

    @Override
    public void run() {
        synchronized(threadSynchronization.class){
            bookTicket(name,wantedTickets);
        }
    }

    public static void main(String[] args) {
        threadSynchronization customer1 = new threadSynchronization("customer1",1);
        threadSynchronization customer2 = new threadSynchronization("customer2",1);
        threadSynchronization customer3 = new threadSynchronization("customer3",4);
        threadSynchronization customer4 = new threadSynchronization("customer4",3);

        Thread t1 = new Thread(customer1);
        Thread t2 = new Thread(customer2);
        Thread t3 = new Thread(customer3);
        Thread t4 = new Thread(customer4);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try{
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("remaining tickets :"+ tickets);
    }
}