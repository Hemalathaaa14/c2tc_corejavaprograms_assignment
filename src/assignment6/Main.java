package assignment6;

public class Main {
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();

        // Schedule 3 tasks using lambda expressions
        scheduler.scheduleTask(() -> System.out.println("Task 1: Printing Hello every 2 seconds"), 2);
        scheduler.scheduleTask(() -> System.out.println("Task 2: Current Time = " + java.time.LocalTime.now()), 3);
        scheduler.scheduleTask(() -> System.out.println("Task 3: Reminder! Stay Hydrated 💧"), 5);

        // Let the tasks run for 20 seconds
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Shutdown the scheduler
        scheduler.shutdown();
        System.out.println("Scheduler stopped.");
    }
}
