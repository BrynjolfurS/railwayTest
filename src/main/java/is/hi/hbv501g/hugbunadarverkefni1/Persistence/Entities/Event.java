package is.hi.hbv501g.hugbunadarverkefni1.Persistence.Entities;


import java.time.LocalDate;

public class Event {
    public enum Sport {
        ARCHERY,
        BOWLING,
        DARTS,
        BADMINTON,
        FENCING;
    }

    private long ID;
    private String eventName;
    private String eventDescription;
    private LocalDate eventDate;

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

    public Event(String eventName, String eventDescription, LocalDate eventDate) {
        this.eventName = eventName;
        this.eventDescription = eventDescription;
        this.eventDate = eventDate;
    }
}
