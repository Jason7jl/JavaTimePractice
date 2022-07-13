import java.time.LocalDate;
import java.time.MonthDay;
import java.time.temporal.ChronoUnit;


// 1. Java LocalDate class is an immutable class that represents Date with a default format of yyyy-mm-dd.
// It inherits Object class and implements the ChronoLocalDate interface

public class LocalDatePractice {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.of(2019, 01, 12);
        LocalDatePractice localDatePractice = new LocalDatePractice();
        MonthDay monthDay = MonthDay.of(11, 12);
        Event event = new Event();
        event.setDate(monthDay);

        localDatePractice.addWeeks(1);
        localDatePractice.removeWeeks(52);

       localDatePractice.dateBeforeAfter();

//        System.out.println(localDatePractice.printSuggetionToMakeWishes(localDate, event));
//
//        System.out.println(new LocalDatePractice().getTodayDate());
//
//        localDatePractice.printCurrentDayMonthYear();
//
//        localDatePractice.printDate(8978, 7, 17);
//
//        System.out.println(localDatePractice.datesEqual(localDatePractice.printDate(8978, 7, 17)));


    }

    // 1. Method that prints and returns today's date
    public LocalDate getTodayDate() {

        return LocalDate.now();
    }

    // 2. Method that prints a current day, month, and year
    public void printCurrentDayMonthYear() {

        LocalDate localDate = LocalDate.now();

        int day = localDate.getDayOfMonth();
        int mounth = localDate.getMonthValue();
        int year = localDate.getYear();

        System.out.println(day);
        System.out.println(mounth);
        System.out.println(year);

    }

    // 3. Method that prints local date from a particular date
    // hint you need to use of instead of now
    // given the input year, month, day create a local date and print it
    public LocalDate printDate(Integer year, Integer month, Integer day) {

        return LocalDate.of(year, month, day);
    }

    // 4. Method that checks if two dates are equal
    public boolean datesEqual(LocalDate myDate) {
        LocalDate todayDate = getTodayDate();

        return myDate.equals(todayDate);
    }

    // 5. How to check for recurring events e.g. birthday
    // ... continue here
    public String printSuggetionToMakeWishes(LocalDate localDate, Event event) {

        // convert local date to monthDay

        MonthDay currentMonthDay = MonthDay.of(localDate.getMonth(), localDate.getDayOfMonth());

        //compare currentDte with eventDate and if they equals sent remainder

        if (event.getDate().equals(currentMonthDay)) {
            return "Make a wish to your friend!";
        }

        return null;
    }

    // 6. This is similar to the previous example, there we learned how to find time after N hours, and here we will learn how to find a date after N week.
    // LocalDate is used to represent date without the time and it got a plus() method which is used to add days, weeks, or months, ChronoUnit is used
    // to specify that unit.
    // Since LocalDate is also immutable any mutable operation will result in a new instance, so don't forget to store it back.
    public LocalDate addWeeks(Integer weeks){
        ChronoUnit chronoUnit =  ChronoUnit.WEEKS;
        LocalDate localDate = getTodayDate();
        localDate = localDate.plus(weeks, ChronoUnit.WEEKS);
        // calculate the result on the next line, print and return it

        System.out.println(localDate);

        return localDate;
    }

    // 7. This is a continuation of the previous example.
    // In the last example, we learn how to use plus() method of LocalDate to add days, weeks or months in a date,
    // now we will learn how to use the minus() method to find what was the day before 1 year.
    public LocalDate removeWeeks(Integer weeks){
        LocalDate localDate = getTodayDate().minus(weeks,ChronoUnit.WEEKS);
        // calculate the result on the next line, print and return it
        System.out.println(localDate);

        return localDate;
    }

    // 8. see if a date is before or after another date in Java
    // This is another very common task in an actual project.
    // How do you find if a given date is before, or after the current date or just another date?
    // In Java 8, LocalDate class has got methods like isBefore() and isAfter() which can be used to compare two dates in Java.
    // isBefore() method return true if given date comes before the date on which this method is called.
    public void dateBeforeAfter(){
        // 1. practice to use after method
        LocalDate localDate = getTodayDate();
        // here create custom date that represents tomorrow
        LocalDate localDate1 =localDate.plus(1, ChronoUnit.DAYS);

        // check if tomorrow is going after today date print if yes
        System.out.println(localDate1.isAfter(localDate));

        // 2. practice to use before method
        // here create customer local date to represent yesterday
        LocalDate localDate2 = localDate.minus(1, ChronoUnit.DAYS);

        // check if yesterday is before tomorrow and print it if yes
        System.out.println(localDate2.isBefore(localDate));


    }

}
