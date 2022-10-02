package is.hi.hbv501g.hugbunadarverkefni1.Persistence.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Club {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long ID;
    private String clubName;
    private String clubUrl;
    private String description;

    public Club(String clubName, String clubUrl, String description) {
        this.clubName = clubName;
        this.clubUrl = clubUrl;
        this.description = description;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getClubUrl() {
        return clubUrl;
    }

    public void setClubUrl(String clubUrl) {
        this.clubUrl = clubUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
