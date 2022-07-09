import java.time.LocalDate;
import java.time.MonthDay;

// Java LocalDate class is an immutable class that represents Date with a default format of yyyy-mm-dd.
// It inherits Object class and implements the ChronoLocalDate interface

public class LocalDatePractice {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.of(2019,01,12);
        LocalDatePractice localDatePractice = new LocalDatePractice();
        MonthDay monthDay = MonthDay.of(11,12);
        Event event = new Event();
        event.setDate(monthDay);

        System.out.println(localDatePractice.printSuggetionToMakeWishes(localDate, event));

        System.out.println(new LocalDatePractice().getTodayDate());

        localDatePractice.printCurrentDayMonthYear();

        localDatePractice.printDate(8978,7,17);

        System.out.println(localDatePractice.datesEqual(localDatePractice.printDate(8978,7,17)));


    }
    // Method that prints and returns today's date
    public LocalDate getTodayDate(){

        return LocalDate.now();
    }

    // Method that prints a current day, month, and year
    public void printCurrentDayMonthYear(){

        LocalDate localDate =  LocalDate.now();

        int day = localDate.getDayOfMonth();
        int mounth = localDate.getMonthValue();
        int year = localDate.getYear();

        System.out.println(day);
        System.out.println(mounth);
        System.out.println(year);

    }

    // Method that prints local date from a particular date
    // hint you need to use of instead of now
    // given the input year, month, day create a local date and print it
    public LocalDate printDate(Integer year, Integer month, Integer day) {

        return LocalDate.of(year,month, day);
    }

    // Method that checks if two dates are equal
    public boolean datesEqual(LocalDate myDate) {
        LocalDate todayDate = getTodayDate();

        return myDate.equals(todayDate);
    }

    // How to check for recurring events e.g. birthday
    // ... continue here
    public String printSuggetionToMakeWishes(LocalDate localDate, Event event) {

        // convert local date to monthDay

        MonthDay currentMonthDay =  MonthDay.of(localDate.getMonth(), localDate.getDayOfMonth());

        //compare currentDte with eventDate and if they equals sent remainder

        if (event.getDate().equals(currentMonthDay)) {
            return "Make a wish to your friend!";
        }

        return null;


    }


}
