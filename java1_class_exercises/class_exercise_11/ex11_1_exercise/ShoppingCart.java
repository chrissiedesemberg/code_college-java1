package exercise_11.ex11_1_exercise;

// import statements here:
import java.time.LocalDateTime;
import java.time.format.*;

public class ShoppingCart {
    public static void main(String[] args){
	// Declare a LocalDateTime object, orderDate
        LocalDateTime myDate = LocalDateTime.now();
        
	// Initialize the orderDate to the current date and time. Print it.
        System.out.println("Original date printed: " + myDate);

	// Format orderDate using ISO_LOCAL_DATE; Print it.
        System.out.println("Formatted date (ISO_LOCAL_DATE) printed: " + myDate.format(DateTimeFormatter.ISO_LOCAL_DATE));
        // Format orderDate using MEDIUM; Print it.
        
        System.out.println("Formatted (ofLocalizedDateTime(FormatStyle.MEDIUM)) date printed: " + myDate.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));
    }
}