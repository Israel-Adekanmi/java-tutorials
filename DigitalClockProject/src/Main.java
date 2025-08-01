import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- Digital Clock ---");
            System.out.println("1. Watch");
            System.out.println("2. Stopwatch");
            System.out.println("3. Timer");
            System.out.println("4. Exit");
            System.out.print("Select mode: ");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input.");
                continue;
            }

            ClockMode mode;

            switch (choice) {
                case 1:
                    mode = new Watch();
                    Thread watchThread = new Thread(mode::start);
                    watchThread.start();
                    System.out.println("Press ENTER to return to menu...");
                    scanner.nextLine(); // Pause
                    watchThread.interrupt(); // Stop watch
                    break;

                case 2:
                    mode = new Stopwatch(scanner); // no thread
                    mode.start(); // run directly
                    break;

                case 3:
                    mode = new TimerMode(scanner); // no thread
                    mode.start(); // run directly
                    break;

                case 4:
                    running = false;
                    continue;

                default:
                    System.out.println("Invalid choice. Try again.");
                    continue;
            }

            Thread thread = new Thread(mode::start);
            thread.start();

            System.out.println("Press ENTER to return to menu...");
            scanner.nextLine(); // pause
            thread.interrupt(); // stop current mode
        }

        scanner.close(); // ✅ Close once at the end
        System.out.println("Goodbye!");
    }
}
