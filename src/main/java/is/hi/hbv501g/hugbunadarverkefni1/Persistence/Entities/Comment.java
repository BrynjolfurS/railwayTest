package is.hi.hbv501g.hugbunadarverkefni1.Persistence.Entities;


import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "comments")
public class Comment {

    private long ID;
    private User user;
    private LocalDateTime dateCommented;

    @Column(columnDefinition="LONGVARCHAR")
    private String comment;

    private Thread thread; // Thread ID Betra? Dno

    public Comment() {
    }

    public Comment(User user, String comment, Thread thread) {
        this.user = user;
        this.dateCommented = LocalDateTime.now();
        this.comment = comment;
        this.thread = thread;
    }

    @Id
    @Column(name = "CommentId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getID() {
        return ID;
    }
    public void setID(Long id) {
        this.ID = id;
    }

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    @JoinColumn(name = "UserID")
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    @JoinColumn(name = "ThreadID")
    public Thread getThread() {return thread;}

    public void setThread(Thread thread) {this.thread = thread;}

    public LocalDateTime getDateCommented() {
        return dateCommented;
    }

    public void setDateCommented(LocalDateTime dateCommented) {
        this.dateCommented = dateCommented;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
