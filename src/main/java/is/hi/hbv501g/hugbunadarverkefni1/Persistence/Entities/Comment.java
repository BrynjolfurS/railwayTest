package is.hi.hbv501g.hugbunadarverkefni1.Persistence.Entities;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "comments")
public class Comment {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long ID;
    private String user;
    private LocalDate dateCommented;
    private String comment;
    private Long threadID; // Thread ID Betra? Dno

//--------------test--------------------------------
    public Comment(String comment) {
        this.comment=comment;
    }
    //-------------------------------------------
    public Comment() {
    }

    public Comment(String user, String comment) {
        this.user = user;
        //this.dateCommented = new LocalDate;
        this.comment = comment;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public LocalDate getDateCommented() {
        return dateCommented;
    }

    public void setDateCommented(LocalDate dateCommented) {
        this.dateCommented = dateCommented;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
