package is.hi.hbv501g.hugbunadarverkefni1.Persistence.Entities;

import javax.persistence.*;

@Entity
@Table(name = "clubs")
public class Club {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long ID;
    private String clubName;
    private String clubUrl;
    private String description;
    private String sport;

    public Club() {

    }
    public Club(String clubName, String clubUrl, String description,String sport) {
        this.clubName = clubName;
        this.clubUrl = clubUrl;
        this.description = description;
        this.sport = sport;
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

    public String getSport(){return sport;}
    public void setSport(String sport){this.sport=sport;}
}
