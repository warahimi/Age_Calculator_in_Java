import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their date of birth
        System.out.println("Enter your date of birth (YYYY-MM-DD):");
        String dobString = scanner.nextLine();

        // Parse the date of birth from the string
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dob = LocalDate.parse(dobString, formatter);

        // Calculate the current date
        LocalDate currentDate = LocalDate.now();

        // Calculate the age
        Period age = Period.between(dob, currentDate);

        // Print the age
        System.out.println("You are " + age.getYears() + " years, " + age.getMonths() + " months, and " + age.getDays() + " days old.");
    }
}