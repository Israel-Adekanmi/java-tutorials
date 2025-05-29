public class Week_3_Java_Basics {
    public static void main(String[] args) {
        // 1. VARIABLES / FIELDS
        String studentName = "Daniel";
        int score = 82;

        // 2. OPERATORS, EXPRESSIONS & STATEMENTS
        boolean passed = score >= 50; // expression with operator

        // 3. IF-ELSE CONTROL STATEMENT
        System.out.println("Student: " + studentName);
        System.out.println("Score: " + score);

        if (score >= 70) {
            System.out.println("Grade: A - Excellent!");
        } else if (score >= 60) {
            System.out.println("Grade: B - Good job.");
        } else if (score >= 50) {
            System.out.println("Grade: C - You passed.");
        } else {
            System.out.println("Grade: F - Try again.");
        }

        // 4. FINAL MESSAGE
        if (passed) {
            System.out.println(studentName + " passed the course.");
        } else {
            System.out.println(studentName + " failed the course.");
        }
    }
}
