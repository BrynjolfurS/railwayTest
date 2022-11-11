package is.hi.hbv501g.hugbunadarverkefni1.Persistence.Entities;

import javax.persistence.*;

@Entity
@Table(name = "players")
public class Player {

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

    public String getSport(){return sport;}
    public void setSport(String sport){this.sport=sport;}

    public Player(String playerName, String playerInfo, int wins, int losses, String sport) {
        this.playerName = playerName;
        this.playerInfo = playerInfo;
        this.wins = wins;
        this.losses = losses;
        this.sport = sport;
    }
}
