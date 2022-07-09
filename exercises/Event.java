import java.time.MonthDay;
import java.util.Objects;

public class Event {

    private int id;
    private String name;
    private MonthDay monthDay;

    public Event() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MonthDay getDate() {
        return monthDay;
    }

    public void setDate(MonthDay date) {
        this.monthDay = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return getId() == event.getId() && getName().equals(event.getName()) && getDate().equals(event.getDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getDate());
    }
}
