package StreamApi;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeExample {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();               // current date
        LocalTime time = LocalTime.now();               // current time
        LocalDateTime dateTime = LocalDateTime.now();   // current date and time

        // Formatting
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatted = dateTime.format(formatter);

        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
        System.out.println("Formatted DateTime: " + formatted);
       
    }
}
