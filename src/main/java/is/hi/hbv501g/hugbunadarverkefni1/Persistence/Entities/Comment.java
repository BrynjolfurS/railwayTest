package is.hi.hbv501g.hugbunadarverkefni1.Persistence.Entities;


import java.time.LocalDate;

public class Comment {

    private long ID;
    private User user;
    private LocalDate dateCommented;
    private Thread thread; // Thread ID Betra? Dno
    private String comment;

    public Comment(User user, LocalDate dateCommented, Thread thread, String comment) {
        this.user = user;
        this.dateCommented = dateCommented;
        this.thread = thread;
        this.comment = comment;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDate getDateCommented() {
        return dateCommented;
    }

    public void setDateCommented(LocalDate dateCommented) {
        this.dateCommented = dateCommented;
    }

    public Thread getThread() {
        return thread;
    }

    public void setThread(Thread thread) {
        this.thread = thread;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
