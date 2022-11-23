package is.hi.hbv501g.hugbunadarverkefni1.Persistence.Entities;

import javax.persistence.*;

/**
 * The Player class contains data about a notable athlete related to some sport or activity.
 * The @Entity annotation marks it as an object that can be put in persistent storage via the Spring Data JPA to be accessed at a later date.
 */
@Entity
@Table(name = "players")
public class Player implements Comparable<Player> {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long ID;
    private  String sport;
    private String playerName;
    private String playerInfo;
    private int wins;
    private int losses;

    public Player() {
    }

    public long getID() {
        return ID;
    }
    public void setID(long id) {
        this.ID = id;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerInfo() {
        return playerInfo;
    }

    public void setPlayerInfo(String playerInfo) {
        this.playerInfo = playerInfo;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    @OneToOne(mappedBy = "player", fetch = FetchType.LAZY)
    public String getSport() {return sport;}
    public void setSport(String sport){this.sport=sport;}

    public Player(String playerName, String playerInfo, int wins, int losses, String sport) {
        this.playerName = playerName;
        this.playerInfo = playerInfo;
        this.wins = wins;
        this.losses = losses;
        this.sport = sport;
    }

    /**
     * This method is used to compare the performance of two athletes, the goal being to obtain a sorted list
     * of athletes in descending order in terms of performance.
     * @param that the object to be compared.
     * @return
     */
    public int compareTo(Player that) {
        if (this.wins > that.wins) return 1;
        if (this.wins == that.wins) return 0;
        return -1;
    }
}
