import java.util.Scanner;

public class Stopwatch implements ClockMode {
    private Scanner scanner;

    public Stopwatch(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void start() {
        System.out.println("Press ENTER to start, ENTER again to stop:");
        scanner.nextLine();
        long startTime = System.currentTimeMillis();
        scanner.nextLine();
        long endTime = System.currentTimeMillis();
        long elapsed = endTime - startTime;
        System.out.printf("Elapsed time: %.2f seconds\n", elapsed / 1000.0);
    }
}
