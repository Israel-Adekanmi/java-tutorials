// Interface definition
interface TimeCalculator {
    int getTotalHoursInDay();
    int getTotalMinutesInDay();

    // Default method (optional)
    default void printNote() {
        System.out.println("All calculations are based on a 24-hour day.");
    }
}

// Class implementing the interface
class DailyTime implements TimeCalculator {
    @Override
    public int getTotalHoursInDay() {
        return 24;
    }

    @Override
    public int getTotalMinutesInDay() {
        return 24 * 60;
    }
}

public class Week_5_Java_Interfaces {
    public static void main(String[] args) {
        // Interface type reference
        TimeCalculator time = new DailyTime();

        System.out.println("Total hours in a day: " + time.getTotalHoursInDay());
        System.out.println("Total minutes in a day: " + time.getTotalMinutesInDay());

        // Call default method
        time.printNote();
    }
}
