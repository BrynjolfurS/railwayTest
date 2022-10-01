package is.hi.hbv501g.hugbunadarverkefni1.Persistence.Entities;


import java.time.LocalDate;
import java.util.List;

public class Thread {
    private long ID;
    private User user;
    private boolean isPinned;
    private List<Comment> comments;
    private String header;
    private String body;
    private LocalDate date;

    public Thread(User user, boolean isPinned, List<Comment> comments, String header, String body, LocalDate date) {
        this.user = user;
        this.isPinned = isPinned;
        this.comments = comments;
        this.header = header;
        this.body = body;
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isPinned() {
        return isPinned;
    }

    public void setPinned(boolean pinned) {
        isPinned = pinned;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
