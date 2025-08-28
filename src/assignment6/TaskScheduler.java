package assignment6;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

// Functional Interface
@FunctionalInterface
interface Task {
    void execute();
}

// TaskScheduler Class
public class TaskScheduler {
    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    // Method to schedule tasks
    public void scheduleTask(Task task, int interval) {
        scheduler.scheduleAtFixedRate(task::execute, 0, interval, TimeUnit.SECONDS);
    }

    // Stop scheduler
    public void shutdown() {
        scheduler.shutdown();
    }
}

