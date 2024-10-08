class stopwatch {
    // Private data fields
    private long startTime;
    private long endTime;

    // No-arg constructor that initializes startTime with the current time
    public stopwatch() {
        this.startTime = System.currentTimeMillis();
    }

    // Getter for startTime
    public long getStartTime() {
        return startTime;
    }

    // Getter for endTime
    public long getEndTime() {
        return endTime;
    }

    // Method to reset startTime to the current time
    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    // Method to set endTime to the current time
    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    // Method to get the elapsed time in milliseconds
    public long getElapsedTime() {
        return endTime - startTime;
    }
public class exam11{
    public static void main(String[] args) {
        // Create a StopWatch object
        stopwatch Stopwatch = new stopwatch();

        // Start the stopwatch
        Stopwatch.start();
        System.out.println("Stopwatch started at: " +  Stopwatch.getStartTime());

        // Simulate some process with sleep
        try {
            Thread.sleep(1000); // Sleep for 1 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Stop the stopwatch
        Stopwatch.stop();
        System.out.println("Stopwatch stopped at: " + Stopwatch.getEndTime());

        // Display the elapsed time
        System.out.println("Elapsed time in milliseconds: " + Stopwatch.getElapsedTime());
    }
}
}
