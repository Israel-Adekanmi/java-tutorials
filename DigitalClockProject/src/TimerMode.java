import java.util.Scanner;

public class TimerMode implements ClockMode {
    private Scanner scanner;

    public TimerMode(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void start() {
        System.out.print("Enter countdown time in seconds: ");
        int seconds;
        try {
            seconds = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input.");
            return;
        }

        while (seconds >= 0) {
            System.out.print("\rRemaining Time: " + seconds + "s  ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
            seconds--;
        }

        System.out.println("\nTimer ended.");
    }
}
