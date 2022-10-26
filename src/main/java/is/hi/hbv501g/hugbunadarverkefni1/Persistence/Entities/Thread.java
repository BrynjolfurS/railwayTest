package is.hi.hbv501g.hugbunadarverkefni1.Persistence.Entities;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "threads")
public class Thread {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long ID;
    private String username;
    private boolean isPinned;

    @OneToMany(mappedBy = "threadID", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Comment> comments = new ArrayList<>();

    private String header;
    private String body;
    private LocalDate date;


    //þarf að fjarlægja ----------------------
    private long fakeid;
    //--------------------------------------


    public Thread() {
    }



    public Thread(long fakeid, String user, boolean isPinned, List<Comment> comments, String header, String body) {
        //-------------test-------------------------
        this.fakeid = fakeid;
        //--------------------------------------

        this.username = user;
        this.isPinned = isPinned;
        this.comments = comments;
        this.header = header;
        this.body = body;
        //this.date = new LocalDate();
    }
    //----------------test----------------------
    public long getFakeid() {
        return fakeid;
    }

    //--------------------------------------

    public String getUser() {
        return username;
    }

    public void setUser(String user) {
        this.username = user;
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
