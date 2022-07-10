import java.time.LocalTime;

// 2. Practice with LocalTime class
public class LocalTimePractice {

    // 1. in previous module we practiced local date class and already know how to get current date
    // now you should try to get current time
    public LocalTime getCurrTime(){
        LocalTime localTime = null; // modify this line to create current time

        return null;
    }

    // 2. Add hours in time
    // On many occasions, we would like to add hours, minutes or seconds to calculate time in the future.
    // Java 8 has not only helped with Immutable and thread-safe classes but also provided better methods e.g. plusHours() instead of add(), there is no conflict.
    // hint: BTW, remember that these methods return a reference to new LocalTime instance because LocalTime is immutable, so don't forget to store them back.
    public LocalTime addHours(Integer hours){
        LocalTime time = LocalTime.now();
        // adding hours print and return it

        return null; // return the actual result here
    }



}
