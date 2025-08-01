import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Watch implements ClockMode {
    @Override
    public void start() {
        while (true) {
            LocalTime time = LocalTime.now();
            System.out.print("\rCurrent Time: " + time.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("\nWatch stopped.");
                break;
            }
        }
    }
}
