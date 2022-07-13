import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoPeriod;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;

public class LocalDateTimePractice {

    public static void main(String[] args) {

        LocalDateTimePractice localDateTimePractice = new LocalDateTimePractice();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

//        System.out.println(localDateTimePractice.useNow());
//
//        localDateTimePractice.useFormatterPrint();
//
//        System.out.println(localDateTimePractice.useFormatter("February 18 2014 09:23:12"));
//
//        localDateTimePractice.useGet(LocalDateTime.now());
//
//        System.out.println(localDateTimePractice.useMinusDays(5));

        System.out.println(localDateTimePractice.usePlusDays(15).format(dateTimeFormatter));

        int[] result = new int[2];

        int[] nums = {2,7,11,15};
        int target = 9;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int pointDigit = target - nums[i];

            if(map.containsKey(pointDigit)) {

                result[0] = i;
                result[1] = map.get(pointDigit);

            } else {

                map.put(pointDigit, i);
            }

        }
    }

    // It is used to obtain the current date-time from the system clock in the default time-zone.
    public LocalDateTime useNow(){
        LocalDateTime localDateTime = LocalDateTime.now();

        return localDateTime;
    }

    // It is used to format this date-time using the specified formatter.
    // Use formatter to print local date time in the following pattern dd-MM-yyyy HH:mm:ss
    public void useFormatterPrint(){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDateTime.format(dateTimeFormatter));



    }

    /***
     * Use formatter to create local date time from the input, where input has the following pattern "MM-dd"
     *
     * @param time string time e.g 09-16
     * @return localDateTime from the input
     */
    public LocalDateTime useFormatter(String time){

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSSSSS");
        LocalDateTime localDateTime = LocalDateTime.parse(time,dateTimeFormatter);

        return localDateTime;
    }

    /***
     * It is used to get the value of the specified field from this date-time as an int.
     * Print each unit from the localDateTime parameter using ChronoUnit
     * @return
     */
    public void useGet(LocalDateTime localDateTime){

        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getYear());
        System.out.println(localDateTime.getHour());
        System.out.println(localDateTime.getMinute());
        System.out.println(localDateTime.getSecond());
        System.out.println(localDateTime.getNano());

    }

    /***
     * It is used to return a copy of this LocalDateTime with the specified number of days subtracted.
     */
    public LocalDateTime useMinusDays(Integer numberOfDaysToSubtract){
        LocalDateTime localDateTime = LocalDateTime.now().minus(numberOfDaysToSubtract, ChronoUnit.DAYS);

        return localDateTime;
    }

    /***
     * It is used to return a copy of this LocalDateTime with the specified number of days added.
     * @return
     */
    public LocalDateTime usePlusDays(Integer numberOfDaysToAdd){
        LocalDateTime localDateTime = LocalDateTime.now().plus(numberOfDaysToAdd, ChronoUnit.DAYS);

        return useFormatter(localDateTime.toString().replaceAll("T", " "));

    }

}
