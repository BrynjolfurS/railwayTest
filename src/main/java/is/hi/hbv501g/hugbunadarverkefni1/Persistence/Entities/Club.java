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
    private String clubEmail;
    private String clubLocation;
    @Lob
    private String description;
    private String sport;

    public Club() {

    }
    public Club(String clubName, String clubUrl, String clubEmail,
                String clubLocation, String description,String sport) {
        this.clubName = clubName;
        this.clubUrl = clubUrl;
        this.clubEmail = clubEmail;
        this.clubLocation = clubLocation;
        this.description = description;
        this.sport = sport;
    }

    public long getID() {
        return ID;
    }
    public void setID(long id) {
        this.ID = id;
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

    public String getClubLocation() {
        return clubLocation;
    }

    public void setClubLocation(String clubLocation) {
        this.clubLocation = clubLocation;
    }

    public String getClubEmail() {
        return clubEmail;
    }

    public void setClubEmail(String clubEmail) {
        this.clubEmail = clubEmail;
    }
}
