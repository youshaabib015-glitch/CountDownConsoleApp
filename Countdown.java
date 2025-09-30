import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter today's date (yyyy-MM-dd): ");
        String date1 = input.nextLine();
        System.out.println("Enter end date (yyyy-MM-dd): ");
        String date2 = input.nextLine();
        LocalDate day1 = LocalDate.parse(date1, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println("Your start date: " + day1);
        LocalDate day2 = LocalDate.parse(date2, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println("Your end date: " + day2);
        long daypassed = ChronoUnit.DAYS.between(day1,day2);
        System.out.println("Days: " + daypassed);
    }
    
}
