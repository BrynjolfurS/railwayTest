package is.hi.hbv501g.hugbunadarverkefni1.Persistence.Entities;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "events")
public class Event {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long ID;
    private String eventName;
    private String eventDescription;
    private LocalDate eventDate;
    private String sport;

    //------------------test-------------------------------
    public Event(String eventName, String eventDescription ,String sport) {
        this.eventName = eventName;
        this.eventDescription = eventDescription+" og "+eventDescription;
        this.sport = sport;
    }
    //------------------test end-------------------------------

    public Event() {
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }

    public String getSport(){return sport;}
    public void setSport(String sport){this.sport=sport;}

    public Event(String eventName, String eventDescription, LocalDate eventDate) {
        this.eventName = eventName;
        this.eventDescription = eventDescription;
        this.eventDate = eventDate;
    }
}
