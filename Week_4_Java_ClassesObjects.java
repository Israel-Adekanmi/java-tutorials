// Enum for days of the week
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

// Superclass
class DisplayDays {
    public void showAllDays() {
        System.out.println("Days of the week:");
        for (Day day : Day.values()) {
            System.out.println(day);
        }
    }
}

// Subclass
class SpecialDay extends DisplayDays {
    public void showFirstDay() {
        System.out.println("First day of the week is: " + Day.MONDAY);
    }
}

public class Week_4_Java_ClassesObjects {
    public static void main(String[] args) {
        // Create subclass object
        SpecialDay days = new SpecialDay();

        // Access superclass and subclass methods
        days.showAllDays();
        System.out.println("--------------------");
        days.showFirstDay();
    }
}

